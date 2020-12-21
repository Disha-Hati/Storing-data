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
public class Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any string :");
        String str=input.readLine();
        for(int i=0;i<str.length();i++){
            for(int j=0;j<=i;j++){
                char ch=str.charAt(j);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    
}
