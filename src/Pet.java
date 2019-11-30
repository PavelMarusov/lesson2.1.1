import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private Color color;
    Shelter shelter;




    public Pet() {
    }

    private int generateDefaultAge() {
        Random r = new Random();
        int number = r.nextInt(20);

        return number;
    }

    public String getInfo() {
        return "Pet :" + age + " Цвет: "+color + " Адрес: " + getShelter() ;


    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = generateDefaultAge();
    }
}

