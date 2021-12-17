package flightstatistic;


import org.apache.hadoop.mapreduce.Mapper;

public class AirportMapper extends Mapper<LongWritable, Text, AirportWritableComparable, DataWritable> {
    @Override


            return;


        context.write(new AirportWritableComparable(writable.getId(), EntityType.AIRPORT), writable);
    }
}
