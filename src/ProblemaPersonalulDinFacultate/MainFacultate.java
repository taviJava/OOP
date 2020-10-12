package PersonalulDinFacultate;

public class MainFacultate {
    public static void main(String[] args) {
        StatutDeClasa statutBoboc=StatutDeClasa.boboc;
        MyDate date1=new MyDate(1967,9,23);
        MyDate date2=new MyDate(1965,7,2);

Student student1=new Student("Popescu Ion","Craiova",782891654,"popescu.ion@gmail.com",statutBoboc);
MembruFacultate decan=new MembruFacultate("Georgescu Gigi","Craiova",761225444,"gg@gmail.com","e207",7000,date1,50,"decan");
PersonalFacultate mecanic =new PersonalFacultate("Florescu Ion","Giurgiu",764233441,"-","Atelierul A12",2800,date2,"lacatus mecanic");
        System.out.println(student1.toString());

        System.out.println(decan.toString());

        System.out.println(mecanic.toString());
    }
}
