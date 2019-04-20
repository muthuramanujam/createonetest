package eample;

import java.util.ArrayList;
import java.util.List;

public class ShortExampls{  
public static void main(String args[]){ 
	//################
    /* List<String> ct = new ArrayList<String>();
    List<String> ct2 = new ArrayList<String>();
    ct.add("Muthu");
    ct2.add("Ram");
   System.out.println(ct ); 

   System.out.println("---"+ct2);   
 
   ct2=ct;

   System.out.println("--222-"+ct2); */

	//################	
/*	String list = "I am from Pondicherry";
	String[] words = list.split(" ");

	for(int i = words.length-1; i>=0;i--){
		System.out.print(words[i]+" ");
	}*/
	
/*	###############
 * String list = "I am from Pondicherry";
	char[] allChars = list.toCharArray();
	for(int i = 0; i<allChars.length;i++){
		
	}*/
	
/*	String ii="muthu";
	String jj="muthu";
	System.out.println(ii==jj);
	
	String i=new String("muthu");
	String j=new String("muthu");
	System.out.print(i==j);*/
	

/*	############# String replace work
 * String s1="th is index of example of";  
	//passing substring  
	int index1=s1.indexOf("is");//returns the index of is substring  
	int index2=s1.indexOf("index");//returns the index of index substring  
	System.out.println(index1+"  "+index2);//2 8  
	  
	//passing substring with from index  
	int index3=s1.indexOf("is",3);//returns the index of is substring after 4th index  
	System.out.println(index3);//5 i.e. the index of another is  
	  
	//passing char value  
	int index4=s1.indexOf('s');//returns the index of s char value  
	System.out.println(index4);//3 
	System.out.println(s1.replace("is", "IS"));//th IS index of example of
	System.out.println(s1.replaceFirst("of", "OF"));//th is index OF example of
*/	
	
}}
