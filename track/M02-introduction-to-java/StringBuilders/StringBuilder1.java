package StringBuilders;

public class StringBuilder1 {
    public static void main(String[]args){
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);//empty string
        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//0
        sb.append("umesh");
        System.out.println(sb);//umesh
        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//5
        


        
        

    }

    
}
