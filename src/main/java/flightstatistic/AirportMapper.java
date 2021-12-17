package flightstatistic;


import org.apache.hadoop.mapreduce.Mapper;

public class AirportMapper extends Mapper<LongWritable, Text, AirportWritableComparable, DataWritable> {
    @Override


            return;
        }
        DataWritable writable = new DataWritable(value.toString(), EntityType.AIRPORT);

    }
}
