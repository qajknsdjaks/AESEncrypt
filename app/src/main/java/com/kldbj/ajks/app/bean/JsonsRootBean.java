package com.kldbj.ajks.app.bean;

/**
 * Auto-generated: 2020-11-25 18:14:10
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class JsonsRootBean {

    private int status;
    private Data data;
    private String msg;
    @JsonProperty("isVip")
    private boolean isvip;
    @JsonProperty("daily_view")
    private int dailyView;
    public void setStatus(int status) {
         this.status = status;
     }
     public int getStatus() {
         return status;
     }

    public void setData(Data data) {
         this.data = data;
     }
     public Data getData() {
         return data;
     }

    public void setMsg(String msg) {
         this.msg = msg;
     }
     public String getMsg() {
         return msg;
     }

    public void setIsvip(boolean isvip) {
         this.isvip = isvip;
     }
     public boolean getIsvip() {
         return isvip;
     }

    public void setDailyView(int dailyView) {
         this.dailyView = dailyView;
     }
     public int getDailyView() {
         return dailyView;
     }

}