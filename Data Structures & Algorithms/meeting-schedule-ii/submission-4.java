/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {



        Collections.sort(intervals,(a,b) ->  Integer.compare(a.start,b.start));

        if(intervals.size() == 1) return 1;
        if(intervals.size()== 0) return 0;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(intervals.get(0).end);

        for(int i = 1; i < intervals.size(); i++){
            if(minHeap.peek() <= intervals.get(i).start){
                minHeap.poll();
            }

            minHeap.add(intervals.get(i).end);
        }



       

        return minHeap.size();

    }
}
