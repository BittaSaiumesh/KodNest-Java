package Strings;

public class Pgm4 {
    public static void main(String[] args) {
        String s3 = new String("umesh");
        String s4 = new String("Umesh");
        if(s3==s4){
            System.out.println("Reference are same");
        }
        else{
            System.out.println("Reference are not same");
        }
        if(s3.equalsIgnoreCase(s4)){
            System.out.println("Contents are same");
        }
        else{
            System.out.println("Contents are not same");
        }
    }
}
