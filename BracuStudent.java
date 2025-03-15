// coding task 7

public class BracuStudent {
    public String name;
    public String destination;
    public boolean pass;
    public BracuStudent(String name, String destination) {
        this.name = name;
        this.destination = destination;
    }
    public void showDetails() {
        System.out.println("Student Name: " + name + "\nLives in " + destination + "\nHave bus pass? " + pass);
    }
    public void getPass() {
        pass = true;
    }
    public void updateHome(String destination) {
        this.destination = destination;
    }
}
