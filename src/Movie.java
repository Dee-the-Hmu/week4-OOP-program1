

public class Movie extends MediaContent implements Downloadable {
    public String genre;
    public String director;

    public Movie() {

        super();
        this.genre = "default";
        this.director = "default";
    }

    public Movie(String genre, String director, String title, int releaseYear, int duration){
        
        super(title, releaseYear, duration); 
        this.genre = genre;
        this.director = director;
        
    }

    @Override
    public void play(){
        System.out.println("Current Movie: " + this.title  +" is playing!");
    }

    @Override 
    public void download(){
        System.out.println("The Movie: " + this.title  +" is downloaded!");   
    }

}