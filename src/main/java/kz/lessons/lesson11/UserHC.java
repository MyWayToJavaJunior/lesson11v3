package kz.lessons.lesson11;

/**
 * с переопределенным hashCode
 */
public class UserHC extends User {
    public UserHC(String name, int age) {
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
