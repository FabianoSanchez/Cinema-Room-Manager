import java.util.Scanner;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        if(x<=0){
       return f1(x);
        }else if(x>=1){
       return f3(x);
        }else{
          return  f2(x);
        }

        //call your implemented methods here.
        //return x;
    }

    //implement your methods here
    public static double f1 (double x1){
        double one =1;
        double exponent=2;
        double total = Math.pow(x1,exponent)+one;

        //System.out.println(total);
        return total;
    }

    public static double f2(double x2){
        double one =1;
        double exponent=2;
        double total = one/Math.pow(x2,exponent);

       // System.out.println(total);
        return total;
    }

    public static double f3(double x3){
        double one =1;
        double exponent=2;
        double total = Math.pow(x3,exponent)-one;
    //    System.out.println(total);
        return total;

    }
}