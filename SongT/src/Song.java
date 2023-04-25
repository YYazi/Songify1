public class Song extends Medium{

    private String genre;
    private String lyrics;

    public Song(String title,Artist artist,int releaseYear, float durationOfMediumInMin) {
        super(title, artist, releaseYear,durationOfMediumInMin);
    }

    @Override
    public boolean play() {
        System.out.println(getTitle());
        return true;
    }

    @Override
    public String info() {
        return "SONG(%s, %s, %f, %d, %s  )".formatted(getTitle(),artist.getName(),getDurationOfMediumInMin(),getReleaseYear(),genre);
    }

    @Override
    public String toString() {
        return "SONG(" + getTitle() + ")";
    }
}
