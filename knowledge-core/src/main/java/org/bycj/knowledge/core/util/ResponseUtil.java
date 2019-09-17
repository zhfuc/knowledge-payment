package org.bycj.knowledge.core.util;

import java.util.HashMap;

public class ResponseUtil {


    private int code = 200 ;
    private String errorMessage = "" ;
    private HashMap<String , Object> data = new HashMap<>();

    public ResponseUtil(int code, String errorMessage) {
        this.code = code;
        this.errorMessage = errorMessage;
    }

    public static final ResponseUtil getSuccess (){
        return new ResponseUtil(200 , "");
    }

    public ResponseUtil put (String key , Object object){
        this.data.put(key , object);
        return this ;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public HashMap<String, Object> getData() {
        return data;
    }

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }
}
