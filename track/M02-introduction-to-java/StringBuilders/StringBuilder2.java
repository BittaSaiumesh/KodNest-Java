public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sbr = new StringBuilder();
        sbr.ensureCapacity(100);
        System.out.println(sbr.capacity());//100
        System.out.println(sbr.length());//0
        sbr.append("umesh");
        System.out.println(sbr);
        System.out.println(sbr.capacity());//100
        System.out.println(sbr.length());//5
        sbr.append(" jaanu");
        System.out.println(sbr);//umesh jaanu
        System.out.println(sbr.capacity());//100
        System.out.println(sbr.length());//11
        sbr.insert(6, "Loves ");
        System.out.println(sbr);//umesh Loves jaanu
        System.out.println(sbr.capacity());//100
        System.out.println(sbr.length());//16
        sbr.setCharAt(6, 'l');
        System.out.println(sbr);//umesh loves jaanu
        sbr.deleteCharAt(5);
        System.out.println(sbr);///umeshloves jaanu
        sbr.delete(5,10);
        System.out.println(sbr);///umesh jaanu
        sbr.replace(0,11,"UMESH JAANU");
        System.out.println(sbr);
        sbr.reverse();
        System.out.println(sbr);//UNAAJ HSEMU
        sbr.reverse();
        System.out.println(sbr);
        
    }
    
}
