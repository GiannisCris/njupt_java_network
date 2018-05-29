abstract class Pet{
    private String name;
    Pet(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    abstract String shout();
}

class Dog extends Pet{
    Dog(String name){
        super(name);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
    public String shout(){
        return "Wang Wang Wang";
    }
}

class Cat extends Pet{
    Cat(String name){
        super(name);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
    public String shout(){
        return "Miao Miao Miao";
    }
}
public class network8 {
    public static void main(String[] args) {
        Pet pet=new Dog("WangCai");
        System.out.println(pet.getName()+":"+pet.shout());
        pet=new Cat("XiaoHua");
        System.out.println(pet.getName()+":"+pet.shout());
    }
}
