public abstract class Medium {

    private float durationOfMediumInMin;
    private String title;
    protected Artist artist;
    private int releaseYear;

    public Medium(String title, Artist artist, int releaseYear) {
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;

    }

    public Medium(String title, Artist artist, int releaseYear, float durationOfMediumInMin) {
        this(title,artist,releaseYear);
        this.durationOfMediumInMin = durationOfMediumInMin;
    }

    public abstract boolean play();

    public String getTitle() {
        return title;
    }

    public int getReleaseYear(){
        return releaseYear;
    }

    public float getDurationOfMediumInMin(){
        return durationOfMediumInMin;
    }

    public abstract String info();


}

