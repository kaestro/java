import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // main1(args);
        main2(args);
    }

    public static void main1(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            items.add(i);
        }
        // items.add("kim");

        printDoubled(items);
    }

    public static void printDoubled(ArrayList<Integer> n) {
        for (Integer i : n) {
            System.out.println(i * 2);
        }
    }

    public static void main2(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        //adelaideCrows.addPlayer(pat);
        //adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        //Team<String> brokenTeam = new Team<>("this won't work");
        //brokenTeam.addPlayer("no-one");
    }
}
