/*
 * Class Ship has atributes of each ship of game.
 */
public class Navio{
    boolean hits;           // boolean to know if ship was hit.
    
    // method construct to initialize hits as false.
    public Navio{
	hits = false;
    }
    public void acertar(){
        hits = true;
    }
}
