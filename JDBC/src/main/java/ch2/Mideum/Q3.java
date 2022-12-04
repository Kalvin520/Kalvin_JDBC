package ch2.Mideum;
//給定一個句子，請判斷它是不是迴文，即正著讀或反著讀都一樣的句子。例如:【上海自來水來自海上】是迴文。其他例子:
//(1) 喜歡的少年是你，你是年少的歡喜
//(2) 小巷殘月凝天空，親人故土鄉情濃，笑聲猶在空懷舊，憔心客愁滿蒼穹，穹蒼滿愁客心憔，舊懷空在猶聲笑，濃情鄉土故人親，空天凝月殘巷小
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        boolean reverse = true;
        int count = 0;
        String test = "小巷殘月凝天空，親人故土鄉情濃，笑聲猶在空懷舊，憔心客愁滿蒼穹，穹蒼滿愁客心憔，舊懷空在猶聲笑，濃情鄉土故人親，空天凝月殘巷小";
        for (int i = 0; i < test.length() / 2; i++) {
            if (test.charAt(i) != test.charAt((test.length() - 1) - count)) {

                reverse = false;
            }
            count++;
        }
        if (reverse){
            System.out.println(test + " 是回文");
        }else {
            System.out.println(test +" 不是回文");
        }
    }
}