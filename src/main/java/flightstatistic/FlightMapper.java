
import java.io.IOException;




public class FlightMapper extends Mapper<LongWritable, Text, AirportWritableComparable, DataWritable> {
    @Override






            context.write(new AirportWritableComparable(writable.getId(), EntityType.FLIGHT), writable);
        }

}
