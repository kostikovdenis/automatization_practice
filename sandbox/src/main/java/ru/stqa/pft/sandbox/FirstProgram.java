package ru.stqa.pft.sandbox;

public class FirstProgram {

	public static void main(String[] args) {
		hello("World");
		hello("user");
		hello("Alexey");

		Square s = new Square(5);
		System.out.println("Площадь квадрата со строной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(4, 6);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
	}

	public static void hello (String somebody) {
		 System.out.println("Hello, " + somebody + "!");

	}
}