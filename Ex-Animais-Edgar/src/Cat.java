public class Cat extends Animal {

    public Cat(int age, String name, String makeNoise) {
        super(age, name, makeNoise);
    }

    public void convertToHumanAge() {
        System.out.println(getAge() * 12);
    }

}
