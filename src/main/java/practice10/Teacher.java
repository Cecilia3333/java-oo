package practice10;

import java.util.LinkedList;

public class Teacher extends Person {
   // private  Klass Klass;
    private LinkedList<Klass> Klass = new LinkedList<Klass>();
    Teacher(int id,String name, int age) {
       super(id,name, age);
    }
    Teacher(int id,String name, int age, LinkedList<Klass> ... Klass) {
        super(id,name, age);
        this.Klass = (Klass.length > 0) ? Klass[0] : null;
    }
    public LinkedList<Klass> getClasses() {
        return Klass;
    }


    @Override
    public String introduce(){
        String s = super.introduce()+" I am a Teacher. I teach ";
        if(Klass==null)
           return s+"No Class.";
        else
            s=s+"Class ";
        for(Klass klass : Klass){
            if (Klass.indexOf(klass) == Klass.size() - 1) {
                s = s + klass.getNumber() + ".";
                break;
            }
            s=s+klass.getNumber()+", ";
        }
        return s;
    }

    public String introduceWith(Student student){
        String s = super.introduce();
        if(Klass.contains(student.getKlass()))
            return super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        else
            return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
    }
    public boolean isTeaching(Student student){
        if (Klass.contains(student.getKlass())) {
            return true;
        }
        return false;
    }

}
