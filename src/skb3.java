import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class skb3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int friends = Integer.parseInt(scanner.nextLine());
        Set<Integer> unique = new HashSet<>();
        int[][] arr = new int[friends][6];
        for (int i = 0; i < friends; i++) {
            String[] s = scanner.nextLine().split(" ");
            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = Integer.parseInt(s[1]);
            arr[i][2] = Integer.parseInt(s[2]);
            arr[i][3] = Integer.parseInt(s[3]);
            arr[i][4] = Integer.parseInt(s[4]);
            arr[i][5] = Integer.parseInt(s[5]);
        }

        for (int f = 0; f < friends - 1; f++) {
            for (int main = 0; main < 6; main++) {
                int i00 = arr[f][main];
                for (int i = 0; i < 6; i++) {
                    int i0 = i00 + arr[f + 1][0];
                    for (int j = 0; j < 5; j++) {
                        int i1 = i0 + arr[f + 1][j];
                        for (int z = 0; z < 4; z++) {
                            int i2 = i1 + arr[f + 1][z];
                            for (int x = 0; x < 3; x++) {
                                int i3 = i2 + arr[f + 1][x];
                                for (int c = 0; c < 2; c++) {
                                    int i4 = i3 + arr[f + 1][c];
                                    for (int v = 0; v < 1; v++) {
                                        int i5 = i4 + arr[f + 1][v];
                                        unique.add(i5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println((unique.size() + 1)/2);
    }
}
