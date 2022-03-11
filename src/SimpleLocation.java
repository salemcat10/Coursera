public class SimpleLocation
{
    private double latitude;
    private double longitude;

    public double getLatitude() {
        return latitude;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setLatitude(double lat) {
        if (lat < -180 || lat > 180) {
            System.out.println("Illegal value for latitude");
        } else {
            this.latitude = lat;
        }
    }
    public void setLongitude (double lon) {
        if (lon < -180 || lon > 180) {
            System.out.println("Illegal value for longitude");
        } else {
            this.longitude = lon;
        }
    }
    public SimpleLocation( double lat, double lon)
            {
                this.latitude = lat;
                this.longitude = lon;
            }


/*    public double distance(SimpleLocation other)
    {
        return getDist(this.latitude, this.longitude,
                other.latitude, other.longitude);
    }
*/
}
