import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }

        List<Integer> countList = new ArrayList<>(map.values());
        countList.sort(Comparator.reverseOrder());

        int sum = 0;

        for (int count : countList) {
            sum += count;
            answer++;
            if (sum >= k) break;
        }

        return answer;
    }
}
