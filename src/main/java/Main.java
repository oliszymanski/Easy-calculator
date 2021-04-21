public class Main {

	static int a = 14;			//main parameters
	static int b = 7;

	public static void main(String[] args) {

		Add addition = new Add();		//creating main objects
		Sub subtraction = new Sub();
		multiply multi = new multiply();
		Div div = new Div();



		//primary operations..

		//addition class test:
		int adding = addition.add(a, b);
		System.out.println("a + b = " + adding);

		//subtraction class test:
		int subtracting = subtraction.sub(a, b);
		System.out.println("a - b = " + subtracting);





		// bit bigger operations..

		//multiplication class test:
		int multiply = multi.mul(a, b);
		System.out.println("a * b = " + multiply);

		//division class test:
		int division = div.divide(a, b);
		System.out.println("a : b = " + division);
	}
}