import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //2


        String s = "is2 sentence4 This1 a3";
        String result = Arrays.stream(s.split(" "))
                .sorted((s1, s2) -> {
                    int i1 = Integer.parseInt(s1.replaceAll("[^0-9]", ""));
                    int i2 = Integer.parseInt(s2.replaceAll("[^0-9]", ""));

                    return i1 - i2;
                })
                .collect(Collectors.joining(" "));

        System.out.println(result);


           //3

            String v="gin,zen,gig,msg";
        String words[]=v.split(",");
            String[] dd = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> seen = new HashSet();
            for (String w : words) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < w.length(); ++i)
                    sb.append(dd[w.charAt(i) - 'a']);
                seen.add(sb.toString());
            }
        System.out.println(seen);

            //4

        StringBuffer word=new StringBuffer("xyxz xe");
        char charr ='z';
        String worlds = null;
        if (word.charAt(3)==charr){
         word.deleteCharAt(3);
         worlds=charr+""+word;
        }
        System.out.println(worlds);

           //5
        String kordinat="a1";
        String [] bbbb=kordinat.split("[0-9]");
        System.out.println(bbbb[0]);
       if (bbbb[0].equals("a")){
           System.out.println((kordinat.charAt(0) + kordinat.charAt(1) - 'a') % 2 == 0);
       }
        if (bbbb[0].equals("h")){
            System.out.println((kordinat.charAt(0)+1 + kordinat.charAt(1) - 'h') % 2 == 0);
        }
     //6


        String ss ="foobar";
        String[]sss=ss.split("");
        System.out.println(sss[0]);
        char dg='o';
        int gh= ss.length();
        int fh=0;
        for (int i=0;i<ss.length();i++){

            if (sss[i].equals("o")){
                fh++;
            }
        }
        System.out.println(fh);
        double res =Math.floor(101* fh/gh);
        int resuglt= (int) res;
        System.out.println(resuglt+"%");
    }
}