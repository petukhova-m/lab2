
import org.apache.hadoop.mapreduce.Partitioner;
import org.apache.hadoop.io.Text;


    @Override

        return key.getId() % numPartitions;
    }
}
