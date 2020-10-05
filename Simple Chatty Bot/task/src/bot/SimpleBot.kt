package bot

import java.util.*


val input = Scanner(System.`in`)

fun main() {
    greet("Gay Bowser", "2020") // change it as you need
    remindName()
    guessAge()
    count()
    println("Let's see how well you know my name.")
    println("How many people are alive in the U.S. with the name Gay Bowser?")
    println("1. four people\n2. zero people\n3. one person\n4. two people")
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
    println("What an awful name you have, " + name + "!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Type in remainders of dividing your age by 3, 5 and 7.")
    val rem3 = input.nextInt()
    val rem5 = input.nextInt()
    val rem7 = input.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is " + age + "; that means there's still time to change your name to Gay Bowser, a far superior name.")
}

fun count() {
    println("Now I will prove to you that I can count to any natural number you want.")
    val num = input.nextInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

fun test1() {
    val ans = input.nextInt()
    if (ans != 3) {
        println("Please, try again.")
        test2()
    }


}
fun test2() {
    val ans2 = input.nextInt()
    if (ans2 != 3) {
        println("Please, try again.")
        test3()
    }
}

fun test3() {
    val ans3 = input.nextInt()
    if (ans3 != 3) {
        println("Please, try again.")
        test4()
    }
}

fun test4() {
    val ans4 = input.nextInt()
    if (ans4 != 3) {
        println("Please, try again.")
    }
    else {
        print("")
    }
}

fun end() {

    println("Congratulations, have a nice day!")
}
