package assignment11;

import javax.xml.catalog.Catalog;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Assignment11 {
    public static void main(String[] args) throws IOException {

        HashMap<Character, Integer> mp = new HashMap<>();

        Scanner scan = null;
        File file = new File("src/test/java/assignment11/data.txt");
        File file2 = new File("src/test/java/assignment11/data2.txt");

        FileWriter write=new FileWriter(file2);
        BufferedWriter bf=new BufferedWriter(write);
        try {

            scan = new Scanner(file, "utf-8");

            while (scan.hasNext()) {
                char[] charvalue = scan.nextLine().toLowerCase().toCharArray();

                for (Character charV : charvalue) {
                    if (Character.isLetter(charV)) {
                        if (mp.containsKey(charV)) {
                            mp.put(charV, mp.get(charV) + 1);
                        } else {
                            mp.put(charV, 1);
                        }
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!mp.isEmpty()) {
            for (Map.Entry<Character, Integer> key : mp.entrySet()) {
                System.out.println(key.getKey() + " " + key.getValue());
                bf.write(key.getKey()+" "+key.getValue() );
                bf.newLine();
            }
            bf.flush();
        }


    }
}