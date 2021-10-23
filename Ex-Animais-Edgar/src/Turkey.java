import java.util.Scanner;

public class Turkey extends Animal {

    public Turkey(int age, String name, String makeNoise) {
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
    public void convertToHumanAge() {
        System.out.println(getAge() * 5);
    }

    @Override
    public void Speak() {
        System.out.println("Queres o peru que fala? Se sim, escreve 'Sim'.");

        Scanner sc = new Scanner(System.in);
        String optionTurkey = sc.next();

        if (optionTurkey.equals("Sim")) {
            System.out.println(getMakeNoise());
        } else {
            System.out.println("*strange noise*");
        }
    }
}
