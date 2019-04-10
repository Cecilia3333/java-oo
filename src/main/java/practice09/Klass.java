package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> list = new ArrayList<>();
    Klass(int number){
        this.number=number;
    }
    public int getNumber(){
        return number;
    }
    public String getDisplayName(){
        return "Class "+getNumber();
    }
    public void assignLeader(Student student){
        if(list.contains(student)){
            this.leader=student;
        }
        System.out.printf("It is not one of us.\n");

    }
    public Student getLeader(){
        return leader;
    }
    public void appendMember(Student student){
       list.add(student);

    }
}