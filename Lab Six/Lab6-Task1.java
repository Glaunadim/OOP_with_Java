
class Grandfather {
    public void realEstate() {
        System.out.println("Grandfather's Asset: A House.");
    }
}

class Father extends Grandfather {
    public void business() {
        System.out.println("Father's Achievement: A Tech shop.");
    }
}

class Son extends Father {
    public void laptop() {
        System.out.println("Son's Asset: A high-end Gaming Setup.");
    }
}
public class labrpt6 {
    public static void main(String[] args) {
        Son obj = new Son();
        
        System.out.println("=== Multilevel Inheritance Demonstration ===");
        
        obj.realEstate(); 
        obj.business();   
        obj.laptop();     
    }
}