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
 * 角色实体
 *
 * @author aiiiiii
 * @CreateTime: 2024-08-28
 */
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("role")
@Data
public class RoleEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1102422389941476904L;

    /**
     * 角色ID
     */
    @TableId(value = "ROLE_ID", type = IdType.ASSIGN_ID)
    private Long roleId;

    /**
     * 角色名称
     */
    @TableField(value = "ROLE_NAME")
    private String roleName;

    /**
     * 角色描述
     */
    @TableField(value = "ROLE_DESC")
    private String roleDesc;

    /**
     * 角色排序
     */
    @TableField(value = "ROLE_SORT")
    private Long roleSort;

    /**
     * 角色类型
     */
    @TableField(value = "ROLE_TYPE")
    private Long roleType;

}
