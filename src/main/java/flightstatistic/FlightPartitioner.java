package flightstatistic;
import org.apache.hadoop.mapreduce.Partitioner;


public class FlightPartitioner extends Partitioner<AirportWritableComparable, DataWritable> {
    @Override

        return key.getId() % numPartitions;
    }
}
