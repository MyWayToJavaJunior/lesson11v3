package kz.lessons.lesson11;

/**
 * Объект - пользователь
 */
public class User {
    public String name;
    public int age;

    public User(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof User)) return false;
        User entry = (User) obj;
        return name.equals(entry.name) && age == entry.age;
    }

    @Override
    public int hashCode() {
        int hash = 37;
        hash = hash * 17 + name.hashCode();
        hash = hash * 17 + age;
        return hash;
    }

    @Override
    public String toString() {
        return "[ " + name + " : " + age +" ]";
    }
}
