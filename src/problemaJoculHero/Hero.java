package JoculHero;

public class Hero extends User {
    private int putereDeAtac;
    private int viata;

    public Hero() {

    }

    @Override
    public int getPutereDeAtac() {
        return putereDeAtac;
    }

    @Override
    public void setPutereDeAtac(int putereDeAtac) {
        this.putereDeAtac = putereDeAtac;
    }

    @Override
    public int getViata() {
        return viata;
    }

    @Override
    public void setViata(int viata) {
        this.viata = viata;
    }

    @Override
    public void attack(User user) {
        user.decressLife(this.putereDeAtac);
    }

    @Override
    public void decressLife(int putereDeAtac) {
this.setViata(this.getViata()-putereDeAtac);
    }

    @Override
    public void attack(Object o) {

    }


}
