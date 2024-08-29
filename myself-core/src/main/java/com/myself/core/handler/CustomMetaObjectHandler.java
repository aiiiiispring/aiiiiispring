package com.myself.core.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

/**
 * @author aiiiiii
 * @CreateTime: 2024/08/29/15:00
 * 自定义公共字段填充处理器
 */
@Component
public class CustomMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        if (metaObject.hasSetter("createDate")) {
            this.strictInsertFill(metaObject, "createDate", java.util.Date.class, new java.util.Date());
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        if (metaObject.hasSetter("updateDate")) {
            this.strictUpdateFill(metaObject, "updateDate", java.util.Date.class, new java.util.Date());
        }
    }
}
