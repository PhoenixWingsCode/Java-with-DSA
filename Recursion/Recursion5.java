package Recursion;

//Print numbers from 5 to 1 using recursion
public class Recursion5{
    public static int calcPower(int num1,int num2){
        if(num2==0){
            return 1;
        }
        if(num1==0){
            return 0;
        }
        int powernm1 = calcPower(num1, num2-1);
        int powern = num1 * powernm1;
        return powern;
    }
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;
        int ans = calcPower(num1,num2);
        System.out.println(ans);
    }
}