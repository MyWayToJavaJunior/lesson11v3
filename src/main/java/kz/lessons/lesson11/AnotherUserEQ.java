package kz.lessons.lesson11;

/**
 * с переопределенным equals
 */
public class AnotherUserEQ extends AnotherUser {
    public AnotherUserEQ(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof AnotherUser)) return false;
        AnotherUser entry = (AnotherUser) obj;
        return name.equals(entry.name) && age == entry.age;
    }

}
