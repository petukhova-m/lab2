

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

enum EntityType{
    AIRPORT,
    FLIGHT


public class DataWritable implements Writable {

    private static final String FLIGHT_DELIMITER = ",";

    public int id;
    public float delay = 0;
    public String description = "";
    public boolean cancelled = false;
    public DataWritable(){


    public DataWritable(String value, EntityType type) {
        this.type = type;
        if (type == EntityType.AIRPORT){


            this.description = data[Constants.DESCRIPTION].replaceAll("\"", "");
        } else if (type == EntityType.FLIGHT) {

            this.id = Integer.parseInt(data[Constants.AIRPORT_ID].replaceAll("\"", ""));
            this.delay = data[Constants.ARR_DELAY].length() > 0 ? Float.parseFloat(data[Constants.ARR_DELAY]) : 0;
            this.cancelled = Float.parseFloat(data[Constants.IS_CANCELED]) == 1;
        }

    }

    public EntityType getType() {
        return type;


    public int getId() {
        return id;
    }

    public boolean isCancelled() {

    }

    public float getDelay() {
        return delay;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(type.ordinal());
        out.writeInt(id);

        out.writeUTF(description);

    }

    @Override
    public void readFields(DataInput in) throws IOException {
        this.type = EntityType.values()[in.readInt()];


        this.description = in.readUTF();

    }
}
