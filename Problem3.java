import java.math.BigInteger;

import static java.math.BigInteger.*;

public class Problem3 {
    public static void main(String[] args) {
        int length = 10;
        BigInteger[] sequence = NotFibbonacci(BigInteger.valueOf(length));
        System.out.println("First " + length + " numbers in the NotFibbonaci sequence:");
        for (int i = 0; i < sequence.length; i++) {
            if (i == length - 1) {
                System.out.print(sequence[i]);
            } else {
                System.out.print(sequence[i] + ", ");
            }
        }

    }

    public static BigInteger[] NotFibbonacci(BigInteger num) {
        BigInteger[] sequence = new BigInteger[num.intValue()];
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        for (int i = 0; i < num.intValue(); i++) {
            sequence[i] = a;
            BigInteger next = a.multiply(BigInteger.valueOf(2)).add(b.multiply(BigInteger.valueOf(3)));
            a = (b);
            b = next;

        }
        return sequence;
    }
}
