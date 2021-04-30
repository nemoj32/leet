import java.util.Arrays;

public class shipWithinDays {
    public static int shipWithinDays(int[] weights, int D) {
        int r = Arrays.stream(weights).sum();
        int l = Arrays.stream(weights).max().getAsInt();
        while (r<l){
            int mid = (r+l)/2;
            if(check(weights,D,mid)){
                r= mid;
            }else {
                l = mid+1;
            }
        }
        return l;

    }
    public static boolean check(int[] weights,int D ,int h){
        int count =1 ;
        int singleweight = 0;
        for (int i = 0; i < weights.length; i++) {
            singleweight +=weights[i];
            if (singleweight>h){
                count++;
                singleweight = weights[i];
            }
            if (count>D){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int D = 4;
        int i = shipWithinDays(a, D);
        System.out.println(i);

    }
}
