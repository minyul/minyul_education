package me.minyul.education.second;

import java.util.Arrays;
import java.util.List;

public class StreamPractice {

	public static void main(String[] args) {
		/**
		 * Stream
		 */
		List<Poo> people = Arrays.asList(
						new Poo("MinYul", 30, 'M'),
						new Poo("MinKyungJae", 30, 'M'),
						new Poo("GoMinJi", 26, 'F'),
						new Poo("KimEunJung", 25, 'F'),
						new Poo("KimMungKi", 32, 'M'),
						new Poo("GD", 29, 'M'));

		// 남자인 사람을 모두 뽑아 출력하시오.
		people.stream()
						.filter(person -> person.gender() == 'M')
						.forEach(System.out::println);

		//
	}
}
