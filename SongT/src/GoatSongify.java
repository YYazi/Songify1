import java.util.*;
import java.util.Random;

public class GoatSongify {

    private Set<Medium> mediums = new HashSet<>();


    public void showDashbord() {
        for (Medium medium : mediums) {
            System.out.print(medium.getTitle() + " ");
        }
    }

    public boolean add(Collection<Medium> mediums){
        return this.mediums.addAll(mediums);
    }

    public boolean add(Medium medium){
        if (medium.getTitle().equals("cat")){
            throw new CatException("This Medium couldn't be created:" + medium.getClass());
        }
        return mediums.add(medium);
    }

    public List<Medium> search(String searchTerm){
        String lowerCaseSearchTerm = searchTerm.toLowerCase();
        return mediums.stream().filter(medium -> medium.getTitle().toLowerCase().contains(lowerCaseSearchTerm)).
                sorted(Comparator.comparing(Medium::getTitle).thenComparing(Medium::getReleaseYear).reversed()).toList();
    }

    public void printSearchResult(String query){
        System.out.println("Suchergebnisse:");
        List<Medium> searchResult = search(query);
        if (searchResult.isEmpty()){
            System.out.println("Die Suche ergab keine resultados.");
        }
        else {
            var foundMediumsInfos = searchResult.stream().map(medium -> medium.info() ).toList();
            System.out.println(foundMediumsInfos);
        }
    }

    public void show3RandomPodcasts(){
        int counter = 0;
        for (Medium medium : mediums) {
            if (medium instanceof Podcast) {
                System.out.println(medium.info());
                counter++;
            }
            if (counter==3){
                break;
            }
        }
    }

    public void show3RandomAlbums(){
        int counter = 0;
        for (Medium medium : mediums) {
            if (medium instanceof Album) {
                System.out.println( medium.info());
                counter++;
            }
            if(counter==3){
                break;
            }
        }
    }
}
