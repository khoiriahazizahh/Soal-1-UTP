package shapes;

public class Tabung extends BangunRuang {
    private double radius;
    private final double PEMBILANG = 22;
    private final int PENYEBUT = 7;

    public Tabung(double radius, double tinggi) {
        setNama("Tabung");
        this.radius = radius;
        setTinggi(tinggi);
    }

    public void setRadius(double inputRadius) {
        this.radius = inputRadius;
    }

    public double getLuasAlas() {
        return radius * radius * PEMBILANG / PENYEBUT;
    }

    public double getKeliling() {
        return 2 * radius * PEMBILANG / PENYEBUT;
    }

    @Override
    public double getLuasPermukaan() {
        return 2 * getLuasAlas() + getKeliling() * getTinggi();
    }

    @Override
    public double getVolume() {
        return getLuasAlas() * getTinggi();
    }
}
