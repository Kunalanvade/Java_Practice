import java.util.*;

public class default_constructor {

    String name;
    int rollno;

    default_constructor() {
        name = "siri";
        rollno = 100;
    }

    public static void main(String[] args) {
        default_constructor student = new default_constructor();
        System.out.println(student.name);
        System.out.println(student.rollno);

    }
}
