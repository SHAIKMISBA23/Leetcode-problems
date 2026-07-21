public class Solution {

public static int numIdenticalPairs(int[] nums) {  
    int[] count = new int[102];  

    for (int num : nums) {  
        count[num]++;  
    }  

    int totalCount = 0;  

    for (int i : count) {  
        totalCount += (i * (i - 1)) / 2;  
    }  

    return totalCount;  
}  

public static void main(String[] args) {  
    int[] nums = {1, 2, 3, 1, 1, 3};  

    System.out.println(numIdenticalPairs(nums));  
}

}
    
        
