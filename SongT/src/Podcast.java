public class Podcast extends Medium{


    private String genre;

    public Podcast(String title, Artist artist, int releaseYear, float durationOfMediumInMin) {
        super(title, artist, releaseYear,durationOfMediumInMin);
    }

    @Override
    public boolean play() {
        System.out.println(getTitle());
        return true;
    }

    @Override
    public String info() {
        return "PODCAST( %s, %s, %d, %f, %s)".formatted(getTitle(),artist.getName(),getReleaseYear(),getDurationOfMediumInMin(),genre);
    }

    public String getGenre(){
        return genre;
    }

}
