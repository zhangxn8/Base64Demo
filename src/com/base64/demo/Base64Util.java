package com.base64.demo;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.apache.commons.codec.binary.Base64;

public class Base64Util {
	// º”√‹  
    public static String getBase64(String str) {  
        byte[] b = null;  
        String s = null;  
        try {  
            b = str.getBytes("utf-8");  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        }  
        if (b != null) {  
            s = Base64.encodeBase64String(b);  
        }  
        return s;  
    }  
  
    // Ω‚√‹  
    public static String getFromBase64(String s) {  
        byte[] b = null;  
        String result = null;  
        if (s != null) {  
            try {  
                b = Base64.decodeBase64(s);  
                result = new String(b, "utf-8");  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }  
        return result;  
    }  
    
    public static void main(String args[]){
    	String str="osm12341234";
    	String s= Base64Util.getBase64(str);
    	System.out.println(Base64Util.getBase64(str));
    	String t=Base64Util.getFromBase64(s);
    	System.out.println(t);
    	System.out.println(new Date().getTime());
    	
    }
}
