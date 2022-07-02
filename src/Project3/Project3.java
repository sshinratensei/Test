package Project3;

public class Project3 {
    public static void main(String[] args) {
        Backpack my_backpack = new Backpack();
        Backpack my_backpack1 = new Backpack();
        Backpack my_backpack3 = new Backpack();
        Object cola = new Object("cola", "cylinder");
        Object water = new Object("water", "cylinder");
        Object book = new Object("book", "flat");
        Object apple = new Object("apple", "circle");
        Object papka = new Object("papka", "flat");
        Object tennisBall = new Object("ball", "circle");
        my_backpack.add(cola);
        my_backpack.add(book);
        for (int i = 0; i < 20; i++){
            my_backpack.add(apple);
        }
        for (int i = 0; i < 50; i++){
            my_backpack1.add(tennisBall);
        }
        my_backpack1.add(papka);
        my_backpack3.add(papka);
        my_backpack3.add(cola);
        for (int i = 0; i < 3; i++){
            my_backpack3.add(tennisBall);
        }
        for (int i = 0; i < 10; i++){
            my_backpack3.add(apple);
        }

    }
}
