package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

import java.util.List;

public class Weather extends DataSupport {

    private List<HeWeather6Bean> HeWeather6;

    public List<HeWeather6Bean> getHeWeather6() {
        return HeWeather6;
    }

    public void setHeWeather6(List<HeWeather6Bean> HeWeather6) {
        this.HeWeather6 = HeWeather6;
    }

    public static class HeWeather6Bean {
        /**
         * basic : {"cid":"CN101010100","location":"北京","parent_city":"北京","admin_area":"北京","cnty":"中国","lat":"39.90498734","lon":"116.4052887","tz":"+8.00"}
         * update : {"loc":"2019-03-24 10:55","utc":"2019-03-24 02:55"}
         * status : ok
         * now : {"cloud":"0","cond_code":"100","cond_txt":"晴","fl":"9","hum":"16","pcpn":"0.0","pres":"1016","tmp":"12","vis":"15","wind_deg":"271","wind_dir":"西风","wind_sc":"2","wind_spd":"8"}
         * daily_forecast : [{"cond_code_d":"100","cond_code_n":"100","cond_txt_d":"晴","cond_txt_n":"晴","date":"2019-03-24","hum":"18","mr":"22:14","ms":"08:18","pcpn":"0.0","pop":"0","pres":"1006","sr":"06:10","ss":"18:31","tmp_max":"19","tmp_min":"4","uv_index":"5","vis":"25","wind_deg":"204","wind_dir":"西南风","wind_sc":"3-4","wind_spd":"14"},{"cond_code_d":"100","cond_code_n":"100","cond_txt_d":"晴","cond_txt_n":"晴","date":"2019-03-25","hum":"27","mr":"23:20","ms":"08:54","pcpn":"0.0","pop":"0","pres":"1012","sr":"06:08","ss":"18:32","tmp_max":"21","tmp_min":"5","uv_index":"5","vis":"25","wind_deg":"231","wind_dir":"西南风","wind_sc":"1-2","wind_spd":"4"},{"cond_code_d":"100","cond_code_n":"100","cond_txt_d":"晴","cond_txt_n":"晴","date":"2019-03-26","hum":"41","mr":"00:00","ms":"09:33","pcpn":"0.0","pop":"0","pres":"1007","sr":"06:06","ss":"18:33","tmp_max":"19","tmp_min":"4","uv_index":"5","vis":"25","wind_deg":"104","wind_dir":"东南风","wind_sc":"1-2","wind_spd":"2"},{"cond_code_d":"100","cond_code_n":"100","cond_txt_d":"晴","cond_txt_n":"晴","date":"2019-03-27","hum":"20","mr":"00:22","ms":"10:16","pcpn":"0.0","pop":"0","pres":"1018","sr":"06:05","ss":"18:34","tmp_max":"22","tmp_min":"4","uv_index":"6","vis":"25","wind_deg":"298","wind_dir":"西北风","wind_sc":"3-4","wind_spd":"15"},{"cond_code_d":"100","cond_code_n":"101","cond_txt_d":"晴","cond_txt_n":"多云","date":"2019-03-28","hum":"16","mr":"01:20","ms":"11:03","pcpn":"0.0","pop":"25","pres":"1006","sr":"06:03","ss":"18:35","tmp_max":"15","tmp_min":"4","uv_index":"6","vis":"25","wind_deg":"205","wind_dir":"西南风","wind_sc":"1-2","wind_spd":"2"},{"cond_code_d":"101","cond_code_n":"101","cond_txt_d":"多云","cond_txt_n":"多云","date":"2019-03-29","hum":"34","mr":"02:11","ms":"11:53","pcpn":"0.0","pop":"25","pres":"1005","sr":"06:02","ss":"18:36","tmp_max":"15","tmp_min":"3","uv_index":"5","vis":"16","wind_deg":"179","wind_dir":"南风","wind_sc":"1-2","wind_spd":"8"},{"cond_code_d":"100","cond_code_n":"101","cond_txt_d":"晴","cond_txt_n":"多云","date":"2019-03-30","hum":"18","mr":"02:57","ms":"12:46","pcpn":"0.0","pop":"0","pres":"1018","sr":"06:00","ss":"18:37","tmp_max":"16","tmp_min":"4","uv_index":"6","vis":"25","wind_deg":"177","wind_dir":"南风","wind_sc":"1-2","wind_spd":"3"}]
         * hourly : [{"cloud":"0","cond_code":"100","cond_txt":"晴","dew":"-13","hum":"23","pop":"0","pres":"1007","time":"2019-03-24 13:00","tmp":"16","wind_deg":"230","wind_dir":"西南风","wind_sc":"3-4","wind_spd":"14"},{"cloud":"0","cond_code":"100","cond_txt":"晴","dew":"-11","hum":"18","pop":"0","pres":"1008","time":"2019-03-24 16:00","tmp":"19","wind_deg":"263","wind_dir":"西风","wind_sc":"3-4","wind_spd":"24"},{"cloud":"0","cond_code":"100","cond_txt":"晴","dew":"-13","hum":"23","pop":"0","pres":"1008","time":"2019-03-24 19:00","tmp":"13","wind_deg":"268","wind_dir":"西风","wind_sc":"1-2","wind_spd":"7"},{"cloud":"0","cond_code":"100","cond_txt":"晴","dew":"-9","hum":"36","pop":"0","pres":"1006","time":"2019-03-24 22:00","tmp":"11","wind_deg":"260","wind_dir":"西风","wind_sc":"1-2","wind_spd":"6"},{"cloud":"0","cond_code":"100","cond_txt":"晴","dew":"-11","hum":"48","pop":"0","pres":"1007","time":"2019-03-25 01:00","tmp":"9","wind_deg":"264","wind_dir":"西风","wind_sc":"1-2","wind_spd":"5"},{"cloud":"0","cond_code":"100","cond_txt":"晴","dew":"-14","hum":"54","pop":"0","pres":"1010","time":"2019-03-25 04:00","tmp":"5","wind_deg":"267","wind_dir":"西风","wind_sc":"1-2","wind_spd":"9"},{"cloud":"0","cond_code":"100","cond_txt":"晴","dew":"-11","hum":"46","pop":"0","pres":"1009","time":"2019-03-25 07:00","tmp":"6","wind_deg":"279","wind_dir":"西风","wind_sc":"1-2","wind_spd":"8"},{"cloud":"0","cond_code":"100","cond_txt":"晴","dew":"-12","hum":"31","pop":"0","pres":"1005","time":"2019-03-25 10:00","tmp":"12","wind_deg":"242","wind_dir":"西南风","wind_sc":"1-2","wind_spd":"4"}]
         * lifestyle : [{"type":"comf","brf":"舒适","txt":"白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。"},{"type":"drsg","brf":"较舒适","txt":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"},{"type":"flu","brf":"较易发","txt":"昼夜温差较大，较易发生感冒，请适当增减衣服。体质较弱的朋友请注意防护。"},{"type":"sport","brf":"较适宜","txt":"天气较好，但因风力稍强，户外可选择对风力要求不高的运动，推荐您进行室内运动。"},{"type":"trav","brf":"适宜","txt":"天气较好，风稍大，但温度适宜，是个好天气哦。适宜旅游，您可以尽情地享受大自然的无限风光。"},{"type":"uv","brf":"中等","txt":"属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"},{"type":"cw","brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"},{"type":"air","brf":"良","txt":"气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"}]
         */

        private BasicBean basic;
        private UpdateBean update;
        private String status;
        private NowBean now;
        private List<DailyForecastBean> daily_forecast;
        private List<HourlyBean> hourly;
        private List<LifestyleBean> lifestyle;

        public BasicBean getBasic() {
            return basic;
        }

        public void setBasic(BasicBean basic) {
            this.basic = basic;
        }

        public UpdateBean getUpdate() {
            return update;
        }

        public void setUpdate(UpdateBean update) {
            this.update = update;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public NowBean getNow() {
            return now;
        }

        public void setNow(NowBean now) {
            this.now = now;
        }

        public List<DailyForecastBean> getDaily_forecast() {
            return daily_forecast;
        }

        public void setDaily_forecast(List<DailyForecastBean> daily_forecast) {
            this.daily_forecast = daily_forecast;
        }

        public List<HourlyBean> getHourly() {
            return hourly;
        }

        public void setHourly(List<HourlyBean> hourly) {
            this.hourly = hourly;
        }

        public List<LifestyleBean> getLifestyle() {
            return lifestyle;
        }

        public void setLifestyle(List<LifestyleBean> lifestyle) {
            this.lifestyle = lifestyle;
        }

        public static class BasicBean {
            /**
             * cid : CN101010100
             * location : 北京
             * parent_city : 北京
             * admin_area : 北京
             * cnty : 中国
             * lat : 39.90498734
             * lon : 116.4052887
             * tz : +8.00
             */

            private String cid;
            private String location;
            private String parent_city;
            private String admin_area;
            private String cnty;
            private String lat;
            private String lon;
            private String tz;

            public String getCid() {
                return cid;
            }

            public void setCid(String cid) {
                this.cid = cid;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public String getParent_city() {
                return parent_city;
            }

            public void setParent_city(String parent_city) {
                this.parent_city = parent_city;
            }

            public String getAdmin_area() {
                return admin_area;
            }

            public void setAdmin_area(String admin_area) {
                this.admin_area = admin_area;
            }

            public String getCnty() {
                return cnty;
            }

            public void setCnty(String cnty) {
                this.cnty = cnty;
            }

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public String getLon() {
                return lon;
            }

            public void setLon(String lon) {
                this.lon = lon;
            }

            public String getTz() {
                return tz;
            }

            public void setTz(String tz) {
                this.tz = tz;
            }
        }

        public static class UpdateBean {
            /**
             * loc : 2019-03-24 10:55
             * utc : 2019-03-24 02:55
             */

            private String loc;
            private String utc;

            public String getLoc() {
                return loc;
            }

            public void setLoc(String loc) {
                this.loc = loc;
            }

            public String getUtc() {
                return utc;
            }

            public void setUtc(String utc) {
                this.utc = utc;
            }
        }

        public static class NowBean {
            /**
             * cloud : 0
             * cond_code : 100
             * cond_txt : 晴
             * fl : 9
             * hum : 16
             * pcpn : 0.0
             * pres : 1016
             * tmp : 12
             * vis : 15
             * wind_deg : 271
             * wind_dir : 西风
             * wind_sc : 2
             * wind_spd : 8
             */

            private String cloud;
            private String cond_code;
            private String cond_txt;
            private String fl;
            private String hum;
            private String pcpn;
            private String pres;
            private String tmp;
            private String vis;
            private String wind_deg;
            private String wind_dir;
            private String wind_sc;
            private String wind_spd;

            public String getCloud() {
                return cloud;
            }

            public void setCloud(String cloud) {
                this.cloud = cloud;
            }

            public String getCond_code() {
                return cond_code;
            }

            public void setCond_code(String cond_code) {
                this.cond_code = cond_code;
            }

            public String getCond_txt() {
                return cond_txt;
            }

            public void setCond_txt(String cond_txt) {
                this.cond_txt = cond_txt;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getPcpn() {
                return pcpn;
            }

            public void setPcpn(String pcpn) {
                this.pcpn = pcpn;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getTmp() {
                return tmp;
            }

            public void setTmp(String tmp) {
                this.tmp = tmp;
            }

            public String getVis() {
                return vis;
            }

            public void setVis(String vis) {
                this.vis = vis;
            }

            public String getWind_deg() {
                return wind_deg;
            }

            public void setWind_deg(String wind_deg) {
                this.wind_deg = wind_deg;
            }

            public String getWind_dir() {
                return wind_dir;
            }

            public void setWind_dir(String wind_dir) {
                this.wind_dir = wind_dir;
            }

            public String getWind_sc() {
                return wind_sc;
            }

            public void setWind_sc(String wind_sc) {
                this.wind_sc = wind_sc;
            }

            public String getWind_spd() {
                return wind_spd;
            }

            public void setWind_spd(String wind_spd) {
                this.wind_spd = wind_spd;
            }
        }

        public static class DailyForecastBean {
            /**
             * cond_code_d : 100
             * cond_code_n : 100
             * cond_txt_d : 晴
             * cond_txt_n : 晴
             * date : 2019-03-24
             * hum : 18
             * mr : 22:14
             * ms : 08:18
             * pcpn : 0.0
             * pop : 0
             * pres : 1006
             * sr : 06:10
             * ss : 18:31
             * tmp_max : 19
             * tmp_min : 4
             * uv_index : 5
             * vis : 25
             * wind_deg : 204
             * wind_dir : 西南风
             * wind_sc : 3-4
             * wind_spd : 14
             */

            private String cond_code_d;
            private String cond_code_n;
            private String cond_txt_d;
            private String cond_txt_n;
            private String date;
            private String hum;
            private String mr;
            private String ms;
            private String pcpn;
            private String pop;
            private String pres;
            private String sr;
            private String ss;
            private String tmp_max;
            private String tmp_min;
            private String uv_index;
            private String vis;
            private String wind_deg;
            private String wind_dir;
            private String wind_sc;
            private String wind_spd;

            public String getCond_code_d() {
                return cond_code_d;
            }

            public void setCond_code_d(String cond_code_d) {
                this.cond_code_d = cond_code_d;
            }

            public String getCond_code_n() {
                return cond_code_n;
            }

            public void setCond_code_n(String cond_code_n) {
                this.cond_code_n = cond_code_n;
            }

            public String getCond_txt_d() {
                return cond_txt_d;
            }

            public void setCond_txt_d(String cond_txt_d) {
                this.cond_txt_d = cond_txt_d;
            }

            public String getCond_txt_n() {
                return cond_txt_n;
            }

            public void setCond_txt_n(String cond_txt_n) {
                this.cond_txt_n = cond_txt_n;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getMr() {
                return mr;
            }

            public void setMr(String mr) {
                this.mr = mr;
            }

            public String getMs() {
                return ms;
            }

            public void setMs(String ms) {
                this.ms = ms;
            }

            public String getPcpn() {
                return pcpn;
            }

            public void setPcpn(String pcpn) {
                this.pcpn = pcpn;
            }

            public String getPop() {
                return pop;
            }

            public void setPop(String pop) {
                this.pop = pop;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getSr() {
                return sr;
            }

            public void setSr(String sr) {
                this.sr = sr;
            }

            public String getSs() {
                return ss;
            }

            public void setSs(String ss) {
                this.ss = ss;
            }

            public String getTmp_max() {
                return tmp_max;
            }

            public void setTmp_max(String tmp_max) {
                this.tmp_max = tmp_max;
            }

            public String getTmp_min() {
                return tmp_min;
            }

            public void setTmp_min(String tmp_min) {
                this.tmp_min = tmp_min;
            }

            public String getUv_index() {
                return uv_index;
            }

            public void setUv_index(String uv_index) {
                this.uv_index = uv_index;
            }

            public String getVis() {
                return vis;
            }

            public void setVis(String vis) {
                this.vis = vis;
            }

            public String getWind_deg() {
                return wind_deg;
            }

            public void setWind_deg(String wind_deg) {
                this.wind_deg = wind_deg;
            }

            public String getWind_dir() {
                return wind_dir;
            }

            public void setWind_dir(String wind_dir) {
                this.wind_dir = wind_dir;
            }

            public String getWind_sc() {
                return wind_sc;
            }

            public void setWind_sc(String wind_sc) {
                this.wind_sc = wind_sc;
            }

            public String getWind_spd() {
                return wind_spd;
            }

            public void setWind_spd(String wind_spd) {
                this.wind_spd = wind_spd;
            }
        }

        public static class HourlyBean {
            /**
             * cloud : 0
             * cond_code : 100
             * cond_txt : 晴
             * dew : -13
             * hum : 23
             * pop : 0
             * pres : 1007
             * time : 2019-03-24 13:00
             * tmp : 16
             * wind_deg : 230
             * wind_dir : 西南风
             * wind_sc : 3-4
             * wind_spd : 14
             */

            private String cloud;
            private String cond_code;
            private String cond_txt;
            private String dew;
            private String hum;
            private String pop;
            private String pres;
            private String time;
            private String tmp;
            private String wind_deg;
            private String wind_dir;
            private String wind_sc;
            private String wind_spd;

            public String getCloud() {
                return cloud;
            }

            public void setCloud(String cloud) {
                this.cloud = cloud;
            }

            public String getCond_code() {
                return cond_code;
            }

            public void setCond_code(String cond_code) {
                this.cond_code = cond_code;
            }

            public String getCond_txt() {
                return cond_txt;
            }

            public void setCond_txt(String cond_txt) {
                this.cond_txt = cond_txt;
            }

            public String getDew() {
                return dew;
            }

            public void setDew(String dew) {
                this.dew = dew;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getPop() {
                return pop;
            }

            public void setPop(String pop) {
                this.pop = pop;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getTmp() {
                return tmp;
            }

            public void setTmp(String tmp) {
                this.tmp = tmp;
            }

            public String getWind_deg() {
                return wind_deg;
            }

            public void setWind_deg(String wind_deg) {
                this.wind_deg = wind_deg;
            }

            public String getWind_dir() {
                return wind_dir;
            }

            public void setWind_dir(String wind_dir) {
                this.wind_dir = wind_dir;
            }

            public String getWind_sc() {
                return wind_sc;
            }

            public void setWind_sc(String wind_sc) {
                this.wind_sc = wind_sc;
            }

            public String getWind_spd() {
                return wind_spd;
            }

            public void setWind_spd(String wind_spd) {
                this.wind_spd = wind_spd;
            }
        }

        public static class LifestyleBean {
            /**
             * type : comf
             * brf : 舒适
             * txt : 白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。
             */

            private String type;
            private String brf;
            private String txt;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }
    }
}
