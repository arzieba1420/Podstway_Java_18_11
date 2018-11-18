public class Animals {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        animals[0] = new Dog("Burek");
        animals[1] = new Cat("Filemon");
        animals[2] = new Pig("Prosiaczek");
        animals[3] = new Animal();
        animals[4] = new Raven("Blackie");
        animals[5] = new Mouse("Micky");

        for (Animal animal: animals){
            animal.introduce();
        }
    }
}


class Animal {
    String name;

    public Animal() {
        this.name = "bezimienny";
    }

    String showName(){
        return "zwierzę "+ this.name;
    }

    String makeSound(){
        return "???";
    }

    void introduce(){
        System.out.println("Jestem "+showName()+ ": "+makeSound());
    }
}



class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }

    @Override
    String makeSound() {
        return "Hau hau";
    }

    @Override
    String showName() {
        return "Pies "+this.name;
    }
}

class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
    }
}

class Pig extends Animal {
    public Pig(String name) {
        this.name = name;
    }

    @Override
    String makeSound() {
        return "hrum hrum";
    }

    @Override
    String showName() {
        return "Świnka "+this.name;
    }
}

class Raven extends Animal {
    public Raven(String name) {
        this.name = name;
    }

    @Override
    String makeSound() {
        return "kra kra";
    }

    @Override
    String showName() {
        return "Kruk "+this.name;
    }
}

class Mouse extends Animal {
    public Mouse(String name) {
        this.name = name;
    }

    @Override
    String makeSound() {
        return "pii";
    }

    @Override
    String showName() {
        return "Mysz "+this.name;
    }
}



