import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int wordsCount;

    public PersonComparator(int wordsCount) {
        this.wordsCount = wordsCount;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int lengthSureNameFirstPerson = o1.getSurName().split("\\h").length;
        int lengthSureNameSecondPerson = o2.getSurName().split("\\h").length;
        if (lengthSureNameFirstPerson == lengthSureNameSecondPerson) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return lengthSureNameFirstPerson > lengthSureNameSecondPerson ? 1 : -1;
    }
}
