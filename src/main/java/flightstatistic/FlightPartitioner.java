package flightstatistic;
import org.apache.hadoop.mapreduce.Partitioner;


public class FlightPartitioner extends Partitioner<AirportWritableComparable, DataWritable> {
    @Override
    public int getPartition(AirportWritableComparable key, DataWritable value, int numPartitions) {
        return key.getId() % numPartitions;
    }
}
