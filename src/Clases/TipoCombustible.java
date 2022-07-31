package Clases;

public enum TipoCombustible {
    CELDAS("Solido*", "Liquido*****" ),
    QUEROSENO_H("Queroseno", "H(liq.)"),
    SOLIDO_N("solido*", "Queroseno+N(liq)"),
    MONOMETILHIDRICA("MMH", "óxido nítrico"),
    HIDRAZINA("aerozina 50**", "NO4"),
    ;

    private String combustible;
    private String agenteOxidante;


    TipoCombustible(String combustible, String agenteOxidante) {
        this.combustible = combustible;
        this.agenteOxidante = agenteOxidante;
    }

     @Override
    public String toString() {
        return  combustible + " + " + agenteOxidante ;
    }
}
