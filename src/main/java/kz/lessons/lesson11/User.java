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
    public String toString() {
        return "[ " + name + " : " + age +" ]";
    }
}
