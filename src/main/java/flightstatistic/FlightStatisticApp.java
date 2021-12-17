
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class FlightStatisticApp {

        if (args.length != 3) {
            System.err.println("Usage: FlightStatisticApp FlightStatisticApp <input path>[] <output path>");
            System.exit(-1);


        job.setJarByClass(FlightStatisticApp.class);
        job.setJobName("Flight sort");
        MultipleInputs.addInputPath(job, new Path(args[0]), TextInputFormat.class, FlightMapper.class);
        MultipleInputs.addInputPath(job, new Path(args[1]), TextInputFormat.class, AirportMapper.class);


        job.setPartitionerClass(FlightPartitioner.class);
        job.setGroupingComparatorClass(FlightComparator.class);

        job.setMapOutputKeyClass(AirportWritableComparable.class);
        job.setMapOutputValueClass(DataWritable.class);


        job.setOutputValueClass(Text.class);

        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }
}
