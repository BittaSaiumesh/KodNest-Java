package Strings;

public class Pgm3 {
    public static void main(String[] args) {
        String s1 = "Umesh";
        String s2 = "umesh";
        if(s1==s2){
            System.out.println("Reference are same");
        }
        else{
            System.out.println("Reference are not same");
        }
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Contents are same");
        }
        else{
            System.out.println("Contents are not same");
        }
    }
}
