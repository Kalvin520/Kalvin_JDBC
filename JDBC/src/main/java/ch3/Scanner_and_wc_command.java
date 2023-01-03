package ch3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner_and_wc_command {
    //wc command UNIX(Mac OS)

    public static void main(String[] args) {
        File f = new File("sleep.txt");
        int line_count = 0;
        int word_cound = 0;
        int char_count = 0;
        try {
            Scanner s = new Scanner(f);
            while (s.hasNext() && s.hasNextLine()){//hasNextLine()在此掃描器的輸入中存在另一行返回 true   hasNext()判斷掃描器中當前掃描位置後是否還存在下一段
                line_count++;
                String line = s.nextLine();
                String [] line_arr  = line.split(" ");
                for (String word : line_arr){
                    word_cound++;
                }
                char_count+= line.length();
                //System.out.println(line);
            }
            s.close();

            System.out.println("Line count is " + line_count);
            System.out.println("word cound is " + word_cound);
            System.out.println("char cound is " + char_count);
        } catch (FileNotFoundException e) {
            System.out.println(f + " File not found. ");
        }
    }
}
