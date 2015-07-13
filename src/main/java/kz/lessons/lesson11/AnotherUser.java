package kz.lessons.lesson11;

/**
 * Объект - другой пользователь
 */
public class AnotherUser {
    public String name;
    public int age;

    public AnotherUser(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "[ " + name + " : " + age +" ]";
    }
}
