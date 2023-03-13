public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Striker Eureka");
        jaeger1.setMark("Mark-5");
        jaeger1.setOrigin("Australia");
        jaeger1.setStrength(10);
        jaeger1.setArmor(9);
        System.out.println("modelName: " + jaeger1.getModelName() + "\n\tmark : " +
                jaeger1.getMark() + "\n\torigin: " + jaeger1.getOrigin() + "\n\tstrength: " + 
                jaeger1.getStrength() + "\n\tarmor: " + jaeger1.getArmor());
        System.out.println(jaeger1.scanKaiju());
        Jaeger jaeger2 = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 10, 10);
        System.out.println(jaeger2);
        jaeger2.useVortexCannon();
    }
}