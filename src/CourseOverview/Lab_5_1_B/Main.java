package CourseOverview.Lab_5_1_B;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Hourly h = new Hourly("hou1", 20, 8);
        h.calcCompensation(1, 1999);
        h.calcCompensation(2, 1999);
        h.calcCompensation(3, 1999);
        h.print();

        Salaried s = new Salaried("sal1", 2000);
        s.calcCompensation(1, 1999);
        s.calcCompensation(2, 1999);
        s.calcCompensation(3, 1999);
        s.print();

        Commissioned c = new Commissioned("comm1", 7, 1000);
        Order o1 = new Order("3289", LocalDate.of(1999, 1, 2), 100, c);
        Order o2 = new Order("8953", LocalDate.of(1999, 1, 2), 200, c);
        c.calcCompensation(1, 1999);
        c.calcCompensation(2, 1999);
        c.calcCompensation(3, 1999);
        c.print();


    }
}
