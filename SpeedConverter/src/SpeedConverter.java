public class SpeedConverter {

  /*  public static void main(String[] args)
    {

        long roundedMilesPerHour = toMilesPerHour(75.114);
        System.out.println(roundedMilesPerHour);

        printConversion(75.114);


    }*/

    public static long toMilesPerHour(double kilometersPerHour)
    {
        if (kilometersPerHour > 0)
        {

            double milesPerHour = (kilometersPerHour / 1.609);

            long roundedMilesPerHour = Math.round(milesPerHour);
            return roundedMilesPerHour;
        }
        else if (kilometersPerHour < 0)
        {
            return -1;
        }return 0;
    }

    public static void printConversion( double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {

            long roundedMilesPerHour = toMilesPerHour(kilometersPerHour);
            toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + roundedMilesPerHour + " mi/h");

        }
    }
}


