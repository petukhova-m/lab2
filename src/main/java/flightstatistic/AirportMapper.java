package flightstatistic;
import java.io.IOException;



public class AirportMapper extends Mapper<LongWritable, Text, AirportWritableComparable, DataWritable> {
    @Override


            return;

        DataWritable writable = new DataWritable(value.toString(), EntityType.AIRPORT);
        context.write(new AirportWritableComparable(writable.getId(), EntityType.AIRPORT), writable);
    }
}
