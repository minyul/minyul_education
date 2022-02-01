package me.minyul.education.first;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test 돌아가지 않을 시, Setting -> Build -> build test : Intellij IDEA
 */

@DisplayName("FooEnumTest Code")
public class FooEnumTest {

	@DisplayName("BiFunction을 이용해서 덧셈을 하다.")
	@Test
	void plusNumberByEnum() {

		// given
		final Integer firstNumber = 10;
		final Integer secondNumber = 20;

		// when
		final Integer result = FooEnum.PLUS.calculate(firstNumber, secondNumber);

		// then
		assertThat(result).isEqualTo(firstNumber + secondNumber);
	}
}