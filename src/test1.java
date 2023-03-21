import java.util.Arrays;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int j = 0;
        int k = a;
        while (k != 0) {
            k = k / 10;
            j++;
        }
        int[] myArray = new int[j];
        int i = 0;
        while (a != 0) {
            myArray[i] = a % 10;
            a /= 10;
            i++;
        }
        Arrays.sort(myArray);

        StringBuilder asc = new StringBuilder();
        for (int b = 0; b < myArray.length; b++) {
            asc.append(myArray[b]);
        }
        int resultAsc = Integer.parseInt(String.valueOf(asc));
        for (int z = 0; z < myArray.length / 2; z++) {
            int tmp = myArray[z];
            myArray[z] = myArray[myArray.length - z - 1];
            myArray[myArray.length - z - 1] = tmp;
        }
        StringBuilder desc = new StringBuilder();
        for (int b = 0; b < myArray.length; b++) {
            desc.append(myArray[b]);
        }
        int resultDesc = Integer.parseInt(String.valueOf(desc));

        int result = resultDesc - resultAsc;

        System.out.println(result);
    }
}