import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Store {
    private List<Toy> toys;

    public Store(List<Toy> toys) {
        this.toys = toys;
    }
    
    public Toy getToyForPrice() {
        ToySelectoin random = new ToySelectoin();
        Toy toy = random.chooseOnCount(toys);
        return toy;
    }

    public void saveToyForLottery() {
        Toy toy = getToyForPrice();
        String text = toy.toString();
        try(FileWriter writer = new FileWriter("toy-store/ToyStore/Toys.txt", true))
        { 
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        toys.remove(toy);
    }
}
