package TestulDoi;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListaUseri {
    private   List<User> useriInregistrati=new ArrayList<>();

    public ListaUseri() {
    }

    public void adaugaInLista(){  //metoda simpla de adaugare in lista
        Scanner input=new Scanner(System.in);
        System.out.println("Introdu numele:");
        String nume=input.nextLine();
        System.out.println("Introdu parola");
        String parola=input.nextLine();
        System.out.println("Introdu username-ul");
        String username=input.nextLine();
        User user=new User(username,parola,nume);
        this.useriInregistrati.add(user);
    }
    private void scrieInLista1()  {  //aceasta metoda scrie in lista in mod normal, este folosita in metoda de mai jos 'scrieInLista' doar cand file-ul este gol deoarece daca file-ul are elemnente in lista va incepe sa suprascrie, daca foloseam metoda cu append atunci cand file-ul era gol lasa primul rand gol(nescris)
        try{
            FileWriter writer = new FileWriter("C:\\Users\\zoriloc002\\Desktop\\File-uri Java\\dateUseri.csv");  //nu uita sa introduci o cale de la tine din PC, daca nu a fost creat in acel folder file-ul: dateUseri.csv, el va fi creat in automat la primul run al programului
            PrintWriter writer1 = new PrintWriter(writer);
            for(User user:this.useriInregistrati) {

                writer1.println(user.getUsername()+","+user.getPassword()+","+user.getNume());
                writer1.close();}
            writer.close();}catch (Exception e){
        }
    }
    private void scrieInLista2()  {  //aceasta metoda adauga cate un rand pe fiecare linie, am creat sa adauge de fiecare data ultimul obiect adaugat in lista, asta evita sa suprascrie file-ul cu dubluri si sa le importe ulterior in lista
        try{
            FileWriter writer = new FileWriter("C:\\Users\\zoriloc002\\Desktop\\File-uri Java\\dateUseri.csv",true);
            PrintWriter writer1 = new PrintWriter(writer);

            writer1.println(this.useriInregistrati.get(this.useriInregistrati.size()-1).getUsername()+
                    ","+this.useriInregistrati.get(this.useriInregistrati.size()-1).getPassword()+","
                    +this.useriInregistrati.get(this.useriInregistrati.size()-1).getNume());
            writer1.close();
            writer.close();}catch (Exception e){
        }
    }
    public void scrieInLista(){   //aceasta metoda scrie in lista este metoda de write pe care o folosim doar cand lista are 1 singur obiect, si metoda de append care scrie atunci cand lista are mai mult de un obiect
        if (this.useriInregistrati.size()==1){
            scrieInLista1();
        }
        if (this.useriInregistrati.size()>1){
            scrieInLista2();
        }
    }
    public void importaDoarDacaNuEGol() throws IOException {  //aceasta metoda a fost creata doar pentru a nu importa atunci cand file-ul nu este gol (vezi ce am scris mai jos)
        File newFile = new File("C:\\Users\\zoriloc002\\Desktop\\File-uri Java\\dateUseri.csv");
        if (newFile.length()>0){
            importaInListaPeUserCuDateleDinFile();

        }
    }
    private void importaInListaPeUserCuDateleDinFile( ) {  //aceasta metoda importa elemntele din file,am creat-o ca private deoarece, daca file-ul era gol aparea un mesaj cu null ca nu avea ce sa importe, ea este folosita in metoda de mai sus unde este pusa o conditie sa importe doar daca fil-ul are mai mult de 0 caractere

        try {
            BufferedReader csvReader = new BufferedReader(new FileReader("C:\\Users\\zoriloc002\\Desktop\\File-uri Java\\dateUseri.csv"));
            User user = new User("test", "null", "null");
            String row;

            while ((row = csvReader.readLine()) != null) {

                String[] data = row.split(",");
                if (row != null && !user.getNume().equals(data[0]) && !user.getPassword().equals(data[1])) {

                    //User(String username, String password, String nume)
                    user = new User(data[0], data[1], data[2]);
                    this.useriInregistrati.add(user);
                }
            }
            csvReader.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void arataElementeLista(){  //metoda de a arata elemntele din lista
        for (User user: this.useriInregistrati){
            System.out.println("Numele: "+user.getNume()+" Parola: "+user.getPassword()+" Username: "+user.getUsername());
        }
    }

    public void stergeElementdinLista(String a) throws IOException { //aceasta metoda pe langa metoda care-ti permite sa stergi elemente din lista, foloseste si metoda de a sterge elemntle (linia) din file altfel la repornirea programului linia va fi importata din nou
        for (int i=0;i<this.useriInregistrati.size();i++){
            if (this.useriInregistrati.get(i).getUsername().equals(a)){
                String x=(this.useriInregistrati.get(i).getUsername()+","+this.useriInregistrati.get(i).getPassword()+","+this.useriInregistrati.get(i).getNume());
                removeLine(x);
                this.useriInregistrati.remove(this.useriInregistrati.get(i));
            }
        }
    }

    private void removeLine(String lineContent) throws IOException  //aceasta metoda va sterge linia din file, String lineContent va trebui sa fie identic cu linia din lista: this.useriInregistrati.get(i).getUsername()+","+this.useriInregistrati.get(i).getPassword()+","+this.useriInregistrati.get(i).getNume()
    {
        File file = new File("C:\\Users\\zoriloc002\\Desktop\\File-uri Java\\dateUseri.csv");
        List<String> out = Files.lines(file.toPath())
                .filter(line -> !line.contains(lineContent))
                .collect(Collectors.toList());
        Files.write(file.toPath(), out, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
    }

}
