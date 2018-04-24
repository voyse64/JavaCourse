class SimpleClass {
    public static void main(String args[]) {
        for (int i = 0; i < 6; i ++) {
            new Box();
        }
    }
}

class Box {
    Box() {
        super();
        System.out.println("Hello! This object raference is located on the heap at:" + this);
    }
}
