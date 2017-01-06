package challenge.datastructure;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by Raj on 1/6/2017.
 */
public class RunningMedian {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        PriorityQueue<Integer> minQueue = new PriorityQueue(length, Collections.reverseOrder());
        PriorityQueue<Integer> maxQueue = new PriorityQueue(length);

        for(int i=0; i<length; i++){
            int val = sc.nextInt();
            addToQueue(val, minQueue, maxQueue);
            rebalance(minQueue, maxQueue);
            double result = getMedian(minQueue,maxQueue);
            System.out.println(result);
        }
    }

    private static double getMedian(PriorityQueue<Integer> minQueue, PriorityQueue<Integer> maxQueue) {

        if(minQueue.size() == maxQueue.size()){
            return ((double) minQueue.peek() + maxQueue.peek() ) / 2;
        }

        return minQueue.size() > maxQueue.size() ? minQueue.peek() : maxQueue.peek();

    }

    private static void rebalance(PriorityQueue<Integer> minQueue, PriorityQueue<Integer> maxQueue) {

        if(maxQueue.size() - minQueue.size() > 1){
            minQueue.add(maxQueue.poll());
        }
        else if(minQueue.size() - maxQueue.size() > 1){
            maxQueue.add(minQueue.poll());
        }
    }

    private static void addToQueue(int val, PriorityQueue<Integer> minQueue, PriorityQueue<Integer> maxQueue) {

        if(minQueue.size() == 0 || val < minQueue.peek()){
            minQueue.add(val);
        }
        else{
            maxQueue.add(val);
        }
    }
}
