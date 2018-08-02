package com.spring.fm;

import org.springframework.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/***
 * @Des: 场景式存证_Demo
 * @Author: jiyang
 * @Date: 2018-07-26 23:56
 */
public class Test {

    public static void main(String[] args) {

        Pattern pattern_column = Pattern.compile("[\\s\\S]" +
                "*文担息费\\[(\\d+)\\][\\s\\S]" +
                "*网金社息费\\[(\\d+)\\][\\s\\S]" +
                "*龙贷息费\\[(\\d+)\\][\\s\\S]" +
                "*冠e通息费\\[(\\d+)\\][\\s\\S]" +
                "*公证费（含委托）\\[(\\d+)\\][\\s\\S]" +
                "*合同鉴证费\\[(\\d+)\\][\\s\\S]" +
                "*权证费\\[(\\d+)\\][\\s\\S]" +
                "*建委核档费\\[(\\d+)\\][\\s\\S]" +
                "*过桥垫资费\\[(\\d+)\\][\\s\\S]" +
                "*其他\\[(\\d+)\\][\\s\\S]", Pattern.CASE_INSENSITIVE);

        String str = "通过审批意见要求，已确认收到以下费用：\n" +
                "1.文担息费[10]元\n" +
                "2.网金社息费[20]元\n" +
                "3.龙贷息费[]元\n" +
                "4.冠e通息费[40]元\n" +
                "5.公证费（含委托）[50]元\n" +
                "6.合同鉴证费[60]元\n" +
                "7.权证费[70]元\n" +
                "8.建委核档费[50]元\n" +
                "9.过桥垫资费[60]元\n" +
                "10.其他[40]元\n";

//        StringBuilder pattern_str = new StringBuilder("[\\s\\S]");
//        IntStream.range(1, 11).forEach(i -> pattern_str.append("*\\.([\\s\\S]*\\[(\\d+)\\])[\\s\\S]"));

        String ss="[\\s\\S]*(\\.\\s*\\[\\d*\\])*";
//       StringBuilder pattern_st2 = new StringBuilder("[\\s\\S]*(\\.([\\s\\S]*\\[(\\d+)\\]元)[\\\\s\\\\S]*)");


        Pattern pattern_column2 = Pattern.compile(ss);
        Matcher matcher2 = pattern_column2.matcher(str);
//        if(matcher2.matches()){
//            System.out.println(matcher2.group(1));
//        }
//        if (matcher2.find()) {
//            System.out.println(matcher2.group(1));
//        }

//        Pattern p = Pattern.compile("\\[(\\d*)\\]");
//        Matcher m = p.matcher(str);
//        while (m.find()) {
//            System.out.println(m.group(1));
//        }

        Pattern p = Pattern.compile("\\.([a-zA-Z0-9_\\u4e00-\\u9fa5\\uff08\\uff09]*\\[(\\d*)\\])");
//                Pattern p = Pattern.compile("\\.([a-zA-Z0-9_\\u4e00-\\uff09]*\\[(\\d*)\\])");

        Matcher m = p.matcher(str);
        while (m.find()) {
            String g = m.group(1);
            System.out.println(g);
            System.out.println(m.group(2));
//            if (g.contains("文担息费")) {
//
//            } else if (g.contains("网金社息费")) {
//
//            } else if (g.contains("龙贷息费")) {
//
//            } else if (g.contains("冠e通息费")) {
//
//            } else if (g.contains("公证费")) {
//
//            } else if (g.contains("合同鉴证费")) {
//
//            } else if (g.contains("权证费")) {
//
//            } else if (g.contains("建委核档费")) {
//
//            } else if (g.contains("过桥垫资费")) {
//
//            } else if (g.contains("其他")) {
//
//            }
        }

//        Pattern p = Pattern.compile("\\.([\\s\\S]*)元");
//        Matcher m = p.matcher(str);
//        while (m.matches()) {
//            String com = m.group(1);
//            System.out.println(m.group(1));
//        }


//        Matcher m_select = pattern_column.matcher(str);
//        if (m_select.find()) {
//            System.out.println(m_select.group(1));
//            System.out.println(m_select.group(2));
//            System.out.println(m_select.group(3));
//            System.out.println(m_select.group(4));
//            System.out.println(m_select.group(5));
//            System.out.println(m_select.group(6));
//            System.out.println(m_select.group(7));
//            System.out.println(m_select.group(8));
//            System.out.println(m_select.group(9));
//            System.out.println(m_select.group(10));
//
//        }

//        List<String> users =null;
//        users.forEach(u-> System.out.println(u));
//        IntStream.range(1, 10).forEach(e-> System.out.println(e));
    }

}
