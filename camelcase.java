import java.util.Scanner;

public class camelcase {
    public static void main(String[] args) {
        
        //*****_____important notes______

        //s stand for split here

        // c stand for combine

        // M indicates method, C indicates class, and V indicates variable
       

        
        Scanner obj = new Scanner(System.in);
        
        // String str = "S;M;plasticCup()";
        String str = "C;M;white sheet of paper"; 
        String newstr="";
        char ch;
    
     
        int tempindex=0;
       

        // when the first character will be S 

        if('S'==str.charAt(0))
        {
            if('M'==str.charAt(2) || 'C'==str.charAt(2) || 'V'==str.charAt(2))
            {
                str = str.replace("S;M;","");
                str = str.replace("S;C;","");
                str = str.replace("S;V;","");

                for (int i = 0; i < str.length(); i++) {
                    ch = str.charAt(i);
                    
                    if(Character.isUpperCase(ch))
                    {
                       
                        newstr = newstr+ " ";
                        ch = Character.toLowerCase(ch);
    
                    }
                    newstr = newstr+ch;
    
                }
                newstr = newstr.replace("()","");
                System.out.println(newstr);
            }

          
        }

        if('C'==str.charAt(0))
        {
            
            if('M'==str.charAt(2) || 'C'==str.charAt(2) || 'V'==str.charAt(2))
            {

                if('M'==str.charAt(2))
                {
                    tempindex = 1;
                }

                str = str.replace("C;M;","");
                str = str.replace("C;C;","");
                str = str.replace("C;V;","");
                String cstring [] = str.split(" "); 

                for (int i = 0; i < cstring.length; i++) {
               
                    ch = cstring[i].charAt(0);
                    ch = Character.toUpperCase(ch);
                   

                    for (int j = 0; j < cstring[i].length(); j++) {

                        if(j==0)
                        {
                            newstr = newstr+ch;
                            continue;
                        }
                        
                        

                        newstr = newstr+cstring[i].charAt(j);
                    }
    
                }

                
                
                if(tempindex==1)
                {
                    newstr=newstr+"()";
                    System.out.println(newstr);
                }else{
                    System.out.println(newstr);
                }
                
                // newstr = newstr.replace(" ","");
                
                
            }
           
        }

        




    }
}
