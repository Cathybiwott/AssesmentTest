fun main() {
    val myString = "Hello, Cathy"
    analyzeString(myString)


    val password = "my password"
    val isValid = validPassword(password)

    if (isValid) {
        println("Password is valid.")
    } else {
        println("Password not valid.")
    }

    println(printMultiples())


}





//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun analyzeString(inputString: String) {
    val firstChar = inputString.first()
    val lastChar = inputString.last()
    val length = inputString.length
    val startsWithVowel = when (firstChar) {
        'a', 'e', 'i', 'o', 'u' -> true
        'A', 'E', 'I', 'O', 'U' -> true
        else -> false
    }
    println("First character: $firstChar")
    println("Last character: $lastChar")
    println("Length: $length")
    println("Begins with a vowel? $startsWithVowel")
}

//2. Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false(7pts)
fun validPassword(password: String): Boolean {
    val regex= Regex("^(?!.*password)(?=.*\\d).{8,16}")
    return regex.matches(password)
}

//3. Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!”(5pts)
fun printMultiples() {
    for (i in 1..1000) {
        if (i % 6 == 0 && i % 8 == 0) {
            println("Bingo!")
        } else if (i % 6 == 0 || i % 8 == 0) {
            println(i)
        }
    }
}

//4. Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)

class CurrentAccount(accountnumber:String, accountname:String,balance:Double){


}
//5. Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)

class SavingsAccount(accountnumber:String, accountname:String,balance:Double,withdrawals:Double){

}


