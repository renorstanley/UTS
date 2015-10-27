/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UTS;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author baskoro
 */
public class UTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            byte[] buf = new byte[10];
            
            try (Socket socket = new Socket("10.151.34.155", 6666)) {
                InputStream is = socket.getInputStream();
                OutputStream os = socket.getOutputStream();
                
                
                
                  
                
               
               
                int len;
                 
                while(true) {
                    buf = new byte[10];
                    len = is.read(buf);
                    if(len == -1) {
                        
                        break;
                    }
                 
              
                   String comp= new String(buf);
                   System.out.print(comp);
                if(comp.contains("NRP\\n"))
                  {
                Scanner sc =new Scanner(System.in); 
                String s;
                s = sc.nextLine();
                String valid= "Username:";
                valid = valid.concat(s);
                valid= valid.concat("\n");
                os.write(valid.getBytes());
                 os.flush();
                  }
                else if(comp.contains("mod"))
                        {
                            
                        }
                else if(comp.contains("+"))
                        {
                            
                        }
                
                 else if(comp.contains("-"))
                        {
                            
                        }
                
             else if(comp.contains("*"))
                        {
                            
                        }
             else if(comp.contains("*"))
                        {
                            
                        }
                }
                os.close();
                is.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(UTS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
