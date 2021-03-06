import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;


public class Ordliste
{
  private ArrayList<Ord> liste = new ArrayList<Ord>();//arraylist for oppsamling av ord


  public void lesBok(String filen)throws Exception
  {
    liste.add(new Ord("null"));//se siste linje i finnOrd-metod
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
      }
  }


  public Ord finnOrd(String tekst)
  {
    for (Ord objektKopi: liste)//gaar gjennnom liste og sender inn en kopi av hvert objekt
    {
      if (objektKopi.toString().equalsIgnoreCase(tekst))//sjekker om tekst er likt som tostring i kopiert objekt
      {
        return objektKopi;//returnerer objektKopi hvis det matcher sin toString mot tekst
      }
    }
    return liste.get(0);//hvis forloekke ikke har returner noen verdi faar man reutrnert null(som er min ekstraoppføring i listen, se linje 12)
  }


  public int antallOrd()
  {
    int listeTelling;
    if (liste.get(0).hentAntall()==1)//trekke fra en pga lagt til null foerst i liste
    {
      listeTelling = liste.size() - 1;
    }
    else
    {
      listeTelling = liste.size();
    }
    return listeTelling;
  }


  public int antallForekomster(String tekst)
  {
    int forekomster = finnOrd(tekst).hentAntall();
    return forekomster;
  }

  public Ord vanligste()
  {
    int size=0;
    int i=0;
    int arrayplass = 0;
    for (Ord o: liste)
    {
      i++;
      if (antallForekomster(o.toString())>size)
      {
        size = o.hentAntall();
        arrayplass = i;
      }
    }
    return liste.get(arrayplass);
  }


}
