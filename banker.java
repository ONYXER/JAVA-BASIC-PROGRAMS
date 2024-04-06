import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class banker{
   static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
         

   
             System.out.println("enter the number of processes: ");
             Integer pros=sc.nextInt();
             System.out.println("enter the number of resources: ");
             Integer reso=sc.nextInt();
            
            //  defining matrics
        int[][] allocate=new int[pros][reso];
        int[][] maxneed=new int[pros][reso];
        int[] avail=new int[reso];
        int[][] need=new int[pros][reso];

        // createing allocation matrix
        System.out.println("enter the allocation metrix:");
        creatermat(allocate, pros, reso);
     

        // //  creating maximum need
        System.out.println("enter the maximum need of processes");
        creatermat(maxneed, pros, reso);
        // creating available resource matrix
        System.out.println("enter the available matrix ");
        for(int i=0;i<reso;i++){
        avail[i]=sc.nextInt();}
    

        // finding actual need
        for(int i=0;i<pros;i++){
           for(int j=0;j<reso;j++){
            need[i][j]=maxneed[i][j]-allocate[i][j];
            System.out.print(need[i][j]);
           }
          System.out.println();}
        // creating execured or non executed queues
            Queue<String> executed=new LinkedList<>();
             Queue<Integer> nonexecuted=new LinkedList<>();
            
            // banker algo
          int i=0;
          boolean flag;
        while(i<pros){
            flag=true;
         // conparing
    
            for(int k=0;(k<reso) && flag;k++){
            if(need[i][k] > avail[k]){
                flag=false;
           
            } }
          if(flag) {
            executed.add("p"+Integer.toString(i));
            sum(avail, allocate[i],reso);

          }
          else{
            nonexecuted.add(i);
          }
          i++;
        }
        
    while(!nonexecuted.isEmpty()){
        flag=true;
     int p=nonexecuted.poll();
  
     for(int j=0;(j<reso) && flag;j++){
        if(avail[j]<need[p][j]){
         flag=false;
         
        }
     }
     if(flag){
        executed.add("p"+p);
        sum(avail,allocate[p],reso);
 
     }
     else{
        nonexecuted.add(p);

     }

    }
 //   shows execution flow diagram
    while (!executed.isEmpty()) {
        System.out.print(executed.poll()+"-->");
        
    }
    sc.close();  
}

    public static void creatermat(int[][] temp,int pros,int reso ){
       
        System.out.println("enter the instance of resources:");
        for(int i=0;i<pros;i++){
            System.out.println("p"+i);
            for(int j=0;j<reso;j++){
                temp[i][j]=sc.nextInt();
            }
        }
      
    }
    public static void sum(int[] avail,int[] allocate, int reso){
   
            for(int i=0;i<reso;i++){
                avail[i]+=allocate[i];
            }
        
    }
    
}
