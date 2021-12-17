





enum EntityType{
    AIRPORT,
    FLIGHT


public class DataWritable implements Writable {



    public int id;

    public String description = "";

    public DataWritable(){










            this.id = Integer.parseInt(data[Constants.AIRPORT_ID].replaceAll("\"", ""));
            this.delay = data[Constants.ARR_DELAY].length() > 0 ? Float.parseFloat(data[Constants.ARR_DELAY]) : 0;
            this.cancelled = Float.parseFloat(data[Constants.IS_CANCELED]) == 1;
        }

    }











    }

    public float getDelay() {



    public String getDescription() {

    }




        out.writeInt(id);













}
