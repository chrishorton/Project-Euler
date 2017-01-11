package Euler;
import java.util.Scanner;

public class Fibonacci {
	@SuppressWarnings("resource")
    public static void main(String args[]) {
 
        //input to print Fibonacci series upto how many numbers
        System.out.print("Enter number up to which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();
 
        System.out.println("\n\nFibonacci series up to " + number +" numbers : ");
        //printing Fibonacci series upto number
        for(int i=1; i<=number; i++){
            int n = fibonacciRecursion(i);  
            System.out.println(n);
            if(n%2==0) {
            	System.out.println(n);
            }
        }
    } 
 
    // Java program for Fibonacci number using recursion.
    public static int fibonacciRecursion(int number){
        if(number == 1 || number == 2){
            return 1;
        }
 
        return fibonacciRecursion(number-1) + fibonacciRecursion(number -2); //tail recursion
    }
 
    // Java program for Fibonacci number using Loop.
    public static int fibonacciLoop(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;
 
        }
        return fibonacci; //Fibonacci number
    }     
}
