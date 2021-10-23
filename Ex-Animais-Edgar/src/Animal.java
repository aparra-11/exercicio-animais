public class Animal {
    private int age;
    private String name;
    private String makeNoise;

    public Animal(int age, String name, String makeNoise) {
        this.age = age;
        this.name = name;
        this.makeNoise = makeNoise;
    }

    public String getName() {
        return name;
    }

    public String getMakeNoise() {
        return makeNoise;
    }

    public int getAge() {
        return age;
    }

    public void convertToHumanAge() {
    }

    public void Speak() {
    }
}
