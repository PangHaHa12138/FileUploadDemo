package com.panghaha.it.fileuploaddemo;


import java.util.List;

/**
 * Created by pang on 2017/4/1.
 *  获取任务详情
 */
public class Data_huoqurenwuxiangqing {


    /**
     * taskid : 329700ebceaa4aa69b64f549886edc7d
     * cuserid : d35558c810fd4b9ea3b7482af39ad51d
     * taskname : 测试附件1319
     * yendtime : 2017-05-26
     * sendtime : null
     * createtime : 2017-05-23
     * updatetime : null
     * ptaskid : null
     * taskstatus : 3
     * tasktype : 1
     * deleted : null
     * newsCount : 1
     * taskCycle : null
     * taskcontent : 测试附件
     * cusername : 战乃国
     * listAcc : [{"accid":102,"taskid":"329700ebceaa4aa69b64f549886edc7d","userid":"f8d95cf3a35e412099b333e1cd32f850","fileName":"附件_20170523132013.png","fileadress":null,"fileaddressdown":"http://123.56.97.229/upload/2017051431320206/附件_20170523132013.png","assid":"-1","creatime":"2017-05-23 13:20:15.0","username":"秦自勉"}]
     * myscores : 0
     * childcount : 1
     * childs : [{"taskid":"43074a7a1bd54bf0a228395fb8ec1eee","execount":0,"cuserid":"f8d95cf3a35e412099b333e1cd32f850","cusername":"秦自勉","taskname":"测试附件1319","yendtime":"2017-05-23","sendtime":"2017-05-23","createtime":"2017-05-23 13:25:01.0","publishTime":null,"taskcontent":null,"taskstatus":3,"tasklevel":4,"taskcycle":null,"cycletype":0,"tasktype":1,"childcount":0,"progress":0,"score":0,"assessed":0,"accepted":1,"executors":null,"from":1,"imageUrl":"","timeInfo":"","updateTime":null,"updatetime":null,"zi":["庞世宇"],"readed":0,"stick":0}]
     * patentcount : 0
     * patenttask : null
     * score : 0
     * assessed : 0
     * accepted : 1
     * progress : 100
     * list : [{"userid":"f8d95cf3a35e412099b333e1cd32f850","taskid":null,"cusername":"秦自勉","progress":100,"status":1,"reason":"测试附件","score":0,"imageurl":"http://123.56.97.229/upload/2017051251145655.png"}]
     * chileList : {"43074a7a1bd54bf0a228395fb8ec1eee":["庞世宇"]}
     * userprogresslist : []
     * level : 4
     * from : 1
     * cycle : 0
     * imageUrl : http://123.56.97.229/upload/2017051251145655.png
     */

    private String taskid;
    private String cuserid;
    private String taskname;
    private String yendtime;
    private Object sendtime;
    private String createtime;
    private Object updatetime;
    private Object ptaskid;
    private int taskstatus;
    private int tasktype;
    private Object deleted;
    private String newsCount;
    private Object taskCycle;
    private String taskcontent;
    private String cusername;
    private int myscores;
    private int childcount;
    private int patentcount;
    private Object patenttask;
    private int score;
    private int assessed;
    private int accepted;
    private int progress;
    private ChileListBean chileList;
    private int level;
    private int from;
    private String cycle;
    private String imageUrl;
    private List<ListAccBean> listAcc;
    private List<ChildsBean> childs;
    private List<ListBean> list;
    private List<?> userprogresslist;

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    public String getCuserid() {
        return cuserid;
    }

    public void setCuserid(String cuserid) {
        this.cuserid = cuserid;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getYendtime() {
        return yendtime;
    }

    public void setYendtime(String yendtime) {
        this.yendtime = yendtime;
    }

    public Object getSendtime() {
        return sendtime;
    }

    public void setSendtime(Object sendtime) {
        this.sendtime = sendtime;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public Object getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Object updatetime) {
        this.updatetime = updatetime;
    }

    public Object getPtaskid() {
        return ptaskid;
    }

    public void setPtaskid(Object ptaskid) {
        this.ptaskid = ptaskid;
    }

    public int getTaskstatus() {
        return taskstatus;
    }

    public void setTaskstatus(int taskstatus) {
        this.taskstatus = taskstatus;
    }

    public int getTasktype() {
        return tasktype;
    }

    public void setTasktype(int tasktype) {
        this.tasktype = tasktype;
    }

    public Object getDeleted() {
        return deleted;
    }

    public void setDeleted(Object deleted) {
        this.deleted = deleted;
    }

    public String getNewsCount() {
        return newsCount;
    }

    public void setNewsCount(String newsCount) {
        this.newsCount = newsCount;
    }

    public Object getTaskCycle() {
        return taskCycle;
    }

    public void setTaskCycle(Object taskCycle) {
        this.taskCycle = taskCycle;
    }

    public String getTaskcontent() {
        return taskcontent;
    }

    public void setTaskcontent(String taskcontent) {
        this.taskcontent = taskcontent;
    }

    public String getCusername() {
        return cusername;
    }

    public void setCusername(String cusername) {
        this.cusername = cusername;
    }

    public int getMyscores() {
        return myscores;
    }

    public void setMyscores(int myscores) {
        this.myscores = myscores;
    }

    public int getChildcount() {
        return childcount;
    }

    public void setChildcount(int childcount) {
        this.childcount = childcount;
    }

    public int getPatentcount() {
        return patentcount;
    }

    public void setPatentcount(int patentcount) {
        this.patentcount = patentcount;
    }

    public Object getPatenttask() {
        return patenttask;
    }

    public void setPatenttask(Object patenttask) {
        this.patenttask = patenttask;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getAssessed() {
        return assessed;
    }

    public void setAssessed(int assessed) {
        this.assessed = assessed;
    }

    public int getAccepted() {
        return accepted;
    }

    public void setAccepted(int accepted) {
        this.accepted = accepted;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public ChileListBean getChileList() {
        return chileList;
    }

    public void setChileList(ChileListBean chileList) {
        this.chileList = chileList;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<ListAccBean> getListAcc() {
        return listAcc;
    }

    public void setListAcc(List<ListAccBean> listAcc) {
        this.listAcc = listAcc;
    }

    public List<ChildsBean> getChilds() {
        return childs;
    }

    public void setChilds(List<ChildsBean> childs) {
        this.childs = childs;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public List<?> getUserprogresslist() {
        return userprogresslist;
    }

    public void setUserprogresslist(List<?> userprogresslist) {
        this.userprogresslist = userprogresslist;
    }

    public static class ChileListBean {
//        @SerializedName("43074a7a1bd54bf0a228395fb8ec1eee")
        private List<String> _$43074a7a1bd54bf0a228395fb8ec1eee;

        public List<String> get_$43074a7a1bd54bf0a228395fb8ec1eee() {
            return _$43074a7a1bd54bf0a228395fb8ec1eee;
        }

        public void set_$43074a7a1bd54bf0a228395fb8ec1eee(List<String> _$43074a7a1bd54bf0a228395fb8ec1eee) {
            this._$43074a7a1bd54bf0a228395fb8ec1eee = _$43074a7a1bd54bf0a228395fb8ec1eee;
        }
    }

    public static class ListAccBean {
        /**
         * accid : 102
         * taskid : 329700ebceaa4aa69b64f549886edc7d
         * userid : f8d95cf3a35e412099b333e1cd32f850
         * fileName : 附件_20170523132013.png
         * fileadress : null
         * fileaddressdown : http://123.56.97.229/upload/2017051431320206/附件_20170523132013.png
         * assid : -1
         * creatime : 2017-05-23 13:20:15.0
         * username : 秦自勉
         */

        private int accid;
        private String taskid;
        private String userid;
        private String fileName;
        private Object fileadress;
        private String fileaddressdown;
        private String assid;
        private String creatime;
        private String username;

        public int getAccid() {
            return accid;
        }

        public void setAccid(int accid) {
            this.accid = accid;
        }

        public String getTaskid() {
            return taskid;
        }

        public void setTaskid(String taskid) {
            this.taskid = taskid;
        }

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public Object getFileadress() {
            return fileadress;
        }

        public void setFileadress(Object fileadress) {
            this.fileadress = fileadress;
        }

        public String getFileaddressdown() {
            return fileaddressdown;
        }

        public void setFileaddressdown(String fileaddressdown) {
            this.fileaddressdown = fileaddressdown;
        }

        public String getAssid() {
            return assid;
        }

        public void setAssid(String assid) {
            this.assid = assid;
        }

        public String getCreatime() {
            return creatime;
        }

        public void setCreatime(String creatime) {
            this.creatime = creatime;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }

    public static class ChildsBean {
        /**
         * taskid : 43074a7a1bd54bf0a228395fb8ec1eee
         * execount : 0
         * cuserid : f8d95cf3a35e412099b333e1cd32f850
         * cusername : 秦自勉
         * taskname : 测试附件1319
         * yendtime : 2017-05-23
         * sendtime : 2017-05-23
         * createtime : 2017-05-23 13:25:01.0
         * publishTime : null
         * taskcontent : null
         * taskstatus : 3
         * tasklevel : 4
         * taskcycle : null
         * cycletype : 0
         * tasktype : 1
         * childcount : 0
         * progress : 0
         * score : 0
         * assessed : 0
         * accepted : 1
         * executors : null
         * from : 1
         * imageUrl :
         * timeInfo :
         * updateTime : null
         * updatetime : null
         * zi : ["庞世宇"]
         * readed : 0
         * stick : 0
         */

        private String taskid;
        private int execount;
        private String cuserid;
        private String cusername;
        private String taskname;
        private String yendtime;
        private String sendtime;
        private String createtime;
        private Object publishTime;
        private Object taskcontent;
        private int taskstatus;
        private int tasklevel;
        private Object taskcycle;
        private int cycletype;
        private int tasktype;
        private int childcount;
        private int progress;
        private int score;
        private int assessed;
        private int accepted;
        private Object executors;
        private int from;
        private String imageUrl;
        private String timeInfo;
        private Object updateTime;
        private Object updatetime;
        private int readed;
        private int stick;
        private List<String> zi;

        public String getTaskid() {
            return taskid;
        }

        public void setTaskid(String taskid) {
            this.taskid = taskid;
        }

        public int getExecount() {
            return execount;
        }

        public void setExecount(int execount) {
            this.execount = execount;
        }

        public String getCuserid() {
            return cuserid;
        }

        public void setCuserid(String cuserid) {
            this.cuserid = cuserid;
        }

        public String getCusername() {
            return cusername;
        }

        public void setCusername(String cusername) {
            this.cusername = cusername;
        }

        public String getTaskname() {
            return taskname;
        }

        public void setTaskname(String taskname) {
            this.taskname = taskname;
        }

        public String getYendtime() {
            return yendtime;
        }

        public void setYendtime(String yendtime) {
            this.yendtime = yendtime;
        }

        public String getSendtime() {
            return sendtime;
        }

        public void setSendtime(String sendtime) {
            this.sendtime = sendtime;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public Object getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(Object publishTime) {
            this.publishTime = publishTime;
        }

        public Object getTaskcontent() {
            return taskcontent;
        }

        public void setTaskcontent(Object taskcontent) {
            this.taskcontent = taskcontent;
        }

        public int getTaskstatus() {
            return taskstatus;
        }

        public void setTaskstatus(int taskstatus) {
            this.taskstatus = taskstatus;
        }

        public int getTasklevel() {
            return tasklevel;
        }

        public void setTasklevel(int tasklevel) {
            this.tasklevel = tasklevel;
        }

        public Object getTaskcycle() {
            return taskcycle;
        }

        public void setTaskcycle(Object taskcycle) {
            this.taskcycle = taskcycle;
        }

        public int getCycletype() {
            return cycletype;
        }

        public void setCycletype(int cycletype) {
            this.cycletype = cycletype;
        }

        public int getTasktype() {
            return tasktype;
        }

        public void setTasktype(int tasktype) {
            this.tasktype = tasktype;
        }

        public int getChildcount() {
            return childcount;
        }

        public void setChildcount(int childcount) {
            this.childcount = childcount;
        }

        public int getProgress() {
            return progress;
        }

        public void setProgress(int progress) {
            this.progress = progress;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getAssessed() {
            return assessed;
        }

        public void setAssessed(int assessed) {
            this.assessed = assessed;
        }

        public int getAccepted() {
            return accepted;
        }

        public void setAccepted(int accepted) {
            this.accepted = accepted;
        }

        public Object getExecutors() {
            return executors;
        }

        public void setExecutors(Object executors) {
            this.executors = executors;
        }

        public int getFrom() {
            return from;
        }

        public void setFrom(int from) {
            this.from = from;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getTimeInfo() {
            return timeInfo;
        }

        public void setTimeInfo(String timeInfo) {
            this.timeInfo = timeInfo;
        }

        public Object getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Object updateTime) {
            this.updateTime = updateTime;
        }

        public Object getUpdatetime() {
            return updatetime;
        }

        public void setUpdatetime(Object updatetime) {
            this.updatetime = updatetime;
        }

        public int getReaded() {
            return readed;
        }

        public void setReaded(int readed) {
            this.readed = readed;
        }

        public int getStick() {
            return stick;
        }

        public void setStick(int stick) {
            this.stick = stick;
        }

        public List<String> getZi() {
            return zi;
        }

        public void setZi(List<String> zi) {
            this.zi = zi;
        }
    }

    public static class ListBean {
        /**
         * userid : f8d95cf3a35e412099b333e1cd32f850
         * taskid : null
         * cusername : 秦自勉
         * progress : 100
         * status : 1
         * reason : 测试附件
         * score : 0
         * imageurl : http://123.56.97.229/upload/2017051251145655.png
         */

        private String userid;
        private Object taskid;
        private String cusername;
        private int progress;
        private int status;
        private String reason;
        private int score;
        private String imageurl;

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public Object getTaskid() {
            return taskid;
        }

        public void setTaskid(Object taskid) {
            this.taskid = taskid;
        }

        public String getCusername() {
            return cusername;
        }

        public void setCusername(String cusername) {
            this.cusername = cusername;
        }

        public int getProgress() {
            return progress;
        }

        public void setProgress(int progress) {
            this.progress = progress;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public String getImageurl() {
            return imageurl;
        }

        public void setImageurl(String imageurl) {
            this.imageurl = imageurl;
        }
    }
}
