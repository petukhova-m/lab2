package flightstatistic;


import org.apache.hadoop.mapreduce.Mapper;


    @Override
    public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

            return;
        }
        DataWritable writable = new DataWritable(value.toString(), EntityType.AIRPORT);

    }
}
