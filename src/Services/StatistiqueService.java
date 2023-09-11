package Services;

import Controllers.StatistiqueControllers;

public class StatistiqueService {
    StatistiqueControllers statistiqueControllers=new StatistiqueControllers();
    public void afficherCountPerdu(){
        statistiqueControllers.NumbreLivrePerdu();
    }  public void afficherCountEmprunte(){
        statistiqueControllers.NumbreLivreEmprunte();
    }
}
