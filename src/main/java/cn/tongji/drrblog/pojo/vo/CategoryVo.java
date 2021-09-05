package cn.tongji.drrblog.pojo.vo;

import cn.tongji.drrblog.pojo.entity.CategoryEntity;


// 在数据库数据的基础上
public class CategoryVo extends CategoryEntity {

    private Long docNum;

    public Long getDocNum() {
        return docNum;
    }

    public void setDocNum(Long docNum) {
        this.docNum = docNum;
    }
}
