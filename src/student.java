import java.util.ArrayList;
import java.util.List;

public class student {

    int id;

    String name;

    double percentage;

    String specialization;

    public student(int id, String name, double percentage, String specialization)
    {
        this.id = id;

        this.name = name;

        this.percentage = percentage;

        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getSpecialization() {
        return specialization;
    }



    

    public static void main(String args[])
    {
        List<student> listOfStudents = new ArrayList<student>();

        listOfStudents.add(new student(111, "John", 81.0, "Mathematics"));

        listOfStudents.add(new student(222, "Harsha", 79.5, "History"));

        listOfStudents.add(new student(333, "Ruth", 87.2, "Computers"));

        listOfStudents.add(new student(444, "Aroma", 63.2, "Mathematics"));

        listOfStudents.add(new student(555, "Zade", 83.5, "Computers"));

        listOfStudents.add(new student(666, "Xing", 58.5, "Geography"));

        listOfStudents.add(new student(777, "Richards", 72.6, "Banking"));

        listOfStudents.add(new student(888, "Sunil", 86.7, "History"));

        listOfStudents.add(new student(999, "Jordan", 58.6, "Finance"));

        listOfStudents.add(new student(101010, "Chris", 89.8, "Computers"));



        for ( student    stu:listOfStudents)
        {
            System.out.println(   stu.getId()+" "+stu.getPercentage()+" "+stu.getSpecialization()+" "+stu.getName());
        }

        System.out.println("Using Streams");
        listOfStudents.stream().filter(e-> e.getName().equalsIgnoreCase("Chris")).forEach(student -> System.out.println(student.getName()+" "+student.getPercentage()+""+student.getSpecialization()+""));
    }


}
