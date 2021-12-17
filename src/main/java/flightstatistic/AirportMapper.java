package flightstatistic;


import org.apache.hadoop.mapreduce.Mapper;


    @Override





        context.write(new AirportWritableComparable(writable.getId(), EntityType.AIRPORT), writable);


