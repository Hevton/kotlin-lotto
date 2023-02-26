import domain.LottoNumber
import org.assertj.core.api.Assertions.assertThatIllegalArgumentException
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class LottoNumberTest {

    @ValueSource(ints = [1, 45, 23])
    @ParameterizedTest
    fun `로또 번호가 1에서 45사이의 숫자이다`(input: Int) {
        assertDoesNotThrow {
            LottoNumber.from(input)
        }
    }

    @ValueSource(ints = [0, 46])
    @ParameterizedTest
    fun `로또 번호가 1에서 45사이의 숫자가 아니면 에러를 발생한다`(input: Int) {
        assertThatIllegalArgumentException()
            .isThrownBy { LottoNumber.from(input) }
            .withMessageContaining("로또 번호는 1에서 45사이의 숫자여야 합니다. ")
    }
}