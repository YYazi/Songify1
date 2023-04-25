public class Artist {

    private String surname;
    private String name;

    public Artist(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getName(){
        return surname + " " + name;
    }
}
