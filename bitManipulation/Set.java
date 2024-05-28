package bitManipulation;

public class Set {
    public static void main(String[] args) {
        //Get the 3rd bit(position=2) of a number n.(n=0101)

        //First step - Bitmask
        // 1<<1
        // 0001<<1
        //0010

        //Second step - Logical OR
        // 0010 & 0101
        // 0111

        //0 or 1 is 1. only 0 or 0 is 0
        int n=5;//0101
        int pos=1;
        int bitMask = 1<<pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}
