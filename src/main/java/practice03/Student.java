package practice03;

public class Student extends Person{

    private int klass;
    Student(String name, int age,int Klass) {
        super(name, age);
        this.klass = Klass;
    }
    public int getKlass(){
        return klass;
    }

    @Override
    public String introduce(){
        return "I am a Student. I am at Class "+getKlass()+".";
    }
}
