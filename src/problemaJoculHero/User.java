package JoculHero;

public abstract class User implements MetodeHero {
    private int putereDeAtac;
    private int viata;

    public User() {
        this.putereDeAtac = putereDeAtac;
        this.viata = viata;
    }

    public int getPutereDeAtac() {
        return putereDeAtac;
    }

    public void setPutereDeAtac(int putereDeAtac) {
        this.putereDeAtac = putereDeAtac;
    }

    public int getViata() {
        return viata;
    }

    public void setViata(int viata) {
        this.viata = viata;
    }

    public abstract void attack(User user);
}
