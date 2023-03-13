package com.zjtec.travel.controller;

import com.zjtec.travel.domain.PageBean;
import com.zjtec.travel.domain.Route;
import com.zjtec.travel.service.RouteService;
import com.zjtec.travel.vo.ResMsg;
import com.zjtec.travel.vo.RouteDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/route")
public class RouteController {

  @Autowired
  private RouteService routeService;

  @RequestMapping("/pageQuery")
  @ResponseBody
  public PageBean<Route> pageQuery(@RequestParam("cid") Integer cid,@RequestParam(value="pageSize",required = false) Integer pageSize,@RequestParam(value="currentPage",required = false) Integer currentPage){
    //pageQuery 功能
    if (currentPage == null){
      currentPage = 1;
    }
    if (pageSize == null){
      pageSize = 5;
    }
    PageBean<Route> pageQuery = routeService.pageQuery(cid, currentPage, pageSize);
    return pageQuery;
  }

  @RequestMapping("/detail")
  @ResponseBody
  public ResMsg findDetail(Integer rid){
    ResMsg msg = new ResMsg();
    //判断是否为空
    if (rid != null){
      //设置状态码和信息
      RouteDetailVo vo = routeService.findByRid(rid);
      //将查询到的图片装进vo
      vo.setList(routeService.findImgByRid(rid));
      msg.setResult(vo);
    }else {
      msg.setErrcode("1");
      msg.setErrmsg("查询不到相关路线信息");
    }
    return msg;
  }
}
