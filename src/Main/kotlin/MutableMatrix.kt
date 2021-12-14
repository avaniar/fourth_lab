class MutableMatrix(input: Array<Array<Double>>) : Matrix(input) {

    operator fun set(i: Int, j: Int, value: Double) {
        if (i < 0 || j < 0 || i >= this.rowsSize || j >= this.columsSize)
            throw IllegalArgumentException("Index does not match the size of the matrix.")
        else
            this.data[i][j] = value
    }

    operator fun plusAssign(other: Matrix) {
        if (this.rowsSize == other.rowsSize && this.columsSize == other.columsSize) {
            for (i in 0 until this.rowsSize)
                for (j in 0 until this.columsSize)
                    this[i,j] += other[i,j]
        } else
            throw IllegalArgumentException("The addition operation cannot be used for matrices of different sizes")
    }


    operator fun minusAssign(other: Matrix) {
        if (this.rowsSize == other.rowsSize && this.columsSize == other.columsSize) {
            for (i in 0 until this.rowsSize)
                for (j in 0 until this.columsSize)
                    this[i,j] -= other[i,j]
        } else
            throw IllegalArgumentException("The addition operation cannot be used for matrices of different sizes")
    }

    operator fun timesAssign(other: Matrix) {
        if (this.columsSize == other.rowsSize) {
            val tempMatrix = MutableMatrix(Array(this.rowsSize) { (Array(other.columsSize) { 0.0 }) })
            for (i in 0 until this.rowsSize)
                for (j in 0 until other.columsSize)
                    for (k in 0 until this.columsSize)
                        tempMatrix[i,j] += this[i,j] * other[i,j]
            this.data = tempMatrix.data
        } else
            throw IllegalArgumentException("Matrices are not compatible.")
    }

    operator fun timesAssign(scalar: Double) {
        for (i in 0 until this.rowsSize)
            for (j in 0 until this.columsSize)
                this[i,j] *= scalar
    }

    operator fun divAssign(scalar: Double) {
        if (scalar == 0.0)
            throw IllegalArgumentException("Division by zero")
        for (i in 0 until this.rowsSize)
            for (j in 0 until this.columsSize)
                this[i,j] /= scalar
    }
}
