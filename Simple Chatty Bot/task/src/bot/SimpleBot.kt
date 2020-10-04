package bot

import java.util.*


val input = Scanner(System.`in`) // Do not change this line

fun main() {
    greet("Gay Bowser", "2020") // change it as you need
    remindName()
    guessAge()
    count()
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
    println("What a great name you have, " + name + "!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Say me remainders of dividing your age by 3, 5 and 7.")
    val rem3 = input.nextInt()
    val rem5 = input.nextInt()
    val rem7 = input.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is " + age + "; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = input.nextInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

fun test() {
    println("Let's see how well you know my name.")
    println("How many people are alive in the U.S. with the name Gay Bowser?")
    println("1. four people\n2. zero people\n3. one person\n4. two people")
    val ans = input.nextInt()
    if (ans != 3) {
        println("Please, try again.")
    }



}

fun end() {
    println("Congratulations, have a nice day!")
}
