package tema.Singleton;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("test1");
        list.add("test2");
        String fileName="fileName";

        FileScanner fileScanner=FileScanner.getInstance();
        fileScanner.write(list,fileName);

        List<String> list2=new ArrayList<>();
        list2.add("test12");
        list2.add("test22");
        String fileName2="fileName2";
        fileScanner.write(list2,fileName2);

        List<String> strings=fileScanner.read(fileName);

        List<String> stringList=fileScanner.read(fileName2);

        System.out.println(strings.get(0)+" "+strings.get(1));
    System.out.println(stringList.get(0)+" "+stringList.get(1));



    }
}
