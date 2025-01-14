fun main(){
   createReverseTriangle(numberOfSides = 3)
}

fun createReverseTriangle(numberOfSides : Int){
    for (i in 0..<numberOfSides) {
        for (j in 0..<(numberOfSides)-i) {
            print("*")
        }
        println()
    }
}

//y=numberOfSides - x
