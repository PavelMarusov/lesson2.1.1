public class Main {

    public static void main(String[] args) {
        Shelter shelter = new Shelter("Home", "Bishkek");



        Dog dog = new Dog();
        dog.setShelter(shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice(5);
        dog.makeVoice("Tayf", 5);
        System.out.println("________________");
//        Dog dog1 = new Dog ("Tyzik","Laika",new Shelter("Home","Tokmok"),"Sidet");
//        System.out.println(dog1.getInfo());
//        dog1.makeVoice();
//        dog1.makeVoice(4);
//        dog1.makeVoice("GAV GAV",2);
//        System.out.println("________________________");
//        Dog dog2 = new Dog ("Sharik", "homedog", new Shelter("gavGav","Kant") );
        Dog dog2 = new Dog("Sharik", "homedog", Color.BLACK, shelter);
        dog2.setShelter(shelter);
        System.out.println(dog2.getInfo());
        dog2.makeVoice();
        dog2.makeVoice(5);
        dog2.makeVoice("Tyaf -tayf", 6);

    }
}
