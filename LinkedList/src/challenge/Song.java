package challenge;

public class Song {

    private String Title;
    private double duration;

    public Song(String title, double duration) {
        Title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return Title;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "Title='" + Title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
