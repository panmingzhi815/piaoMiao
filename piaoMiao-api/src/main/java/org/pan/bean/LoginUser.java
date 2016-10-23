package org.pan.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by panmingzhi on 2016/10/14.
 */
@Entity
@Data
public class LoginUser {
    @Id
    private String id;
    @Column(nullable = false,unique = true)
    private String username;
    @Column
    private String password;
    @Column
    private String email;
}
