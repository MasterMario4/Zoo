package Animals;

public class Shark implements IAnimal {
    @Override
    public String getName() {
        return "Shark";
    }

    @Override
    public String makeNoise() {
        return "bul bul bul";
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
