import java.util.*;

public class test4 {

    public static void main(String[] args) {
        Map<Integer, char[]> fullMap = new LinkedHashMap<>();
        Scanner in = new Scanner(System.in);
        String map = in.nextLine();
        String[] splitMap = map.split(" ");
        for (Integer i = 0; i < Integer.parseInt(splitMap[0]); i++) {
            String mapDitails = in.nextLine();
            char[] charsArray = mapDitails.toCharArray();
            fullMap.put(i, charsArray);
        }
        int ploshadka = 1;
        for (int i = 0; i < fullMap.size(); i++) {
            for (int j = 0; j < Integer.parseInt(splitMap[1]); j++) {

            }

        }


      //  System.out.println(fullMap);
    }
}
