interface Pet {
    void sound();
}

class Cat implements Pet {
    @Override

    public void sound() {
        System.out.println("Cat says MEOW ");
    }

}

class Dog implements Pet {
    @Override

    public void sound() {
        System.out.println("Dog says GAV");
    }
}

abstract class PetHouse {
    abstract Pet createPet();
}



class CatHouse extends PetHouse {

    @Override
    Pet createPet() {
        return new Cat();
    }
}

class DogHouse extends PetHouse {
    @Override
    Pet createPet() {
        return new Dog();
    }
}

class Test1 {
    public static void main(String[] args) {

        PetHouse CatHouse = new CatHouse();
        PetHouse DogHouse = new DogHouse();
        Pet Cat = CatHouse.createPet();
        Cat.sound();
        Pet Dog = DogHouse.createPet();
        Dog.sound();
    }
}