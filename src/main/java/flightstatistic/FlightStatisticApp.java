
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.*;

import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class FlightStatisticApp {

        if (args.length != 3) {
            System.err.println("Usage: FlightStatisticApp FlightStatisticApp <input path>[] <output path>");



        job.setJarByClass(FlightStatisticApp.class);
        job.setJobName("Flight sort");




        job.setPartitionerClass(FlightPartitioner.class);
        job.setGroupingComparatorClass(FlightComparator.class);

        job.setMapOutputKeyClass(AirportWritableComparable.class);



        job.setOutputValueClass(Text.class);


    }
}
