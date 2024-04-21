package TestPackage;

public class Customer {
    protected int customerId;
    private String customerName;
    private String customerAddress;

    public Customer() {
    }


    public Customer(int customerId, String customerName, String customerAddress) {
        this.customerId = Math.abs(customerId);
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
}
