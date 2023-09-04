package modules;
import java.util.Date;

public class Resarvation {
    private Date dateDemprunt;
    private Date datePrevueDeRetoure;
    private Date dateDeRetoure;
    public enum StatusLivraison {
        Disponible,
        Emprunté,
        perdu

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
}
