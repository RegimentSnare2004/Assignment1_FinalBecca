import java.math.BigInteger;
import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        int input = 7000;
        System.out.println(Arrays.toString(Problem3.NotFibbonacci(BigInteger.valueOf(10))));
        System.out.println("Input: " + input);
        System.out.println("Output: " + whereInSequence(input));


    }

    public static int whereInSequence(int num) {
        BigInteger[] sequence = Problem3.NotFibbonacci(BigInteger.valueOf(10));
            for (int i = 0; i < sequence.length; i++) {
                if (sequence[i].compareTo(BigInteger.valueOf(num)) == 1){
                    return i+1;
                }
                else if (sequence[i].compareTo(BigInteger.valueOf(num)) == 0) {
                    return i;
                }

            }
            return 0;
        }

    }

