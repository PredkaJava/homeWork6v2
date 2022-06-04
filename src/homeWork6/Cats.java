package homeWork6;

public class Cats extends Animals{
    private static int catCount;

    public Cats(String name) {
        super(name, 200, 0,"Кот");
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void toSwim(int distance) {
        System.out.println("Коты не умеют плавать!");
    }

}
