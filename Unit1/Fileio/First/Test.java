import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Test{
public static void main(String [] args) throws Exception{
   try {
            FileOutputStream fos=new FileOutputStream("output.txt");
            String str="Learn backend development using java";
            byte b[]=str.getBytes();

         /*   for(byte x:b)
                fos.write(x);*/
    
          //  fos.write(str.getBytes());
          
          // Writing the byte array to the file starting from the 7th byte (6th index)
         fos.write(b,6,str.length()-6);
            System.out.println("Successfully written to the file");
            fos.close();
        } catch (FileNotFoundException e) {
        }
        catch(IOException e){
        }
        
    }
}