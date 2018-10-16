
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kuldip
 */
public class tts {
    public static void main(String[] args){
        
         BufferedReader br = null;
         

        try {

            String CurrentLine;
           
            br = new BufferedReader(new FileReader("C:\\Study\\sem 5\\DBMS\\lecture\\DBMS.txt"));

            while ((CurrentLine = br.readLine()) != null) {
                System.out.println(CurrentLine);
                ttsc tssc= new ttsc();
                tssc.speak(CurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        /*finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }*/
      }
    
}
