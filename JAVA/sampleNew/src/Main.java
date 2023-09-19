interface animals{
    void animalname();
}
class tiger implements animals{
    public void animalname() {
        System.out.println("i am tiger");
    }
}
class littletiger extends  tiger {
    public void animalname(){
        super.animalname();
        System.out.println("i am littletiger");
    }
}
public class Main{
    public static void main(String[] args){
        littletiger obj = new littletiger();
        obj.animalname();
    }
}