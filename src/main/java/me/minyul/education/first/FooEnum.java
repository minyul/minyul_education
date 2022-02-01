package me.minyul.education.first;

import java.util.function.BiFunction;

public enum FooEnum {

	PLUS("+", (a, b) -> a + b),
	MINUS("-", (a, b) -> a - b),
	DIVISION("/", (a, b) -> a / b),
	MULTIPLICATION("*", (a, b) -> a * b)
	;

	private final String symbol;

	private final BiFunction<Integer, Integer, Integer> function;

	FooEnum(String symbol, BiFunction<Integer, Integer, Integer> function) {
		this.symbol = symbol;
		this.function = function;
	}

	public Integer calculate(final Integer firstNumber, final Integer secondNumber) {
		return function.apply(firstNumber, secondNumber);
	}
}
