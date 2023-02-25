package view

import domain.lotto.PurchasedLotto
import domain.rank.Rank

class ResultView {
    fun printPurchasedLottos(lottos: List<PurchasedLotto>) {
        println(PURCHASED_LOTTO_SIZE_FORMAT.format(lottos.size))
        lottos.map { it.getSortedLotto() }
            .forEach { sortedNumber ->
                println(sortedNumber.map { it.value }.joinToString(", ", "[", "]"))
            }
        println()
    }

    fun printWinningRate(resultRank: Map<Rank, Int>, incomeRate: Double) {
        println(WINNING_RATE_TITLE)
        println(DIVIDER)

        println(
            RANK_PRINT_FORMAT.format(
                Rank.FIFTH.countOfMatch,
                Rank.FIFTH.winningMoney,
                resultRank[Rank.FIFTH] ?: DEFAULT_MATCHED_SIZE
            )
        )
        println(
            RANK_PRINT_FORMAT.format(
                Rank.FOURTH.countOfMatch,
                Rank.FOURTH.winningMoney,
                resultRank[Rank.FOURTH] ?: DEFAULT_MATCHED_SIZE
            )
        )
        println(
            RANK_PRINT_FORMAT.format(
                Rank.THIRD.countOfMatch,
                Rank.THIRD.winningMoney,
                resultRank[Rank.THIRD] ?: DEFAULT_MATCHED_SIZE
            )
        )
        println(
            RANK_PRINT_FORMAT.format(
                Rank.SECOND.countOfMatch,
                Rank.SECOND.winningMoney,
                resultRank[Rank.SECOND] ?: DEFAULT_MATCHED_SIZE
            )
        )
        println(
            RANK_PRINT_FORMAT.format(
                Rank.FIRST.countOfMatch,
                Rank.FIRST.winningMoney,
                resultRank[Rank.FIRST] ?: DEFAULT_MATCHED_SIZE
            )
        )
        print(TOTAL_INCOME_RATE_FORMAT.format(incomeRate))
        if (incomeRate < 0.0) println(LOSS_MESSAGE)
    }

    companion object {
        private const val PURCHASED_LOTTO_SIZE_FORMAT = "%d개를 구매했습니다."

        private const val WINNING_RATE_TITLE = "\n당첨 통계"
        private const val DIVIDER = "---------"
        private const val RANK_PRINT_FORMAT = "%d개 일치 (%d원) - %d개"
        private const val TOTAL_INCOME_RATE_FORMAT = "총 수익률은 %.2f입니다."
        private const val LOSS_MESSAGE = "(기준이 1이기 때문에 결과적으로 손해라는 의미임)"

        private const val DEFAULT_MATCHED_SIZE = 0
    }
}