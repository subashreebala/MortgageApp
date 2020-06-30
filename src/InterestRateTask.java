
public class InterestRateTask implements CalculatorTaskInterface {

  @Override
  public double calculateMonthlyPayout(double principalAmount, double rateOfInterestYearly,
      int tenure) {

    double monthlyPayout = principalAmount * (rateOfInterestYearly / 100) / 12;

    monthlyPayout = (double) Math.round(monthlyPayout * 100) / 100;

    return monthlyPayout;
  }

}
