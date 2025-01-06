package lang.math.test;

import java.util.Arrays;
import java.util.Random;

public class LottoMain {
    public static void main(String[] args) {
        Random random = new Random();

        int[] lotto = new int[6];
        int count = 0;

        while (count < 6) {
            int lottoNumber = random.nextInt(45) + 1;

            if (count == 0) {
                lotto[count] = lottoNumber;
                count++;
            } else if (lotto[count - 1] != lottoNumber) {
                lotto[count] = lottoNumber;
                count++;
            }
        }

        System.out.println("lotto = " + Arrays.toString(lotto));
    }
}
