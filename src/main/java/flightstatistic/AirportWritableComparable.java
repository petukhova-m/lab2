



import java.io.DataOutput;


public class AirportWritableComparable implements WritableComparable<AirportWritableComparable> {
    private EntityType type;

    AirportWritableComparable(){}

        this.type = type;










        this.id = in.readInt();

    }
    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(id);

    }

    public int compareTo(AirportWritableComparable b) {




}
