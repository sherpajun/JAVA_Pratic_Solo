package DoitJavaPratice.inheritance;

public class VIPCustomer extends Customer1{
    private int agentID;
    double saleRation;

    public VIPCustomer(){
        customerGrade = "VIP";// 상위 클래스의 private 선언으로 인해 불러오기 실패
        bonusRation=0.05;
        saleRation=0.1;
    }

    public int getAgentID(){
        return agentID;
    }
}
