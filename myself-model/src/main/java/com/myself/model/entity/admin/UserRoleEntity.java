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
 * 用户角色实体
 *
 * @author aiiiiii
 * @CreateTime: 2024-08-28
 */
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("user_role")
@Data
public class UserRoleEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1113505078563203949L;

    /**
     * 主键ID
     */
    @TableId(value = "ID", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 用户ID
     */
    @TableField(value = "USER_ID")
    private Long userId;

    /**
     * 角色ID
     */
    @TableField(value = "ROLE_ID")
    private Long roleId;

}
