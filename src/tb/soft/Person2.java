package tb.soft;

public class Person2 extends Person{

    public Person2(Person person) throws PersonException{
        super(person.getFirstName(), person.getLastName());
        birthYear = person.getBirthYear();
        job = person.getJob();
    }


    public boolean equals(Person person1) {
        if (this == person1) return true;
        if (person1 == null || getClass() != person1.getClass()) return false;

        Person2 person2 = (Person2) person1;

        if (getBirthYear() != person2.getBirthYear()) return false;
        if (getFirstName() != null ? !getFirstName().equals(person2.getFirstName()) : person2.getFirstName() != null)
            return false;
        return getLastName().equals(person2.getLastName());
    }

    @Override
    public int hashCode() {
        int result = getFirstName() != null ? getFirstName().hashCode() : 0;
        result = 37 * result + getLastName().hashCode();
        result = 37 * result + getBirthYear();
        return result;
    }

}