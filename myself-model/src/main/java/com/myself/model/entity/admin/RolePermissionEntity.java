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
 * 角色权限实体
 *
 * @author aiiiiii
 * @CreateTime: 2024-08-28
 */
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("role_permission")
@Data
public class RolePermissionEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 8537230465056607263L;

    /**
     * 主键ID
     */
    @TableId(value = "ID", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 角色ID
     */
    @TableField(value = "ROLE_ID")
    private Long roleId;

    /**
     * 权限ID
     */
    @TableField(value = "PERMISSION_ID")
    private Long permissionId;

}
