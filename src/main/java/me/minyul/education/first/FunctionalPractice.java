package me.minyul.education.first;

public class FunctionalPractice {

	public static void main(String[] args) {

		/**
		 * date : 2022-02-01
		 * author : min yul
		 * Custom FP
		 */
		FooInterface fooInterface1 = new FooInterface() {
			@Override
			public void getData(final Integer number) {
				System.out.println("fooInterface1 result : " + number);
			}
		};

		FooInterface fooInterface2 = number -> System.out.println("fooInterface1 result : " + number);

		fooInterface1.getData(10);
		fooInterface2.getData(10);
		System.out.println(FooInterface.randomNumber());

		/**
		 * ENUM
		 */
		System.out.println(FooEnum.MINUS.calculate(2, 3));
	}
}
