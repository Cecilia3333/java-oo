package practice07;

public class Klass {
    private int number=-1;
    Klass(int number){
        this.number=number;
    }
    public int getNumber(){
        return number;
    }
    public String getDisplayName(){
        return "Class "+getNumber();
    }

}
