package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by tao on 2/8/17.
 */
public class Main {


    public void maxSum(List<Integer> input){
        int maxSum=Integer.MIN_VALUE;
        int start=0,end=0,sum=0,s=0;
        int n=input.size();
        for(int i=0;i<n;++i){
            sum+=input.get(i);
            if(sum>maxSum){
                maxSum=sum;
                end=i;
                start=s;
            }
            if(sum<0){
                sum=0;
                s=i+1;
            }
        }
        System.out.println(maxSum+" "+(start+1)+" "+(end+1));

    }


    public static void main(String[]strs){
        Main aq=new Main();
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            int cnt=1;
            while(cnt<=n) {
                System.out.println("Case "+cnt+":");
                List<Integer>li=new ArrayList<>();
                int m=scanner.nextInt();//total number
                while(m-- >0)
                    li.add(scanner.nextInt());
                aq.maxSum(li);
                cnt++;
                if(cnt<=n)
                    System.out.println();
            }

        }
    }
}