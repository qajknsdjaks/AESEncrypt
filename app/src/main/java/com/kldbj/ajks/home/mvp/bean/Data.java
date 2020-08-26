/**
  * Copyright 2020 bejson.com 
  */
package com.kldbj.ajks.home.mvp.bean;
import java.util.List;

/**
 * Auto-generated: 2020-08-25 13:17:47
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Data {

    private List<Banner> banner;
    private List<Widget> widget;
    private List<MVideo> list;
    public void setBanner(List<Banner> banner) {
         this.banner = banner;
     }
     public List<Banner> getBanner() {
         return banner;
     }

    public void setWidget(List<Widget> widget) {
         this.widget = widget;
     }
     public List<Widget> getWidget() {
         return widget;
     }

    public void setList(List<MVideo> list) {
         this.list = list;
     }
     public List<MVideo> getList() {
         return list;
     }

}