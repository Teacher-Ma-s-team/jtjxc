package com.itqf.jtjxc.mapper;

import com.itqf.jtjxc.bean.Product;

import java.util.List;

/**
 * projectName: jtjxc
 *
 * @author: 赵伟风
 * time: 2020/11/26 9:26
 * description:
 */
public interface ProductMapper {

    List<Product> query();

    int insert(Product product);

    int delete(Integer pid);

    Product queryOne(Integer pid);

    int update(Product product);

    List<Product> queryByTId(Integer tId);
}
