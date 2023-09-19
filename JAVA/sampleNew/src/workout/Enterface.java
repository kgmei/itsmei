package workout;
interface mobiles{
    void features();
}
class vivo implements mobiles {
    public void features() {
        System.out.println("vivofeatures");
    }
}
class vivo10 extends vivo  {
  { super.features();
        System.out.println("vivo10 features");
    }
}
public class Enterface {
    public static void main(String[] args) {
       vivo obj1 = new vivo();
        obj1.features();
        vivo10 obj2 = new vivo10();
        obj2.features();
       
    }
}