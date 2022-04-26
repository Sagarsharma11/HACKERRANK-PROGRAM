public class timeconversion{
    public static void main(String[] args) {
        String str = "12:45:54PM";
       

        String str2 [] = str.split(":");
        int len = str2.length;
        len -=1;
        int temptime;
        var str3="";
        
        
        for (int i = 0; i < str2.length; i++) {
           

            if(str2[len].contains("AM"))
            {   
                temptime = Integer.parseInt(str2[0]);

                if(temptime == 12)
                {
                    str2[0] = "00";
                }
                

                if(i<2)
                    str3 = str3+ str2[i]+":";
                else    
                    str3 = str3+str2[i];
                    str3  =str3.replace("AM","");
                
                continue;
               
                
            }else if(str2[len].contains("PM"))
            {
               temptime = Integer.parseInt(str2[0]);
               if(temptime == 12)
               {
                   str2[0] = "12";
               }else{
                temptime +=12;
                str2[0] = Integer.toString(temptime);
               }
               
            
               
            
            }
            if(i<2)
            {
                str3 = str3+ str2[i]+":";

            }
            else  
            {
                str3 = str3+str2[i];

            }  
            str3 = str3.replace("PM","");
            
            

        }
        System.out.println(str3);
    }
}