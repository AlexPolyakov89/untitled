package lesson9;

public class FractionNumber {
    private int chislitel;
    private int znamenatel;

    public FractionNumber() {

    }
    public FractionNumber(int chis,int znam) {
        chislitel = chis;
        znamenatel = znam;
    }

    public void setChislitel(int chisl) {
        chislitel = chisl;
    }

    public int getChislitel() {
        return chislitel;
    }

    public void setZnamenatel(int znamen) {
        znamenatel = znamen;
    }

    public int getZnamenatel() {
        return znamenatel;
    }

    public FractionNumber slojenie( FractionNumber dr2) {
        int resultZnam = this.getZnamenatel() * dr2.getZnamenatel();
        int resultChisl = (this.getChislitel() * dr2.getZnamenatel()) + (this.getZnamenatel() * dr2.getChislitel());
        FractionNumber result = new FractionNumber();
        result.setChislitel(resultChisl);
        result.setZnamenatel(resultZnam);
        return result;
    }
}

