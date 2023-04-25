import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Artist bardia = new Artist("Bardia","Rahmani Khorasgani");
        Artist iceCube = new Artist("O'Shea", "Jackson");
        Artist joe = new Artist("Joe","Rogan");
        Artist edmund = new Artist("Edmund","Weitz");



        Song drehDenSwagAuf = new Song("DrehDenSwagAuf", bardia, 2010,2.1f );
        Song drehDenSwagAuf2 = new Song("DrehDenSwagAuf", bardia, 2015,2.1f );
        Song drehDenSwagAuf3 = new Song("DrehDenSwagAuf", bardia, 2018,2.1f );
        Song atemlosDurchDieNacht = new Song("atemlosDurchDieNacht", bardia,2014,3.42f);
        Song uMadBruh = new Song("u Mad Bruh?",bardia,2019,2.10f);
        Song wassup = new Song("wassup", bardia,2020,2.30f);
        Song integralsRock = new Song("integralsRock", edmund,2024,2.4f);
        Song straightArithmetic = new Song("straightArithmetic",edmund,2024,2.15f);
        Song checkYoSelf = new Song("Check Yo Self", iceCube,1993, 4.34f);
        Song goodCopBadCop = new Song("Good Cop Bad Cop",iceCube,2017,4.19f);
        Song cat = new Song("cat",iceCube,2020,2.30f);

        Album swaggerBoii = new Album("SwaggerBoii", bardia, 2009, new ArrayList<Song> (List.of(drehDenSwagAuf, atemlosDurchDieNacht)) );
        Album crazyBoy = new Album("crazyBoy", bardia,2013,new ArrayList<Song>(List.of(uMadBruh,wassup)));
        Album mathRap = new Album("Math Rap",edmund,2024,new ArrayList<Song>(List.of(integralsRock,straightArithmetic)));
        Album ogRap = new Album("OG Rap",iceCube,2018,new ArrayList<>(List.of(checkYoSelf,goodCopBadCop)));


        Podcast letTalkAboutShit = new Podcast("ImJesus", bardia, 0,25.50f);
        Podcast joeRogan = new Podcast("The Joe Rogan Show",joe,2018,60.0f);
        Podcast blabla = new Podcast("blabla",joe,2019,34.0f);
        Podcast platChat = new Podcast("From Zero to Hero",bardia,2020,31.25f);
        Podcast mathAwesome = new Podcast("Why Mathmatics?",edmund,2019,41.10f);



        GoatSongify besteApp = new GoatSongify();

        besteApp.add(Set.of(letTalkAboutShit,joeRogan,blabla,platChat,mathAwesome));
        besteApp.show3RandomPodcasts();

        besteApp.add(Set.of(swaggerBoii,crazyBoy,mathRap,ogRap));
        besteApp.show3RandomAlbums();

        try {
            besteApp.add(cat);
        }
       catch (CatException catException){
           System.out.println(catException.getMessage());

       }


        besteApp.showDashbord();
        //drehDenSwagAuf.info();
        besteApp.add(drehDenSwagAuf2);
        besteApp.add(drehDenSwagAuf3);

        besteApp.printSearchResult("drehdenSwagauf");

    }
}