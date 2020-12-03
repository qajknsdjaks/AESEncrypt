package com.kldbj.ajks.home.mvp.presenter;

import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class e {
    public static final char[]  a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};


    public static String a(byte[] arg7) {
        String v0 = "";
        if(arg7 == null) {
            return v0;
        }

        int v1 = arg7.length;
        if(v1 <= 0) {
            return v0;
        }

        char[] v0_1 = new char[v1 << 1];
        int v2 = 0;
        int v3 = 0;
        while(v2 < v1) {
            int v4 = v3 + 1;
            char[] v5 = e.a;
            v0_1[v3] = v5[arg7[v2] >> 4 & 15];
            v3 = v4 + 1;
            v0_1[v4] = v5[arg7[v2] & 15];
            ++v2;
        }

        return new String(v0_1);
    }

    public static IvParameterSpec b(String arg2) {
        byte[] v2_1;
        if(arg2 == null) {
            arg2 = "";
        }

        int v1 = 16;
        StringBuffer v0 = new StringBuffer(v1);
        v0.append(arg2);
        while(v0.length() < v1) {
            v0.append("0");
        }

        if(v0.length() > v1) {
            v0.setLength(v1);
        }

        try {
            v2_1 = v0.toString().getBytes("UTF-8");
        }
        catch(UnsupportedEncodingException v2) {
            v2.printStackTrace();
            v2_1 = null;
        }

        return new IvParameterSpec(v2_1);
    }

    public static SecretKeySpec c(String arg2) {
        byte[] v2_1;
        if(arg2 == null) {
            arg2 = "";
        }

        int v1 = 16;
        StringBuffer v0 = new StringBuffer(v1);
        v0.append(arg2);
        while(v0.length() < v1) {
            v0.append("0");
        }

        if(v0.length() > v1) {
            v0.setLength(v1);
        }

        try {
            v2_1 = v0.toString().getBytes("UTF-8");
        }
        catch(UnsupportedEncodingException v2) {
            v2.printStackTrace();
            v2_1 = null;
        }

        return new SecretKeySpec(v2_1, "AES");
    }

    public static String d(String arg1, String arg2, String arg3) {
        byte[] v1_1 = null;
        String v0 = null;
        try {
            v1_1 = e.i(arg1);
        }
        catch(Exception v1) {
            v1.printStackTrace();
      //      v1_1 = ((byte[])v0);
        }

        v1_1 = e.e(v1_1, arg2, arg3);
        if(v1_1 == null) {
            return v0;
        }

        try {
            v0 = new String(v1_1, "UTF-8");
        }
        catch(UnsupportedEncodingException v1_2) {
            v1_2.printStackTrace();
        }

        return v0;
    }

    public static byte[] e(byte[] arg2, String arg3, String arg4) {
        try {
            SecretKeySpec v3 = e.c(arg3);
            IvParameterSpec v4 = e.b(arg4);
            Cipher v0 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            v0.init(2, ((Key)v3), ((AlgorithmParameterSpec)v4));
            return v0.doFinal(arg2);
        }
        catch(Exception v2) {
            v2.printStackTrace();
            return null;
        }
    }

    public static String f(String arg1, String arg2, String arg3) {
        byte[] v1_1;
        try {
            v1_1 = arg1.getBytes("UTF-8");
        }
        catch(Exception v1) {
            v1.printStackTrace();
            v1_1 = null;
        }

        return e.a(e.g(v1_1, arg2, arg3));
    }

    public static byte[] g(byte[] arg2, String arg3, String arg4) {
        try {
            SecretKeySpec v3 = e.c(arg3);
            IvParameterSpec v4 = e.b(arg4);
            Cipher v0 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            v0.init(1, ((Key)v3), ((AlgorithmParameterSpec)v4));
            return v0.doFinal(arg2);
        }
        catch(Exception v2) {
            v2.printStackTrace();
            return null;
        }
    }

    public static int h(char arg2) {
        int v0 = 0x30;
        if(arg2 >= v0 && arg2 <= 57) {
            return arg2 - v0;
        }

        v0 = 65;
        if(arg2 >= v0 && arg2 <= 70) {
            return arg2 - v0 + 10;
        }

        throw new IllegalArgumentException();
    }

    public static byte[] i(String arg6) {
        if(e.j(arg6)) {
            return null;
        }

        int v0 = arg6.length();
        if(v0 % 2 != 0) {
            arg6 = "0" + arg6;
            ++v0;
        }

        char[] v6 = arg6.toUpperCase().toCharArray();
        byte[] v1_1 = new byte[v0 >> 1];
        int v2;
        for(v2 = 0; v2 < v0; v2 += 2) {
            v1_1[v2 >> 1] = ((byte)(e.h(v6[v2]) << 4 | e.h(v6[v2 + 1])));
        }

        return v1_1;
    }

    public static boolean j(String arg5) {
        if(arg5 == null) {
            return true;
        }

        int v1 = arg5.length();
        int v3;
        for(v3 = 0; v3 < v1; ++v3) {
            if(!Character.isWhitespace(arg5.charAt(v3))) {
                return false;
            }
        }

        return true;
    }
}

