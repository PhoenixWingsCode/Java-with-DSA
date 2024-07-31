package Recursion;

//Print numbers from 5 to 1 using recursion
public class Recursion3{
    public static int calcFactorial(int num){
        if(num==1 || num==0){
            return 1;
        }
        int factnminus1 = calcFactorial(num-1);
        int factn = num * factnminus1;
        return factn;
    }
    public static void main(String[] args) {
        int num = 10;
        int ans = calcFactorial(num-1);
        System.out.println(ans);
    }
}