import java.io.*;

public class Main {
    public static void main(String[] args) {


        File myFile = new File("C:\\Windows_folder\\System32");

        delete(myFile);

    }

    public static void delete(File myFile){

        try {

            if (myFile.isDirectory()) {
                for (File sub : myFile.listFiles()) {
                    delete(sub);

                }
            }

        }catch (NullPointerException n){
            n.printStackTrace();
        }

    }

}