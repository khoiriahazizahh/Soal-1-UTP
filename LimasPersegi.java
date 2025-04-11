package shapes;

public class LimasPersegi extends BangunRuang {
    private double sisi;

    public LimasPersegi(double sisi, double tinggi) {
        setNama("Limas Persegi");
        this.sisi = sisi;
        setTinggi(tinggi);
    }

    public double getLuasAlas() {
        return sisi * sisi;
    }

    public double getLuasSegitiga() {
        double ts = Math.sqrt((tinggi * tinggi) + ((sisi / 2) * (sisi / 2)));
        return ts * sisi / 2;
    }

    @Override
    public double getLuasPermukaan() {
        return 4 * getLuasSegitiga() + getLuasAlas();
    }

    @Override
    public double getVolume() {
        return getLuasAlas() * getTinggi() / 3;
    }
}

