package CourseOverview.Threads_Lab1.ThreadsQ5;

public class PrimeThread extends Thread {
    int start;
    int end;
    PrimeThread(int start, int end) {
    	 this.start = start;
    	 this.end = end;
    }

    public void run() {
        for(int i = start; i <= end; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    boolean isPrime(int n){
        if(n == 1) return false;
        for(int i = 2; i <= Math.ceil(n/2d); i++ ){
            if(n % i == 0) return false;
        }
        return true;
    }
}
