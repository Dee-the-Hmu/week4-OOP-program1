

public abstract class MediaContent{

    protected String title; //should use private in reality
    protected int releaseYear;
    protected int duration;

    //constructor of abstract class WHATTT :(
    //because subclasses inheirt its constructors and to initialize shared attributes
    public MediaContent(String title, int releaseYear, int duration) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.duration = duration;
    }

    public MediaContent() {
        this.title = "";
        this.releaseYear = 0;
        this.duration = 0;
    }

    //abstract method , only method headings, no method body, must be public, must use "abstract"
    abstract public void play();

    
    public int getDuration() {
        return this.duration;
    }
}