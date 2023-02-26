package domain

class Money(val price: Int) {
    init {
        require(price >= 0) { INPUT_MONEY_NEGATIVE_ERROR_MESSAGE }
        require(price % LOTTO_PRICE == 0) { INPUT_MONEY_NOT_DIVIDE_ERROR_MESSAGE }
    }

    fun getLottoCount(): Int {
        return price / LOTTO_PRICE
    }

    fun leftMoney(count: Int): Money = Money(price - LOTTO_PRICE * count)

    companion object {
        const val INPUT_MONEY_NEGATIVE_ERROR_MESSAGE = "금액은 양수여야 합니다."
        const val LOTTO_PRICE = 1000
        const val INPUT_MONEY_NOT_DIVIDE_ERROR_MESSAGE = "금액은 ${LOTTO_PRICE}원으로 나누어떨어져야 합니다."
    }
}
