public class Person {
    protected String name;
    protected int tickets;

    public Person (String name, int tickets) {
        this.name = name;
        this.tickets = tickets;
    }

    public String getName() {
        return name;
    }

    public int getTickets() {
        return tickets;
    }

    public void down (){
        if (tickets > 0) {
            tickets--;
        }
    }

    public String toString() {
        return name ;
    }


}
