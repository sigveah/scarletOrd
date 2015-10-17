
public class Oppgave6
{
  public static void main(String[]args)throws Exception
  {
    Ordliste liste = new Ordliste();
    liste.lesBok("scarlet.text");
    System.out.println("Det er totalt " + liste.antallOrd() + " ulike ord i teksten.");
    System.out.println("Watson er skrevet " + liste.antallForekomster("watson") + " ganger i teksten.");

  }
}
