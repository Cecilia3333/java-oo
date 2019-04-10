package practice07;

public class Student extends Person{


    private  Klass Klass;
    Student(String name, int age,Klass Klass) {
        super(name, age);
        this.Klass = Klass;
    }
    public Klass getKlass(){
        return Klass;
    }
    @Override
    public String introduce(){
        return super.introduce()+" I am a Student. I am at Class "+Klass.getNumber()+".";
    }
}
