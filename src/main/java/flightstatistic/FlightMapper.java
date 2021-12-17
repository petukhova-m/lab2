
import java.io.IOException;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Mapper;

public class FlightMapper extends Mapper<LongWritable, Text, AirportWritableComparable, DataWritable> {
    @Override

        if (key.get() == 0) {



        if (writable.getDelay() > Constants.ZERO && !writable.isCancelled()) {
            context.write(new AirportWritableComparable(writable.getId(), EntityType.FLIGHT), writable);
        }

}
