import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private String color;
    Shelter shelter = new Shelter("Ygg", "Bishek");



    public Pet(int age, String color, Shelter shelter) {
        this.age = age;
        this.color = color;
        this.shelter = shelter;
    }

    public Pet() {
    }

    private int generateDefaultAge(){
        Random r = new Random();
        int number = r.nextInt(20);

        return number;
    }
    public String getInfo(){
        return "Pet :" + age+" "+ "Color :"+ color+" " + "address :" +" "+ shelter.getAddress()+" " + shelter.getName()
        ;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = generateDefaultAge();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
}
