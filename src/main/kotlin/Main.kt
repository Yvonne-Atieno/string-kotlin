fun main (){
    names()
    var cars = arrayOf("volvo","BMW","FORD","mazda")
    car()
    texts()
    carss()
    myFunction()
}
//NO.1
//create a variable in kotlin that should store text and another store numbers
fun names(){
    var name ="john"
    var birthyear=1935
    println(name)
    println(birthyear)

}
//No.2
//find how many element an array of cars have
fun car(){
    var cars = arrayOf("volvo","BMW","FORD","mazda")
    println(cars.contentToString().length)

}
//No.3
//convert the string "Hello World" to upperCase
fun texts(){
    var text="Hello World"
    println(text.toUpperCase())
}
//No.4
//loop through  all element in the cars array.
fun carss(){
    var car = arrayOf("VOLVO","BMW","ford")
    for(x in car){
        println(x)

    }    }
//No.5
//create a function named"myFunction" that should output text i just got executed
fun myFunction(){
    var myFunctions="I just got executed"
    println(myFunctions)
}



