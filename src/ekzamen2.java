import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ekzamen2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nailCount = Integer.parseInt(scanner.nextLine());
        int[] arrX = new int[nailCount];
        int[] arrY = new int[nailCount];
        for (int i = 0; i < nailCount; i++) {
            String[] s = scanner.nextLine().split(" ");
            arrX[i] = Integer.parseInt(s[0]);
            arrY[i] = Integer.parseInt(s[1]);
 //           System.out.println(arrX[i] + " " + arrY[i]);
//            Arrays.sort();
//            int[] ints = Arrays.copyOf(arrX, nailCount);
            //        int min = col.get(0);

            }
        int maxXznach = arrX[0];
        int minXZnach = arrX[0];
        int minX = 0;
        int maxX = 0;
        List<Integer> pozMinX = new LinkedList<>();
        List<Integer> pozMaxX = new LinkedList<>();
        int maxYznach = arrY[0];
        int minYZnach = arrY[0];
        int minY = 0;
        int maxY = 0;
        for (int j = 1; j < arrX.length; j++) {
            if (arrX[j] <= minXZnach) {
                minX = j;
                pozMinX.add(j);
                minXZnach = arrX[j];
            }
            if (arrX[j] >= maxXznach) {
                maxX = j;
                pozMaxX.add(j);
                maxXznach  = arrX[j];
            }

        }
       // System.out.println(minX + " " + maxX);
        System.out.println(pozMinX);
        System.out.println(pozMaxX);
    }
}
