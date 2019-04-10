package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> list = new ArrayList<>();
    private String teacherName;

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
            System.out.printf("I am %s. I know %s become Leader of Class %s.\n",teacherName,student.getName(),number);
            return;
        }
        System.out.printf("It is not one of us.\n");

    }
    public Student getLeader(){
        return leader;
    }
    public void appendMember(Student student){
        list.add(student);
        System.out.printf("I am %s. I know %s has joined Class %d.\n",teacherName,student.getName(),number);
    }
    public String getTeacherName(){
        return teacherName;
    }
    public boolean isIn(Student student){
        if (list.contains(student)) {
            return true;
        }
        return false;
    }
    public void setTeacherName(String teacherName){
        this.teacherName = teacherName;
    }
}