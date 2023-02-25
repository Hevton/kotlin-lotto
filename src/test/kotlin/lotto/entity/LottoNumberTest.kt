package lotto.entity

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import kotlin.IllegalArgumentException

class LottoNumberTest {
    @ValueSource(ints = [0, 46, 52])
    @ParameterizedTest
    fun `로또 번호가 1에서 45 사이의 범위에 있지 않으면 예외가 발생한다`(value: Int) {
        val thrown = assertThrows<IllegalArgumentException> { LottoNumber.from(value) }
        val except = "당첨 번호는 1에서 45 사이의 숫자여야 합니다. 입력된 당첨 번호는 %d 입니다.".format(value)
        assertThat(thrown.message).isEqualTo(except)
    }

    @ValueSource(ints = [2, 6, 35])
    @ParameterizedTest
    fun `로또 번호가 1에서 45 사이의 범위에 있으면 예외가 발생하지 않는다`(value: Int) {
        assertDoesNotThrow { LottoNumber.from(value) }
    }
}
