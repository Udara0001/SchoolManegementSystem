package school_management_system;
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int SalaryEarned;


    public Teacher(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.SalaryEarned=0;
    }
    

    public int getid(){
        return id;
    }

    public String getname(){
        return name;
    }

    public int getsalary(){
        return salary;
    }


    public void setsalary(int salary){
          this.salary=salary;
    }

    public void receiveSalary(int salary){
        SalaryEarned+= salary;
        School.updateTotalMoneySpent(salary);

    }

}
