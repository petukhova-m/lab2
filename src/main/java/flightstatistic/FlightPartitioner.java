

import org.apache.hadoop.io.Text;

public class FlightPartitioner extends Partitioner<AirportWritableComparable, DataWritable> {

    public int getPartition(AirportWritableComparable key, DataWritable value, int numPartitions) {


}
