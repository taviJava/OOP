package tema.Builder;

public class MasaBuilder {
    private String culoare;
    private String material;
    private boolean suprafataLucioasa;
    private int lungime;
    private int latime;
    private int inaltime;
    private boolean colturiRotunde;

    public MasaBuilder setCuloare(String culoare) {
        this.culoare = culoare;
        return this;
    }


    public MasaBuilder setMaterial(String material) {
        this.material = material;
        return this;
    }

    public MasaBuilder setSuprafataLucioasa(boolean suprafataLucioasa) {
        this.suprafataLucioasa = suprafataLucioasa;
        return this;
    }

    public MasaBuilder setLungime(int lungime) {
        this.lungime = lungime;
        return this;
    }

    public MasaBuilder setLatime(int latime) {
        this.latime = latime;
        return this;
    }

    public MasaBuilder setInaltime(int inaltime) {
        this.inaltime = inaltime;
        return this;
    }

    public MasaBuilder setColturiRotunde(boolean colturiRotunde) {
        this.colturiRotunde = colturiRotunde;
        return this;
    }
    public Masa build(){
        if (lungime==0){
            throw new RuntimeException("Trebuie sa stetezi lungimea");
        }if (latime==0){
            throw new RuntimeException("Trebuie sa setezi latimea");

        }if (inaltime==0){
            throw new RuntimeException("Trebuie sa stetezi inltimea");
        }if (material==null){
           throw new RuntimeException ("Trebuie sa setezi materialul");
        }if (culoare==null){
            throw new RuntimeException("Trebuie sa setezi culoarea");
        }
        Masa masa=new Masa();
        masa.setColturiRotunde(false).setLatime(100).setInaltime(100).setCuloare("Mahon").setLungime(200).setMaterial("Stejar");
        return masa;
    }

    public class Masa{
        //2.Builder de Masa(Culoare , Material(stejar/fag), suprafataLuctiosa = true/false , lungime. latime si intaltime, colturirotunde= true/false

        private String culoare;
        private String Material;
        private boolean suprafataLucioasa;
        private int lungime;
        private int latime;
        private int inaltime;
        private boolean colturiRotunde;

        public String getCuloare() {
            return culoare;
        }

        public Masa setCuloare(String culoare) {
            this.culoare = culoare;
            return this;
        }

        public String getMaterial() {
            return Material;
        }

        public Masa setMaterial(String material) {
            Material = material;
            return this;
        }

        public boolean isSuprafataLucioasa() {
            return suprafataLucioasa;
        }

        public Masa setSuprafataLucioasa(boolean suprafataLucioasa) {
            this.suprafataLucioasa = suprafataLucioasa;
            return this;
        }

        public int getLungime() {
            return lungime;
        }

        public Masa setLungime(int lungime) {
            this.lungime = lungime;
            return this;
        }

        public int getLatime() {
            return latime;
        }

        public Masa setLatime(int latime) {
            this.latime = latime;
            return this;
        }

        public int getInaltime() {
            return inaltime;
        }

        public Masa setInaltime(int inaltime) {
            this.inaltime = inaltime;
            return this;
        }

        public boolean isColturiRotunde() {
            return colturiRotunde;
        }

        public Masa setColturiRotunde(boolean colturiRotunde) {
            this.colturiRotunde = colturiRotunde;
            return this;
        }

        @Override
        public String toString() {
            return "Masa{" +
                    "culoare='" + culoare + '\'' +
                    ", Material='" + Material + '\'' +
                    ", suprafataLucioasa=" + suprafataLucioasa +
                    ", lungime=" + lungime +
                    ", latime=" + latime +
                    ", inaltime=" + inaltime +
                    ", colturiRotunde=" + colturiRotunde +
                    '}';
        }
    }
}
