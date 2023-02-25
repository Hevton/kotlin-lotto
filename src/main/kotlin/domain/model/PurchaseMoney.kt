package domain.model

class PurchaseMoney(
    val money: Int
) {
    init {
        require(this.money >= LOTTO_PRICE) {
            NOT_ENOUGH_MONEY_ERROR
        }
        require(this.money % LOTTO_PRICE == ZERO) {
            NUMBER_UNIT_ERROR
        }
    }

    companion object {
        private const val ZERO = 0
        private const val LOTTO_PRICE = 1000
        private const val NOT_ENOUGH_MONEY_ERROR = "[ERROR] 금액이 부족합니다."
        private const val NUMBER_UNIT_ERROR = "[ERROR] 천원 단위로 입력해주세요."
    }
}
