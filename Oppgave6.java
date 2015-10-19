
public class Oppgave6
{
  public static void main(String[]args)throws Exception
  {
    Ordliste liste = new Ordliste();
    liste.lesBok("scarlet.text");
    System.out.println("Det er totalt " + liste.antallOrd() + " ulike ord i teksten.");
    System.out.println("Holmes er skrevet " + liste.antallForekomster("holmes") + " ganger i teksten.");
    System.out.println("Elementary er skrevet " + liste.antallForekomster("elementary") + " ganger i teksten.");
    System.out.println("Vanligste ord er " + liste.vanligste().toString());
  }
}
