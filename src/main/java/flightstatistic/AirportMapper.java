
import java.io.IOException;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Mapper;






        }

        context.write(new AirportWritableComparable(writable.getId(), EntityType.AIRPORT), writable);
    }
}
