fun main() {
    createMirroredReverseTriangle(numberOfSides = 3)
}

fun createMirroredReverseTriangle(numberOfSides: Int) {
    for (currentColumn in 0..<numberOfSides) {
        for (y in 0..<(numberOfSides-currentColumn)-1) {
           print(" ")
        }
        for (star in 0 .. currentColumn) {
            print("*")
        }
        println()
    }
}