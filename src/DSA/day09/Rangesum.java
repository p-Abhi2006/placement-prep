package DSA.day09;

public class Rangesum {
        int[] pnum;
        public void NumArray(int[] nums) {
            pnum=new int[nums.length];
            pnum[0]=nums[0];
            for(int i=1;i<nums.length;i++){
                pnum[i]=pnum[i-1]+nums[i];

            }
        }
        public int sumRange(int left, int right) {
            if(left==0){
                return pnum[right];
            }
            else if(left>0){
                return pnum[right]-pnum[left-1];
            }
            else
                return -1;
        }}
