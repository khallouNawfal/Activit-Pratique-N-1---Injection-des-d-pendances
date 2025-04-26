package net.nawfal.pres;


import net.nawfal.dao.DaoImpl;
import net.nawfal.matier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        System.out.println("RES= "+metier.calcul());
    }
}
