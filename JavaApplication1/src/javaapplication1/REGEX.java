package javaapplication1;
import java.util.*;
import java.io.*;
import java.util.regex.*;
import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.List; 
import java.util.stream.Collectors; 
public class REGEX {
  
   public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) 
    { 
  
        
        Set<T> set = new LinkedHashSet<>(); 
  
        
        set.addAll(list); 
  
       
        list.clear(); 
  
        list.addAll(set); 
  
        
        return list; 
    } 
  
  
  public static void main(String[] args) throws FileNotFoundException{
    File f=new File ("input.txt");
    Scanner sc=new Scanner(f);
    
    ArrayList<String> id =new ArrayList<String>();
     
    
    System.out.print("Keywords :");
    
    
    while(sc.hasNextLine()){
      String r= sc.nextLine();
      Pattern p = Pattern.compile("[a-zA-Z]{2,}+");
      Matcher m =p.matcher(r);
      if(m.find()){
        System.out.print(m.group()+ " , ");
      }
      
    }
    System.out.println();
    System.out.println();
    
    System.out.print("Identifiers :");
    Scanner sc1=new Scanner(f);
    while(sc1.hasNext()){
      String r= sc1.next();
      Pattern p = Pattern.compile("\\b[a-z]\\b");
      Matcher m =p.matcher(r);
      if(m.find()){
        id.add(m.group()); 
          
     
             
}}
               
          
     ArrayList<String> 
            newList = removeDuplicates(id); 
     System.out.println(newList);
          
    
     
     id.clear();
System.out.println();
    System.out.print("logical Operators :");
    Scanner sc2=new Scanner(f);
    while(sc2.hasNextLine()){
      String r= sc2.nextLine();
      Pattern p = Pattern.compile("(&&|<=|>=|<|>|!=|==)");
      Matcher m =p.matcher(r);
      if(m.find()){
       id.add(m.group()); 
        //System.out.print(m.group()+ " , ");
      }
      
    }
   
    
            newList = removeDuplicates(id); 
     System.out.println(newList);
        System.out.println();  
    
    id.clear();
    System.out.print("nemerical values:");
    Scanner sc3=new Scanner(f);
    while(sc3.hasNextLine()){
      String r= sc3.nextLine();
      Pattern p = Pattern.compile("[0-9]{1,1}[.][0-9]|[0-9]");
      Matcher m =p.matcher(r);
      if(m.find()){
        id.add(m.group()); 
       //System.out.print(m.group()+ " , ");
      }
      
    }
      newList = removeDuplicates(id); 
     System.out.println(newList);
    
    System.out.println();
    
    
    
     id.clear();
    System.out.print("Other:");
    Scanner sc4=new Scanner(f);
    while(sc4.hasNext()){
      String r= sc4.next();
      //Pattern p = Pattern.compile("[({})]");
      Pattern p = Pattern.compile("[^[a-z0-5,=;>*%<+-./[[0-9].0]]]");
      Matcher m =p.matcher(r);
      if(m.find()){
        id.add(m.group());
        //System.out.print(m.group()+ " , ");
      }
      
    }
    newList = removeDuplicates(id); 
    System.out.println(newList);
   
    
    
    id.clear();
    System.out.println();
    System.out.print("Math Operators :");
    Scanner sc5=new Scanner(f);
    while(sc5.hasNext()){
      String r= sc5.next();
      Pattern p = Pattern.compile("[+]|[-]|[=]|[/]|[*]|[%]");
      Matcher m =p.matcher(r);
      if(m.find()){
        id.add(m.group());
       // System.out.print(m.group()+ " , ");
      }
      
    }
    
    newList = removeDuplicates(id); 
     System.out.println(newList);
    System.out.println();
    
     }}
  
  
