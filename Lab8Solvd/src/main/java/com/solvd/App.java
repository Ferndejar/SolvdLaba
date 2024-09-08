package com.solvd;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;

import static java.nio.charset.Charset.defaultCharset;
import static org.apache.commons.io.FileUtils.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        File file = new File("src/input.txt");
        String string = readFileToString(file);

        System.out.println("Read in: " + string);

        int totalWords = 0;

        String[] space = string.split(" ");

        for(int i = 0; space.length > i; i++)
        {
           totalWords++;
        }

        System.out.println("The number of words are " + totalWords);

       // Map<String,Integer> w = new HashMap<String,Integer>();
       // countWords("src/input.txt",w);


        // Read file and calculate unique words
        Set<String> words = new HashSet<>(Arrays.asList(FileUtils.readFileToString(file, StandardCharsets.UTF_8).split(" ")));

        // Save number of unique words to another file
        FileUtils.writeStringToFile(new File("output.txt"), "Number of unique words: " + words.size(), StandardCharsets.UTF_8);

    }

    public static void countWords(String filename,Map<String,Integer>words) throws IOException {

        File file = new File(filename);
        LineIterator iterator = lineIterator(file, "UTF-8");


        while(iterator.hasNext()){
            String word = readFileToString(file);
            int count = words.getOrDefault(word, 0);

            if(count != 0){
                count++;
            }
            else{
                count =1;
                words.put(word,count);
            }

        }
    }


}
