import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Person> people = generetePerson();
        people.removeIf(person -> person.getAge() < 18);
        people.forEach(System.out::println);
    }

    private static List<Person> generetePerson() {
        return Stream.of(
                new Person("Cris", "Ibn Ali Maha", 25),
                new Person("Mulla", "Al Guri", 32),
                new Person("Far", "Al Gazi Bula", 16),
                new Person("Kat", "Jafar", 21),
                new Person("Stiv", "Al Rashid", 14),
                new Person("Radg", "Ali", 25)
        ).collect(Collectors.toList());
    }
}
