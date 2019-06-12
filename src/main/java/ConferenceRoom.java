import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String name;
    private boolean hasProjector;

    public ConferenceRoom(String name, int capacity, boolean hasProjector){
        super(capacity);
        this.name = name;
        this.hasProjector = hasProjector;
    }

    public String getName() {
        return this.name;
    }


    public boolean checkHasProjector() {
        return this.hasProjector;
    }

}
