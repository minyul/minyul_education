package me.minyul.education.first;

import java.util.Random;

@FunctionalInterface
public interface FooInterface {

	void getData(final Integer number);

	static Integer randomNumber() {
		Random random = new Random();

		return random.nextInt();
	}
}
