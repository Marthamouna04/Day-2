public class Dog{
    public static void Barking(){
        System.out.println("Tommy is Barking");
    }
    public static void Sleeping(){
        System.out.println("Tommy is Sleeping");
    }
    public static void Eating(){
        System.out.println("Tommy is Eating");
    }
    public static void main(String[] args){
        Dog Dog=new Dog();
        Dog.Barking();
        Dog.Sleeping();
        Dog.Eating();
    }
}