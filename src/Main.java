public class Main{
    static int sumNumber(int a, int b){
        return a+b;
    }
    static double sumNumber(double a, double b){
        return a+b;
    }
    static double sumNumber(int a, double b){
        return a+b;
    }
    static double sumNumber(double a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("Penjumlahan integer dan integer : "+sumNumber(3,5));
        System.out.println("Penjumlahan double dan double : "+sumNumber(4.7,9.9));
        System.out.println("Penjumlahan integer dan double : "+sumNumber(5,5.9));
        System.out.println("Penjumlahan double dan integer : "+sumNumber(4.3,8));
    }
}