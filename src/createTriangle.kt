fun main() {
    createTriangle(numberOfSides = 3)
}

fun createTriangle(numberOfSides: Int) {
    for (currentColumn in 0..<numberOfSides) {
        for (currentRow in 0..currentColumn) {
            print("*")
        }
        println()
    }
}

// y=x+1