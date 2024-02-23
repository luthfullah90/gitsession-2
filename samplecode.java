public class CallingMethodsInSameClass
{
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
	}

	public static void printOne() {
		System.out.println("Hello World");
	}

	public static void printTwo() {
		printOne();
		printOne();
	}
}::public class HelloWorld
{
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
public class HelloWorld
{
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}}
