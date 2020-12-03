package com.kldbj.ajks.app.bean;

public class JsonNangua {

    /**
     * code : 200
     * msg : succ
     * data : {"response_key":""}
     */

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * response_key :
         */

        private String response_key;

        public String getResponse_key() {
            return response_key;
        }

        public void setResponse_key(String response_key) {
            this.response_key = response_key;
        }
    }
}
