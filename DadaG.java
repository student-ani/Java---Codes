public class DadaG {
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        System.out.println("Father name is: "+f.name +" " + f.surname);
        System.out.println("My name is: "+s.name + " " + s.surname);
    }
    
}
                    //Multilevel Inheritence(Two level)
class Dada {
    String name = "Ram Murat";
    String surname = "Prakash";
    } 

    class Father extends Dada{

        String name = "Ved";

    }
    class Son extends Father{

        String name = "Aniket";

    }
