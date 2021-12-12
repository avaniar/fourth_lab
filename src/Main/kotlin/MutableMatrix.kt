class MutableMatrix(input: Array<Array<Double>>) : Matrix(input) {

    operator fun set(i: Int, j: Int, value: Double) {
        if (i < 0 || j < 0 || i >= this.rowsSize || j >= this.columsSize)
            throw IllegalArgumentException("Index does not match the size of the matrix.")
        else
            this.data[i][j] = value
    }

    override operator fun plus(other: Matrix): MutableMatrix {
        return MutableMatrix((Matrix(this.getData()) + other).getData())
    }

    override operator fun minus(other: Matrix): MutableMatrix {
        return MutableMatrix((Matrix(this.getData()) - other).getData())
    }

    override operator fun times(other: Matrix): MutableMatrix {
        return MutableMatrix((Matrix(this.getData()) * other).getData())
    }

    override operator fun times(scalar: Double): MutableMatrix {
        return MutableMatrix((Matrix(this.getData()) * scalar).getData())
    }

    override operator fun div(scalar: Double): MutableMatrix {
        return MutableMatrix((Matrix(this.getData()) / scalar).getData())
    }

    override operator fun unaryMinus(): MutableMatrix {
        this *= -1.0
        return this
    }

    override operator fun unaryPlus(): MutableMatrix {
        return this
    }

    operator fun plusAssign(other: Matrix) {
        val tempMatrix = this + other
        this.data = tempMatrix.getData()
    }


    operator fun minusAssign(other: Matrix) {
        val tempMatrix = this - other
        this.data = tempMatrix.getData()
    }

    operator fun timesAssign(other: Matrix) {
        val tempMatrix = this * other
        this.data = tempMatrix.getData()
        this.rowsSize = tempMatrix.getDimension().first
        this.columsSize = tempMatrix.getDimension().second
    }

    operator fun timesAssign(scalar: Double) {
        val tempMatrix = this * scalar
        this.data = tempMatrix.getData()
    }

    operator fun divAssign(scalar: Double) {
        val tempMatrix = this / scalar
        this.data = tempMatrix.getData()
    }
}