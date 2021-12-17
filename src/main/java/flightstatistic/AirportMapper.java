package flightstatistic;
import java.io.IOException;

import org.apache.hadoop.mapreduce.Mapper;





            return;
        }
        DataWritable writable = new DataWritable(value.toString(), EntityType.AIRPORT);
        context.write(new AirportWritableComparable(writable.getId(), EntityType.AIRPORT), writable);

}
