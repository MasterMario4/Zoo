package Animals;

public class Lion implements IAnimal {
    @Override
    public String getName() {
        return "Lion";
    }

    @Override
    public String makeNoise() {
        return "RRRRROOOOOOOOOAAAAAAARRRRR!";
    }
}
