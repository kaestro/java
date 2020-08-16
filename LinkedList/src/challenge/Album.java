package challenge;

import java.util.ArrayList;

public class Album {

    private ArrayList<Song> songs;
    private String name;

    public Album(String name) {
        this.name = name;
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public String getName() {
        return name;
    }

    public Song getSongByTitle(String title) {
        Song res = null;

        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                res = song;
                break;
            }
        }

        return res;
    }

}
