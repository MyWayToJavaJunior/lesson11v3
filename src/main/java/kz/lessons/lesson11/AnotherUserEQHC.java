package kz.lessons.lesson11;

/**
 * с переопределенным equals
 * и hashCode
 */
public class AnotherUserEQHC extends AnotherUser {
    public AnotherUserEQHC(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof AnotherUser)) return false;
        AnotherUser entry = (AnotherUser) obj;
        return this.hashCode() == entry.hashCode() && name.equals(entry.name) && age == entry.age;
    }

    @Override
    public int hashCode() {
        int hash = 37;
        hash = hash * 17 + name.hashCode();
        hash = hash * 17 + age;
        return hash;
    }

}
