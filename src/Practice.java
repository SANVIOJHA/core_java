import java.util.*;
public class Practice {
    public static void main(String[]args){
//     for(int i=0;i<=5;i++){
//         System.out.println(i);
//     }

//        int i=5;
//        while(i<=10){
//            System.out.println(i);
//            i++;
//        }
//        int i=1;
//        do{
//            System.out.println(5);
//            i++;
//        }while(i<=5);


        for(int i=0;i<=10;i++){
            System.out.println(i);
            if(i==3){
                continue;
            }
            if(i==9){
                break;

            }
            System.out.println("end");
        }

    }
}

