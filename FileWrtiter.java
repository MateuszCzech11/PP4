import java.io.FileWriter;
public class FileWrtiter {

    public static void writeToFile(String text){
        try{
            FileWriter writer = new FileWriter("filename.txt");
            writer.write(text);
            writer.close();
        } catch (Exception e){
            System.out.println("Error");
            System.out.println(e);
        }
    }
}
