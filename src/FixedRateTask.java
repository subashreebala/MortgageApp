
public class FixedRateTask implements CalculatorTaskInterface {

  @Override
  public double calculateMonthlyPayout(double principalAmount, double rateOfInterestYearly,
      int tenure) {

    double monthlyRate = rateOfInterestYearly / 100 / 12;

    // Term in months
    int termInMonths = tenure * 12;

    // calculate monthly payment
    double monthlyPayment =
        (principalAmount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -termInMonths));

    // round to two decimals
    monthlyPayment = (double) Math.round(monthlyPayment * 100) / 100;
    return monthlyPayment;
  }



}
