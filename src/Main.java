public class Main
{

    public static void main(String[] args)
    {
	int creditCardBalance = 5000;
    double INTEREST_RATE = 0.17;
    double interestOneMonth = creditCardBalance * INTEREST_RATE;
    double interestTwoMonth = interestOneMonth + interestOneMonth * INTEREST_RATE;

        System.out.println("The interest due after one month is " + interestOneMonth + " and the interest due after two months is " + interestTwoMonth);
    }
}
