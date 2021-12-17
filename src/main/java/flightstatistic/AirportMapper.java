

import org.apache.hadoop.io.*;


public class AirportMapper extends Mapper<LongWritable, Text, AirportWritableComparable, DataWritable> {

    public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

            return;

        DataWritable writable = new DataWritable(value.toString(), EntityType.AIRPORT);


}
