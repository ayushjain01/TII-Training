package Lesson3;

public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int res;
        int[] array = {1,2,3,4};
        try{
            res = num1/0;
        }
        catch(ArithmeticException err1){
            System.out.println("Error occurred-" + err1);
            System.out.println("Doing something else");
            try{
                res = array[10];
            }
            catch(ArrayIndexOutOfBoundsException err2){
                System.out.println("Another error occurred-" + err2);
            }
        }
        finally {
            System.out.println("Terminal tired, you keep making errors...");
        }
    }
}
