public class Pig extends Animal{
    public Pig(int age, String name, String makeNoise) {
        super(age, name, makeNoise);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getMakeNoise() {
        return super.getMakeNoise();
    }

    public void convertToHumanAge() {
        System.out.println(getAge() * 10);
    }
}
