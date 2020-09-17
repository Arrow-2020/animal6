/*1. Создать классы Собака и Кот с наследованием от класса Животное.
        2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
        4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
        5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.*/
package ru.geekbrains.lessons6;
public abstract class Animal extends Object {
    protected String name;
    protected double max_length;
    protected double max_length_swim;
    protected double max_height;

    public Animal(String name, double max_length, double max_length_swim, double max_height) {
        this.name = name;
        this.max_length = max_length;
        this.max_length_swim = max_length_swim;
        this.max_height = max_height;
    }

    protected void running(double distance_run) {

        if (max_length >= distance_run)
            System.out.println(name + " пробежит " + distance_run + ".");
        else
            System.out.println(name + " не пробежит. Дистанция " + distance_run + " слишком большая.");
    }


    protected void swimming(double distance_sw) {

        if (max_length_swim >= distance_sw)
            System.out.println(name + " проплывет " + distance_sw + ".");
        else
            System.out.println(name + " не сможет проплыть.");
    }

    protected void jumping(double distance_jump) {

        if (max_height >= distance_jump)
            System.out.println(name + " прыгнет " + distance_jump + ".\n");
        else
            System.out.println(name + " не сможет прыгнуть.\n");
    }

}