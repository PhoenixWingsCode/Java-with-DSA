package bitManipulation;

import java.util.Scanner;

public class Update {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        int oper = scanner.nextInt();


        //oper=1 : set
        //oper=0 : clear

        int n=5;
        int pos=1;

        int bitMask = 1<<pos;

        if(oper == 1){
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
