package programmers;

class 소수만들기 {
    public int solution(int[] nums) {
        boolean [] prime = new boolean[3000];
        for (int i=2; i*i<prime.length; i++){
            if (prime[i]) continue;
            for (int j= i+i; j< prime.length; j+=i){
                prime[j]= true;
            }
        }
        int count =0;
        for (int i=0; i< nums.length-2; i++){
            for (int j=i+1;j<nums.length-1; j++){
                for (int k=j+1; k< nums.length;k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    if (!prime[sum]){
                        count++;
                    }

                }
            }
        }
        return count;
    }
}