public class Main {

	static int a = 14;			//main parameters
	static int b = 7;

	public static void main(String[] args) {

		Add addition = new Add();		//creating main objects
		Sub subtraction = new Sub();
		multiply multi = new multiply();
		Div div = new Div();


		//addition class test:
		int adding = addition.add(a, b);
		System.out.println("a + b = " + adding);

		//subtraction class test:
		int subtracting = subtraction.sub(a, b);
		System.out.println("a - b = " + subtracting);

		//multiplication class test:
		int multiplying = multi.multiply(a, b);
		System.out.println("a * b = " + multiplying);

		//division class test:
		int division = div.divide(a, b);
		System.out.println("a : b = " + division);
	}
}