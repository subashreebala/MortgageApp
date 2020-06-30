import java.util.HashMap;
import java.util.Map;

public class MortgageCalculator {


  private CalculatorTaskInterface calculatePayment =
      new FixedRateTask();


  Map<String, Double> payout = new HashMap<>();
  
  public Map<String, Double> calculateInterest(double principal, double yearlyRate, int term)
      throws Exception {


    double fixedRate = calculatePayment.calculateMonthlyPayout(principal, yearlyRate, term);

    System.out.println(fixedRate);
    payout.put("fixedRate", fixedRate);

    calculatePayment = new InterestRateTask();

    double interestRate = calculatePayment.calculateMonthlyPayout(principal, yearlyRate, term);

    payout.put("interestRate", interestRate);

    return payout;
  }

  public static void main(String[] args) throws Exception {

    Map<String, Double> payment = new HashMap<>();

    MortgageDataRequest req = new MortgageDataRequest();
    req.printData("suba", "chennai", "savings", 10000, 4, 8);
    
    MortgageCalculator mortgage = new MortgageCalculator();
    payment = mortgage.calculateInterest(10000.0, 4.0, 8);

    System.out.println(payment);
    
  }


}
