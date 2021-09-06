package cn.tongji.drrblog.pojo.vo;

import cn.tongji.drrblog.pojo.entity.TagEntity;

public class TagVo extends TagEntity {
    private Long docNum;

    public Long getDocNum() {
        return docNum;
    }

    public void setDocNum(Long docNum) {
        this.docNum = docNum;
    }
}
