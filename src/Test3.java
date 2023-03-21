import java.util.*;

public class Test3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer colichestvoComand = Integer.parseInt(in.nextLine());
        List<Commands> noSortedComand = new ArrayList<>();
        for (int j = 0; j < colichestvoComand; j++) {
            String stroka = in.nextLine();
            String[] split = stroka.split(" ");
            Commands comands = new Commands(split[0], Integer.parseInt(split[1]));
            noSortedComand.add(comands);
        }

        sorter(noSortedComand);

        String strokaMatcha = in.nextLine();
        String[] split = strokaMatcha.split("-");

        for (Commands commands : noSortedComand) {
            if (Objects.equals(commands.getName(), split[0])) {
                commands.setPoint(commands.getPoint() + 3);
            }
        }

        sorter(noSortedComand);

        int pobeda = 0;
        for (Commands commands : noSortedComand) {
            if (Objects.equals(commands.getName(), split[0])) {
                pobeda = commands.getMesto();
                commands.setPoint(commands.getPoint() - 2);
            }
            if (Objects.equals(commands.getName(), split[1])) {
                commands.setPoint(commands.getPoint() + 1);
            }
        }
        sorter(noSortedComand);

        int nichya = 0;
        for (Commands commands : noSortedComand) {
            if (Objects.equals(commands.getName(), split[0])) {
                nichya = commands.getMesto();
                commands.setPoint(commands.getPoint() - 1);
            }
            if (Objects.equals(commands.getName(), split[1])) {
                commands.setPoint(commands.getPoint() + 2);
            }
        }
        sorter(noSortedComand);

        int proigrish = 0;
        for (Commands commands : noSortedComand) {
            if (Objects.equals(commands.getName(), split[0])) {
                proigrish = commands.getMesto();

            }
        }
        System.out.println(pobeda + " " + nichya + " " + proigrish);


    }

    private static List<Commands> sorter(List<Commands> noSortedComand) {
        noSortedComand.sort(Comparator.comparing((Commands::getPoint)).reversed().thenComparing(Commands::getName));

        Integer startMesto = 1;
        for (int i = 0; i < noSortedComand.size(); i++) {
            noSortedComand.get(i).setMesto(startMesto);
            startMesto++;
        }
        return noSortedComand;
    }
}


class Commands {
    Integer mesto;
    String name;
    Integer point;

    public Commands(String name, Integer point) {
        this.name = name;
        this.point = point;
    }

    public Integer getMesto() {
        return mesto;
    }

    public void setMesto(Integer mesto) {
        this.mesto = mesto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

}
