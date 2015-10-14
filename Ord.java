
public class Ord
{
  private int teller = 1;
  private String ord;

  Ord(String navn)//konstruktoer
  {
    this.ord = navn;
  }

  public void oekAntall()//oeker teller for antall forekomster av ordet
  {
    teller +=1;
  }

  public String toString()//returnerer ordet
  {
    return ord;
  }

  public int hentAntall() //henter data om hvor mange ganger ordet forekommer.
  {
    return teller;
  }
}
