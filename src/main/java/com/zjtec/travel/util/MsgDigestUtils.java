package com.zjtec.travel.util;

import com.alibaba.druid.sql.visitor.functions.Hex;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MsgDigestUtils {
    /**
     * SHA256 加密
     * @param str 明文
     * @return 密文
     */
    public static String encodeSHA256(String str){
        MessageDigest messageDigest;
        String encdeStr = "";
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] hash = messageDigest.digest(str.getBytes("UTF-8"));
            encdeStr = byte2Hex(hash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return encdeStr;
    }

    private static String byte2Hex(byte[] bytes){
        StringBuffer stringBuffer = new StringBuffer();
        String temp = null;
        for (int i=0;i<bytes.length;i++){
            //此方法返回的字符串表示的无符号整形参数所表示的值以十六进制，使用0XFF可以把高24位0以避免错误
            temp = Integer.toHexString(bytes[i] & 0xFF);
            if (temp.length()==1){
                //1得到一位的进行补0操作
                stringBuffer.append("0");
            }
            stringBuffer.append(temp);
        }
        return stringBuffer.toString();
    }

    public static String pwdEncrypt(String pwd,String salt){
        final int loop = 3;//循环加密三层
        String pwdEnc = pwd;
        for (int i = 0; i < loop; i++) {
            pwdEnc = encodeSHA256(pwd+salt);
        }
        return pwdEnc;
    }

}
