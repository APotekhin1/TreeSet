import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Person> people = generetePerson();
        PersonComparator personComparator = new PersonComparator(1);
        System.out.println("До сортировки \n"
                + people.stream().map(Person::toString).collect(Collectors.joining("\n")));
        people.sort(personComparator);
        System.out.println("\n После сортировки \n"
                + people.stream().map(Person::toString).collect(Collectors.joining("\n")));
    }

    private static List<Person> generetePerson() {
        return Stream.of(
                new Person("Cris", "Ibn Ali Maha", 25),
                new Person("Mulla", "Al Guri", 32),
                new Person("Far", "Al Gazi Bula", 40),
                new Person("Radg", "Ali", 25)
        ).collect(Collectors.toList());
    }
}
