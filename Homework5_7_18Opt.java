
public class Homework5_7_18Opt {
		 
        public static void main(String[] args) {
                int mylist[] = new int[]{1,5,3,2,5,6,8,3};

                System.out.println("This is my list");
                for(int i=0; i < mylist.length; i++){
                        System.out.print(mylist[i] + " ");
                }
                bubbleList(mylist);
               
                System.out.println("");

                System.out.println("This is buddle sort list");
                for(int i=0; i < mylist.length; i++){
                        System.out.print(mylist[i] + " ");
                }
        } 
        public static void bubbleList(int[] list) {

                int n = list.length;
                int temp = 0;
               
                for(int i=0; i < n; i++){
                        for(int j=1; j < (n-i); j++){
                               
                                if(list[j-1] > list[j]){
                                   temp = list[j-1];
                                   list[j-1] = list[j];
                                   list[j] = temp;
                                }                              
                     }
               }      
   }
}


