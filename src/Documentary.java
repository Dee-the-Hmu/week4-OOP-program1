

public class Documentary extends MediaContent {

    public String category; 
    public String narrator; 

    public Documentary(){
        super();
        this.category = "";
        this.narrator = "";
    }

    public Documentary(String category, String narrator, String title, int releaseYear, int duration){

        super(title, releaseYear, duration);
        this.category = category;
        this.narrator = narrator;
    }

    @Override
    public void play() {
        System.out.println(this.title + " documentary is playing!");
    }
}