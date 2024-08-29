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
 * 用户实体
 *
 * @author aiiiiii
 * @CreateTime: 2024-08-28
 */
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("user")
@Data
public class UserEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 5997169649312847642L;

    /**
     * 用户ID
     */
    @TableId(value = "USER_ID", type = IdType.ASSIGN_ID)
    private Long userId;

    /**
     * 用户账号
     */
    @TableField(value = "USER_ACCOUNT")
    private String userAccount;

    /**
     * 用户密码
     */
    @TableField(value = "USER_PASSWORD")
    private String userPassword;

    /**
     * 用户昵称
     */
    @TableField(value = "USER_NICK_NAME")
    private String userNickName;

    /**
     * 用户手机号
     */
    @TableField(value = "USER_CELLPHONE")
    private String userCellphone;

    /**
     * 用户邮箱
     */
    @TableField(value = "USER_EMAIL")
    private String userEmail;

    /**
     * 用户性别 0:男 1:女
     */
    @TableField(value = "USER_SEX")
    private Long userSex;

    /**
     * 用户年龄
     */
    @TableField(value = "USER_AGE")
    private Long userAge;

}
