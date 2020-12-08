
public class SumAverageRunningIntEx3 {

	public static void main(String[] args) {
		//define variables
		int sum=0; //the accumulated sum, init to 0
		double average; //average in double
		int lowerbound=1; 
		int upperbound=100;
		
		//use a for-loop to sum from lowerbound to upperbound
		for(int number=lowerbound; number<=upperbound; ++number) {
			//the loop index variable number=1, 2, 3, ..., 99, 100
			sum += number; //same as "sum = sum + number
		}
		
		average=(sum/100);
		System.out.println("The sum of 1 to 100 is " + sum);
		System.out.println("The average is " + average);
		System.out.println();
		
		System.out.println("While Loop");
		int sum1=0;
		double average1;
		int lowerbound1=1;
		int upperbound1=100;
		int number=lowerbound1;
		while(number<=upperbound1) {
			sum1 += number;
			++number;
		}
		
		average1=sum1/100;
		System.out.println("The sum of 1 to 100 is " + sum1);
		System.out.println("The average is " + average1);
		System.out.println();
		
		System.out.println("Do While Loop");
		int sum2=0;
		double average2;
		int lowerbound2=1;
		int upperbound2=100;
		int number1=lowerbound2;
		
		do {
			sum2 += number1;
			++number1;
		} while(number1<=upperbound2);
		
		average2=sum2/100;
		System.out.println("The sum of 1 to 100 is " + sum2);
		System.out.println("The average is " + average2);
		System.out.println();

	}

}
