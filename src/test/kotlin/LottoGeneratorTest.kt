import domain.LottoGenerator
import domain.model.lotto.Lotto
import domain.model.lotto.LottoTicket
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LottoGeneratorTest {

    @Test
    fun `구입 금액에 해당하는 수의 로또를 발행한다`() {
        val lottoGenerator = LottoGenerator(
            numberOfLottos = 5
        )
        assertThat(
            lottoGenerator.generateLottos().size
        ).isEqualTo(5)
    }

    @Test
    fun `로또를 2개 발행한다`() {
        // given
        val lottoGenerator = LottoGenerator(
            numberOfLottos = 2
        ) {
            LottoTicket(listOf(1, 2, 3, 4, 5, 6))
        }
        // when
        val lottos = lottoGenerator.generateLottos()
        // then
        assertThat(lottos).isEqualTo(
            listOf(
                Lotto.create(LottoTicket(listOf(1, 2, 3, 4, 5, 6))),
                Lotto.create(LottoTicket(listOf(1, 2, 3, 4, 5, 6)))
            )
        )
    }

    @Test
    fun `로또 1개를 발행한다`() {
        // given
        val lottoGenerator = LottoGenerator {
            LottoTicket(listOf(1, 2, 3, 4, 5, 6))
        }
        // when
        val lotto = lottoGenerator.generateLottos().first()
        // then
        assertThat(lotto).isEqualTo(
            Lotto.create(LottoTicket(listOf(1, 2, 3, 4, 5, 6)))
        )
    }
}
