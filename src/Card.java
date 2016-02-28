import java.awt.*;

/**
 * Created by endrias on 2/28/2016.
 */
public class Card {
    public String pros;
    public String cons;
    public String name;
    public Color color;
    public int index;
    public Card(String name, String pros, String cons, int index ) {
        this.name = name;
        this.pros = pros;
        this.cons = cons;
        this.index = index;
    }
    
    public String toString(){
    	return name + " Pros: " + pros + " Cons: " + cons;
    }
}
