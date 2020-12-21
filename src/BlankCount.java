/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Disha
 */
import java.io.*;
public class BlankCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any string :");
        String str=input.readLine();
        int b=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                b++;
            }
        }
        System.out.println("Total number of blank spaces : "+b);
    }
    
}
