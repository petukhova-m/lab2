package flightstatistic;


import org.apache.hadoop.mapreduce.Reducer;




public class FlightReducer extends Reducer<AirportWritableComparable, DataWritable, Integer, Text> {





        float min = Float.MAX_VALUE;








            min = Math.min(arrDelay, min);
            max = Math.max(arrDelay, max);

        if (counter > Constants.ZERO) {
            context.write(key.getId(), new Text(String.format(pattern, name, min, max, average / counter)));
        }

}
