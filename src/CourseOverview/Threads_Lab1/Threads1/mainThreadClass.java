package CourseOverview.Threads_Lab1.Threads1;

public class mainThreadClass {

    public static void main( String[] args ) {

        System.out.println("Inside main  ");        

        PrimeThread p = new PrimeThread(143);
        p.start();

    }
}
