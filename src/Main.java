public class Main {
    /*The void keyword indicates that the method shoild not return any value. If you want the method to return a value,
    * you can use a primitive data type such as char, int, etc instead of void and use the return keyword inside the method: */
    static int myMethod(int y) {
        return 5+y;
    }
    public static void main(String[] args) {
        System.out.println(myMethod(7));
//        outputs 12 (5+7)
    }
}