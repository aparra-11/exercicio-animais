public class Dog extends Animal {
    public Dog(int age, String name, String makeNoise) {
        super(age, name, makeNoise);
    }

    public void convertToHumanAge() {
        System.out.println(getAge() * 7);
    }
}

