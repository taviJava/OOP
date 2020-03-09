package TemaGenerica;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class MainGeneric {


    public static void main(String[] args) {
Patrat patrat1=new Patrat(5);
Patrat patrat2=new Patrat(5);
patrat1.getAria();
patrat2.getAria();
        System.out.println(patrat1.compareTo(patrat2));

        assertEquals(patrat1.compareTo(patrat2), 0); //habar n-am ce face
        User tavi=new User();
        User Adi=new User();
        tavi.setVarsta(25);
        tavi.getVarsta();
        Adi.setVarsta(29);
        Adi.getVarsta();
        System.out.println(tavi.compareTo(Adi));
        assertEquals(tavi.compareTo(Adi),20); //habar n-am ce face si cum se face



    }



}
