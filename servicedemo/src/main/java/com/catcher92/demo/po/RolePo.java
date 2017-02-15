/**
 * This file is automatically generated by MyBatis Generator, do not modify.
 */
package com.catcher92.demo.po;

import com.catcher92.demo.framework.bean.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public class RolePo extends BaseEntity implements Serializable {
    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 删除状态 0未删除，1已删除
     */
    private Integer deleteStatus;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 更新人
     */
    private String updateBy;

    private static final long serialVersionUID = 1L;

    /**
     * 名称
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 描述
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 删除状态 0未删除，1已删除
     *
     * @return deleteStatus
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * 删除状态 0未删除，1已删除
     *
     * @param deleteStatus
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * 创建时间
     *
     * @return createDate
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建时间
     *
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 创建人
     *
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 创建人
     *
     * @param createBy
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 更新时间
     *
     * @return updateDate
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 更新时间
     *
     * @param updateDate
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 更新人
     *
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 更新人
     *
     * @param updateBy
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }
}