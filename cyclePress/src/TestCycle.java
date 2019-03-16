/**
 * Created by Lenovo on 20.01.2019.
 */
import java.math.BigInteger;

public class TestCycle {

    private static final int lamp_count = 100, frog_count = 100;

    private final boolean[] lamps = new boolean[lamp_count];

    public String getResult() {
        // calculate...
        for (int i = 1; i <= frog_count; i++) {
            for (int j = i; j <= lamp_count; j += i) {
                press(j - 1);
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

        System.out.println("result: " + new TestCycle().getResult());
        // output: "result: 9081008010008001000080001"
    }
}