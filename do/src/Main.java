public class Main      {
        public static void main(String[] args) {                     
        
           int i=3;int j=1;
            int count=0;
            while(i<=8) {
               if((i==3||i==5)&&j==1)
                  System.out.println("<"+i+"´Ü>");
               
            
            System.out.println(i+"*"+j+"="+i*j);
            j++;
            count+=1;
            if(count%9==0) {
               i++;
               j-=9;
            }
            }
        }
}            