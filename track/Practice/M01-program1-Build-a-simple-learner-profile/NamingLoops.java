public class NamingLoops {
    public static void main(String[] args) {
        outer:for (int i=1;i<5;i++){
            inner:for(int j=1;j<=3;j++){
                if(i==2){
                    break outer;
                }
                System.err.println("i "+i+" j "+j );
            }
        }
    }
    
}
