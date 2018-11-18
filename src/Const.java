public class Const {
    public static void main(String[] args) {


        new Bb ();

    }
}


class Aa {

    Aa (){
        System.out.println("Działa konstruktor klasy A");
    }
    Aa (boolean arg){
        System.out.println("Działa konstruktor z argumentem "+ arg+" klasy A");
    }
}

class Bb extends Aa {

    Bb () {
        super(true);
        System.out.println("Działa konstruktor klasy B");
    }
}