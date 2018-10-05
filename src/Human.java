public class Human {
    private String name = "man";
    private int age = 0;
    private boolean isBoy = true;

    public Human() {
    }

    public Human(String name, boolean isBoy) {
        this.name = name;
        this.isBoy = isBoy;
    }

    public Human(String name, int age, boolean isBoy) {
        this.name = name;
        this.age = age;
        this.isBoy = isBoy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBoy() {
        return isBoy;
    }

    public void setBoy(boolean boy) {
        isBoy = boy;
    }

    public void say(String word) {
        System.out.println(this.name + " say: " + word);
    }

    public void eat(Apple apple) {
        if (apple.isEmpty()) {
            System.out.println("hết táo rồi");
        } else {
            apple.weight -= 1;
            System.out.println(this.name+" ăn 1 quả táo");
        }
    }

    public void sleep() {
        System.out.println(this.name + " đi ngủ");
    }


}
