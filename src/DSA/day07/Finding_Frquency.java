package DSA.day07;

import java.util.HashMap;

public class Finding_Frquency {
    public void Get_freq(int nums[]){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i =0;i<nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Integer key :map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
