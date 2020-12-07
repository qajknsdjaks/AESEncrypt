package com.kldbj.ajks.app.bean;

import java.util.List;

public class JsonNanguaList {

    private List<ListBeanX> list;

    public List<ListBeanX> getList() {
        return list;
    }

    public void setList(List<ListBeanX> list) {
        this.list = list;
    }

    public static class ListBeanX {
        /**
         * pid : 3
         * tag : 0
         * type : 全球院线提前看
         * type_pic : https://storage.taifutj.com/admin/201911201749744new.jpg
         * parent_id : 24
         * p_type : 2
         * show_pid : 3
         * list : [{"vod_id":"151531","c_name":"冷血狂宴（爵迹2)","cf_name":"燃魂一战","c_pic":"https://storage.taifutj.com/admin/202012061406195new.jpg","parent_id":"24","vod_continu":"0","vod_douban_score":"4.0","t_id":"1","is_end":false},{"vod_id":"150834","c_name":"担保","cf_name":"好哭又好笑的亲情","c_pic":"https://storage.taifutj.com/admin/202012051541365new.jpg","parent_id":"24","vod_continu":"0","vod_douban_score":"7.8","t_id":"1","is_end":false},{"vod_id":"151434","c_name":"信条","cf_name":"\u201c信条\u201d一词是唯一的线索","c_pic":"https://storage.taifutj.com/admin/20201204215183new.jpg","parent_id":"24","vod_continu":"0","vod_douban_score":"7.7","t_id":"1","is_end":false},{"vod_id":"150800","c_name":"中国女排/夺冠","cf_name":"不止为冠军","c_pic":"https://storage.taifutj.com/admin/202011280157133new.jpg","parent_id":"24","vod_continu":"0","vod_douban_score":"7.4","t_id":3,"is_end":false}]
         * show_id : 7
         */

        private String pid;
        private String tag;
        private String type;
        private String type_pic;
        private String parent_id;
        private String p_type;
        private String show_pid;
        private String show_id;
        private List<ListBean> list;

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getType_pic() {
            return type_pic;
        }

        public void setType_pic(String type_pic) {
            this.type_pic = type_pic;
        }

        public String getParent_id() {
            return parent_id;
        }

        public void setParent_id(String parent_id) {
            this.parent_id = parent_id;
        }

        public String getP_type() {
            return p_type;
        }

        public void setP_type(String p_type) {
            this.p_type = p_type;
        }

        public String getShow_pid() {
            return show_pid;
        }

        public void setShow_pid(String show_pid) {
            this.show_pid = show_pid;
        }

        public String getShow_id() {
            return show_id;
        }

        public void setShow_id(String show_id) {
            this.show_id = show_id;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * vod_id : 151531
             * c_name : 冷血狂宴（爵迹2)
             * cf_name : 燃魂一战
             * c_pic : https://storage.taifutj.com/admin/202012061406195new.jpg
             * parent_id : 24
             * vod_continu : 0
             * vod_douban_score : 4.0
             * t_id : 1
             * is_end : false
             */

            private String vod_id;
            private String c_name;
            private String cf_name;
            private String c_pic;
            private String parent_id;
            private String vod_continu;
            private String vod_douban_score;
            private String t_id;
            private boolean is_end;

            public String getVod_id() {
                return vod_id;
            }

            public void setVod_id(String vod_id) {
                this.vod_id = vod_id;
            }

            public String getC_name() {
                return c_name;
            }

            public void setC_name(String c_name) {
                this.c_name = c_name;
            }

            public String getCf_name() {
                return cf_name;
            }

            public void setCf_name(String cf_name) {
                this.cf_name = cf_name;
            }

            public String getC_pic() {
                return c_pic;
            }

            public void setC_pic(String c_pic) {
                this.c_pic = c_pic;
            }

            public String getParent_id() {
                return parent_id;
            }

            public void setParent_id(String parent_id) {
                this.parent_id = parent_id;
            }

            public String getVod_continu() {
                return vod_continu;
            }

            public void setVod_continu(String vod_continu) {
                this.vod_continu = vod_continu;
            }

            public String getVod_douban_score() {
                return vod_douban_score;
            }

            public void setVod_douban_score(String vod_douban_score) {
                this.vod_douban_score = vod_douban_score;
            }

            public String getT_id() {
                return t_id;
            }

            public void setT_id(String t_id) {
                this.t_id = t_id;
            }

            public boolean isIs_end() {
                return is_end;
            }

            public void setIs_end(boolean is_end) {
                this.is_end = is_end;
            }
        }
    }
}
