package flightstatistic;


import org.apache.hadoop.mapreduce.Mapper;

public class AirportMapper extends Mapper<LongWritable, Text, AirportWritableComparable, DataWritable> {
    @Override
    public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

            return;
        }
        DataWritable writable = new DataWritable(value.toString(), EntityType.AIRPORT);

    }
}
