import java.util.*;

public class test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstDay = Integer.parseInt(in.nextLine());
        Map<String, List<Integer>> vsedoma2 = new HashMap<>();
        List<Integer> result = new LinkedList<>();
        for (int j = 0; j < firstDay; j++) {
            String inputAddress = in.nextLine();
                String streetName = inputAddress.split("\\d")[0];
                int houseNumber = Integer.parseInt(inputAddress.substring(streetName.length()));
                List<Integer> tempos = vsedoma2.get(streetName);
                if (tempos == null) {
                    List<Integer> numbresDomsTemp = new ArrayList<>();
                    numbresDomsTemp.add(houseNumber);
                    vsedoma2.put(streetName, numbresDomsTemp);
                } else if (!tempos.contains(houseNumber)) {
                    vsedoma2.get(streetName).add(houseNumber);
                }
            }

        int secondDay = Integer.parseInt(in.nextLine());
        for (int j = 0; j < secondDay; j++) {
            String inputStreet = in.nextLine();
            List<Integer> tempos = vsedoma2.get(inputStreet);
            if (tempos == null) {
                List<Integer> numbresDomsTemp = new ArrayList<>();
                numbresDomsTemp.add(1);
                vsedoma2.put(inputStreet, numbresDomsTemp);
                result.add(1);
            } else {
                int ishemDom = 1;
                while (tempos.contains(ishemDom)) {
                    ishemDom++;
                }
                vsedoma2.get(inputStreet).add(ishemDom);
                result.add(ishemDom);
            }
        }
        result.forEach(System.out::println);
    }
}