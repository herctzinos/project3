package do_you_feel_lucky;

public class IDleaflet {

    private static int id;

    public IDleaflet() {//Creates ID for each leaflet
        id++;
    }

    public int getId() {
        return id;
    }
}
