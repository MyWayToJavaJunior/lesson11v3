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
        UserEQ[] usersEQ = new UserEQ[10];
        UserHC[] usersHC = new UserHC[10];
        UserEQHC[] usersEQHC = new UserEQHC[10];
        for (int i = 0; i < users.length; i++) {
            if (i < 5) users[i] = new User(USERS[i], AGES[i]);
            else users[i] = new User(USERS[i - 5], AGES[i - 5]);
            if (i < 5) usersEQ[i] = new UserEQ(USERS[i], AGES[i]);
            else usersEQ[i] = new UserEQ(USERS[i - 5], AGES[i - 5]);
            if (i < 5) usersHC[i] = new UserHC(USERS[i], AGES[i]);
            else usersHC[i] = new UserHC(USERS[i - 5], AGES[i - 5]);
            if (i < 5) usersEQHC[i] = new UserEQHC(USERS[i], AGES[i]);
            else usersEQHC[i] = new UserEQHC(USERS[i - 5], AGES[i - 5]);
        }
        AnotherUser[] anotherUsers = new AnotherUser[10];
        AnotherUserEQ[] anotherUsersEQ = new AnotherUserEQ[10];
        AnotherUserHC[] anotherUsersHC = new AnotherUserHC[10];
        AnotherUserEQHC[] anotherUsersEQHC = new AnotherUserEQHC[10];
        for (int i = 0; i < anotherUsers.length; i++) {
            if (i < 5) anotherUsers[i] = new AnotherUser(USERS[i], AGES[i]);
            else anotherUsers[i] = new AnotherUser(USERS[i - 5], AGES[i - 5]);
            if (i < 5) anotherUsersEQ[i] = new AnotherUserEQ(USERS[i], AGES[i]);
            else anotherUsersEQ[i] = new AnotherUserEQ(USERS[i - 5], AGES[i - 5]);
            if (i < 5) anotherUsersHC[i] = new AnotherUserHC(USERS[i], AGES[i]);
            else anotherUsersHC[i] = new AnotherUserHC(USERS[i - 5], AGES[i - 5]);
            if (i < 5) anotherUsersEQHC[i] = new AnotherUserEQHC(USERS[i], AGES[i]);
            else anotherUsersEQHC[i] = new AnotherUserEQHC(USERS[i - 5], AGES[i - 5]);
        }
        HashSet<User> usersHS = new HashSet<>(Arrays.asList(users));
        HashSet<UserEQ> usersHSEQ = new HashSet<>(Arrays.asList(usersEQ));
        HashSet<UserHC> usersHSHC = new HashSet<>(Arrays.asList(usersHC));
        HashSet<UserEQHC> usersHSEQHC = new HashSet<>(Arrays.asList(usersEQHC));
        HashSet<AnotherUser> anotherUsersHS = new HashSet<>(Arrays.asList(anotherUsers));
        HashSet<AnotherUserEQ> anotherUsersHSEQ = new HashSet<>(Arrays.asList(anotherUsersEQ));
        HashSet<AnotherUserHC> anotherUsersHSHC = new HashSet<>(Arrays.asList(anotherUsersHC));
        HashSet<AnotherUserEQHC> anotherUsersHSEQHC = new HashSet<>(Arrays.asList(anotherUsersEQHC));
        Object[] obj = new Object[10];
        Object[] objEQ = new Object[10];
        Object[] objHC = new Object[10];
        Object[] objEQHC = new Object[10];
        for (int i = 0; i < obj.length; i++) {
            if (i < 5) obj[i] = users[i];
            else obj[i] = anotherUsers[i - 5];
            if (i < 5) objEQ[i] = usersEQ[i];
            else objEQ[i] = anotherUsersEQ[i - 5];
            if (i < 5) objHC[i] = usersHC[i];
            else objHC[i] = anotherUsersHC[i - 5];
            if (i < 5) objEQHC[i] = usersEQHC[i];
            else objEQHC[i] = anotherUsersEQHC[i - 5];
        }
        HashSet<Object> objHS = new HashSet<>(Arrays.asList(obj));
        HashSet<Object> objHSEQ = new HashSet<>(Arrays.asList(objEQ));
        HashSet<Object> objHSHC = new HashSet<>(Arrays.asList(objHC));
        HashSet<Object> objHSEQHC = new HashSet<>(Arrays.asList(objEQHC));

        System.out.println("-------------------- Nothing overrided --------------------");
        System.out.println("1      : " + usersHS.toString());
        System.out.println("2      : " + anotherUsersHS.toString());
        System.out.println("3(obj) : " + objHS.toString());
        System.out.println("-------------------- Equals overrided ---------------------");
        System.out.println("4      : " + usersHSEQ.toString());
        System.out.println("5      : " + anotherUsersHSEQ.toString());
        System.out.println("6(obj) : " + objHSEQ.toString());
        System.out.println("-------------------- HashCode overrided -------------------");
        System.out.println("7      : " + usersHSHC.toString());
        System.out.println("8      : " + anotherUsersHSHC.toString());
        System.out.println("9(obj) : " + objHSHC.toString());
        System.out.println("---------------- Hashcode & equals overrided --------------");
        System.out.println("10     : " + usersHSEQHC.toString());
        System.out.println("11     : " + anotherUsersHSEQHC.toString());
        System.out.println("12(obj): " + objHSEQHC.toString());
    }

}
