import domain.validator.NumericValidator
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class NumericValidatorTest {

    @ParameterizedTest
    @ValueSource(strings = ["abc", "*", "우기"])
    fun `입력이 정수 형태의 스트링이 아닌 경우 예외가 발생한다`(input: String) {
        assertThrows<IllegalArgumentException> {
            NumericValidator().validate(input)
        }
    }
}
