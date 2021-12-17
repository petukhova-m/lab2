package flightstatistic;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class FlightComparator extends WritableComparator {
    public FlightComparator() {
        super (AirportWritableComparable.class, true);
    }


        return ((AirportWritableComparable) a).getId() - ((AirportWritableComparable) b).getId();


}
