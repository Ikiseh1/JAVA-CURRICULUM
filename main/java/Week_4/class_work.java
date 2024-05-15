package Week_4;

public class class_work {
    public static void main(String[] args) {
        int num1 =50;
        int num2 =0;
        int num3;
        try{
            num3=num1/num2;
            System.out.println(num3);
        } catch (Exception e) {
            num3 = num1 / (num2 + 2);
            System.out.println("Result :" + num3);
        }
    }
}
