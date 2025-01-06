package lang.math.test;

import java.util.Arrays;

public class LottoMain2 {
    public static void main(String[] args) {
        int[] lotto = new LottoGenerator().generate();
        System.out.println("lotto = " + Arrays.toString(lotto));
    }
}
