package Bits;

public class Get {
    public static void main(String[] args) {
        //Get the 3rd bit(position=2) of a number n.(n=0101)

        //First step - Bitmask
        // 1<<2
        // 0001<<2
        //0100

        //Second step - Logical AND
        // 0100 & 0101
        // 0100

        //0 and 1 is 0. only 1 and 1 is 1
        int n=5;
        int pos = 2;
        int bitmask = 1<<pos;

        if((bitmask & n) == 0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }
    }
}
