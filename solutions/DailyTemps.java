import java.util.Stack;

public class DailyTemps {
    int[] res = new int[temperatures.length];
    Stack<int[]> stack = new Stack<>();

    for(int i = 0; i < temperatures.length; i++){
        int t = temperatures[i];

        while(!stack.isEmpty() && t > stack.peek()[0]){
            int[] pair = stack.pop();
            res[pair[1]] = i - pair[i];
        }
        stack.push(new int[]{t, i});
    }
    return res;
}
