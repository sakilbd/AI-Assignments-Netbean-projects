/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.io.*;
public class Ass2 {

     
    public static boolean validateEmailAddress(String userName){
      String s= userName;
        int state = 0 ;
    int start = 0;
    int lb = 0;
    int forward = -1;
    int i= 0;
       while(true){
      switch (state){
        
        case 0:
         
          char c = s.charAt(i);
          i++;
          String ch = String.valueOf(c);
          Pattern p = Pattern.compile("[A-Za-z0-9]");
          Matcher m = p.matcher(ch);
          state = 1;
          if(m.find()){
            
            forward=forward+1;
           // System.out.println(m.group());
           // System.out.println("case 0");
           // System.out.println("I is :"+ i);  
            break;
          }
          
          else{
            
           // System.out.println("else case 0");
            state = 8;
            break;
            
          }
          
          
          
        case 1:
          char c1 = s.charAt(i);
          i++;
          String ch1 = String.valueOf(c1);
          Pattern p1 = Pattern.compile("[A-Za-z0-9]");
          Matcher m1 = p1.matcher(ch1);
          if(m1.find()){
            state=1;
            forward=forward+1;
           // System.out.println(m1.group());
            //System.out.println("case 1");
            break;
            
            
          }
          else{
            state = 2;
            //System.out.println("else case 1");
            
            //System.out.println("I is :"+ i);
            //System.out.println(state);
            break;
            
          }
          
          
        case 2:
          i--;
          char c2 = s.charAt(i);
          //System.out.println("i:"+i);
          state = 3;
          i++;
          String ch2 = String.valueOf(c2);
           //System.out.println(ch2);
          Pattern p2 = Pattern.compile("[@]");
          Matcher m2 = p2.matcher(ch2);
          if(m2.find()){
           
              i++;
            state = 3;
            forward=forward+1;
           // System.out.println(m2.group());
           // System.out.println("case 2");
            // System.out.println(state);
            break;
          }
          
          else{
            state = 8;
            //System.out.println("else case 2");
           
            
          }
        case 3:
          i=i-1;  
          c = s.charAt(i);
          i++;
          ch = String.valueOf(c);
          p = Pattern.compile("[A-Za-z]");
          m = p.matcher(ch);
          
          if(m.find()){
            state = 3;
            forward=forward+1;
            //System.out.println(m.group());
            //System.out.println("case 3");
            i++;
            break;
            
            
          }
          else{
           state = 4;
            //System.out.println("else case 3");
            
            //System.out.println("I is :"+ i);
            //System.out.println(state);
            break;
            
          }
          
        case 4:
              i=i-1;
          c = s.charAt(i);
          i++;
          ch = String.valueOf(c);
          p = Pattern.compile("[.]");
          m = p.matcher(ch);
          
          if(m.find()){
            state = 5;
            forward=forward+1;
            //System.out.println(m.group());
            //System.out.println("case 4");
            i++;
            break;
            
            
          }
          else{
           state = 5;
            //System.out.println("else case 4");
            
          //  System.out.println("I is :"+ i);
           // System.out.println(state);
            break;
            
          }
          
        case 5:
            i=i-1;
          c = s.charAt(i);
          i++;
          ch = String.valueOf(c);
          p = Pattern.compile("[A-Za-z0-9]");
          m = p.matcher(ch);
          
          if(m.find()){
            
            forward=forward+1;
           // System.out.println(m.group());
           // System.out.println("case 5");
           // System.out.println("Mail Input is in proper format");
            
            i++;
           return true;
            
            
          }
          else{
           state = 8;
            //System.out.println("else case 5");
            
            //System.out.println("I is :"+ i);
           // System.out.println(state);
            break;
            
          }
        case 8:
           state = 8; 
          //System.out.println("Mail not inputted properly");
          return false;
        
            


          
      }
    }

         
       /* Matcher mtch = emailNamePtrn.matcher(userName);
        if(mtch.matches()){
            return true;
        }
        return false;*/
    }
    public static boolean validateWebAddress(String userName){
      String s= userName;
        int state = 0 ;
    int start = 0;
    int lb = 0;
    int forward = -1;
    int i= 0;
       while(true){
      switch (state){
        
        case 0:
         
          char c = s.charAt(i);
          i++;
          String ch = String.valueOf(c);
          Pattern p = Pattern.compile("[A-Za-z0-9]");
          Matcher m = p.matcher(ch);
          state = 1;
          if(m.find()){
            
            forward=forward+1;
           // System.out.println(m.group());
           // System.out.println("case 0");
           // System.out.println("I is :"+ i);  
            break;
          }
          
          else{
            
           // System.out.println("else case 0");
            state = 8;
            break;
            
          }
          
          
          
        case 1:
          char c1 = s.charAt(i);
          i++;
          String ch1 = String.valueOf(c1);
          Pattern p1 = Pattern.compile("[A-Za-z0-9]");
          Matcher m1 = p1.matcher(ch1);
          if(m1.find()){
            state=1;
            forward=forward+1;
           // System.out.println(m1.group());
            //System.out.println("case 1");
            break;
            
            
          }
          else{
            state = 2;
            //System.out.println("else case 1");
            
            //System.out.println("I is :"+ i);
            //System.out.println(state);
            break;
            
          }
          
          
        case 2:
          i--;
          char c2 = s.charAt(i);
          //System.out.println("i:"+i);
          state = 3;
          i++;
          String ch2 = String.valueOf(c2);
           //System.out.println(ch2);
          Pattern p2 = Pattern.compile("[.]");
          Matcher m2 = p2.matcher(ch2);
          if(m2.find()){
           
              i++;
            state = 3;
            forward=forward+1;
           // System.out.println(m2.group());
           // System.out.println("case 2");
            // System.out.println(state);
            break;
          }
          
          else{
            state = 8;
            //System.out.println("else case 2");
           
            
          }
        case 3:
          i=i-1;  
          c = s.charAt(i);
          i++;
          ch = String.valueOf(c);
          p = Pattern.compile("[A-Za-z]");
          m = p.matcher(ch);
          
          if(m.find()){
            state = 3;
            forward=forward+1;
            //System.out.println(m.group());
            //System.out.println("case 3");
            i++;
            break;
            
            
          }
          else{
           state = 4;
            //System.out.println("else case 3");
            
            //System.out.println("I is :"+ i);
            //System.out.println(state);
            break;
            
          }
          
        case 4:
              i=i-1;
          c = s.charAt(i);
          i++;
          ch = String.valueOf(c);
          p = Pattern.compile("[.]");
          m = p.matcher(ch);
          
          if(m.find()){
            state = 5;
            forward=forward+1;
            //System.out.println(m.group());
            //System.out.println("case 4");
            i++;
            break;
            
            
          }
          else{
           state = 5;
            //System.out.println("else case 4");
            
          //  System.out.println("I is :"+ i);
           // System.out.println(state);
            break;
            
          }
          
        case 5:
            i=i-1;
          c = s.charAt(i);
          i++;
          ch = String.valueOf(c);
          p = Pattern.compile("[A-Za-z0-9]");
          m = p.matcher(ch);
          
          if(m.find()){
            
            forward=forward+1;
           // System.out.println(m.group());
           // System.out.println("case 5");
           // System.out.println("Mail Input is in proper format");
            
            i++;
           return true;
            
            
          }
          else{
           state = 8;
            //System.out.println("else case 5");
            
            //System.out.println("I is :"+ i);
           // System.out.println(state);
            break;
            
          }
        case 8:
           state = 8; 
          //System.out.println("Mail not inputted properly");
          return false;
        
            


          
      }
    }

         
       /* Matcher mtch = emailNamePtrn.matcher(userName);
        if(mtch.matches()){
            return true;
        }
        return false;*/
    }
     
    public static void main(String[] args) throws FileNotFoundException {
        File f=new File ("validate.txt");
    Scanner sc=new Scanner(f);
    String p=sc.nextLine();
    int b = Integer.parseInt(p);
     
    String myArray[] = new String[b];
   // System.out.println(myArray.length);

  

       
        for( int i=0;i<myArray.length;i++){
           String r= sc.nextLine();
        myArray[i] = r;
        
     
        }
        
       
 for (int i=0;i<myArray.length;i++) {
    
     if(validateWebAddress(myArray[i])==true) {
       System.out.println("Web : "+ (i+1));
    }
    else if(validateEmailAddress(myArray[i])==true){
      System.out.println("EMail : "+(i+1));
    }
}
    }
    
}
