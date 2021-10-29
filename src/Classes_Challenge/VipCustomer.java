package Classes_Challenge;

public class VipCustomer {

    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer(){
        this("default name",1500,"default email");
    }

    public VipCustomer(String name, int creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public VipCustomer(int creditLimit,String email){
        this("Tim",creditLimit, email);
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
