package practice08;

public class Klass {
    private int number;
    private Student leader;
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
        leader=student;
    }
    public Student getLeader(){
        return leader;
    }
}
