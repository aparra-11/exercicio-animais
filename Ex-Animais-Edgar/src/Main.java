public class Main {

    public static void main(String[] args) {
        Turkey peru= new Turkey(4, "Peru", "glu glu glu");
        peru.convertToHumanAge();
        System.out.println("O peru tem " + peru.getAge() + " anos!");
        System.out.println("O peru chama-se " + peru.getName() + " !");
        peru.Speak();

        System.out.println("\n");

        Pig porco= new Pig(5, "Porco", "oink oink");
        porco.convertToHumanAge();
        System.out.println("O porco tem " + porco.getAge() + " anos!");
        System.out.println("O porco chama-se " + porco.getName() + " !");
        System.out.println(porco.getMakeNoise());

        System.out.println("\n");

        Dog cao = new Dog(3, "Cão", "woof woof");
        cao.convertToHumanAge();
        System.out.println("O cao tem " + cao.getAge() + " anos!");
        System.out.println("O cao chama-se " + cao.getName() + " !");
        System.out.println(cao.getMakeNoise());



    }
}
