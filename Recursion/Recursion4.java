package Recursion;

//Print numbers from 5 to 1 using recursion
public class Recursion4{
    public static void printFib(int num1,int num2,int finalNum){
        if(finalNum==0){
            return;
        }
        int sum = num1 + num2;
        System.out.println(sum);
        printFib(num2, sum, finalNum-1);
    }
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        System.err.println(num1);
        System.err.println(num2);
        int finalNum = 7;
        printFib(num1,num2,finalNum-2);
    }
}