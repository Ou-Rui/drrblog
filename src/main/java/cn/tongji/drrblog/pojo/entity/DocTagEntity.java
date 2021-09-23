package cn.tongji.drrblog.pojo.entity;


import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

// 文章与标签的对应关系表
@TableName("drrblog_doc_tag")
public class DocTagEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long id;

    private Long docId;

    private Integer tagId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDocId() {
        return docId;
    }

    public void setDocId(Long docId) {
        this.docId = docId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }
}
