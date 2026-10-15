class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0, start=0,tank=0,size=gas.length;
        for(int index=0;index<size;index++){
            int diff=gas[index]-cost[index];
            total+=diff; tank+=diff;
            if(tank<0){start=index+1;tank=0;}
        }
        return (total>=0)?start:-1;
    }
}
