//1 Create a function that prints out all the odd numbers between 1 and 100 (2pts)
//2 Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)

//3 You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)

//4. Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and 5,
// print "FizzBuzz" instead of the number. (4pts)

fun main(){
    oddNumbers()

    println(takeInNames(arrayOf("Naima", "Nyawera", "Mima", "Angara", "Tessa")))

    drinkType(5)
    drinkType(8)
    drinkType(24)
    drinkType(6)

    multiples()
}
fun oddNumbers(){
    for (num in 1..100)
        if (num%2!==0)
            println(num)
}
fun takeInNames(names:Array<String>):Int {
    var y = 0
    names.forEach { x->
      if (x.length>5){
          y++
      }
    }
    return y
}
fun drinkType(age:Int){
    if (age < 6){
        println("milk")
    }
    if (age>6 && age<15){
        println("fanta orange")
    }
    else{
        println("coca cola")
    }
}

fun multiples() {
    for (nash in 1..100)
        if (nash % 3 == 0) {
            println("Fizz")

            if (nash % 5 == 0) {
                println("Buzz")
            } else if (nash % 3 == 0 || nash % 5 == 0) {
                println("FizzBuzz")
            }


        }
}


