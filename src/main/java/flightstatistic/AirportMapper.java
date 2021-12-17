
import java.io.IOException;

import org.apache.hadoop.mapreduce.Mapper;






        }
        DataWritable writable = new DataWritable(value.toString(), EntityType.AIRPORT);
        context.write(new AirportWritableComparable(writable.getId(), EntityType.AIRPORT), writable);
    }
}
