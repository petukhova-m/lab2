package flightstatistic;


import org.apache.hadoop.mapreduce.Reducer;


import java.util.Iterator;

public class FlightReducer extends Reducer<AirportWritableComparable, DataWritable, Integer, Text> {




        Text name = new Text(iter.next().getDescription());
        float min = Float.MAX_VALUE;


        float counter = Constants.ZERO;





            min = Math.min(arrDelay, min);
            max = Math.max(arrDelay, max);
        }
        if (counter > Constants.ZERO) {
            context.write(key.getId(), new Text(String.format(pattern, name, min, max, average / counter)));
        }

}
