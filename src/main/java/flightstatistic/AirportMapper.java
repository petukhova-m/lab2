package flightstatistic;





    @Override





        context.write(new AirportWritableComparable(writable.getId(), EntityType.AIRPORT), writable);


