package chapter1;

import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for(int i=0;i<T;i++){
            String[] ss = sc.nextLine().split("[.]");
            long zhengShu = Long.parseLong(ss[0]);
            int xiaoShu = Integer.parseInt(ss[1]);
            if((ss[1].length()==3&&xiaoShu>444&&xiaoShu<1000)||
                    (ss[1].length()==2&&xiaoShu>44&&xiaoShu<100)||
                            (ss[1].length()==1&&xiaoShu>4&&xiaoShu<10))
                zhengShu += 1;
            System.out.println(zhengShu);
        }
    }
}