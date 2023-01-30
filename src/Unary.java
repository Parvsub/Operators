public class Unary {
    public static void main(String[] args) {
        int a = 13;int b=-13;
        System.out.println("addition of Post increment:"+(a++));
        System.out.println("addition of pre increment:"+(++a));
        System.out.println("Subtraction of post increment:"+(a--));
        System.out.println("Subtraction of pre increment:"+(--a));
        System.out.println("NOt operation:"+~a);
        System.out.println("Positive expr:"+(b));
        System.out.println("Negative expr:"+(-b));
    }
}