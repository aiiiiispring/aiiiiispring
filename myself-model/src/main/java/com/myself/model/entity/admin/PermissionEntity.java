package com.myself.model.entity.admin;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

import com.myself.model.entity.BaseEntity;
import lombok.Data;

import java.io.Serial;


/**
 * 权限实体
 *
 * @author aiiiiii
 * @CreateTime: 2024-08-28
 */
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("permission")
@Data
public class PermissionEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 7732706673654768953L;

    /**
     * 权限ID
     */
    @TableId(value = "PERMISSION_ID", type = IdType.ASSIGN_ID)
    private Long permissionId;

    /**
     * 权限名称
     */
    @TableField(value = "PERMISSION_NAME")
    private String permissionName;

    /**
     * 权限描述
     */
    @TableField(value = "PERMISSION_DESC")
    private String permissionDesc;

    /**
     * 权限排序
     */
    @TableField(value = "PERMISSION_SORT")
    private Long permissionSort;

    /**
     * 权限类型
     */
    @TableField(value = "PERMISSION_TYPE")
    private Long permissionType;

}
