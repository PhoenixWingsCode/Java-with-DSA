package Recursion;

//Print numbers from 5 to 1 using recursion
public class Recursion1{
    public static void printNumbers(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        printNumbers(num-1);
    }
    public static void main(String[] args) {
        int num = 5;
        printNumbers(num);
    }
}