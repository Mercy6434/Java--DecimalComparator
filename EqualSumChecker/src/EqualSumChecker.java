public class EqualSumChecker {

    public static void main (String[] args) {

        boolean sum = hasEqualSum(1, 1, 1);
        System.out.println(sum);

    }
    public static boolean hasEqualSum (int num1, int num2, int num3) {

        int sum = num1 + num2;

        if (sum == num3){
            return true;
        }else {
            return false;
        }


    }

}
