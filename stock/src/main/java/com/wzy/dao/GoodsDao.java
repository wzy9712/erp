package com.wzy.dao;

import com.wzy.domain.Goods;

import java.util.List;

public interface GoodsDao {

     List<Goods> goodsSelect();
     void goodsAdd(Goods goods);
     void goodsReduce(Goods goods);
     int goodsUidAdd(Goods goods);
}