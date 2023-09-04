package modules;
import enums.StatusLivre;

import java.util.Date;

public class Resarvation {
    private Date dateDemprunt;
    private Date datePrevueDeRetoure;
    private Date dateDeRetoure;
    public StatusLivre statusLivre;

    public Resarvation(Date dateDemprunt, Date datePrevueDeRetoure, Date dateDeRetoure, StatusLivre statusLivre) {
        this.dateDemprunt = dateDemprunt;
        this.datePrevueDeRetoure = datePrevueDeRetoure;
        this.dateDeRetoure = dateDeRetoure;
        this.statusLivre = statusLivre;
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
                '}';
    }
}
