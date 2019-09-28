package Animals;

public class Tiger implements IAnimal {
    @Override
    public String getName() {
        return "Tiger";
    }

    @Override
    public String makeNoise() {
        return "RRRRROOOOOOOOOAAAAAAARRRRR!";
    }

    @Override
    public boolean canSwim() {
        return true;
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
