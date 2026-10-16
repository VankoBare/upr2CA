package membership;

public class PremiumK implements  Membership {

    private static final double Price = 60.00;

    @Override
    public double getPrice() {
        return Price;
    }

    @Override
    public void printBenefits() {
        System.out.println("Benefits: access to gym");

    }
}
