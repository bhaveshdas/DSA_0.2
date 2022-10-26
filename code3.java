class KthLargest {
    PriorityQueue<Integer> pq;
    int k;

    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        this.k = k;
        for(int i : nums)
            pq.add(i);
    }
    
    public int add(int val) {
        pq.add(val);
        while(pq.size() > k)
            pq.remove();
        return pq.peek();
    }
}
