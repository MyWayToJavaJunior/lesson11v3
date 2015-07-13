package kz.lessons.lesson11;

/**
 * абстрактный класс предок
 * животных
 */
public abstract class Pet {
    public String name;
    public int age;

    public Pet(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pet)) return false;
        Pet entry = (Pet) obj;
        return this.hashCode() == entry.hashCode() && name.equals(entry.name) && age == entry.age;
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
