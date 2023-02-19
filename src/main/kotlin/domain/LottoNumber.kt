package domain

data class LottoNumber(val number: Int) {
    init {
        require(number in MINIMUM_NUMBER..MAXIMUM_NUMBER) { ERROR_NUMBER_IN_RANGE.format(number) }
    }

    override fun toString() = number.toString()

    companion object {
        private const val MINIMUM_NUMBER = 1
        private const val MAXIMUM_NUMBER = 45
        private const val ERROR_NUMBER_IN_RANGE = "로또 숫자는 1부터 45사이어야합니다. \n 잘못된 값: %d"
        private val NUMBERS = (MINIMUM_NUMBER..MAXIMUM_NUMBER).associateWith { LottoNumber(it) }
        fun from(number: Int): LottoNumber = NUMBERS[number] ?: LottoNumber(number)
    }
}