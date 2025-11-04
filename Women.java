public class Women{
    public static void WomenData() {
        System.out.println("My Name is Mouna");
        System.out.println("Iam A fresher");
    }
    public Boolean isHavingFood () {
        return true;
    }
    public static void main(String[] args){
        Women.Women=new Women();
        Women.print WomenData();
        System.out.println("Are you Having food? "+Women.isHavingFood());
    }
}
