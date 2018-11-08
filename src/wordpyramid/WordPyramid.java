/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordpyramid;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrew Archer this program take a word and reduces it to one letter
 */
public class WordPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //asks the user for a word 
        String word = JOptionPane.showInputDialog("Please enter a word: ");
        //creates a stringBuilder 
        StringBuilder sb = new StringBuilder();
       sb.append(word);
        //displays the word 
      System.out.println(word);
      pyriamid(sb);
     
           
           
          
          
    }
    //takes the word and removes letters untill its one letter 
public static void pyriamid(StringBuilder sb){
    System.out.println(sb);
    
    if(sb.length()>=2){
        pyriamid(sb.deleteCharAt(0));
        //I tried to take off the last and first letter but it didnt work with 
        //words that had a a odd number of letters
       
    }
}
   
    }
