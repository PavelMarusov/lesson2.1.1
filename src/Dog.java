import java.util.SortedMap;

public class Dog extends  Pet{
    private String name;
    private String breed;
    private String commands;




    public Dog ( String name,String breed, Shelter shelter, String commands){
        super.setColor(Color.BLACK);
        this.name=name;
        this.breed=breed;
        this.commands=commands;



    }
    Pet pet = new Pet();


    public Dog() {
    }


    public Dog (String name,String breed, Color color, Shelter shelter){
        this.breed=breed;
        this.name=name;
        super.setColor(color);


    }
    void makeVoice (){
        System.out.println("gav gav");
    }
    void makeVoice(String voice, int number){
        System.out.println("Издала (" + voice + ")" + "столько (" +number+ ") раз");
    }
    void makeVoice(int number){
        for (int i = 0; i <number ; i++) {
            System.out.println("Gav");

        }
    }
    public String getInfo(){
        return super.getInfo() +" "+ " Кличка :"+ name + " Порода :"+ breed + " Команда :" + commands;
    }

}
