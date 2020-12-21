/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Disha
 */
import java.util.*;
public class Diamond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int b=i;b<n;b++){
                System .out.print("  ");
                
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int k=i-1;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
                
        }
        for(int i=n-1;i>=1;i--){
            for(int b=i;b<n;b++){
                System.out.print("  ");
               
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int k=i-1;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
            
        }
    }
}
