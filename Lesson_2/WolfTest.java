public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "Мужской";
        wolfOne.nickname = "Белый клык";
        wolfOne.color = "Белый";
        wolfOne.weight = 20.5f;
        wolfOne.age = 5;

        System.out.println(wolfOne.gender);
        System.out.println(wolfOne.nickname);
        System.out.println(wolfOne.color);
        System.out.println(wolfOne.weight);
        System.out.println(wolfOne.age);

        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.wail();
        wolfOne.hunt();
        }
}