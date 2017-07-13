public class Solution3 {
    public static int minNumberInRotateArray(int [] array) {
        if (array == null)
            return 0;
        int start = 0;
        int end = array.length-1;
        int mid = 0;
        while(array[start] >= array[end]){
            if(end -start == 1) {
                mid = end;
                break;
            }
            mid = (start+end)/2;

            if(array[start] == array[mid] && array[start] == array[end]){
                int min = array[start];
                for(int i = start+1;i <= end;i++){
                    if(min > array[i])
                        min = array[i];
                }
                return min;
            }

            if(array[mid] >= array[start])
                start = mid;
            else if(array[mid] <= array[end])
                end = mid;
        }

        return array[mid];

    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,0,1};
        System.out.println(minNumberInRotateArray(arr));
    }
}