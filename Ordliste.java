import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;


public class Ordliste
{
  private ArrayList<Ord> liste = new ArrayList<Ord>();//arraylist for oppsamling av ord
  private int listelengde = 0;

  public void lesBok(String filen)throws Exception
  {
    liste.add(new Ord("null"));//se siste linje i finnOrd-metod
    listelengde++;
    Scanner inn = new Scanner(new File(filen));//henter ord fra filen anngitt i kallet paa metode lesBok og legger det inn i scanner inn
    while (inn.hasNextLine())
      {
        String tempOrd = inn.nextLine();
        leggeTilOrd(tempOrd);//sender ord fra scanner via string til metode legeTilOrd
      }
  }

  public void leggeTilOrd(String ordet)
  {
    if(ordet.equalsIgnoreCase(finnOrd(ordet).toString()))//sjekker om ordet finnes i listen fra foer ved hjelt av metoden finnord
      {
        finnOrd(ordet).oekAntall();//oeker teller i objekt ord
      }
    else
      {
        Ord ord = new Ord(ordet);//lager nytt ord objekt
        liste.add(ord);//legger til objektet i liste
        listelengde++;
      }
  }

  public Ord finnOrd(String tekst)
  {
    for (int i =0; i>=liste.size();  i++)//gaar gjennom alle ord i liste
    {
     if(tekst.equalsIgnoreCase(liste.get(i).toString()))//sjekker om tekst er likt som hver toString fra liste
     {
       return liste.get(i);//returnerer listepossisjon
     }
    }
    return liste.get(0);//hvis forloekke ikke har returner noen verdi faar man reutrnert null(som er min ekstraoppføring i listen, se linje 12)
  }

  public int antallOrd()
  {
    int listeTelling;
    if (liste.get(0).hentAntall()==1)
    {
      listeTelling = liste.size() - 1;
    }
    else
    {
      listeTelling = liste.size();
    }
    return listeTelling;

  }



}
