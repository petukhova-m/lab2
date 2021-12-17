
import java.io.IOException;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Mapper;


    @Override
    public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        if (key.get() == 0) {

        }

        context.write(new AirportWritableComparable(writable.getId(), EntityType.AIRPORT), writable);
    }
}
