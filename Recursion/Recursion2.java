package Recursion;

//Print numbers from 5 to 1 using recursion
public class Recursion2{
    public static void printNumbers(int startNum, int endNum, int sum){
        if(startNum==endNum){
            System.out.println(sum);
            return;
        }
        sum += startNum;
        printNumbers(startNum+1,endNum,sum);
    }
    public static void main(String[] args) {
        int startNum = 1;
        int endNum = 5;
        int sum = 0;
        printNumbers(startNum,endNum,sum);
    }
}