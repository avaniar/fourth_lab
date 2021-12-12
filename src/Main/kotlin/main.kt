fun main() {
    val matrix = Matrix(
        arrayOf(
            arrayOf(1.0, 2.0),
            arrayOf(3.0, 4.0)
        )
    )
    val matrix2 = Matrix(
        arrayOf(
            arrayOf(1.0, 5.0),
            arrayOf(8.0, 15.0)
        )
    )
    val matrix3 = MutableMatrix(
        arrayOf(
            arrayOf(5.0, 8.0),
            arrayOf(3.0, 2.0)
        )
    )
    println("Matrix 1")
    println(matrix.toString())
    println("Matrix 2")
    println(matrix2.toString())
    println("Matrix 1 Plus Matrix 2")
    println((matrix + matrix2).toString())
    println("Matrix 1 Minus Matrix 2")
    println((matrix - matrix2).toString())
    println("Matrix 1 Times Matrix 2")
    println((matrix * matrix2).toString())
    println("Matrix 1 Times 5")
    println((matrix * 5.0).toString())
    println("Matrix 1 Div 5")
    println((matrix / 5.0).toString())
    println("Get Matrix 1 [1,1]")
    println((matrix[1, 1]).toString())
    println("\nUnary Minus Matrix 1")
    println((matrix.unaryMinus()).toString())
    println("Unary Plus Matrix 1")
    println((matrix.unaryPlus()).toString())
    println("Matrix 1 Equals Matrix 2")
    println((matrix == matrix2).toString())
    println("\nMutable Matrix 3")
    println(matrix3.toString())
    println("Matrix 3 plusAssign Matrix 2")
    matrix3 += matrix2
    println(matrix3.toString())
    println("Matrix 3 minusAssign Matrix 2")
    matrix3 -= matrix2
    println(matrix3.toString())
    println("Matrix 3 timesAssign Matrix 2")
    matrix3 *= matrix2
    println(matrix3.toString())
    println("Matrix 3 timesAssign 5.0")
    matrix3 *= 5.0
    println(matrix3.toString())
    println("Matrix 3 divAssign 5.0")
    matrix3 /= 5.0
    println(matrix3.toString())
}