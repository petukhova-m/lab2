
import java.io.IOException;




public class FlightMapper extends Mapper<LongWritable, Text, AirportWritableComparable, DataWritable> {







            context.write(new AirportWritableComparable(writable.getId(), EntityType.FLIGHT), writable);
        }

}
