public class MortgageDataRequest implements ProcessTaskInterface {

  String name;
  String address;
  String type;
  int tenure;
  double principalAmount;
  double rateOfInterest;

  @Override
  public void printData(String name, String address, String type, int tenure,
      double principalAmount, double rateOfInterest) {

    System.out.println(name);
    System.out.println(address);
    System.out.println(type);
    System.out.println(tenure);
    System.out.println(principalAmount);
    System.out.println(rateOfInterest);

  }


}
