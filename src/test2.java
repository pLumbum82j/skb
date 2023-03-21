import java.util.Scanner;
import java.util.stream.IntStream;

public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] myArray = new int[in.nextInt()];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = in.nextInt();
        }
        int sum = IntStream.of(myArray).sum();
        int result =- sum;

        System.out.println(result);
    }
}
