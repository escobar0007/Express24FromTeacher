package uz.escobar.express24;

import uz.escobar.express24.model.User;

import java.util.Random;
import java.util.Scanner;

public class Express24APP {
    public static void main(String[] args) {
        User user = new User();
    }

    public static Scanner sc() {
        return new Scanner(System.in);
    }

    public static Random r() {
        return new Random();
    }
}
