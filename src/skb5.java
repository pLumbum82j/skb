import java.util.*;
import java.util.stream.Collectors;

public class skb5 {
    public static void main(String[] args) {
        String str = "123";
        int[] arr = new int[str.length()];
        for (int i=0; i<str.length();i++) {
            arr[i]=Character.digit(str.charAt(i), 10);
        }
        Scanner scanner = new Scanner(System.in);
        String[] znachenie = scanner.nextLine().split(" ");
        Integer[][] arr = new Integer[Integer.parseInt(znachenie[0])][Integer.parseInt(znachenie[1])];
        for (int i = 0; i < Integer.parseInt(znachenie[0]); i++) {
            char[] arrStr = scanner.nextLine().toCharArray();

            for (int j = 0; j < arr[0].length; j++) {
 //               System.out.println(arrStr[j]);
                for (int k = 0; k < arr[1].length; k++) {
                    arr[i][k] = (int) arrStr[k];
                    System.out.println(arr[i][k]);
                }

            }

        }*/


//        int friends = Integer.parseInt(scanner.nextLine());
//        Set<Integer> unique = new HashSet<>();
//        Map<Integer, List<Integer>> dices = new HashMap<>();
//        for (int i = 0; i < friends; i++) {
//            String strArr = scanner.nextLine();
//            dices.put(i, Arrays.stream(strArr.split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
//        }
//        for (int i = 0; i < friends; i++) {
//
//        }
    }
}
