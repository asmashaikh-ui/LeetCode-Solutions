import java.util.Queue;
import java.util.LinkedList;

class MyStack {

    Queue<Integer> q= new LinkedList<>();
    Queue<Integer> helper= new LinkedList<>();

    public MyStack() {

    }
    
    public void push(int x) {
        
        if(q.isEmpty()){
            q.add(x);
            return;
        }

        while(!q.isEmpty()){

            helper.add(q.poll());
        }

        q.add(x);
        while(!helper.isEmpty()){
            q.add(helper.poll());
        }
    }
    
    public int pop() {

        return q.poll();
    }
    
    public int top() {

        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */