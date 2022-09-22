public class Main {
    public static void main(String[] args)
    {
        String partyPolitic = "D";

        if(partyPolitic.equalsIgnoreCase("D"))
        {
            System.out.println("You selected Democrat. You receive a Donkey badge!");
        }
        else if(partyPolitic.equalsIgnoreCase("R"))
        {
            System.out.println("You selected Republican. You receive an Elephant badge!");
        }
        else if(partyPolitic.equalsIgnoreCase("I"))
        {
            System.out.println("You selected Independent. You receive an Eagle badge!");
        }
        else
        {
            System.out.println("You selected other. You receive an O badge!");
        }
    }
}