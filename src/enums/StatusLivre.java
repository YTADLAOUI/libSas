package enums;

public enum StatusLivre {
    Disponible("Disponible"),Emprunte("Emprunté"),Perdu("perdu");

    public final String status;

    StatusLivre(String status){
        this.status=status;
    }

    @Override
    public String toString() {
        return "StatusLivre{"
                +"status='" + status + '\'' +
                '}';
    }
}
