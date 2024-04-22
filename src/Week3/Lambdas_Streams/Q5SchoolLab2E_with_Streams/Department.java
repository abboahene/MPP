package Week3.Lambdas_Streams.Q5SchoolLab2E_with_Streams;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;

    List<Person> persons = new ArrayList<>();

    Department(String name){
        this.name = name;
    }

    public double getTotalSalary(){
        double sum = 0;
        for(Person p : persons){
            boolean instanceOfStudent = p instanceof Student;
            boolean instanceOfFaculty = p instanceof Faculty;
            boolean instanceOfStaff = p instanceof Staff;

            if(!instanceOfStudent){
               if(instanceOfFaculty){
                  Faculty f = (Faculty) p;
                  sum += f.getSalary();
               }
               if(instanceOfStaff){
                   Staff s = (Staff) p;
                   sum += s.getSalary();
               }
            }
        }
        return sum;
    }

    public void showAllMembers(){
        System.out.println("[");
        for(Person p : persons){
            boolean instanceOfStudent = p instanceof Student;
            boolean instanceOfFaculty = p instanceof Faculty;
            boolean instanceOfStaff = p instanceof Staff;

            String type = "N/A";
            if(instanceOfStudent) type = "student";
            else if(instanceOfFaculty) type = "faculty";
            else if(instanceOfStaff) type = "staff";
            String outStr = String.format("{%nName: %s,%nPhone: %s,%nAge: %d,%nType: %s%n}%n", p.getName(), p.getPhone(), p.getAge(), type);
            System.out.printf(outStr);
        }
        System.out.println("]");
    }

    public void unitsPerFaculty(){
        System.out.println("[");
        for (Person p: persons){
            boolean instanceOfFaculty = p instanceof Faculty;
            if(instanceOfFaculty){
              Faculty f = (Faculty) p;
              String outStr = String.format("{%nName: %s,%nTotal Units: %d%n}",f.getName(), f.getTotalUnits());
              System.out.printf(outStr);
            }
        }
        System.out.println("]");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getPersons() {
        return persons;
    }
    public Faculty getFacultyByName(String name) {
//     Optional<Faculty> faculty = persons.stream()
//                .filter(p -> p instanceof Faculty)
//                .map(p -> (Faculty) p)
//                .filter((f) -> f.getName().equals(name))
//                .findFirst();
        Faculty res = null;
        for (Person p: persons){
            boolean instanceOfFaculty = p instanceof Faculty;
            if(instanceOfFaculty){
                Faculty f = (Faculty) p;
                if(f.getName().equals(name)){
                    res = f;
                }
            }
        }
        return res;
    }

    public void showStudentsByFacultyName(String name) {
       Faculty faculty = getFacultyByName(name);
       if(faculty == null) System.out.println("No faculty found.");
       List<String> facultyCourseNumbers = faculty.getCourseNumbers();
       int count = 0;
       for (Person p : persons){
           boolean isStudent = p.getClass().equals(Student.class);
           if(isStudent){
               Student student = (Student) p;
              List<String> studentCourseNumbers = student.getCourseNumbers();
                for(String sCn: studentCourseNumbers){
                    if(facultyCourseNumbers.contains(sCn)){
                        System.out.println("Name: " + student.getName());
                        count++;
                        break;
                    }
                }
           }
       }
       if(count == 0) System.out.println("No students found.");
    }

    public void addPerson(Person person) {
        this.persons.add(person);
    }
}
