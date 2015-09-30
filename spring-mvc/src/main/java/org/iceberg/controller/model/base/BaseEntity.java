package org.iceberg.controller.model.base;

import javax.persistence.Column;

/**
 * @author zhuxy
 * @description
 * @createDate 2015/9/30
 */
public class BaseEntity {

    @Column(name = "ID")
    private String id;

}
