public class Tast {
    public static void main(String[] args) {


        int [] arr = {2,3,2,2};
        int t = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                if (arr[i] != arr[j]){
                     t = arr[i];

                }
            }
        }
        System.out.print(t);
    }

}
