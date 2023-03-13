package com.zjtec.travel.vo;


import com.zjtec.travel.domain.RouteImg;

import java.util.List;

public class RouteDetailVo{
    private int rid;
    private String rname;
    private int price;
    private String routeIntroduce;
    private int rflag;
    private String rdate;
    private int isThemeTour;
    private int count;
    private int cid;
    private String rimage;
    private int sid;
    private String sourceId;
    private String sname;
    private String consphone;
    private String address;
    private String cname;
    private List<RouteImg> list;

    public List<RouteImg> getList() {
        return list;
    }

    public void setList(List<RouteImg> list) {
        this.list = list;
    }

    public RouteDetailVo(int rid, String rname, int price, String routeIntroduce, int rflag, String rdate, int isThemeTour, int count, int cid, String rimage, int sid, String sourceId, String sname, String consphone, String address, String cname) {
        this.rid = rid;
        this.rname = rname;
        this.price = price;
        this.routeIntroduce = routeIntroduce;
        this.rflag = rflag;
        this.rdate = rdate;
        this.isThemeTour = isThemeTour;
        this.count = count;
        this.cid = cid;
        this.rimage = rimage;
        this.sid = sid;
        this.sourceId = sourceId;
        this.sname = sname;
        this.consphone = consphone;
        this.address = address;
        this.cname = cname;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRouteIntroduce() {
        return routeIntroduce;
    }

    public void setRouteIntroduce(String routeIntroduce) {
        this.routeIntroduce = routeIntroduce;
    }

    public int getRflag() {
        return rflag;
    }

    public void setRflag(int rflag) {
        this.rflag = rflag;
    }

    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
    }

    public int getIsThemeTour() {
        return isThemeTour;
    }

    public void setIsThemeTour(int isThemeTour) {
        this.isThemeTour = isThemeTour;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getRimage() {
        return rimage;
    }

    public void setRimage(String rimage) {
        this.rimage = rimage;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getConsphone() {
        return consphone;
    }

    public void setConsphone(String consphone) {
        this.consphone = consphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
