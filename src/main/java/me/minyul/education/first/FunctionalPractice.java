package me.minyul.education.first;

public class FunctionalPractice {

	public static void main(String[] args) {
		FooInterface fooInterface1 = new FooInterface() {
			@Override
			public void getData(final Integer number) {
				System.out.println("fooInterface1 result : " + number);
			}
		};

		FooInterface fooInterface2 = number -> System.out.println("fooInterface1 result : " + number);

		fooInterface1.getData(10);
		fooInterface2.getData(10);
	}
}
