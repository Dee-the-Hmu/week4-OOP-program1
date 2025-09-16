

public class TVSeries extends MediaContent implements Downloadable {

    public int seasons;
    public int episodesPerSeason;

    public TVSeries() {
        
        super();
        this.seasons = 0;
        this.episodesPerSeason = 0;
    }

    public TVSeries(int seasons, int episodesPerSeason, String title, int releaseYear, int duration){

        super(title, releaseYear, duration);
        this.seasons = seasons;
        this.episodesPerSeason = episodesPerSeason;
    }

    @Override
    public void download(){
        System.out.println(this.title + " TV series is downloaded!");
    }

    @Override 
    public void play(){
        System.out.println(this.title + " TV series is playing!");
    }

}