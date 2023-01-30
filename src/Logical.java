public class Logical {
    public static void main(String[] args) {
        byte a=10,b=20,c=20,d=40;
        boolean res=(a<b)&&(c>d);
        boolean res1=(a>b)||(c<d);
        System.out.println("result= "+res);
        System.out.println("result= "+res1);
    }
}
