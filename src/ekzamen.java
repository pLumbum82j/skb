import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ekzamen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer strlen = Integer.parseInt(scanner.nextLine());
        String strArr = scanner.nextLine();
        List<Integer> col = Arrays.stream(strArr.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int min = col.get(0);
        int max = col.get(0);
        int minDay = 1;
        int maxDay = 1;
        for (int i = 1; i < strlen; i++) {
            if (col.get(i) < min) {
                minDay = i + 1;
                min = col.get(i);
            }
            if (col.get(i) >= max) {
                maxDay = i + 1;
                max = col.get(i);
            }
        }
        System.out.println(maxDay + " " + minDay);
    }
}
