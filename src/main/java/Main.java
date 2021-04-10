public class Main {

	public static void main(String[] args) {

		Add addition = new Add();		//creating main objects
		Sub subtraction = new Sub();


		int a = 12;			//main parameters
		int b = 7;

		//addition class test:
		int adding = addition.add(a, b);
		System.out.println("a + b = " + adding);


		//subtraction class test:
		int subtracting = subtraction.sub(a, b);
		System.out.println("a - b = " + subtracting);
	}
}
