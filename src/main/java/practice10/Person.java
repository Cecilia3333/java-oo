package practice10;

public class Person {
    private int age;
    private String name;
    private int id;
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    Person(int id,String name , int age){
        this.id=id;
        this.age = age;
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;

            if (id == person.getId()) {
                return true;
            }
        }
        return false;
    }
    public String introduce(){
        return "My name is "+getName()+". I am "+getAge()+" years old.";
    }
}
