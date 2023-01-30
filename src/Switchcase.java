import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the city");
        String a = sc.next();
        switch (a) {
            case "Bangalore":
                System.out.println("City is in Bangalore");
                break;
            case "Vizag":
                System.out.println("City is in Andhra pradesh");
                break;
            case "Pune":
                System.out.println("City is in maharashtra");
                break;
            default:
                System.out.println("City is not valid");
        }
    }
}












