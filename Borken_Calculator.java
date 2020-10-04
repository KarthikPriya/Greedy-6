import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int brokenCalc(int X, int Y) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(X);
        int count = 0;
        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i=0;i<size;i++)
            {
                int curr = queue.poll();
                if(curr == Y)return count;
                if(curr > Y)
                {
                    queue.add(curr-1);
                }else
                {
                    queue.add(curr * 2);
                    queue.add(curr - 1);
                }
            }
            count++;            
        }
        return count;
    }
}

//Time complexity: 2 ^ n
//Space complexity: 2 ^ n

class Broke_Calculator {
    public int brokenCalc(int X, int Y) {
        int count = 0;
        while( Y > X)
        {
            if(Y % 2 == 0)
            {
                Y = Y/2;
            }else
            {
                Y = Y+1;
            }
            count++;
        }
        return count + X - Y;
    }
}

//Time complexity : O (log Y)
//Space complexity : O(1)