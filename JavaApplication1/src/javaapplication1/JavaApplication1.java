/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
import java.io.*;
import java.util.regex.*;
import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.List; 
import java.util.stream.Collectors; 
public class JavaApplication1 {
    
      public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) 
    { 
  
        
        Set<T> set = new LinkedHashSet<>(); 
  
        
        set.addAll(list); 
  
       
        list.clear(); 
  
        list.addAll(set); 
  
        
        return list; 
    } 
  

  
    public static void main(String[] args) throws FileNotFoundException{
       File f=new File ("input2.txt");
    Scanner sc=new Scanner(f);
    
    ArrayList<String> id =new ArrayList<String>();
     
    
           
          
    
    System.out.print("Other:");
    System.out.println();
    Scanner sc4=new Scanner(f);
    while(sc4.hasNext()){
      String r= sc4.nextLine();
      Pattern p = Pattern.compile("[a-z]+\\(((int|void|String|boolean)[a-z,\\s]*)]?\\)");
      Pattern q = Pattern.compile("(public|static) (int|void|String|boolean)");
      
      Matcher m =p.matcher(r);
      if(m.find()){
        id.add(m.group());
        System.out.println("Methods :"+m.group()+ ",");
      }
      Matcher m1 = q.matcher(r);
      if(m1.find()){
      System.out.println("return type :"+m1.group(2));
      }
      
    }
    
    
}}
