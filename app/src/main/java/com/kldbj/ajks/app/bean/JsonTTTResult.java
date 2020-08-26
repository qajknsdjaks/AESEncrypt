/**
  * Copyright 2020 bejson.com 
  */
package com.kldbj.ajks.app.bean;

/**
 * Auto-generated: 2020-08-25 0:57:8
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class JsonTTTResult {


        private int errcode;
        private long timestamp;
        private String data;
        private String sign;
        public void setErrcode(int errcode) {
            this.errcode = errcode;
        }
        public int getErrcode() {
            return errcode;
        }

        public void setTimestamp(long timestamp) {
            this.timestamp = timestamp;
        }
        public long getTimestamp() {
            return timestamp;
        }

        public void setData(String data) {
            this.data = data;
        }
        public String getData() {
            return data;
        }

        public void setSign(String sign) {
            this.sign = sign;
        }
        public String getSign() {
            return sign;
        }
}