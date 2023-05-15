// 4. WAP to print elements of an array in reverse order by using for, while and do while loops in separate member functions.

public class lab2q4{

    public static void reverseArrayByForLoop(int arr[]){
        System.out.println("Using For Loop");
        for(int i=arr.length;i>0;i--){
            System.out.print(arr[i-1]+ " ");
        }
    }
    public static void revereArrayByDoWhileLoop(int arr[]){
        int size=arr.length;
        System.out.println("Using Do While Loop");
        do {
            System.out.print(arr[size-1]+ " ");
            size--;
        }while(size>0);
    }
    public static void revereArrayByWhileLoop(int arr[]){
        int size=arr.length;
        System.out.println("Using While Loop");
        while(size>0) {
            System.out.print(arr[size-1]+ " ");
            size--;
        }
    }
   public static void main(String[] args) {
       int array[]={11,12,13,14,15,16,17,18,19};
       
       lab2q4 obj=new lab2q4();
       obj.reverseArrayByForLoop(array);
       
       
       obj.revereArrayByDoWhileLoop(array);
       
        
        obj.revereArrayByWhileLoop(array);
    }
}