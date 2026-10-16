import membership.Membership;
import membership.BasicK;
import membership.PremiumK;
import models.customer;
import service.GymService;

public class Main {
    public static void main(String[] args) {

        Membership.printGymRules();

        GymService gymService = new GymService();

        customer customer1 = new customer(
                "Andrew", 25, new BasicK()
        );

        customer customer2 = new customer(
                "Minka", 30, new PremiumK()
        );

        customer customer3 = new customer(
                "Pecata", 22, new PremiumK()
        );


        gymService.addCustomer(customer1);
        gymService.addCustomer(customer2);
        gymService.addCustomer(customer3);

        System.out.println("Members");

        gymService.printAllCustomers();

        System.out.println(
                "Total members: "
                        + gymService.getCustomerCount()
        );
    }
}
