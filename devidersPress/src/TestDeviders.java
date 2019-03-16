/**
 * Created by Lenovo on 20.01.2019.
 */
import java.math.BigInteger;

public class TestDeviders {

    private static final int lamp_count = 100, frog_count = 100;

    private final boolean[] lamps = new boolean[lamp_count];

    public String getResult() {
        // calculate...
        for (int i = 1; i <= frog_count; i++) {
            int c=1;
            for (int j = 1; j <= i; j++) {
                if((i%j)==0) {
                    c++;
                }
            }
            if((c%2)==0) {
                press(i-1);
            }
        }
        // convert...
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < lamp_count; i++) {
            s.append(this.lamps[i] ? 1 : 0);
        }
        return new BigInteger(s.toString(), 2).toString(16);
    }

    private void press(int i) {
        this.lamps[i] = !this.lamps[i];
    }

    public static void main(String[] args) {

        System.out.println("result: " + new TestDeviders().getResult());
        // output: "result: 9081008010008001000080001"
    }
}