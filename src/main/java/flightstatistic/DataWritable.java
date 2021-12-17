





enum EntityType{
    AIRPORT,



public class DataWritable implements Writable {



    public int id;

    public String description = "";

    public DataWritable(){










            this.id = Integer.parseInt(data[Constants.AIRPORT_ID].replaceAll("\"", ""));

            this.cancelled = Float.parseFloat(data[Constants.IS_CANCELED]) == 1;
        }













    }

    public float getDelay() {





    }




        out.writeInt(id);













}
