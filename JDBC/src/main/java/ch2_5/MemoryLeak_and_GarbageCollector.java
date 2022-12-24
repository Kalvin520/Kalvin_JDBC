package ch2_5;

public class MemoryLeak_and_GarbageCollector {
    public static void main(String[] args) {
        Person p1 = new Person("Kalvin",20);
        Person p2 = new Person("vivian",20);

        p1 = p2;
        p1.talk();// p1已經指向vivian的物件池
        p2.talk();
    }
}
