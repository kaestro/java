package challenge;

import java.util.*;

public class PlayList {

    private LinkedList<Song> songs;
    private ArrayList<Album> albums;
    private ListIterator<Song> songsIt;
    boolean forward;

    public PlayList() {
        songs = new LinkedList<>();
        albums = new ArrayList<>();
        songsIt = null;
        forward = true;
    }

    public boolean processOrder(int orderNo) {
        boolean res = false;
        switch (orderNo) {
            case 0:
                break;
            case 1:
                addSong();
                break;
            case 2:
                skipForward();
                break;
            case 3:
                skipBackward();
                break;
            case 4:
                replay();
                break;
            case 5:
                listSongs();
                break;
            case 6:
                addAlbum();
                break;
            case 9:
                res = true;
                break;
        }

        if (!res) {
            showMenu();
        }
        return res;
    }

    public void addAlbum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type in album Title: ");
        String albumTitle = scanner.nextLine();

        for (Album album : albums) {
            if (album.getName().equals(albumTitle)) {
                System.out.println("Album exists");
                return;
            }
        }

        albums.add(new Album(albumTitle));
        System.out.println("new Album [" + albumTitle + "] has been added");
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public void addSong() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type in albumTitle: ");
        String albumTitle = scanner.nextLine();

        Album targetAlbum = null;
        for (Album album : albums) {
            if (album.getName().equals(albumTitle)) {
                targetAlbum = album;
                break;
            }
        }

        if (targetAlbum == null) {
            System.out.println("There's no album");
            return;
        }

        System.out.print("Type in songTitle: ");
        String songTitle = scanner.nextLine();

        addSong(targetAlbum, songTitle);
    }


    public void addSong(Album album, String title) {

        Song song = album.getSongByTitle(title);
        if (song != null) {
            songs.add(song);
            System.out.println("Song has been added to the playlist");
            songsIt = songs.listIterator();
            songsIt.next();
            forward = true;
        } else {
            System.out.println("There's no song with the title in the album");
        }
    }

    public void showMenu() {
        System.out.println(
                "0 - showMenu again\n"
                + "1 - add new song to the playlist\n"
                + "2 - skip forward to the next song\n"
                + "3 - skip backwards to a previous song.\n"
                + "4 - replay the current song\n"
                + "5 - list the songs in the playlist\n"
                + "6 - add new Album to the playlist\n"
                + "9 - end the music player\n"
        );
    }

    public void skipForward() {
        if (!forward) {
            if (songsIt.hasNext()) {
                songsIt.next();
            }
            forward = true;
        }

        if (songsIt.hasNext()) {
            System.out.println("Playing " + songsIt.next().toString());
        } else {
            System.out.println("This is the end of playList");
            forward = false;
        }
    }

    public void skipBackward() {
        if (forward) {
            if (songsIt.hasPrevious()) {
                songsIt.previous();
            }
            forward = false;
        }

        if (songsIt.hasPrevious()) {
            System.out.println("Playing " + songsIt.previous());
        } else {
            System.out.println("This is the beginning of the playList");
            forward = true;
        }
    }

    public void replay() {
        if (songs.isEmpty()) {
            System.out.println("Playlist is currently empty");
        } else {
            if (forward) {
                if (songsIt.hasPrevious()) {
                    System.out.println("Playing " + songsIt.previous());
                    forward = false;
                }
            } else {
                if (songsIt.hasNext()) {
                    System.out.println("Playing " + songsIt.next());
                    forward = true;
                }
            }
        }
    }

    public void listSongs() {
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}

