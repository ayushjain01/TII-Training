package lesson2;

public class Bank {
    int interestRate;
    Address address;
    Bank(Address address){
        this.address = address;
    }
    int addMoney(int a, int b){
        return a + b;
    }
    int addMoney(int a, int b, int c){
        return a + b + c;
    }
    int getInterestRate(){
        return this.interestRate;
    }
    void getAddress(){
        System.out.println("Bank address - " + this.address.city + ", " + this.address.state + ", " + this.address.country);
    }
}
class SBI extends Bank{
    SBI(Address address){
        super(address);
    }
    int getInterestRate(){
        this.interestRate = 8;
        return super.getInterestRate();
    }
}

class AXIS extends Bank{
    AXIS(Address address){
        super(address);
    }
    int getInterestRate(){
        this.interestRate = 12;
        return super.getInterestRate();
    }
}