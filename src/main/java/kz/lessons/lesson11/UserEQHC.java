package kz.lessons.lesson11;

/**
 * с переопределенным equals
 * и hashCode
 */
public class UserEQHC extends User {
    public UserEQHC(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof User)) return false;
        User entry = (User) obj;
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
