package leetcode;

import java.util.Arrays;

public class LeastDrump{
    //[2,3,1,1,4] print 2 最短距离跳跃
    public LeastDrump(){

    }

    public static void main(String[] args) {
        System.out.println(new LeastDrump().leastDrump(new int[]{2,3,1,1,4,1}));
    }

    public int leastDrump(int[] data){
        int st = 0;
        int ed =0,count=1,size = data.length,temp;
        if(size == 1){
            return 0;
        }
        while(ed+1<size-1){
            temp = st;
            st = ed +1;
            ed = data[temp] +1;
            count++;


        }
       return count;

    }
}
