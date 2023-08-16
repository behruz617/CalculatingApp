import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Number ");

        double a = sc.nextDouble();
        System.out.println("2.Number");
        double b = sc.nextDouble();

        System.out.println("Select the proccess: \n1:+\n2:- \n3:* \n4:/ ");

        int operation = sc.nextInt();

        String message = "The result is : ";


        if(operation==1){
            System.out.println(message+(a+b));
        }else if(operation==2){
            System.out.println(message+(a-b));

        }else if (operation==3){
            System.out.println(message+(a*b));

        }else if(operation==4){
            if(b==0){
                System.out.println("The second number can't be zero ");
            }else {

                System.out.println(message+(a/b));
            }

        }
//
//        switch (operation) {
//            case 1:
//                System.out.println(message + (a + b));
//                break;
//            case 2:
//                System.out.println(message + (a - b));
//                break;
//
//            case 3:
//                System.out.println(message + (a * b));
//                break;
//
//            case 4:
//                if (b == 0) {
//                    System.out.println("The second number can't be zero ");
//
//                } else {
//                    System.out.println(message + (a / b));
//                }
//                break;
//            default:
//                System.out.println("Enter the valid operation ");
//        }


    }


}
