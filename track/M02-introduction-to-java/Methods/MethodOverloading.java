class Addition{

    int add(int x,int y){
        return x+y;
    }
    double add(double x,double y){
        return x+y;
    }
    double add(int x,double y){
        return x+y;
    }
    double add(double x,int y){
        return x+y;
    }
    double add(int x,int y,double z){
        return x+y+z;
    }
    double add(int x,double y,int z){
        return x+y+z;
    }
    double add(double x,int y,int z){
        return x+y+z;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
    Addition a = new Addition();
    System.out.println(a.add(10,20));
    System.out.println(a.add(20.3,30.5));
    System.out.println(a.add(10,20.3));
    System.out.println(a.add(10.3,20));
    System.out.println(a.add(10,20,30.5));
    System.out.println(a.add(10,20.3,30));
    System.out.println(a.add(10.3,20,30));

    }
}
