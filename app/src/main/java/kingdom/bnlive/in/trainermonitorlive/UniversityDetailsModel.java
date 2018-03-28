package kingdom.bnlive.in.trainermonitorlive;

/**
 * Created by Sk Faisal on 3/26/2018.
 */

public class UniversityDetailsModel {
    private String address;
    private String lat_long;
    private String location;
    private String university_name;

    public UniversityDetailsModel() {
    }

    public UniversityDetailsModel(String address, String lat_long, String location, String university_name) {
        this.address = address;
        this.lat_long = lat_long;
        this.location = location;
        this.university_name = university_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLat_long() {
        return lat_long;
    }

    public void setLat_long(String lat_long) {
        this.lat_long = lat_long;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUniversity_name() {
        return university_name;
    }

    public void setUniversity_name(String university_name) {
        this.university_name = university_name;
    }

    @Override
    public String toString() {
        return "UniversityDetailsModel{" +
                "address='" + address + '\'' +
                ", lat_long='" + lat_long + '\'' +
                ", location='" + location + '\'' +
                ", university_name='" + university_name + '\'' +
                '}';
    }
}
