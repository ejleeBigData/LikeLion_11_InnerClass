public class Main {
    String outerMessage = "Hello from Outer";

    private class Inner {
        void showMessage() {
            System.out.println(outerMessage);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        Main.Inner inner = main.new Inner();
        inner.showMessage();
    }
}

/*
//오류 코드
class Outer {
    String outerMessage = "Hello from Outer";

    private class Inner {
        void showMessage() {
            System.out.println(outerMessage);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.Inner inner = outer.new Inner();

        inner.showMessage();
    }
}
*/