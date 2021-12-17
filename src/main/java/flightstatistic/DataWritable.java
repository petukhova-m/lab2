





enum EntityType{
    AIRPORT,
    FLIGHT


public class DataWritable implements Writable {



    public int id;
    public float delay = 0;
    public String description = "";

    public DataWritable(){







            this.description = data[Constants.DESCRIPTION].replaceAll("\"", "");


            this.id = Integer.parseInt(data[Constants.AIRPORT_ID].replaceAll("\"", ""));
            this.delay = data[Constants.ARR_DELAY].length() > 0 ? Float.parseFloat(data[Constants.ARR_DELAY]) : 0;
            this.cancelled = Float.parseFloat(data[Constants.IS_CANCELED]) == 1;
        }

    }

    public EntityType getType() {



    public int getId() {
        return id;




    }

    public float getDelay() {

    }

    public String getDescription() {

    }



        out.writeInt(type.ordinal());
        out.writeInt(id);

        out.writeUTF(description);



    @Override
    public void readFields(DataInput in) throws IOException {



        this.description = in.readUTF();


}
