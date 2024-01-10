package model.Customer;
import model.Car.Cars;

public class VipCustomer extends Customer {
    int pointMember;

    public VipCustomer(String name, String idCustomer, String phoneNumber, int pointMember) {
        super(name, idCustomer, phoneNumber);
        this.pointMember = pointMember;
    }

    public VipCustomer(int pointMember) {
        this.pointMember = pointMember;
    }

    public VipCustomer() {
    }

    @Override
    public double payment() {
        return 0;
    }
}
