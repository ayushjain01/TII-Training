package lesson2;

public class Main {
    public static void main(String[] args) {
        Address add1 = new Address("Bangalore", "Karnataka", "India");
        Address add2 = new Address("Mysore", "Karnataka", "India");

        SBI bank1 = new SBI(add1);
        AXIS bank2 = new AXIS(add2);


        System.out.println("SBI ROI - " + bank1.getInterestRate());
        System.out.println("AXIS ROI - " + bank2.getInterestRate());
        bank2.getAddress();
        System.out.println("Method overloading");
        System.out.println("Sum of 2 - " + bank2.addMoney(10,20));
        System.out.println("Sum of 3- " + bank2.addMoney(10,20, 30));

    }
}