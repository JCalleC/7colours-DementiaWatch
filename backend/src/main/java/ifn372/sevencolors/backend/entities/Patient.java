package ifn372.sevencolors.backend.entities;

import java.sql.Timestamp;

/**
 * Created by lua on 15/08/2015.
 */
public class Patient extends User {

    public long getLocation_last_update() {
        return location_last_update;
    }

    public void setLocation_last_update(long location_last_update) {
        this.location_last_update = location_last_update;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }


    public int getCarer_id() {
        return carer_id;
    }

    public void setCarer_id(int carer_id) {
        this.carer_id = carer_id;
    }

    Location currentLocation;
    private long location_last_update;
    int carer_id;
}
