package controller;

import model.Car.Cars;
import model.Customer.Customer;

import java.util.ArrayList;

public class ManageCustomer {
    private ArrayList<Customer> customersList;

    public ManageCustomer(){
        this.customersList = new ArrayList<Customer>();
    }
    public ManageCustomer(ArrayList<Customer> customersList){
        this.customersList = customersList;
    }

    public ArrayList<Customer> getCustomersList() {
        return customersList;
    }

    public void setCustomersList(ArrayList<Customer> customersList) {
        this.customersList = customersList;
    }
    public void addNewCustomer(Customer customer){
        this.customersList.add(customer);
    }
    public void deleteCustomer (Customer customer){
        this.customersList.remove(customer);
    }
    public void updateCustomer  (Customer customer){
        this.customersList.remove(customer);
        this.customersList.add(customer);
    }
}
