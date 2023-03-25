import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstDay = Integer.parseInt(in.nextLine());
        List<Adress> vsedoma = new ArrayList<>();
        List<Integer> result = new LinkedList<>();
        for (int j = 0; j < firstDay; j++) {
            String stroka = in.nextLine();
            if (stroka.matches("\\w+\\d+")) {
                String[] nameUlica = stroka.split("\\d");
                String neameUlicaString = nameUlica[0].toLowerCase();
                int razmer = neameUlicaString.length();
                Integer numb = Integer.parseInt(stroka.substring(razmer));
                List<Integer> numbresDomsTemp = new ArrayList<>();
                if (vsedoma.size() > 0) {
                    for (int i = 0; i < vsedoma.size(); i++) {
                        if (vsedoma.get(i).getName().equals(neameUlicaString)) {
                            if (vsedoma.get(i).numbresDoms.contains(numb)) {
                                break;
                            }
                            vsedoma.get(i).numbresDoms.add(numb);
                            break;
                        } else {
                            numbresDomsTemp.add(numb);
                            vsedoma.add(new Adress(neameUlicaString, numbresDomsTemp));
                        }
                    }
                } else {
                    numbresDomsTemp.add(numb);
                    vsedoma.add(new Adress(neameUlicaString, numbresDomsTemp));
                }
            } else {
                List<Integer> numbresDomsTemp = new ArrayList<>();
                if (vsedoma.size() > 0) {
                    boolean ink = true;
                    for (Adress adress : vsedoma) {
                        if (adress.getName().equals(stroka)) {
                            ink = false;
                            Integer ishemDom = 1;
                            do {
                                if (adress.numbresDoms.contains(ishemDom)) {
                                    ishemDom++;
                                }
                            }
                            while (adress.numbresDoms.contains(ishemDom));
                            adress.numbresDoms.add(ishemDom);
                            break;
                        }
                    }
                    if (ink) {
                        numbresDomsTemp.add(1);
                        vsedoma.add(new Adress(stroka, numbresDomsTemp));

                    }
                } else {
                    numbresDomsTemp.add(1);
                    vsedoma.add(new Adress(stroka, numbresDomsTemp));
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
                if (vsedoma.size() > 0) {
                    for (int i = 0; i < vsedoma.size(); i++) {
                        if (vsedoma.get(i).getName().equals(neameUlicaString)) {
                            if (vsedoma.get(i).numbresDoms.contains(numb)) {
                                break;
                            }
                            vsedoma.get(i).numbresDoms.add(numb);
                            result.add(numb);
                            break;
                        } else {
                            numbresDomsTemp.add(numb);
                            vsedoma.add(new Adress(neameUlicaString, numbresDomsTemp));
                            result.add(numb);
                        }
                    }
                } else {
                    numbresDomsTemp.add(numb);
                    vsedoma.add(new Adress(neameUlicaString, numbresDomsTemp));
                    result.add(numb);
                }
            } else {
                List<Integer> numbresDomsTemp = new ArrayList<>();
                if (vsedoma.size() > 0) {
                    boolean ink = true;
                    for (Adress adress : vsedoma) {
                        if (adress.getName().equals(stroka)) {
                            ink = false;
                            Integer ishemDom = 1;
                            do {
                                if (adress.numbresDoms.contains(ishemDom)) {
                                    ishemDom++;
                                }
                            }
                            while (adress.numbresDoms.contains(ishemDom));
                            adress.numbresDoms.add(ishemDom);
                            result.add(ishemDom);
                            break;
                        }
                    }
                    if (ink) {
                        numbresDomsTemp.add(1);
                        vsedoma.add(new Adress(stroka, numbresDomsTemp));
                        result.add(1);
                    }
                } else {
                    numbresDomsTemp.add(1);
                    vsedoma.add(new Adress(stroka, numbresDomsTemp));
                    result.add(1);
                }
            }
        }
      result.forEach(System.out::println);
    }
}

class Adress {
    String name;
    List<Integer> numbresDoms;

    public Adress(String name, List<Integer> numbresDoms) {
        this.name = name;
        this.numbresDoms = numbresDoms;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "name='" + name + '\'' +
                ", numbresDoms=" + numbresDoms +
                '}';
    }
}

