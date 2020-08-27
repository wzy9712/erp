package com.wzy.service.impl;

import com.wzy.dao.GoodsDao;
import com.wzy.dao.InputDao;
import com.wzy.dao.OutputDao;
import com.wzy.domain.Goods;
import com.wzy.service.GoodsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsDao goodsDao;
    @Resource
    private InputDao inputDao;
    @Resource
    private OutputDao outputDao;

    @Override
    public List<Goods> goodsSelect() {
        List<Goods> goodsList = goodsDao.goodsSelect();
        return goodsList;
    }

    @Transactional
    @Override
    public void goodsAdd(Goods goods) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        goods.setDate(sdf.parse(sdf.format(date)));
        goodsDao.goodsAdd(goods);
        inputDao.inputAdd(goods);
    }
    @Transactional
    @Override
    public void goodsReduce(Goods goods) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        goods.setDate(sdf.parse(sdf.format(date)));
        goodsDao.goodsReduce(goods);
        outputDao.outputAdd(goods);
    }
}
