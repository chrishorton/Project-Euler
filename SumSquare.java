package Euler;

public class SumSquare {

	public static void sumSquares(int large){
		int i;		
		
		if(large%10==0){ //Wrap in an if statement because logic only works with mod 10 numbers
			for(i=large;i>0;i-=10) {
				System.out.println(i);
			}
		}
	}
	
	public static void squareSums(int large) {
		int larges = (large * (large + 1))/2;
		System.out.println("\nThis is the sum: " + larges);
		int squaredResult = larges * larges;
		System.out.println("\nThis is the squared sum: " + squaredResult);
	}
	
	public static void main(String[] args) {
		sumSquares(100);
		squareSums(100);
	}

}
