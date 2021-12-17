

import org.apache.hadoop.io.*;


import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class FlightStatisticApp {


            System.err.println("Usage: FlightStatisticApp FlightStatisticApp <input path>[] <output path>");




        job.setJobName("Flight sort");




        job.setPartitionerClass(FlightPartitioner.class);


        job.setMapOutputKeyClass(AirportWritableComparable.class);



        job.setOutputValueClass(Text.class);



}
