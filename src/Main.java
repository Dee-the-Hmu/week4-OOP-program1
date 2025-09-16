

public class Main {
    public static void main(String[] args){

      MediaContent[] objs =  new MediaContent[] { //this is not instantiating MediaContent but just referencing ([] not ()) TT
        new Movie("comedy", "John", "X man", 2000, 120 ),
        new Documentary("reality", "David Narrator", "Running Man", 2000, 80),
        new TVSeries(8, 12, "Supernatural", 1999,120)
      };


      for(MediaContent object : objs) {

        System.out.println(object.title + "'s duration = " + object.getDuration() + "\n") ;

        if (object instanceof Downloadable){

            Downloadable dObj = (Downloadable) object;
            dObj.download();
        }
        else 
            System.out.println(object.title + "is not downloadable!\n");


        object.play();

        
      }

        
    }
}
