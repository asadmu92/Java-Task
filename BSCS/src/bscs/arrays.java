
package bscs;

public class arrays {
    public static void msg()
    {
        System.out.println("This is msg");
    }
    public static void getMultiples(int[] arr,int num1,int num2)
    {
        int sum=0,sum1=0;
        for (int i = 0; i < arr.length; i++) {
          if(arr[i] %num1==0)
          {
              sum+=arr[i];
          }
          if(arr[i] %num2==0)
          {
              sum1+=arr[i];
          }
        }
        System.out.println("Sum of " + num1+ "s Multiples: "+sum);
        System.out.println("Sum of " + num2+ "s Multiples: "+sum1);
    }
    
    public static int maxArrayValue(int[] arr)
    {
      int max = arr[0]; // 56
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i])
            {
                
                max = arr[i];
            }
            
        }
        return max;
    }
     public static int minArrayValue(int[] arr)
    {
      int min = arr[0]; // 56
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i])
            {
                
                min = arr[i];
            }
            
        }
        return min;
    }
     
     public static void getFees(double fees,int cs)
     {
         System.out.println("Class 1:"+ fees);
         double inc;
         for (int i = 2; i <= cs; i++) 
         {
             inc = fees * 0.10;
             fees = fees +  inc;
             System.out.println("Class "+ i + ":" + fees);
         }
         
     }
    public static void main(String[] args) {
        
        //msg();
        //size = 6
        int[] arr = new int[10];
        
        arr[0] =6;
        arr[1] =15;
        arr[2] =46;
        arr[3] =35;
        arr[4] =18;
        arr[5] =37;
        arr[6] =48;
        arr[7] =35;
        arr[8] =2;
        arr[9] =20;
        
       // System.out.println(arr.length);
        getMultiples(arr, 5, 6);
        maxArrayValue(arr);
        System.out.println(minArrayValue(arr));
        getFees(1500, 10);
    }
}
