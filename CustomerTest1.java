package DoitJavaPratice.inheritance;

public class CustomerTest1 {
    public static void main (String []args){
        Customer1 cu= new Customer1();
        cu.setCustomerID(10010);
        cu.setCustomerName("씨유");
        cu.bonusPoint =1000;
        System.out.println(cu.showCustomerInfo());
    }
}
