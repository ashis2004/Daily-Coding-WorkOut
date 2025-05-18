class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int ttlgas=0, ttlcost=0;
        
        for(int i=0;i<gas.length;i++){
            ttlgas+=gas[i];
        }
        for(int i=0;i<cost.length;i++){
            ttlcost+=cost[i];
        }
        if(ttlgas<ttlcost) return -1;
        
        
        int start=0, remGas=0;
        for(int i=0;i<gas.length;i++){
            remGas=remGas+(gas[i]-cost[i]);
            if(remGas<0){
                start=i+1;
                remGas=0;
            }
        }
        
        return start;
    }
    
}