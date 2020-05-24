package tema.Singleton;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileScanner <T> {

    private FileScanner(){
        System.out.println("Se face conexiunea");
    }
    private static FileScanner fileScanner;

    public static FileScanner getInstance(){
        if (fileScanner==null){
            fileScanner=new FileScanner();
        }
        return fileScanner;
    }

    public void write(T object,String filename){
        File file=new File(filename);
        try {
            FileOutputStream fileOutputStream=new FileOutputStream(file);
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<T> read(String filename){
        File file=new File(filename);
        if (file.exists()){
            try {
                FileInputStream fileInputStream=new FileInputStream(file);
                ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
                return (List<T>) objectInputStream.readObject();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return new ArrayList<>();
    }
}
