package model.customer;

public class VipCustomer extends Customer implements realPayment {

    public VipCustomer(String name, String idCustomer, String phoneNumber, int pointMember) {
        super(name, idCustomer, phoneNumber, pointMember);
    }

    public VipCustomer() {
    }

    @Override
    public double payment() {
        return 0;
    }

    @Override
    public double realPayment() {
        return 0;
    }

    @Override
    public String toString() {
        return "VipCustomer{" +
                "pointMember=" + pointMember +
                '}';
    }
}
