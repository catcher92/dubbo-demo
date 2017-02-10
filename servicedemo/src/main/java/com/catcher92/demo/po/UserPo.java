/**
 * This file is automatically generated by MyBatis Generator, do not modify.
 */
package com.catcher92.demo.po;

import com.catcher92.demo.framework.bean.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public class UserPo extends BaseEntity implements Serializable {
    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 部门id
     */
    private Long deptId;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 锁定状态 0未锁定，1已锁定
     */
    private Boolean lockStatus;

    /**
     * 锁定状态 0未删除，1已删除
     */
    private Boolean deleteStatus;

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
     * 用户名
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 用户名
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 密码
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
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
     * 邮箱
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 锁定状态 0未锁定，1已锁定
     *
     * @return lockStatus
     */
    public Boolean getLockStatus() {
        return lockStatus;
    }

    /**
     * 锁定状态 0未锁定，1已锁定
     *
     * @param lockStatus
     */
    public void setLockStatus(Boolean lockStatus) {
        this.lockStatus = lockStatus;
    }

    /**
     * 锁定状态 0未删除，1已删除
     *
     * @return deleteStatus
     */
    public Boolean getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * 锁定状态 0未删除，1已删除
     *
     * @param deleteStatus
     */
    public void setDeleteStatus(Boolean deleteStatus) {
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