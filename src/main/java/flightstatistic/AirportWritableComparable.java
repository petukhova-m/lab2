


import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportWritableComparable implements WritableComparable<AirportWritableComparable> {
    private EntityType type;
    private int id;
    AirportWritableComparable(){}
    AirportWritableComparable(int id, EntityType type) {
        this.type = type;

    }
    public EntityType getType() {
        return type;
    }
    public int getId() {
        return id;
    }
    @Override
    public void readFields(DataInput in) throws IOException {
        this.id = in.readInt();
        this.type = EntityType.values()[in.readInt()];
    }
    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(id);
        out.writeInt(type.ordinal());
    }

    public int compareTo(AirportWritableComparable b) {
        Integer a = this.id - b.getId();

        return (a == 0 ? c : a);
    }
}
