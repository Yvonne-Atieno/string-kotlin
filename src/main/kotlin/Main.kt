
fun main(){
println(personDetails("yvonne",20,"kenyan"))
    println(stringLength("tringle"))
    myDetail("dan")

}

//1. Write a function that takes in 3 parameters, name, age, and country, and returns a String with this structure “Hi, my name is x, I am y years old and I am from z.” Where x, y, and z are the provided name, age, and country respectively. (3 points)
fun personDetails(name:String,age:Int,country:String):String{
    return "Hi, my name is $name,I am $age years old and I am from $country"

}


//2. Write a function that takes in a String and returns its length (2 points)
fun stringLength(name:String):Int{
    return name.length
}

//3. Write a function that takes in a name and prints out “That’s me!” when your name is passed to it, otherwise, it prints out “I don’t know who that is” (3 points)
fun myDetail(name: String){
    if (name=="yvonne"){
        println("That's me")
    }
    else{
        println("I don't know who that is ")
    }
}
//4. Write a Kotlin function that takes in a string will all the vowels replaces by the character ‘*’. Use string interpolation to generate the output. (2 points)1. Write a function that takes in 3 parameters, name, age, and country, and returns a String with this structure “Hi, my name is x, I am y years old and I am from z.” Where x, y, and z are the provided name, age, and country respectively. (3 points)

