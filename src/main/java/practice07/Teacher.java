package practice07;

public class Teacher extends Person {
    private  Klass Klass;
    Teacher(String name, int age, Klass Klass) {
        super(name, age);
        this.Klass=Klass;
    }

    Teacher(String name, int age) {
        super(name, age);
    }
    public Klass getKlass(){
        return Klass;
    }
    @Override
    public String introduce(){
        String s = super.introduce()+" I am a Teacher. I teach ";
        if(Klass==null)
            s=s+"No Class.";
        else
            s=s+"Class "+Klass.getNumber()+".";
        return s;
    }

    public String introduceWith(Student student){
        String s = super.introduce();
        if(student.getKlass().equals(Klass))
            return super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        else
            return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
    }

}
