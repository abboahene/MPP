package CourseOverview.Threads_Lab1.ThreadsQ5;

public class mainThreadClass {

    public static void main( String[] args ) {

           int step = 100_000;
           for(int i = 1; i <= 1000000; i = i + step){
                  PrimeThread p = new PrimeThread(i, i + step - 1);
                  p.start();
           }
//            System.out.println(p.isPrime(4));




    }
}









