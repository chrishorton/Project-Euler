package Euler;

public class palindrome {
	
	public static boolean check(int reverse){
		int i = 999;
		int x = 0;

		return false;
	}
	
	public static int reverseNum(int input) {
		int reversedNum = 0;
		while (input != 0) {
		    reversedNum = reversedNum * 10 + input % 10;
		    input = input / 10;   
		}
		System.out.println(reversedNum);
		return reversedNum;
	}

	public static void main(String[] args) {
		int reversedNumber = reverseNum(23334);
		check(reversedNumber);
	}

}
