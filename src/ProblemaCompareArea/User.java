package TemaGenerica;

public class User implements CompareArea <User> {
    private String nume;
    private String prenume;
    private int varsta;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public int compareTo(User user) {

        if(this.varsta > user.getVarsta()){
            return 1;
        }else {
            return 20;
        }

    }
}
