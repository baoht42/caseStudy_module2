package model.Customer;

public abstract class Customer {
    private String name;
    private String idCustomer;
    private String phoneNumber;
    int pointMember;

    public Customer(String name, String idCustomer, String phoneNumber, int pointMember) {
        this.name = name;
        this.idCustomer = idCustomer;
        this.phoneNumber = phoneNumber;
        this.pointMember = pointMember;
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

    public int getPointMember() {
        return pointMember;
    }

    public void setPointMember(int pointMember) {
        this.pointMember = pointMember;
    }

    public abstract double payment();

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", pointMember=" + pointMember +
                '}';
    }
}
