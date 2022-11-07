import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static List<Person> generateClients() {
        List<Person> clients = new LinkedList<>();
        clients.add(new Person("Илья Мышкин", 2));
        clients.add(new Person("Сергей Березин", 3));
        clients.add(new Person("Руслан Савельев", 6));
        clients.add(new Person("Артем Васин", 4));
        clients.add(new Person("Олег Поцелуев", 5));
        return clients;
    }

    public static void main(String[] args) {
        Queue<Person> attraction = new LinkedList<>();
        for (Person p : generateClients()) {
            attraction.offer(p);
        }

        while (!attraction.isEmpty()) {
            Person people = attraction.poll();
            System.out.println(people.getName() + " прокатился на аттракционе!");
            people.down();
            if (people.getTickets() != 0) {
                attraction.offer(people);
            }
        }
    }
}
