package DoitJavaPratice.inheritance;

public class Customer {
    private int customerID;
    private String customerName;
    private String customerGrade;
    int bonusPoint;
    double bonusRation;

    public Customer(){
        customerGrade = "Silver";
        bonusRation=0.01;
    }

    public int calcPrice(int price){
        bonusPoint+=price*bonusRation;
        return price;
    }
    public String showCustomerInfo(){
        return customerName+"님의 등급은"+customerGrade+"이며,보너스 포인트는"+bonusPoint+"입니다.";
    }
}
