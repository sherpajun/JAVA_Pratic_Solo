package DoitJavaPratice.inheritance;

public class Customer1 {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public Customer1(){
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

    double bonusRation;
}//get set method 는 alt+insert 변수 선언 영역에 마우스 가져다 놓은 후 해야한다.


