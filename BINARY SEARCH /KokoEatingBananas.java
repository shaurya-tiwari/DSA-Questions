// 🏁 START: Program shuru hota hai
//  ⬇️
// 🛠️ PHASE 1: PREPARATION (Range Set Karna)
//    • Manager array mein check karke sabse bada dher (max pile) nikalta hai.
//    • left = 1  (Minimum possible speed)
//    • right = Max value (Maximum useful speed)
//    • ans = -1  (Answer save karne ki khali jagah)
//  ⬇️
// 🔄 PHASE 2: THE MANAGER'S GUESS (Binary Search Loop)
//    👉 Jab tak (left <= right) hai:
//    • Manager ek speed guess karta hai: mid = left + (right - left) / 2
//  ⬇️
// ⚙️ PHASE 3: THE WORKER'S JOB (Helper Function)
//    • Manager apni guess ki hui 'mid' speed Worker (helperfunction) ko deta hai.
//    • Worker har dher par jata hai: Math.ceil(pile / mid)
//    • Worker saare ghante jod kar 'totaltime' Manager ko wapas lauta deta hai.
//  ⬇️
// ⚖️ PHASE 4: THE DECISION (Check & Shift)
//    • Manager dekhta hai: Kya totaltime <= h (Deadline) hai?
     
//       ✅ AGAR YES (Koko safe hai):
//          1. ans = mid (Is safe speed ko save kar lo)
//          2. right = mid - 1 (Chalo check karte hain kya isse bhi kam speed par kaam chalega?)
//          ⤴️ Wapas PHASE 2 par jao!

//       ❌ AGAR NO (Koko pakdi jayegi, time zyada lag gaya):
//          1. left = mid + 1 (Speed bohot slow thi, ab fast speed try karni hogi)
//          ⤴️ Wapas PHASE 2 par jao!
//  ⬇️
// 🛑 PHASE 5: END
//    • Jab 'left' bada ho jata hai 'right' se, loop toot jata hai.
//    • Program 'ans' return kar deta hai jisme humari sabse best (minimum) speed save thi.



public class KokoEatingBananas {
//  TC = n log m 

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for (int i : piles) {

            right = Math.max(i, right)
        }
        int answer = -1;

        while (left < right) {
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

        long totaltime = 0;
        for (int i : piles) {
            // no need to call other ceil funtion 
            totaltime += ((i - 1) / k + 1); // add time with prevous time with uppr value
        }
        return totaltime;

    }

    public static void main(String[] args) {

    }
}
