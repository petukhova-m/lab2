package flightstatistic;


import org.apache.hadoop.mapreduce.Reducer;




public class FlightReducer extends Reducer<AirportWritableComparable, DataWritable, Integer, Text> {





        float min = Float.MAX_VALUE;








            min = Math.min(arrDelay, min);






}
