package kr.ac.konkuk.network.stream.inheritance;

class ChildTest {
    public static void print(Parent parent) {
        System.out.println(parent.i);
        System.out.println(parent.get());
    }

    public static void main(String[] args) {
        var parent = new Parent();
        System.out.println("------ 1 ------");
        System.out.println(parent.i);
        System.out.println(parent.get());

        var child = new Child();
        System.out.println("------ 2 ------");
        System.out.println(child.i);
        System.out.println(child.get());

        Parent parent2 = new Child();
        System.out.println("------ 3 ------");
        System.out.println(parent2.i);
        System.out.println(parent2.get());

        System.out.println("------ 4 ------");
        print(child);
        print(parent2);
    }
}
