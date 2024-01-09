package model.Customer;

public abstract class Customer {
    private String name;
    private String idCustomer;
    private String phoneNumber;

    public Customer(String name, String idCustomer, String phoneNumber) {
        this.name = name;
        this.idCustomer = idCustomer;
        this.phoneNumber = phoneNumber;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public abstract double payment();
}
