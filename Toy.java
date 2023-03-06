public class Toy {

    int id;
    String name;
    double count;

    public Toy(int id, String name, double count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    public void setWeight(float count) {
        this.count = count;
    }

    public double getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Toy [id=" + id + ", name=" + name + ", count=" + count + "]";
    }
}
