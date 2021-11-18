package cn.tongji.drrblog.pojo.entity;

import java.io.Serializable;


/**
 * FilterEntity 搜索过滤器
 */
public class FilterEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer categoryId;

    // 可以有多个Tag，目前是 && 的逻辑关系
    private Integer[] tagIds;

    private Integer num;

    private Integer offset;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer[] getTagIds() {
        return tagIds;
    }

    public void setTagIds(Integer[] tagIds) {
        this.tagIds = tagIds;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}
