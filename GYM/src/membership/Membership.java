package membership;

public interface Membership {
    double getPrice();

default void printBenefits() {
        System.out.println("Benefits: access to gym");
    }
static void printGymRules() {

    System.out.println("Gym rules");
    System.out.println("Max members:10");
    System.out.println("Member age");
    System.out.println("Prices in EUR");

    }
}
