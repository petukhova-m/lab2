package flightstatistic;




public class AirportMapper extends Mapper<LongWritable, Text, AirportWritableComparable, DataWritable> {
    @Override




        DataWritable writable = new DataWritable(value.toString(), EntityType.AIRPORT);
        context.write(new AirportWritableComparable(writable.getId(), EntityType.AIRPORT), writable);


