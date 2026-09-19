public class KokoEatingBananas {
//  TC = n log m 

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for (int i : piles) {

            if (right < i) {
                right = i;
            }
        }
        int answer = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int totaltimeofkoko = helperfunctionfortimecalculate(piles, mid);
            if (totaltimeofkoko <= h) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return answer;
    }

    // hel[er cuntin ]
    public static int helperfunctionfortimecalculate(int[] piles, int k) {

        int totaltime = 0;
        for (int i : piles) {
            totaltime += Math.ceil((double) i / k); // add time with prevous time with uppr value
        }
        return totaltime;

    }

    public static void main(String[] args) {

    }
}
