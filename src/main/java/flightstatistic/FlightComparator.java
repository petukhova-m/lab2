package flightstatistic;

import org.apache.hadoop.io.WritableComparable;


public class FlightComparator extends WritableComparator {
    public FlightComparator() {

    }


        return ((AirportWritableComparable) a).getId() - ((AirportWritableComparable) b).getId();


}
