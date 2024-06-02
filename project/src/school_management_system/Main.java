package school_management_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Udara = new Teacher(1, "Udara", 5000);
        Teacher Nadeesha = new Teacher(2, "Nadeesha", 6000);
        Teacher Nipun = new Teacher(3 , "Nipun", 7000);



        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Udara);
        teacherList.add(Nadeesha);
        teacherList.add(Nipun);


        Student Nipunika = new Student(1, "Nipunika", 12);
        Student Sandeepa = new Student(2, "Sandeepa", 13);
        Student Shalani  = new Student(3, "Shalani", 10);



        List<Student> studentList =new ArrayList<>();
        studentList.add(Nipunika);
        studentList.add(Sandeepa);
        studentList.add(Shalani);


        School SCC = new School(teacherList, studentList);


        Nipunika.payfees(10000);
        Sandeepa.payfees(10000);
        Shalani .payfees(10000);

        System.out.println("SCC has earned $"+SCC.getTotalMoneyEarned());


        System.out.println("----Making School Pay Salary----");
        Nipun.receiveSalary(Nipun.getsalary());
        Udara.receiveSalary(Udara.getsalary());
        Nadeesha.receiveSalary(Nadeesha.getsalary());

        System.out.println("SCC has spent for salary to "+Nipun.getname()+","+Udara.getname()+","+Nadeesha.getname()+" and  now has "+SCC.getTotalMoneyEarned());


        System.out.println(Shalani);


    }
}
