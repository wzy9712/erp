package com.wzy.service;

import com.wzy.domain.Goods;

import java.text.ParseException;
import java.util.List;

public interface GoodsService {
    List<Goods> goodsSelect();
    void goodsAdd(Goods goods) throws ParseException;
    void goodsReduce(Goods goods) throws ParseException;
}
