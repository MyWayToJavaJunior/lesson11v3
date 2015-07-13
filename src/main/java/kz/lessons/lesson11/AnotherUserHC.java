package kz.lessons.lesson11;

/**
 * с переопределенным hashCode
 */
public class AnotherUserHC extends AnotherUser {
    public AnotherUserHC(String name, int age) {
        super(name, age);
    }

    @Override
    public int hashCode() {
        int hash = 37;
        hash = hash * 17 + name.hashCode();
        hash = hash * 17 + age;
        return hash;
    }

}
