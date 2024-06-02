package bitManipulation;

public class Clear {
    public static void main(String[] args) {
        //Clear the 3rd bit (postiion=2) of a number n.(n=0101)
        //BitMask : 1<<i
        //1<<2
        //0001<<2
        //0100
        
        
        //NOT
        //~(0100) => 1011
        
        //AND
        //1011 & 0101
        //0001

        int n=5;
        int pos=2;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}
