package com.sfa.restaurant.config.mybatisPlus;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.util.Date;

public class MyMetaObjectHandler extends MetaObjectHandler {


        @Override
        public void insertFill(MetaObject metaObject) {
            Object lastUpdateNameId = metaObject.getValue("lastUpdateNameId");
            Object lastUpdateTime = metaObject.getValue("lastUpdateTime");

            if (null == lastUpdateNameId) {
                metaObject.setValue("lastUpdateNameId", "123");
            }
            if (null == lastUpdateTime) {
                metaObject.setValue("lastUpdateTime", new Date());
            }


        }

        //更新填充
        @Override
        public void updateFill(MetaObject metaObject) {
            insertFill(metaObject);

        }

    }
