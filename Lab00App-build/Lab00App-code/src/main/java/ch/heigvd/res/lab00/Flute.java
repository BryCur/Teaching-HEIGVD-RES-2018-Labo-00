package ch.heigvd.res.lab00;/* ***********************************************
    HEIG-VD
    Date : 21.02.2018
    Nom du fichier : 
    Auteur(s) : Bryan Curchod
    But:
    
 ************************************************* */

public class Flute implements IInstrument {
    @Override
    public int getSoundVolume() {
        return 5;
    }

    @Override
    public String getColor() {
        return "yellow";
    }

    @Override
    public String play() {
        return "tut";
    }
}
