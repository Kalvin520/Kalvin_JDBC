package ch2_5;
public class NullPointException {
    public static void main(String[] args) {
        Person kalvin = new Person("Kalvin", 20);
        Person vivian = new Person("vivian",20);
        kalvin.setSpouse(vivian);
        vivian.setSpouse(kalvin);
        kalvin.talk();
        vivian.talk();
    }
}
