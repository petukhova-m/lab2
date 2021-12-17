



import java.io.DataOutput;


public class AirportWritableComparable implements WritableComparable<AirportWritableComparable> {















        this.id = in.readInt();

    }
    @Override

        out.writeInt(id);

    }

    public int compareTo(AirportWritableComparable b) {




}
