package org.iceberg.controller.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author zhuxy
 * @description
 * @createDate 2015/9/29
 */
@Table(name="USER")
@Entity
public class User {

    private String name;

    private String age;

}
