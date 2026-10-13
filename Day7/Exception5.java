package Day7;

import java.io.*;

public class Exception5 {

    static void readFile() throws IOException{
        FileReader file = new FileReader("data.txt");
        System.out.println("File Opened");
    }
    public static void main(String[] args) {
                           try{
                               readFile();
                           }catch(IOException e){
                               System.out.println("Error reading the file: " + e.getMessage());
                           }
    }
}
