public class counting_vellys {
    public static void main(String[] args) {
        String path ="UDDDUDUU";

        int valley=0;
        int level =0;

        for (int i = 0; i < path.length(); i++) {
            
            if (path.charAt(i)=='U'){
                level++;
                if (level==0){valley++;}
                continue;
            }
            if (path.charAt(i)=='D'){
                level--;
            }
        }
        System.out.println(valley);
        
    }
}
