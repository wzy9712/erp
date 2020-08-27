package com.wzy.dao;

import com.wzy.domain.Goods;
import com.wzy.domain.Input;
import java.util.List;

public interface InputDao {
    List<Input> inputSelect();
    void inputAdd(Goods goods);
}
