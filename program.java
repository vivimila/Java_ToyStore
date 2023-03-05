// Задание 1
// 1)  Linux no
// 2) Создайте в директории «Игрушки для школьников» текстовые файлы - «Роботы», «Конструктор», «Настольные игры»
// Создайте в директории «Игрушки для дошколят» текстовые файлы «Мягкие игрушки», «Куклы», «Машинки»
// Объединить 2 директории в одну «Имя Игрушки»

// Задание 2
// Необходимо написать программу – розыгрыша игрушек в магазине детских товаров.

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

//Toy [id=0, name=Робот]
//Toy [id=1, name=Конструктор]
//Toy [id=2, name=Пазл]
//Toy [id=3, name=Кукла]
//Toy [id=4, name=Мячик]
//Toy [id=5, name=Мягкие]

        Toy toy1 = new Toy(0, "Робот");
        Toy toy2 = new Toy(1, "Конструктор");
        Toy toy3 = new Toy(2, "Пазл");
        Toy toy4 = new Toy(3, "Кукла");
        Toy toy5 = new Toy(2, "Мячик");
        Toy toy6 = new Toy(3, "Мячик");

        List<Toy> toys = new ArrayList<Toy>();
        toys.add(toy6);
        toys.add(toy5);
        toys.add(toy4);
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);

        ToyStore toyStore = new ToyStore(toys);
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
    } 
}
