public class FooCorporation
{

    public static void main (String[] args)
         {

              totalPay(7.50, 35);
              totalPay(8.20, 47);
              totalPay(10.00, 73);
         }


    public static void totalPay(double basePay, int hoursWorked)
    {

        double minimumWage = 8.0;
        int maximumHours = 60;
        double totalSalary = 0;


        if ((basePay < minimumWage) || (hoursWorked > maximumHours))
        {
            System.out.println("Error");
        }

        else
            {
                 if (hoursWorked > 40)
                   {
                      totalSalary = (basePay * 40) + (1.5 * basePay) * (hoursWorked - 40);
                   }
                 else
                     {
                       totalSalary = basePay * hoursWorked;
                     }
                 System.out.println(totalSalary);

            }
    }
}
