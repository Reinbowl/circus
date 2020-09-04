package circus.animal;

import circus.Asset;

<<<<<<< HEAD
public class Animal implements Asset {

    @Override
    public int getValue() {
        return 10;
    }

    public String speak(){
        return null;
    }
=======
public abstract class Animal implements Asset {
    
    public abstract String speak();
>>>>>>> improved
}
