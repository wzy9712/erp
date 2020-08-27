package com.wzy.controller;

import com.wzy.domain.Goods;
import com.wzy.excep.GoodsException;
import com.wzy.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Resource
    private GoodsService goodsService;
    @RequestMapping("/goodsSelect.do")
    @ResponseBody
    public List<Goods> goodsSelect(){
        List<Goods> goodsList = goodsService.goodsSelect();
        return goodsList;
    }
    @RequestMapping("/goodsAdd.do")
    public ModelAndView goodsAdd(Goods goods) throws ParseException {
        ModelAndView mv = new ModelAndView();
        if(goods.getUid() != 1 &&goods.getUid() != 2){
            throw new GoodsException();
        }
        goodsService.goodsAdd(goods);
        mv.setViewName("goodsSelect");
        return mv;
    }
    @RequestMapping("/goodsReduce.do")
    public ModelAndView goodsReduce(Goods goods) throws ParseException {
        ModelAndView mv = new ModelAndView();
        goodsService.goodsReduce(goods);
        mv.setViewName("goodsSelect");
        return mv;
    }
}
