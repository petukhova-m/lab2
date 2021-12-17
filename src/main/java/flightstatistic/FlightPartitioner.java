package flightstatistic;
import org.apache.hadoop.mapreduce.Partitioner;
import org.apache.hadoop.io.Text;

public class FlightPartitioner extends Partitioner<AirportWritableComparable, DataWritable> {
    @Override

        return key.getId() % numPartitions;
    }
}
