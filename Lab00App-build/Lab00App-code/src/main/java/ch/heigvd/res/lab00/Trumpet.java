package ch.heigvd.res.lab00;/* ***********************************************
    HEIG-VD
    Date : 21.02.2018
    Nom du fichier : 
    Auteur(s) : Bryan Curchod
    But:
    
 ************************************************* */

public class Trumpet implements IInstrument {
    @Override
    public int getSoundVolume() {
        return 10;
    }

    @Override
    public String getColor() {
        return "golden";
    }

    @Override
    public String play() {
        return "pouet";
    }
}
