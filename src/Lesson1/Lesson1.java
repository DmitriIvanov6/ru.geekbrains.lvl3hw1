package Lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Orange orange = new Orange();

        Box<Apple> box1 = new Box<Apple>(apple1, apple2, apple3);
        Box<Apple> box2 = new Box<Apple>();
        Box<Orange> box3 = new Box<Orange>(new Orange(), new Orange());
        box2.add(apple1);
        box2.add(apple1);
        box2.add(apple1);
        box2.add(apple1);
        box2.add(apple1);
        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box1.compare(box3));
        box1.move(box2);
        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());


//        ArraySwap<String> arraySwap = new ArraySwap<>("a", "b", "c", "d", "e");
//        arraySwap.swap(arraySwap.getMyArray(), 2, 1);
////        System.out.println(Arrays.toString(arraySwap.getMyArray()));
//
//        ArrayList<String> arrayList = arraySwap.arrToList(arraySwap.getMyArray());
//        System.out.println(arrayList);


    }
}
