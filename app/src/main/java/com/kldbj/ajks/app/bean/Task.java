package com.kldbj.ajks.app.bean;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/**
 * Auto-generated: 2020-11-25 18:14:10
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class Task {

    private int id;
    private String title;
    private Date desc;
    private String category;
    private String type;
    private String value;
    private int status;
    @JsonProperty("start_time")
    private String startTime;
    @JsonProperty("end_time")
    private String endTime;
    @JsonProperty("img_url")
    private String imgUrl;
    @JsonProperty("created_at")
    private String createdAt;
    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setTitle(String title) {
         this.title = title;
     }
     public String getTitle() {
         return title;
     }

    public void setDesc(Date desc) {
         this.desc = desc;
     }
     public Date getDesc() {
         return desc;
     }

    public void setCategory(String category) {
         this.category = category;
     }
     public String getCategory() {
         return category;
     }

    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setValue(String value) {
         this.value = value;
     }
     public String getValue() {
         return value;
     }

    public void setStatus(int status) {
         this.status = status;
     }
     public int getStatus() {
         return status;
     }

    public void setStartTime(String startTime) {
         this.startTime = startTime;
     }
     public String getStartTime() {
         return startTime;
     }

    public void setEndTime(String endTime) {
         this.endTime = endTime;
     }
     public String getEndTime() {
         return endTime;
     }

    public void setImgUrl(String imgUrl) {
         this.imgUrl = imgUrl;
     }
     public String getImgUrl() {
         return imgUrl;
     }

    public void setCreatedAt(String createdAt) {
         this.createdAt = createdAt;
     }
     public String getCreatedAt() {
         return createdAt;
     }

}