package me.minyul.education.first;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Consumer;

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

		/**
		 * Foo Class + FP
		 * 우선 우측 부터 작성 후   C + A + V
		 */
		Consumer<String> introduce = Foo::introduce;
		BiFunction<String, Integer, Foo> getFoo = Foo::new;

		introduce.accept("minyul");
		getFoo.apply("gomjae", 30);

		Integer[] numbers = {3, 1, 2};

		// 구식
		Arrays.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return 0;
			}
		});

		// Arrays.sort(numbers, ((o1, o2) -> o1.compareTo(o2)));
		Arrays.sort(numbers, Integer::compareTo);
		System.out.println(Arrays.toString(numbers));
	}
}
