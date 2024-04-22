package Week3.Lab7.Lab7_Level_4_Q10_Q11;

//immutable class
public class Person {
    private final String name;
    private final String phone;
    private final String address;
    private final Direction direction;

    public Person(String name, String phone, String address, Direction direction) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.direction = direction;
    }


    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public Direction getDirection() {
        return direction;
    }
}
