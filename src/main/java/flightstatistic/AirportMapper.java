package flightstatistic;


import org.apache.hadoop.mapreduce.Mapper;


    @Override


            return;


        context.write(new AirportWritableComparable(writable.getId(), EntityType.AIRPORT), writable);
    }
}
