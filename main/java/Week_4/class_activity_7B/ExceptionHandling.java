package Week_4.class_activity_7B;

public class ExceptionHandling {
    public static void main(String[] args) {
//        int num = 50/0;
//        System.out.println(num);
//        System.out.println("Run other parts of code");

        try {
            int num = 50/0;
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Run the other part of the Code");
    }
}
