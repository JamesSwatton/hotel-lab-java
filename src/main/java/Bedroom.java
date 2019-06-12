import java.util.ArrayList;

public class Bedroom extends Room{

    private int roomNumber;
    private String type;
    private int nightlyRate;

    public Bedroom(int roomNumber, int capacity, String type, int nightlyRate){
        super (capacity);
        this.roomNumber = roomNumber;
        this.nightlyRate = nightlyRate;
        this.type = type;
    }


    public int getRoomNumber() {
        return this.roomNumber;
    }


    public String getType() {
        return this.type;
    }

    public int getNightlyRate() {
        return this.nightlyRate;
    }
}
