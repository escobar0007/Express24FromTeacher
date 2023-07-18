package uz.escobar.express24.util;

import java.util.Random;

public class CredentialsUtil {
    public static Long generateRandomId() {
        return new Random().nextLong(1, 2>>64);
    }

    public static void main(String[] args) {
        Long id = generateRandomId();
        System.out.println(id);
    }
}
