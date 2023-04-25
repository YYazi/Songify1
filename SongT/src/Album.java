import java.util.ArrayList;

public class Album extends Medium {

    private ArrayList<Song> songs;

    public Album(String title, Artist artist, int releaseYear,ArrayList<Song> songs) {
        super(title, artist, releaseYear);
        this.songs = songs;
    }

    @Override
    public boolean play() {
        songs.get(0).play();
        return true;
    }

    @Override
    public String info() {
        return "ALBUM(%s, %s, %d, %f, %d)".formatted(getTitle(),artist.getName(),getReleaseYear(),durationOfAlbum(),amountOfSongsInAlbum());
    }

    public long amountOfSongsInAlbum(){
        return songs.stream().distinct().count();
    }

    public float durationOfAlbum() {
        float timer = 0;
        for (Song song : songs) {
            timer+=song.getDurationOfMediumInMin();
        }
        return timer;

    }

}
