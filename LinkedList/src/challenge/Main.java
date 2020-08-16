package challenge;

import java.util.Scanner;

public class Main {

    public static PlayList pl;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Album hello = new Album("hello");
        hello.addSong(new Song("world", 5.1));
        hello.addSong(new Song("seoul", 6.2));
        hello.addSong(new Song("incheon", 7.3));
        hello.addSong(new Song("new york", 8.4));

        pl = new PlayList();
        pl.addAlbum(hello);
        pl.addSong(hello, "world");
        pl.addSong(hello, "seoul");

        boolean quit = false;
        int order = 0;

        quit = pl.processOrder(order);
        while (!quit) {
            System.out.print("Enter number: ");
            order = scanner.nextInt();
            quit = pl.processOrder(order);
        }
    }
}
