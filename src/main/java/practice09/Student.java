package practice09;

public class Student extends Person{

    private  Klass Klass;
    Student(int id,String name, int age,Klass Klass) {
        super(id,name, age);
        this.Klass = Klass;
    }
    public Klass getKlass(){
        return Klass;
    }
    @Override
    public String introduce(){
        if(Klass.getLeader()==null)
            return super.introduce()+" I am a Student. I am at Class "+Klass.getNumber()+".";
        if((getName())==(Klass.getLeader().getName())){
            return super.introduce()+" I am a Student. I am Leader of Class "+Klass.getNumber()+".";
        }else{
            return super.introduce()+" I am a Student. I am at Class "+Klass.getNumber()+".";
        }
    }

}