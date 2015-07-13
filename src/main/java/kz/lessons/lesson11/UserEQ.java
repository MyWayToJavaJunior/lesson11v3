package kz.lessons.lesson11;

/**
 * с переопределенным equals
 */
public class UserEQ extends User{
    public UserEQ(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof User)) return false;
        User entry = (User) obj;
        return name.equals(entry.name) && age == entry.age;
    }


}
