package ie.atu.week10;

public class Customer extends Person{
    private String customerNumber;
    private boolean mailList;

    public Customer(){

}

    public Customer(String name, String address, String number, String customerNumber, boolean mailList) {
        super(name, address, number);
        this.customerNumber = customerNumber;
        this.mailList = mailList;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isMailList() {
        return mailList;
    }

    public void setMailList(boolean mailList) {
        this.mailList = mailList;
    }

    @Override
    public String toString() {
        return super.toString() + " "+
                "customerNumber='" + customerNumber + '\'' +
                ", mailList=" + mailList +
                '}';
    }
}
