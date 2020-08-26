/**
  * Copyright 2020 bejson.com 
  */
package com.kldbj.ajks.home.mvp.bean;

import java.io.Serializable;

/**
 * Auto-generated: 2020-08-25 13:17:47
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Member implements Serializable {

    private String uuid;
    private String nickname;
    private String username;
    private boolean auth_status;
    private String phone;
    private int followed_count;
    private int fans_count;
    private int videos_count;
    private boolean is_follow;
    private String thumb;
    public void setUuid(String uuid) {
         this.uuid = uuid;
     }
     public String getUuid() {
         return uuid;
     }

    public void setNickname(String nickname) {
         this.nickname = nickname;
     }
     public String getNickname() {
         return nickname;
     }

    public void setUsername(String username) {
         this.username = username;
     }
     public String getUsername() {
         return username;
     }

    public void setAuth_status(boolean auth_status) {
         this.auth_status = auth_status;
     }
     public boolean getAuth_status() {
         return auth_status;
     }

    public void setPhone(String phone) {
         this.phone = phone;
     }
     public String getPhone() {
         return phone;
     }

    public void setFollowed_count(int followed_count) {
         this.followed_count = followed_count;
     }
     public int getFollowed_count() {
         return followed_count;
     }

    public void setFans_count(int fans_count) {
         this.fans_count = fans_count;
     }
     public int getFans_count() {
         return fans_count;
     }

    public void setVideos_count(int videos_count) {
         this.videos_count = videos_count;
     }
     public int getVideos_count() {
         return videos_count;
     }

    public void setIs_follow(boolean is_follow) {
         this.is_follow = is_follow;
     }
     public boolean getIs_follow() {
         return is_follow;
     }

    public void setThumb(String thumb) {
         this.thumb = thumb;
     }
     public String getThumb() {
         return thumb;
     }

}