import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/12.
 */
public class TwoSum {
    public static void main(String [] args){
        int[] arr = {15,11,7,2};
        int target = 9;
        int[] arrs = twoSum(arr,target);
        System.out.println("第一个数的索引为：" + arrs[0] + "，第二个数的索引为：" + arrs[1]);
    }

    public static int[] twoSum(int[] arr, int target) {

        if(arr == null)
            return null;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < arr.length;i++) {
            map.put(arr[i],i);
        }

        quickSort(arr,0,arr.length-1);

        int i = 0;
        int j = arr.length - 1;
        int[] arrs = {-1,-1};
        while(i<j){
            if(arr[i] + arr[j] == target) {
                arrs[0] = map.get(arr[i])<map.get(arr[j])?map.get(arr[i]):map.get(arr[j]);
                arrs[1] = map.get(arr[i])>map.get(arr[j])?map.get(arr[i]):map.get(arr[j]);
                return arrs;
            }
            while((i < j) &&(arr[i] + arr[j] < target))
                i++;
            while((i < j) &&(arr[i] + arr[j] > target))
                j--;
        }
        return null;

    }
    public static void quickSort(int[] arr,int start,int end){
        if(start < end){
            int j = quick(arr,start,end);
            quickSort(arr,start,j-1);
            quickSort(arr,j+1,end);
        }
    }

    public static int quick(int[] arr,int start ,int end){

        if(start == end)
            return start;

        int key = start;

        while(start < end){

            while((start < end)&&(arr[end] >= arr[key]))
                end--;
            while((start < end)&&(arr[start] <= arr[key]))
                start++;

            if(start < end)
                swap(arr,start,end);
        }
        swap(arr,key,start);
        return start;
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
