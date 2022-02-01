package me.minyul.education.first;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public enum FooEnum {

	PLUS("+", (a, b) -> a + b),
	MINUS("-", (a, b) -> a - b),
	DIVISION("/", (a, b) -> a / b),
	MULTIPLICATION("*", (a, b) -> a * b)
	;

	private final String symbol;

	// BiFunction<Integer, Integer, Integer>
	private final BinaryOperator<Integer> function;

	FooEnum(String symbol, BinaryOperator<Integer> function) {
		this.symbol = symbol;
		this.function = function;
	}

	public Integer calculate(final Integer firstNumber, final Integer secondNumber) {
		return function.apply(firstNumber, secondNumber);
	}
}
