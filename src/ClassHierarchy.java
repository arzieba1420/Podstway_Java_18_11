public class ClassHierarchy {
    public static void main(String[] args) {

    }
}



class A {

    boolean val;

    A(){
        System.out.println("Wywołano konstruktor klasy A");
    }

    A (boolean val) {


    }
}

class B extends A {
    boolean val;
    B(){
        System.out.println("Wywołano konstruktor klasy B");
    }

    B (boolean val) {
        super(val);
    }
}

class C extends B{

    boolean val;

    C(){
        System.out.println("Wywołano konstruktor klasy C");
    }

    C (boolean val){
        super(val);
        this.val=val;
   }
}
