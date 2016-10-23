package org.pan.repository;

import org.pan.bean.LoginUser;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by panmingzhi on 2016/10/14.
 */
public interface LoginUserRepository extends PagingAndSortingRepository<LoginUser,String> {
}
