package lotto.domain

import lotto.domain.model.Lotto
import lotto.domain.model.LottoNumber

class RandomNumberGenerator : LottoNumberGenerator {
    override fun generate(count: Int): List<List<LottoNumber>> {
        val result = mutableListOf<List<LottoNumber>>()
        repeat(count) {
            result.add(
                (LottoNumber.MINIMUM_LOTTO_NUMBER..LottoNumber.MAXIMUM_LOTTO_NUMBER).toList().shuffled()
                    .slice(0 until Lotto.LOTTO_SIZE)
                    .sorted().map { number -> LottoNumber.from(number) }
            )
        }
        return result
    }
}