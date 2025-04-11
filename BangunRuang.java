package shapes;

    public abstract class BangunRuang {
        protected String nama;
        protected double tinggi;
    
        public BangunRuang() {}
    
        public void setNama(String inputNama) {
            this.nama = inputNama;
        }
    
        public String getNama() {
            return nama;
        }
    
        public void setTinggi(double inputTinggi) {
            this.tinggi = inputTinggi;
        }
    
        public double getTinggi() {
            return tinggi;
        }
    
        public abstract double getLuasPermukaan();
        public abstract double getVolume();
    
        public void printInfo() {
            System.out.println("Nama : " + getNama());
            System.out.println("Luas permukaan : " + getLuasPermukaan());
            System.out.println("Volume : " + getVolume());
        }
    }

