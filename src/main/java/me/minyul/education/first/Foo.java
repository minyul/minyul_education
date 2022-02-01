package me.minyul.education.first;

public class Foo {

	private String name;
	private int age;

	public Foo() {
		//
	}

	public Foo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int age() {

		return this.age;
	}

	public static void introduce(String content) {

		System.out.println("Foo Class ~" + content);
	}
}
