

public class StocksBuyAndSell {
    public static void main(String[] args) {
        //int arr[]={7,1,5,3,6,4};
        int arr[]={7,6,4,3,1};
        int n=arr.length;
        int max=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    int diff=arr[j]-arr[i];
                    max=Math.max(max,diff);
                }
            }
        }
        System.out.println(max);
    }
}

// public int maxProfit(int[] prices) {
//     int maxprofit=0,n=prices.length;
//     int low=prices[0];
//         for(int i=1;i<n;i++){
//             int profit=prices[i]-low;
//             maxprofit=Math.max(maxprofit,profit);
//             if(prices[i]<low)
//                 low=prices[i];
//         }
//     return maxprofit;
// }