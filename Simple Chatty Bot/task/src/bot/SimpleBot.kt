package bot

import java.util.*


val input = Scanner(System.`in`)
var boolean = true
var FirstTest = true
var ans :Char = 'a'
fun main() {
    greet("Gay Bowser", "2020")
    remindName()
    guessAge()
    count()
    question()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is " + assistantName + ".")
    println("I was created in " + birthYear + ".")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = input.nextLine()
    if (name == "Gay Bowser") {      // Checks to see if name is Gay Bowser, then assigns boolean accordingly
        boolean = false
        println("What a wonderful name you have, " + name + "!")
    }
    else {
        println("What an awful name you have, " + name + "!")
    }
}

fun guessAge() {
    println("Let me guess your age.")
    println("Type in remainders of dividing your age by 3, 5 and 7.")
    val rem3 = input.nextInt()
    val rem5 = input.nextInt()
    val rem7 = input.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    if (boolean == false) {
        println("Your age is " + age + "; looks like you might be around a bit longer than the last person who had your name, haha!")
    }
    else {
        println("Your age is " + age + "; that means there's still time to change your name to Gay Bowser, a far superior name!")
    }
}

fun count() {
    println("Now I will prove to you that I can count to any natural number you want.")
    val num = input.nextInt()
    for (i in 0..num) {
        println(i)
    }
}

fun test() {
    if (FirstTest == true) {  // Prints string on first run through, then loops infinitely until correct answer is given
        println("How many people are alive in the U.S. with the name Gay Bowser?")
        println("a. four people\nb. zero people\nc. one person\nd. two people")
        FirstTest = false
    }
    ans = input.next().single()
    if (ans != 'c') {
        println("Please, try again.")
        test()
    }
}

fun end() {
    if (boolean == false) {
        println("Congratulations, I hope we meet again!")
    }
    else {
        println("Congratulations, have a nice day!")
    }
}

fun question() {
    if (boolean == false) {
        println("Let's see how well you know our name.")
    }
    else {
        println("Let's see how well you know my name.")
    }
}
