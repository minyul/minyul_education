package me.minyul.education.second;

public class Poo {

	private String name;
	private Integer age;
	private char gender;

	public Poo(String name, Integer age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public boolean isAdult() {

		return this.age > 19;
	}

	public char gender() {

		return gender;
	}

	public String name() {

		return name;
	}

	public Integer age() {

		return age;
	}

	@Override
	public String toString() {
		return "Poo{" +
						"name='" + name + '\'' +
						", age=" + age +
						", gender=" + gender +
						'}';
	}
}
