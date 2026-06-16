class Person {
    public void displayInfo() {
        System.out.println("Basic Info: This is a professional human.");
    }
}
class Cricketer extends Person {
    public void playMatch() {
        System.out.println("Role: Plays cricket matches and scores runs.");
    }
}
class Artist extends Person {
    public void draw() {
        System.out.println("Role: Paints beautiful canvases and creates visual art.");
    }
}
class Chef extends Person {
    public void cook() {
        System.out.println("Role: Prepares delicious meals and designs menus.");
    }
}
public class labrptt6 {
    public static void main(String[] args) {
        System.out.println("--- Cricketer's Info ---");
        Cricketer cric = new Cricketer();
        cric.displayInfo();
        cric.playMatch();
        
        System.out.println("\n--- Artist's Info ---");
        Artist art = new Artist();
        art.displayInfo();
        art.draw();
        
        System.out.println("\n--- Chef's Info ---");
        Chef chef = new Chef();
        chef.displayInfo();
        chef.cook();
    }
}