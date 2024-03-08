package dk.kea.musikdatacontroller.repository;

import dk.kea.musikdatacontroller.model.Musikdata;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MusikRepository {
    public List<Musikdata> getAll() {
    List<Musikdata> liste = new ArrayList<>();
        liste.add(new Musikdata(1, "Run-DMC", "Walk This Way", "Raising Hell", 1986));
        liste.add(new Musikdata(2, "N.W.A", "Straight Outta Compton", "Straight Outta Compton", 1988));
        liste.add(new Musikdata(3, "Public Enemy", "Fight the Power", "Fear of a Black Planet", 1989));
        liste.add(new Musikdata(4, "The Notorious B.I.G.", "Juicy", "Ready to Die", 1994));
        liste.add(new Musikdata(5, "Tupac Shakur", "California Love", "All Eyez on Me", 1996));
        liste.add(new Musikdata(6, "Wu-Tang Clan", "C.R.E.A.M.", "Enter the Wu-Tang (36 Chambers)", 1993));
        liste.add(new Musikdata(7, "Dr. Dre", "Nuthin' but a 'G' Thang", "The Chronic", 1992));
        liste.add(new Musikdata(8, "Beastie Boys", "Sabotage", "Ill Communication", 1994));
        liste.add(new Musikdata(9, "A Tribe Called Quest", "Can I Kick It?", "People's Instinctive Travels and the Paths of Rhythm", 1990));
        liste.add(new Musikdata(10, "Snoop Doggy Dogg", "Gin and Juice", "Doggystyle", 1994));

        return liste;
    }
}
