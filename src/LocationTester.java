public class LocationTester
{
    public static void main(String[] args)
    {
        SimpleLocation ucsd =
                new SimpleLocation(32.9, -117.2);
        SimpleLocation lima =
                new SimpleLocation(-12.0, -77.0);
//        System.out.println(ucsd.distance(lima));
        double[] coords = {5.0, 0.0};
        ArrayLocation accra = new ArrayLocation(coords);

        System.out.print(accra.coords[0] + " ");
        System.out.println(accra.coords[1]);
        coords[0] = 32.9;
        coords[1] = -117.2;
        System.out.print(accra.coords[0] + " ");
        System.out.println(accra.coords[1]);

    }
}
