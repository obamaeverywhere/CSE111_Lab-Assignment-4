// coding task 7

public class BracuBus {
    public String destination;
    public int capacity=2;
    public int passCount;
    public String [] passList;
    public BracuBus(String destination) {
        this.destination = destination;
        passList = new String[2];
    }
    public BracuBus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        passList = new String[capacity];
    }
    public void showDetails() {
        System.out.println("Bus Route: " + destination + "\nPassenger Count: " + passCount + " (Max: " + capacity + ")" + "\nPassengers on Board: ");
        for(int i=0; i<passCount; i++) {
            System.out.print(passList[i]+ " ");
        }
    }
    public void board() {
     if(passCount==0) {
        System.out.println("No passengers");
     }
    }
    public void board(BracuStudent st1) {
        if(passCount<capacity) {
            if(st1.pass) {
                if(st1.destination.equals(destination)) {
                    passList[passCount++] = st1.name;
                    System.out.println(st1.name + " boarded the bus.");
                }
                else {
                    System.out.println("You got on the wrong bus!");
                }
            }
            else {
                System.out.println("You don't have a bus pass!");
            }
        }
        else {
            System.out.println("Bus is full!");
        }
    }
    public void board(BracuStudent st1,BracuStudent st2) {
            board(st1);
            board(st2);
    }
}
