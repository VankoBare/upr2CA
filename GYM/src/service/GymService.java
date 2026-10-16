package service;

import  models.customer;

public class GymService {
    private  static  final int CAPACITY = 10;

    private customer[] customers = new customer[CAPACITY];
    private int customerCount = 0;

    public  void addCustomer(customer customer) {
        customers[customerCount] = customer;
        customerCount ++;
                return;
    }
    public void printAllCustomers(){
        for (int i = 0; i < customerCount; i++) {
            customers[i].printInfo();
        }
        return;
    }

    public  int getCustomerCount() {
        return  customerCount;
    }
}
