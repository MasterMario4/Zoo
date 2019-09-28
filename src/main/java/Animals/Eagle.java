package Animals;

public class Eagle implements IAnimal {
    @Override
    public String getName() {
        return "Eagle";
    }

    @Override
    public String makeNoise() {
        return "IIIIIIII";
    }
}
