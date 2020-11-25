package com.kldbj.ajks.app.bean;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/**
 * Auto-generated: 2020-11-25 18:14:10
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class Data {

    private int aff;
    private String uuid;
    private String nickname;
    private String thumb;
    private int followed;
    @JsonProperty("fabulous_count")
    private int fabulousCount;
    @JsonProperty("videos_count")
    private int videosCount;
    private boolean vip;
    @JsonProperty("invited_code")
    private String invitedCode;
    @JsonProperty("invited_by")
    private String invitedBy;
    @JsonProperty("invited_url")
    private String invitedUrl;
    private String phone;
    @JsonProperty("free_view_cnt")
    private int freeViewCnt;
    private int coins;
    private int creator;
    @JsonProperty("creator_tag")
    private String creatorTag;
    @JsonProperty("creator_desc")
    private String creatorDesc;
    @JsonProperty("creator_detail")
    private List<String> creatorDetail;
    @JsonProperty("creator_level")
    private String creatorLevel;
    @JsonProperty("creator_auth_at")
    private String creatorAuthAt;
    @JsonProperty("creator_auth_at_day")
    private int creatorAuthAtDay;
    private List<Task> task;
    @JsonProperty("is_channel")
    private int isChannel;
    @JsonProperty("aff_url_copy")
    private String affUrlCopy;
    @JsonProperty("aff_code")
    private String affCode;
    @JsonProperty("aff_url")
    private String affUrl;
    private List<Section> section;
    @JsonProperty("club_id")
    private int clubId;
    private Center center;
    @JsonProperty("creator_center")
    private CreatorCenter creatorCenter;
    public void setAff(int aff) {
         this.aff = aff;
     }
     public int getAff() {
         return aff;
     }

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

    public void setThumb(String thumb) {
         this.thumb = thumb;
     }
     public String getThumb() {
         return thumb;
     }

    public void setFollowed(int followed) {
         this.followed = followed;
     }
     public int getFollowed() {
         return followed;
     }

    public void setFabulousCount(int fabulousCount) {
         this.fabulousCount = fabulousCount;
     }
     public int getFabulousCount() {
         return fabulousCount;
     }

    public void setVideosCount(int videosCount) {
         this.videosCount = videosCount;
     }
     public int getVideosCount() {
         return videosCount;
     }

    public void setVip(boolean vip) {
         this.vip = vip;
     }
     public boolean getVip() {
         return vip;
     }

    public void setInvitedCode(String invitedCode) {
         this.invitedCode = invitedCode;
     }
     public String getInvitedCode() {
         return invitedCode;
     }

    public void setInvitedBy(String invitedBy) {
         this.invitedBy = invitedBy;
     }
     public String getInvitedBy() {
         return invitedBy;
     }

    public void setInvitedUrl(String invitedUrl) {
         this.invitedUrl = invitedUrl;
     }
     public String getInvitedUrl() {
         return invitedUrl;
     }

    public void setPhone(String phone) {
         this.phone = phone;
     }
     public String getPhone() {
         return phone;
     }

    public void setFreeViewCnt(int freeViewCnt) {
         this.freeViewCnt = freeViewCnt;
     }
     public int getFreeViewCnt() {
         return freeViewCnt;
     }

    public void setCoins(int coins) {
         this.coins = coins;
     }
     public int getCoins() {
         return coins;
     }

    public void setCreator(int creator) {
         this.creator = creator;
     }
     public int getCreator() {
         return creator;
     }

    public void setCreatorTag(String creatorTag) {
         this.creatorTag = creatorTag;
     }
     public String getCreatorTag() {
         return creatorTag;
     }

    public void setCreatorDesc(String creatorDesc) {
         this.creatorDesc = creatorDesc;
     }
     public String getCreatorDesc() {
         return creatorDesc;
     }

    public void setCreatorDetail(List<String> creatorDetail) {
         this.creatorDetail = creatorDetail;
     }
     public List<String> getCreatorDetail() {
         return creatorDetail;
     }

    public void setCreatorLevel(String creatorLevel) {
         this.creatorLevel = creatorLevel;
     }
     public String getCreatorLevel() {
         return creatorLevel;
     }

    public void setCreatorAuthAt(String creatorAuthAt) {
         this.creatorAuthAt = creatorAuthAt;
     }
     public String getCreatorAuthAt() {
         return creatorAuthAt;
     }

    public void setCreatorAuthAtDay(int creatorAuthAtDay) {
         this.creatorAuthAtDay = creatorAuthAtDay;
     }
     public int getCreatorAuthAtDay() {
         return creatorAuthAtDay;
     }

    public void setTask(List<Task> task) {
         this.task = task;
     }
     public List<Task> getTask() {
         return task;
     }

    public void setIsChannel(int isChannel) {
         this.isChannel = isChannel;
     }
     public int getIsChannel() {
         return isChannel;
     }

    public void setAffUrlCopy(String affUrlCopy) {
         this.affUrlCopy = affUrlCopy;
     }
     public String getAffUrlCopy() {
         return affUrlCopy;
     }

    public void setAffCode(String affCode) {
         this.affCode = affCode;
     }
     public String getAffCode() {
         return affCode;
     }

    public void setAffUrl(String affUrl) {
         this.affUrl = affUrl;
     }
     public String getAffUrl() {
         return affUrl;
     }

    public void setSection(List<Section> section) {
         this.section = section;
     }
     public List<Section> getSection() {
         return section;
     }

    public void setClubId(int clubId) {
         this.clubId = clubId;
     }
     public int getClubId() {
         return clubId;
     }

    public void setCenter(Center center) {
         this.center = center;
     }
     public Center getCenter() {
         return center;
     }

    public void setCreatorCenter(CreatorCenter creatorCenter) {
         this.creatorCenter = creatorCenter;
     }
     public CreatorCenter getCreatorCenter() {
         return creatorCenter;
     }

}