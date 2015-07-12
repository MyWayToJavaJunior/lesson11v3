package kz.lessons.lesson11;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Основной класс
 */
public class Main {
    private final static String[] USERS = {"Bil", "Bob", "Ben", "Yen", "Lee"};
    private final static int[] AGES = {12, 31, 44, 51, 61};
    public static void main(String[] args) {
        User[] users = new User[10];
        for (int i = 0; i < users.length; i++) {
            if (i < 5) users[i] = new User(USERS[i], AGES[i]);
            else users[i] = new User(USERS[i - 5], AGES[i - 5]);
        }
        AnotherUser[] anotherUsers = new AnotherUser[10];
        for (int i = 0; i < anotherUsers.length; i++) {
            if (i < 5) anotherUsers[i] = new AnotherUser(USERS[i], AGES[i]);
            else anotherUsers[i] = new AnotherUser(USERS[i - 5], AGES[i - 5]);
        }
        HashSet<User> usersHS = new HashSet<>(Arrays.asList(users));
        HashSet<AnotherUser> anotherUsersHS = new HashSet<>(Arrays.asList(anotherUsers));
        Object[] obj = new Object[10];
        for (int i = 0; i < obj.length; i++) {
            if (i < 5) obj[i] = users[i];
            else obj[i] = anotherUsers[i - 5];
        }
        HashSet<Object> objHS = new HashSet<>(Arrays.asList(obj));
        System.out.println("1: " + usersHS.toString());
        System.out.println("2: " + anotherUsersHS.toString());
        System.out.println("3: " + objHS.toString());
    }

}
