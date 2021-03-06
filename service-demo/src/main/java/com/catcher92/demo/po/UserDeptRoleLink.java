/**
 * This file is automatically generated by MyBatis Generator, do not modify.
 */
package com.catcher92.demo.po;

import com.catcher92.demo.framework.bean.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public class UserDeptRoleLink extends BaseEntity implements Serializable {
    /**
     * 用户id
     */
    private Long userId;

    /**
     * 部门id
     */
    private Long deptId;

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 是否兼职 0主职，1兼职
     */
    private Integer isParttime;

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
     * 用户id
     *
     * @return userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户id
     *
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 部门id
     *
     * @return deptId
     */
    public Long getDeptId() {
        return deptId;
    }

    /**
     * 部门id
     *
     * @param deptId
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * 角色id
     *
     * @return roleId
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 角色id
     *
     * @param roleId
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 是否兼职 0主职，1兼职
     *
     * @return isParttime
     */
    public Integer getIsParttime() {
        return isParttime;
    }

    /**
     * 是否兼职 0主职，1兼职
     *
     * @param isParttime
     */
    public void setIsParttime(Integer isParttime) {
        this.isParttime = isParttime;
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