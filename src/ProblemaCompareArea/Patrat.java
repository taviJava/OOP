package TemaGenerica;

public class Patrat implements CompareArea <Patrat> {
    private double latura;


    public Patrat(double latura) {
        this.latura = latura;
    }

    public double getLatura() {
        return latura;
    }

    public void setLatura(double latura) {
        this.latura = latura;
    }

    public double getAria(){
        double aria=latura*latura;
        return aria;
    }





    @Override
    public int compareTo(Patrat patrat) {

        if(patrat.getAria()>this.getAria()){
            return 1;

        }if (patrat.getAria()<this.getAria()){
            return -1;
        }else {
            return 0;
        }
        }




}
