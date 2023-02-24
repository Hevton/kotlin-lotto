package lotto.model

import lotto.view.ERROR_OUT_OF_RANGE

@JvmInline
value class LottoNumber private constructor(private val number: Int) {

    fun toInt(): Int = number

    companion object {
        private const val START_LOTTO_RANGE: Int = 1
        private const val END_LOTTO_RANGE: Int = 45
        private val RANGE_LOTTO_NUMBER: IntRange = START_LOTTO_RANGE..END_LOTTO_RANGE

        private val NUMBERS: Map<Int, LottoNumber> = RANGE_LOTTO_NUMBER.associateWith(::LottoNumber)

        fun create(value: Int): LottoNumber = NUMBERS[value] ?: throw IllegalArgumentException(ERROR_OUT_OF_RANGE)
    }
}