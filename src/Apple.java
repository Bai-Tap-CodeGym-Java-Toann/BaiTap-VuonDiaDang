public class Apple {
    public int weight = (int) (Math.random() * 30 + 2);

    public boolean isEmpty() {
        if (this.weight <= 0) {
            return true;
        }
        return false;
    }
}
