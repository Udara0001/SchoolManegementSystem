package school_management_system;

public class Student {


    private int id;
    private String name;
    private int grade;
    private int feespaid;
    private int feestotal;


    public Student(int id,String name,int grade){

            this.feespaid=0;
            this.feestotal=30000;        
            this.id = id;
            this.name=name;
            this.grade=grade;
    }


 public void setGrade(int grade){
    this.grade =grade;
 }

 public void payfees(int fees){
    feespaid+=fees;
    School.updateTotalMoneyEarned(feespaid);
 }


public int getid(){
    return id;
}

public String getname(){
     return name;
}

public int getgrade(){
    return grade;
}

public int feespaid(){
    return feespaid;
}

public int feestotal(){
    return feestotal;
}

public int GetRemainingFees(){
   return feestotal-feespaid;
}

@Override
public String toString(){
      return "Name of the Student :"+ name+" Total fees paid so far $"+ feespaid;
}

}
