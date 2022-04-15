fun main() {
    names(listOf("alla","ken","nik","jay","dee","tim","sila","jim","sean","cop"))

    var collect= peopleHeight(listOf(5.2,4.3,5.5,4.4))
    println(collect)

    var a=people( "alla",44, 54.0)
    var b=people( "alla",54, 33.0)
    var c=people( "din",74, 84.0)
    var d= listOf(a,b,c)
    var y= d.sortedByDescending { people -> people.age }
    println(d)

    var one= people("ida", 33, 55.6)
    var two= people("cindy", 93, 45.68)
    var all= mutableListOf(one,two)
    println(all.plus(d))

    var prado=Car( "KAB445",33.7)
    var taxi=Car( "KAV125",33.7)
    var lory=Car( "KBB275",33.7)
    var x= listOf(prado,taxi,lory)
    println(carFunction(x))


}
//Given a list of 10 strings, write a function that returns a list of the strings
fun names(name:List<String>):List<String>{
    name.forEachIndexed{ index, s ->
        if (index%2==0)
            println(s)
    }
    return name
}



//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun peopleHeight(height:List<Double>):String{
    var x=height.sum()
    var avarage=height.average()
    var total="$x,$avarage"
    return total
}


//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age

data class people(var name:String, var age:Int, var weight:Double)







//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go

fun pipo(more:List<Any>):List<Any>{

    return listOf()
}



//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car(var registration:String, var mileage:Double)
fun carFunction(car:List<Car>):Double{
    var both=0.0
    car.forEach{ cars->
        both+=cars.mileage
    }
    return both/car.count()
}








