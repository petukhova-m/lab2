package flightstatistic;


import org.apache.hadoop.mapreduce.Mapper;

public class AirportMapper extends Mapper<LongWritable, Text, AirportWritableComparable, DataWritable> {





        DataWritable writable = new DataWritable(value.toString(), EntityType.AIRPORT);
        context.write(new AirportWritableComparable(writable.getId(), EntityType.AIRPORT), writable);


