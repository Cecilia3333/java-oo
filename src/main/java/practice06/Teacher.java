package practice06;

public class Teacher extends Person {
    private int Klass=-1;
    Teacher(String name, int age, int Klass) {
        super(name, age);
        this.Klass=Klass;
    }

    Teacher(String name, int age) {
        super(name, age);
    }
    public int getKlass(){
        return Klass;
    }
    @Override
    public String introduce(){
        String s = super.introduce()+" I am a Teacher. I teach ";
        if(getKlass()==-1)
            s=s+"No Class.";
        else
            s=s+"Class "+getKlass()+".";
        return s;
    }
}
