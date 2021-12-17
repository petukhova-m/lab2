package flightstatistic;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Mapper;


    @Override

        if (key.get() == 0) {

        }

        context.write(new AirportWritableComparable(writable.getId(), EntityType.AIRPORT), writable);

}
