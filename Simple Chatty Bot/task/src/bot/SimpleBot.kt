package bot

import java.util.*


val input = Scanner(System.`in`)
var boolean = true
fun main() {
    greet("Gay Bowser", "2020")
    remindName()
    guessAge()
    count()
    question()
    println("How many people are alive in the U.S. with the name Gay Bowser?")
    println("a. four people\nb. zero people\nc. one person\nd. two people")
    test1()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is " + assistantName + ".")
    println("I was created in " + birthYear + ".")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = input.nextLine()
    if (name == "Gay Bowser") {
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

fun test1() {
    val ans :Char = input.next().single()
    if (ans != 'c') {
        println("Please, try again.")
        test2()
    }


}
fun test2() {
    val ans2 = input.next().single()
    if (ans2 != 'c') {
        println("Please, try again.")
        test3()
    }
}

fun test3() {
    val ans3 = input.next().single()
    if (ans3 != 'c') {
        println("Please, try again.")
        test4()
    }
}

fun test4() {
    val ans4 = input.next().single()
    if (ans4 != 'c') {
        println("Please, try again.")
    }
    else {
        print("")
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
