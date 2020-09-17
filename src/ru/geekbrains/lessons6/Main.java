package ru.geekbrains.lessons6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Установите дистанцию бега: ");
        double distance_run = in.nextInt();
        System.out.println("Установите дистанцию плавания: ");
        double distance_sw = in.nextInt();
        System.out.println("Установите дистанцию прыжка: ");
        double distance_jump = in.nextInt();

        Cat CatOne = new Cat("Кузен", 200, 0, 2);
        Dog DogOne = new Dog("Лорд", 500, 10, 0.5);
        Dog DogTwo = new Dog("Дружок", 550, 30, 3.2);

        CatOne.running(distance_run);
        CatOne.swimming(distance_sw);
        CatOne.jumping(distance_jump);

        DogOne.running(distance_run);
        DogOne.swimming(distance_sw);
        DogOne.jumping(distance_jump);
        DogTwo.running(distance_run);
        DogTwo.swimming(distance_sw);
        DogTwo.jumping(distance_jump);

    }
}