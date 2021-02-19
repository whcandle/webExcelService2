package com.mg.webexcel.util;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.sql.Clob;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringUtils extends org.apache.commons.lang3.StringUtils {
    public static String createRandomCharData(int length) {
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();//随机用以下三个随机生成器
        Random randdata = new Random();
        int data = 0;
        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(3);
            //目的是随机选择生成数字，大小写字母
            switch (index) {
                case 0:
                    data = randdata.nextInt(10);//仅仅会生成0~9
                    sb.append(data);
                    break;
                case 1:
                    data = randdata.nextInt(26) + 65;//保证只会产生65~90之间的整数
                    sb.append((char) data);
                    break;
                case 2:
                    data = randdata.nextInt(26) + 97;//保证只会产生97~122之间的整数
                    sb.append((char) data);
                    break;
            }
        }
        return sb.toString();
    }

    public static boolean isAllNotEmpty(CharSequence... cs) {
        for (CharSequence c : cs) {
            if (isEmpty(c)) {
                return false;
            }
        }
        return true;
    }

    /***
     * 字符串格式化成xml
     * @param str
     * @return
     * @throws Exception
     */
    public static String formatXml(String str) throws Exception {
        Document document = null;
        document = DocumentHelper.parseText(str);
        // 格式化输出格式
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");
        StringWriter writer = new StringWriter();
        // 格式化输出流
        XMLWriter xmlWriter = new XMLWriter(writer, format);
        // 将document写入到输出流
        xmlWriter.write(document);
        xmlWriter.close();
        return writer.toString();
    }

    public static String ClobToString(Clob clob) {
        try {
            String reString = "";
            Reader is = clob.getCharacterStream();
            BufferedReader br = new BufferedReader(is);
            String s = br.readLine();
            StringBuffer sb = new StringBuffer();
            while (s != null) {
                sb.append(s);
                s = br.readLine();
            }
            reString = sb.toString();
            if (br != null) {
                br.close();
            }
            if (is != null) {
                is.close();
            }
            return reString;
        } catch (Exception e) {
            return "";
        }
    }

    //字符串转 字符集合
    public static List<String> toCharList(String string) {
        return Stream.iterate(0, n -> ++n)
                .limit(string.length())
                .map(n -> "" + string.charAt(n))
                .collect(Collectors.toList());
    }

    //判断字符串 s1前几位等于s2 但不相等 返回true
    public static boolean containsAndNotEquals(String s1, String s2) {

        if(s1.length() >=s2.length()){
            int length2 = s2.length();
            if (s1.substring(0, length2).equals(s2)) {
                //System.out.println("s1前几位等于s2");
                if(!s1.equals(s2)){
                    return true;
                }
            }
        }


        return false;
    }
}
