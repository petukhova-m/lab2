package flightstatistic;





    @Override


            return;

        DataWritable writable = new DataWritable(value.toString(), EntityType.AIRPORT);
        context.write(new AirportWritableComparable(writable.getId(), EntityType.AIRPORT), writable);

}
