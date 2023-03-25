import java.util.*;

public class test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstDay = Integer.parseInt(in.nextLine());
        Map<String, List<Integer>> vsedoma2 = new HashMap<>();
        List<Integer> result = new LinkedList<>();
        for (int j = 0; j < firstDay; j++) {
            String stroka = in.nextLine();
            if (stroka.matches("\\w+\\d+")) {
                String[] nameUlica = stroka.split("\\d");
                String neameUlicaString = nameUlica[0].toLowerCase();
                int razmer = neameUlicaString.length();
                Integer numb = Integer.parseInt(stroka.substring(razmer));
                List<Integer> numbresDomsTemp = new ArrayList<>();
                List<Integer> tempos = getValueMap(vsedoma2, neameUlicaString);
                if (tempos == null) {
                    numbresDomsTemp.add(numb);
                    vsedoma2.put(neameUlicaString, numbresDomsTemp);
                } else if (!tempos.contains(numb)) {
                    vsedoma2.get(neameUlicaString).add(numb);
                }
            } else {
                List<Integer> numbresDomsTemp = new ArrayList<>();
                List<Integer> tempos = getValueMap(vsedoma2, stroka);
                if (tempos == null) {
                    numbresDomsTemp.add(1);
                    vsedoma2.put(stroka, numbresDomsTemp);
                } else {
                    Integer ishemDom = 1;
                    do {
                        if (tempos.contains(ishemDom)) {
                            ishemDom++;
                        }
                    }
                    while (tempos.contains(ishemDom));
                    vsedoma2.get(stroka).add(ishemDom);
                    result.add(ishemDom);
                }
            }
        }
        int secondDay = Integer.parseInt(in.nextLine());
        for (int j = 0; j < secondDay; j++) {
            String stroka = in.nextLine();
            if (stroka.matches("\\w+\\d+")) {
                String[] nameUlica = stroka.split("\\d");
                String neameUlicaString = nameUlica[0].toLowerCase();
                int razmer = neameUlicaString.length();
                Integer numb = Integer.parseInt(stroka.substring(razmer));
                List<Integer> numbresDomsTemp = new ArrayList<>();
                List<Integer> tempos = getValueMap(vsedoma2, neameUlicaString);
                if (tempos == null) {
                    numbresDomsTemp.add(numb);
                    result.add(numb);
                    vsedoma2.put(neameUlicaString, numbresDomsTemp);
                } else if (!tempos.contains(numb)) {
                    vsedoma2.get(neameUlicaString).add(numb);
                    result.add(numb);
                }
            } else {
                List<Integer> numbresDomsTemp = new ArrayList<>();
                List<Integer> tempos = getValueMap(vsedoma2, stroka);
                if (tempos == null) {
                    numbresDomsTemp.add(1);
                    vsedoma2.put(stroka, numbresDomsTemp);
                    result.add(1);
                } else {
                    Integer ishemDom = 1;
                    do {
                        if (tempos.contains(ishemDom)) {
                            ishemDom++;
                        }
                    }
                    while (tempos.contains(ishemDom));
                    vsedoma2.get(stroka).add(ishemDom);
                    result.add(ishemDom);
                }
            }

        }
              result.forEach(System.out::println);
    }

    public static <K, V> V getValueMap(Map<K, V> map, K key) {
        return map.entrySet().stream()
                .filter(entry -> key.equals(entry.getKey()))
                .findFirst().map(Map.Entry::getValue)
                .orElse(null);
    }
}




