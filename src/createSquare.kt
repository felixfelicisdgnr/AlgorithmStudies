fun main() {
    createSquare(numberOfSides = 3)
}

fun createSquare(numberOfSides : Int) {

    for (i in 0..<numberOfSides) {
        for (j in 0..<numberOfSides) {
            print("*")
        }
        println()
    }
}