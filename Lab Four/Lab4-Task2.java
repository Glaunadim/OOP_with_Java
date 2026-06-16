public class IDCard {
    String name;
    String id;
    String department;
    String institution;
    public IDCard(String name, String id, String department, String institution) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.institution = institution;
    }
    public void showID() {
        System.out.println("=== ID CARD ===");
        System.out.println("Name: " + name);
        System.out.println("ID No: " + id);
        System.out.println("Department: " + department);
        System.out.println("Institution: " + institution);
    }
    public static void main(String[] args) {
        IDCard studentID = new IDCard("Abu Taher Nadim", "E253027", "Computer and Communication Engineering", "IIUC");
        studentID.showID();
    }
}