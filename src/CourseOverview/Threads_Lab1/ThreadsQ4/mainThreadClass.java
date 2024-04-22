package CourseOverview.Threads_Lab1.ThreadsQ4;


public class mainThreadClass {

    public static void main( String[] args ) {


        int step = 200_000;
        for(int i = 1; i <= 1000000; i = i + step){
           PrimeThread p = new PrimeThread(i, i + step - 1);
            p.start();
        }
//            System.out.println(p1.isPrime(4));
    }
}









