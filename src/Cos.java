import java.util.ArrayList;

public class Cos {
   public double suma(ArrayList<Produs> produse){
       double total=0;
for(int i=0;i<produse.size();i++){
    Produs produs =produse.get(i);
    double pret=produs.getPret();
    total=total+pret;

}
return  total;
   }
}
