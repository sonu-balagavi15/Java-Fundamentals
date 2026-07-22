import java.io.*;
import java.util.HashMap;

public class FileWordCount {

    public static void main(String[] args) {

        HashMap<String, Integer> words = new HashMap<>();

        try {

            BufferedReader br = new BufferedReader(new FileReader("input.txt"));

            String line;

            while((line = br.readLine()) != null){

                String[] arr = line.toLowerCase().split("\\s+");

                for(String word : arr){

                    words.put(word, words.getOrDefault(word,0)+1);
                }
            }

            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

            for(String key : words.keySet()){

                bw.write(key + " : " + words.get(key));
                bw.newLine();
            }

            bw.close();

            System.out.println("Word frequency written to output.txt");

        }
        catch(IOException e){

            System.out.println(e.getMessage());
        }

    }
}