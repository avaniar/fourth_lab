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
    val matrix3 = matrix + matrix2
    println(matrix3.toString())
}