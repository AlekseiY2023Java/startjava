public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("Мужской");
        wolfOne.setNickname("Белый клык");
        wolfOne.setColor("Белый");
        wolfOne.setWeight(20.5f);
        wolfOne.setAge(5);

        System.out.println(wolfOne.getGender());
        System.out.println(wolfOne.getNickname());
        System.out.println(wolfOne.getColor());
        System.out.println(wolfOne.getWeight());
        System.out.println(wolfOne.getAge());

        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}