public class döngüler {
    public static void main(String[] args) {
//         int k;
//         int i = 1;
//         while(i <= 5){
//             System.out.println(i);
//             k =1;
//             while(k <= 10){
//                 System.out.println(k +",");
//                 k++;
//             }
//             System.out.println("---");
//             i++;
// //int left = 100, right = 200;
// // while (++left < --right);
// // System.out.println("100 ile 200'ün ortası: " + left);
//         }
//     }

    int i =1;
    while(i<=10){
        if( i % 2==0){
            continue;// continue if even
            
        }
        System.out.println(i);
        i++;
    }
}
