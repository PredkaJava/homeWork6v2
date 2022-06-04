package homeWork6;

public abstract class Animals {
    private String name;
    private int run;
    private int swim;

    private String type;
    private static int count;

    public static int getCount() {
        return count;
    }

    public Animals(String name, int run, int swim, String type) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.type = type;
        count++;
    }

    public void toRun(int distance) {
        if (run <= distance) {
            System.out.printf("%s %s пробежал %d м! \n", type, name, run);
        } else {
            System.out.printf("%s %s не может преодолеть такую дистанцию!\n", type, name);
        }
        return;
    }

    public void toSwim(int distance) {
        if (swim <= distance) {
            System.out.printf("%s %s проплыл %d м!\n",type, name, swim);
        } else {
            System.out.printf("%s %s не может преодолеть такую дистанцию!\n", type, name);
        }
    }

    @Override
    public String toString() {
        return String.format("%s совершает действие", name);
    }
    public  void printInfo() {
        System.out.println(this);
    }
}