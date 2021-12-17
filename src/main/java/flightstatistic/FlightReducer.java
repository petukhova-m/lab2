package flightstatistic;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class FlightReducer extends Reducer<AirportWritableComparable, DataWritable, Integer, Text> {

    @Override


        Text name = new Text(iter.next().getDescription());
        float min = Float.MAX_VALUE;
        float max = Float.MIN_VALUE;
        float average = Constants.ZERO;
        float counter = Constants.ZERO;
        while (iter.hasNext()) {


            counter++;
            average += arrDelay;
            min = Math.min(arrDelay, min);
            max = Math.max(arrDelay, max);
        }
        if (counter > Constants.ZERO) {
            context.write(key.getId(), new Text(String.format(pattern, name, min, max, average / counter)));
        }
    }
}
