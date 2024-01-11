package model.customer;

public class NormalCustomer extends Customer implements realPayment {

    public NormalCustomer(String name, String idCustomer, String phoneNumber, int pointMember) {
        super(name, idCustomer, phoneNumber, pointMember);
    }

    public NormalCustomer() {
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
        return "NormalCustomer{" +
                "pointMember=" + pointMember +
                '}';
    }
}
