package bytestreams3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LAB2 {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileOutputStream output = new FileOutputStream("data.dat");
        String s = "Hello World";
        byte[] b = s.getBytes();
            try {
                output.write(b);
            } catch (IOException ex) {
                Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        catch (FileNotFoundException ex){
        Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
        FileInputStream input = new FileInputStream("data.dat");
        int value;
        while ((value=input.read()) != -1) {
            System.out.println(value);
    }
            input.close();
}           
        catch (FileNotFoundException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
}       catch (IOException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
}
       }
   
      

}
    

