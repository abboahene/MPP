package Week3.Lab7.Lab7_Level_4_Q9;

public interface IPerson {
    default void myDefault(){
        System.out.println("From default method");
    }
    static void myStatic(){
        System.out.println("From static method");
    }

    void myAbstract();
}
