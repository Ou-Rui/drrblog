package cn.tongji.drrblog.pojo.vo;

import cn.tongji.drrblog.pojo.entity.DocEntity;
import cn.tongji.drrblog.pojo.item.CategoryItem;
import cn.tongji.drrblog.pojo.item.TagItem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DocVo {

    private Long id;            // 文章ID 主键

    private String title;       // 标题

    private String summary;     // 摘要

    private CategoryItem categoryItem;  // 分类

    private ArrayList<TagItem> tagItems;         // 标签

    private String content;     // 内容.txt

    private String contentHtml; // 内容.html

    private Date createTime;    // 创建时间

    private Date updateTime;    // 更新时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public CategoryItem getCategoryItem() {
        return categoryItem;
    }

    public void setCategoryItem(CategoryItem categoryItem) {
        this.categoryItem = categoryItem;
    }

    public ArrayList<TagItem> getTagItems() {
        return tagItems;
    }

    public void setTagItems(ArrayList<TagItem> tags) {
        this.tagItems = tags;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentHtml() {
        return contentHtml;
    }

    public void setContentHtml(String contentHTML) {
        this.contentHtml = contentHTML;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
