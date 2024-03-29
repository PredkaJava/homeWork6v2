package homeWork6;
/* Создайте классы Собака и Кот с наследованием от класса животные
   Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия
   Результатом выполнения действия будет печать в консоль.
   У каждого животного есть ограничения на действия(бег кот 200м пес 500м, плавание пес 10м кот не умеет плавать)
   *Добавить подсчет котов собак и животных */
public class Main {

    public static void main(String[] args) {
        Cats cat = new Cats("Борис", 100, 10);
        Dogs dog = new Dogs("Бобик", 300, 10);
        Dogs dog2 = new Dogs("Тузик", 600, 20);

        cat.printInfo();
        cat.toRun(100);
        cat.toSwim(0);

        dog.printInfo();
        dog.toSwim(100);
        dog.toRun(500);

        dog2.printInfo();
        dog2.toRun(500);
        dog2.toSwim(10);

        System.out.println(Animals.getCount() + " Всего животных!");
        System.out.println(Cats.getCatCount() + " Кошки!");
        System.out.println(Dogs.getDogCount() + " Собаки!");
    }
}