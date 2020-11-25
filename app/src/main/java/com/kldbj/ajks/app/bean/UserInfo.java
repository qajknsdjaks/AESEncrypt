package com.kldbj.ajks.app.bean;

import java.util.List;

public class UserInfo {

    /**
     * status : 200
     * data : {"aff":6506676,"uuid":"ef7e66e7baceac3cb50884b82e3a5dd8","nickname":"温婉毛豆","thumb":"https://images.91-tv.me/new/head/20200718/2020071820202690175.png","followed":0,"fabulous_count":0,"videos_count":0,"vip":false,"invited_code":"Ktwa","invited_by":null,"invited_url":"https://ttt.tangbr.net/af/Ktwa","phone":null,"free_view_cnt":0,"coins":0,"creator":0,"creator_tag":"","creator_desc":"","creator_detail":[],"creator_level":"1","creator_auth_at":"","creator_auth_at_day":0,"task":[{"id":3,"title":"手机登录","desc":"免费看大鸟+1","category":"global","type":"times","value":"1","status":1,"start_time":null,"end_time":null,"img_url":null,"created_at":"1576244052"},{"id":2,"title":"邀请送会员","desc":"vip +1天","category":"daily","type":"vip","value":"1","status":1,"start_time":null,"end_time":null,"img_url":null,"created_at":"1576244052"},{"id":1,"title":"周三免费看片","desc":"限时送+3次","category":"limit","type":"times","value":"3","status":1,"start_time":"2019-12-22 00:24:42","end_time":"2019-12-25 21:24:56","img_url":null,"created_at":"1576244052"}],"is_channel":0,"aff_url_copy":"网红不雅被流出？网红资源无处寻？最新网黄ta是谁？全新看片体验，全球最大网黄孵化平台，一切就在【汤头条】(百万资源在线看，分享赚钱月入10万，日更新视频上万部)，填我邀请码【Ktwa】请复制链接在浏览器中打开！https://ttt.tangbr.net/af/Ktwa","aff_code":"Ktwa","aff_url":"https://ttt.tangbr.net/af/Ktwa","section":[{"name":"我的消息","type":"message","unread":0},{"name":"在线客服","type":"customer","unread":0},{"name":"官方公告","type":"post","unread":1}],"club_id":0,"center":{"version":"1.3.1","url":"https://ttt.tangbr.com/index/creator","tips":"升级优化更多功能~"},"creator_center":{"win":{"version":"1.3.1","url":"https://download.trialv.com/tbr/tang.winnew1.3.1.zip","tips":"修复已知bug，完善体验,绿色安装免解压，更顺滑~"},"mac":{"version":"1.3.1","url":"https://download.trialv.com/tang.macnew1.3.1.dmg","tips":"修复已知bug，完善体验。"}}}
     * msg : null
     * isVip : false
     * daily_view : 3
     */

    private int status;
    private DataBean data;
    private Object msg;
    private boolean isVip;
    private int daily_view;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }

    public boolean isIsVip() {
        return isVip;
    }

    public void setIsVip(boolean isVip) {
        this.isVip = isVip;
    }

    public int getDaily_view() {
        return daily_view;
    }

    public void setDaily_view(int daily_view) {
        this.daily_view = daily_view;
    }

    public static class DataBean {
        /**
         * aff : 6506676
         * uuid : ef7e66e7baceac3cb50884b82e3a5dd8
         * nickname : 温婉毛豆
         * thumb : https://images.91-tv.me/new/head/20200718/2020071820202690175.png
         * followed : 0
         * fabulous_count : 0
         * videos_count : 0
         * vip : false
         * invited_code : Ktwa
         * invited_by : null
         * invited_url : https://ttt.tangbr.net/af/Ktwa
         * phone : null
         * free_view_cnt : 0
         * coins : 0
         * creator : 0
         * creator_tag :
         * creator_desc :
         * creator_detail : []
         * creator_level : 1
         * creator_auth_at :
         * creator_auth_at_day : 0
         * task : [{"id":3,"title":"手机登录","desc":"免费看大鸟+1","category":"global","type":"times","value":"1","status":1,"start_time":null,"end_time":null,"img_url":null,"created_at":"1576244052"},{"id":2,"title":"邀请送会员","desc":"vip +1天","category":"daily","type":"vip","value":"1","status":1,"start_time":null,"end_time":null,"img_url":null,"created_at":"1576244052"},{"id":1,"title":"周三免费看片","desc":"限时送+3次","category":"limit","type":"times","value":"3","status":1,"start_time":"2019-12-22 00:24:42","end_time":"2019-12-25 21:24:56","img_url":null,"created_at":"1576244052"}]
         * is_channel : 0
         * aff_url_copy : 网红不雅被流出？网红资源无处寻？最新网黄ta是谁？全新看片体验，全球最大网黄孵化平台，一切就在【汤头条】(百万资源在线看，分享赚钱月入10万，日更新视频上万部)，填我邀请码【Ktwa】请复制链接在浏览器中打开！https://ttt.tangbr.net/af/Ktwa
         * aff_code : Ktwa
         * aff_url : https://ttt.tangbr.net/af/Ktwa
         * section : [{"name":"我的消息","type":"message","unread":0},{"name":"在线客服","type":"customer","unread":0},{"name":"官方公告","type":"post","unread":1}]
         * club_id : 0
         * center : {"version":"1.3.1","url":"https://ttt.tangbr.com/index/creator","tips":"升级优化更多功能~"}
         * creator_center : {"win":{"version":"1.3.1","url":"https://download.trialv.com/tbr/tang.winnew1.3.1.zip","tips":"修复已知bug，完善体验,绿色安装免解压，更顺滑~"},"mac":{"version":"1.3.1","url":"https://download.trialv.com/tang.macnew1.3.1.dmg","tips":"修复已知bug，完善体验。"}}
         */

        private int aff;
        private String uuid;
        private String nickname;
        private String thumb;
        private int followed;
        private int fabulous_count;
        private int videos_count;
        private boolean vip;
        private String invited_code;
        private Object invited_by;
        private String invited_url;
        private Object phone;
        private int free_view_cnt;
        private int coins;
        private int creator;
        private String creator_tag;
        private String creator_desc;
        private String creator_level;
        private String creator_auth_at;
        private int creator_auth_at_day;
        private int is_channel;
        private String aff_url_copy;
        private String aff_code;
        private String aff_url;
        private int club_id;
        private CenterBean center;
        private CreatorCenterBean creator_center;
        private List<?> creator_detail;
        private List<TaskBean> task;
        private List<SectionBean> section;

        public int getAff() {
            return aff;
        }

        public void setAff(int aff) {
            this.aff = aff;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public int getFollowed() {
            return followed;
        }

        public void setFollowed(int followed) {
            this.followed = followed;
        }

        public int getFabulous_count() {
            return fabulous_count;
        }

        public void setFabulous_count(int fabulous_count) {
            this.fabulous_count = fabulous_count;
        }

        public int getVideos_count() {
            return videos_count;
        }

        public void setVideos_count(int videos_count) {
            this.videos_count = videos_count;
        }

        public boolean isVip() {
            return vip;
        }

        public void setVip(boolean vip) {
            this.vip = vip;
        }

        public String getInvited_code() {
            return invited_code;
        }

        public void setInvited_code(String invited_code) {
            this.invited_code = invited_code;
        }

        public Object getInvited_by() {
            return invited_by;
        }

        public void setInvited_by(Object invited_by) {
            this.invited_by = invited_by;
        }

        public String getInvited_url() {
            return invited_url;
        }

        public void setInvited_url(String invited_url) {
            this.invited_url = invited_url;
        }

        public Object getPhone() {
            return phone;
        }

        public void setPhone(Object phone) {
            this.phone = phone;
        }

        public int getFree_view_cnt() {
            return free_view_cnt;
        }

        public void setFree_view_cnt(int free_view_cnt) {
            this.free_view_cnt = free_view_cnt;
        }

        public int getCoins() {
            return coins;
        }

        public void setCoins(int coins) {
            this.coins = coins;
        }

        public int getCreator() {
            return creator;
        }

        public void setCreator(int creator) {
            this.creator = creator;
        }

        public String getCreator_tag() {
            return creator_tag;
        }

        public void setCreator_tag(String creator_tag) {
            this.creator_tag = creator_tag;
        }

        public String getCreator_desc() {
            return creator_desc;
        }

        public void setCreator_desc(String creator_desc) {
            this.creator_desc = creator_desc;
        }

        public String getCreator_level() {
            return creator_level;
        }

        public void setCreator_level(String creator_level) {
            this.creator_level = creator_level;
        }

        public String getCreator_auth_at() {
            return creator_auth_at;
        }

        public void setCreator_auth_at(String creator_auth_at) {
            this.creator_auth_at = creator_auth_at;
        }

        public int getCreator_auth_at_day() {
            return creator_auth_at_day;
        }

        public void setCreator_auth_at_day(int creator_auth_at_day) {
            this.creator_auth_at_day = creator_auth_at_day;
        }

        public int getIs_channel() {
            return is_channel;
        }

        public void setIs_channel(int is_channel) {
            this.is_channel = is_channel;
        }

        public String getAff_url_copy() {
            return aff_url_copy;
        }

        public void setAff_url_copy(String aff_url_copy) {
            this.aff_url_copy = aff_url_copy;
        }

        public String getAff_code() {
            return aff_code;
        }

        public void setAff_code(String aff_code) {
            this.aff_code = aff_code;
        }

        public String getAff_url() {
            return aff_url;
        }

        public void setAff_url(String aff_url) {
            this.aff_url = aff_url;
        }

        public int getClub_id() {
            return club_id;
        }

        public void setClub_id(int club_id) {
            this.club_id = club_id;
        }

        public CenterBean getCenter() {
            return center;
        }

        public void setCenter(CenterBean center) {
            this.center = center;
        }

        public CreatorCenterBean getCreator_center() {
            return creator_center;
        }

        public void setCreator_center(CreatorCenterBean creator_center) {
            this.creator_center = creator_center;
        }

        public List<?> getCreator_detail() {
            return creator_detail;
        }

        public void setCreator_detail(List<?> creator_detail) {
            this.creator_detail = creator_detail;
        }

        public List<TaskBean> getTask() {
            return task;
        }

        public void setTask(List<TaskBean> task) {
            this.task = task;
        }

        public List<SectionBean> getSection() {
            return section;
        }

        public void setSection(List<SectionBean> section) {
            this.section = section;
        }

        public static class CenterBean {
            /**
             * version : 1.3.1
             * url : https://ttt.tangbr.com/index/creator
             * tips : 升级优化更多功能~
             */

            private String version;
            private String url;
            private String tips;

            public String getVersion() {
                return version;
            }

            public void setVersion(String version) {
                this.version = version;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getTips() {
                return tips;
            }

            public void setTips(String tips) {
                this.tips = tips;
            }
        }

        public static class CreatorCenterBean {
            /**
             * win : {"version":"1.3.1","url":"https://download.trialv.com/tbr/tang.winnew1.3.1.zip","tips":"修复已知bug，完善体验,绿色安装免解压，更顺滑~"}
             * mac : {"version":"1.3.1","url":"https://download.trialv.com/tang.macnew1.3.1.dmg","tips":"修复已知bug，完善体验。"}
             */

            private WinBean win;
            private MacBean mac;

            public WinBean getWin() {
                return win;
            }

            public void setWin(WinBean win) {
                this.win = win;
            }

            public MacBean getMac() {
                return mac;
            }

            public void setMac(MacBean mac) {
                this.mac = mac;
            }

            public static class WinBean {
                /**
                 * version : 1.3.1
                 * url : https://download.trialv.com/tbr/tang.winnew1.3.1.zip
                 * tips : 修复已知bug，完善体验,绿色安装免解压，更顺滑~
                 */

                private String version;
                private String url;
                private String tips;

                public String getVersion() {
                    return version;
                }

                public void setVersion(String version) {
                    this.version = version;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getTips() {
                    return tips;
                }

                public void setTips(String tips) {
                    this.tips = tips;
                }
            }

            public static class MacBean {
                /**
                 * version : 1.3.1
                 * url : https://download.trialv.com/tang.macnew1.3.1.dmg
                 * tips : 修复已知bug，完善体验。
                 */

                private String version;
                private String url;
                private String tips;

                public String getVersion() {
                    return version;
                }

                public void setVersion(String version) {
                    this.version = version;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getTips() {
                    return tips;
                }

                public void setTips(String tips) {
                    this.tips = tips;
                }
            }
        }

        public static class TaskBean {
            /**
             * id : 3
             * title : 手机登录
             * desc : 免费看大鸟+1
             * category : global
             * type : times
             * value : 1
             * status : 1
             * start_time : null
             * end_time : null
             * img_url : null
             * created_at : 1576244052
             */

            private int id;
            private String title;
            private String desc;
            private String category;
            private String type;
            private String value;
            private int status;
            private Object start_time;
            private Object end_time;
            private Object img_url;
            private String created_at;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public Object getStart_time() {
                return start_time;
            }

            public void setStart_time(Object start_time) {
                this.start_time = start_time;
            }

            public Object getEnd_time() {
                return end_time;
            }

            public void setEnd_time(Object end_time) {
                this.end_time = end_time;
            }

            public Object getImg_url() {
                return img_url;
            }

            public void setImg_url(Object img_url) {
                this.img_url = img_url;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }
        }

        public static class SectionBean {
            /**
             * name : 我的消息
             * type : message
             * unread : 0
             */

            private String name;
            private String type;
            private int unread;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public int getUnread() {
                return unread;
            }

            public void setUnread(int unread) {
                this.unread = unread;
            }
        }
    }
}
