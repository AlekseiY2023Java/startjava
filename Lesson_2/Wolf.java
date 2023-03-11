public class Wolf {

    private String gender;
    private String nickname;
    private String color;
    private float weight;
    private int age;

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getGender() {
        return gender;
    }

    public String getNickname() {
        return nickname;
    }

    public String getColor() {
        return color;
    }

    public float getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void go() {
        System.out.println("Идти");
    }

    public void sit() {
        System.out.println("Сидеть");
    }

    public void run() {
        System.out.println("Бежать");
    }

    public void wail() {
        System.out.println("Выть");
    }

    public void hunt() {
        System.out.println("Охотиться");
    }
}