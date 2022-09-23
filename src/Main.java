import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Person> people = generetePerson();

        //PersonComparator personComparator = new PersonComparator(1);
        System.out.println("До сортировки \n"
                + people.stream().map(Person::toString).collect(Collectors.joining("\n")));
        //people.sort(personComparator);
        (o1, o2) -> {

            return compare(o1, o2);
        };
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
    public static int compare(Person o1, Person o2) {
        int lengthSureNameFirstPerson = o1.getSurName().split("\\h").length;
        int lengthSureNameSecondPerson = o2.getSurName().split("\\h").length;
        if (lengthSureNameFirstPerson == lengthSureNameSecondPerson) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return lengthSureNameFirstPerson > lengthSureNameSecondPerson ? 1 : -1;
    }
}
