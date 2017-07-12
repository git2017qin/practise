/**
 * Created by Administrator on 2017/7/12.
 */
public class Offer1 {
    public static void main(String[] args) {
        Offer1 of = new Offer1();
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        boolean re = of.Find(10,arr);
        System.out.println(re);
    }
    public boolean Find(int target, int [][] array) {
        if(array == null)
            return false;
        int l1 = array.length - 1;
        int l2 = array[0].length - 1;
        int i = 0;
        int j = l2;
        for(;(i<=l1)&&(j >= 0);) {
            if (array[i][j] < target)
                i++;
            else if (array[i][j] > target)
                j--;
            else
                return true;
        }
        return false;
    }
}
