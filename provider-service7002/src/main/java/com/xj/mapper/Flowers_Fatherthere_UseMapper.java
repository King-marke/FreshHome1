package com.xj.mapper;

/*
* 用途表mapper
* */
import com.xj.pojo.FlowersFatherthereUse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Flowers_Fatherthere_UseMapper {

    //查询首页鲜花用途（前六条）
    public List<FlowersFatherthereUse> selectAll();



}
