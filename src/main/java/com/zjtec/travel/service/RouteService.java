package com.zjtec.travel.service;

import com.zjtec.travel.domain.PageBean;
import com.zjtec.travel.domain.Route;
import com.zjtec.travel.domain.RouteImg;
import com.zjtec.travel.vo.RouteDetailVo;

import java.util.List;

public interface RouteService {
    /**
     * 分页查询
     * @param cid 分组ID
     * @param currentPage 当前页码
     * @param pageSize 每页大小
     * @return
     */
    PageBean<Route> pageQuery(int cid,int currentPage,int pageSize);
    //根据rid查询详情的方法
    RouteDetailVo findByRid(int rid);
    //根据rid查找相关商品图片
    List<RouteImg> findImgByRid(int rid);
}
