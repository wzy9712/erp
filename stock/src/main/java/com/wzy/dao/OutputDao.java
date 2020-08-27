package com.wzy.dao;

import com.wzy.domain.Goods;
import com.wzy.domain.Output;

import java.util.List;

public interface OutputDao {
    List<Output> outputSelect();
    void outputAdd(Goods goods);
}
