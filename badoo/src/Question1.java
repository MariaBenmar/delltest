import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Lenovo on 23.01.2019.
 */
public class Question1 {
    static String findNumber(List<Integer> arr, int k) {
        // enter nummers and place into array
        System.out.print("How many numbers do you want to input? ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        if (size == 0) {
            System.out.print("Program is finished");
            System.exit(0);
        }
        Integer[] sourceNumbers = new Integer[size];
        System.out.print("Введите целые числа через пробел "
                + "и нажмите <Enter>: ");
        for (int i = 0; i < size; i++) {
            sourceNumbers[i] = in.nextInt();
        }
    }
    public static void main(String[] args) throws IOException {

    }

}

