package modules;
import enums.StatusLivre;

import java.util.Date;

public class Resarvation {
    private Date dateDemprunt;
    private Date datePrevueDeRetoure;
    private Date dateDeRetoure;
    public StatusLivre statusLivre;
    private int adherentID;
    private int livreID;

    public Resarvation(Date dateDemprunt, Date datePrevueDeRetoure, Date dateDeRetoure, StatusLivre statusLivre, int adherentID, int livreID) {
        this.dateDemprunt = dateDemprunt;
        this.datePrevueDeRetoure = datePrevueDeRetoure;
        this.dateDeRetoure = dateDeRetoure;
        this.statusLivre = statusLivre;
        this.adherentID = adherentID;
        this.livreID = livreID;
    }

    public Resarvation() {
    }

    public Date getDateDemprunt() {
        return dateDemprunt;
    }

    public void setDateDemprunt(Date dateDemprunt) {
        this.dateDemprunt = dateDemprunt;
    }

    public Date getDatePrevueDeRetoure() {
        return datePrevueDeRetoure;
    }

    public void setDatePrevueDeRetoure(Date datePrevueDeRetoure) {
        this.datePrevueDeRetoure = datePrevueDeRetoure;
    }

    public Date getDateDeRetoure() {
        return dateDeRetoure;
    }

    public void setDateDeRetoure(Date dateDeRetoure) {
        this.dateDeRetoure = dateDeRetoure;
    }

    @Override
    public String toString() {
        return "Resarvation{" +
                "dateDemprunt=" + dateDemprunt +
                ", datePrevueDeRetoure=" + datePrevueDeRetoure +
                ", dateDeRetoure=" + dateDeRetoure +
                ", statusLivre=" + statusLivre +
                ", adherentID=" + adherentID +
                ", livreID=" + livreID +
                '}';
    }
}
