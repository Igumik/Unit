import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MainTest {
    private List<Person> clients = new LinkedList<>();
    private Queue<Person> attraction = new LinkedList<>();
    private int before;
    private int after;

    @BeforeEach
    void added() {
        clients.add(new Person("Илья Мышкин", 2));
        clients.add(new Person("Сергей Березин", 3));
        for (Person p : clients) {
            attraction.offer(p);
        }
        Person people = attraction.peek();
        before = people.getTickets();
        people.down();
        after = people.getTickets();
    }

    @Test
    @DisplayName("Тест заполнен ли список?")
    void list() {
        Assertions.assertTrue(!clients.isEmpty());
    }

    @Test
    @DisplayName("Тест заполнена ли очередь?")
    void queue() {
        Assertions.assertTrue(!attraction.isEmpty());
    }

    @Test
    @DisplayName("Тест сколько билетов расходуется после поездки")
    void useTicket() {
        Assertions.assertEquals(1, before - after);
    }
}
