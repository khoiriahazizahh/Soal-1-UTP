package shapes;

public class PrismaSegitigaSamaKaki extends BangunRuang {
    private double alas;
    private double kaki;

    public PrismaSegitigaSamaKaki(double alas, double kaki, double tinggi) {
        setNama("Prisma Segitiga Sama Kaki");
        this.alas = alas;
        this.kaki = kaki;
        setTinggi(tinggi);
    }

    public double getLuasAlas() {
        double ta = Math.sqrt((kaki * kaki) - ((alas * alas) / 4));
        return ta * alas / 2;
    }

    public double getKeliling() {
        return 2 * kaki + alas;
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

