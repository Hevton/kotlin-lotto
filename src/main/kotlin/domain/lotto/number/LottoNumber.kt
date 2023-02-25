package domain.lotto.number

data class LottoNumber(val value: Int) {
    init {
        validateLottoNumberRange()
    }

    private fun validateLottoNumberRange() {
        require(value in MIN_LOTTO_NUMBER..MAX_LOTTO_NUMBER) { ERROR_MESSAGE_LOTTO_NUMBER_OUT_OF_RANGE }
    }

    companion object {
        const val MIN_LOTTO_NUMBER = 1
        const val MAX_LOTTO_NUMBER = 45
        private const val ERROR_MESSAGE_LOTTO_NUMBER_OUT_OF_RANGE = "[ERROR] 로또 번호는 1이상 45이하여야 합니다."
    }
}