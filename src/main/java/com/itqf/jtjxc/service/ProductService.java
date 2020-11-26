package com.itqf.jtjxc.service;

import com.itqf.jtjxc.bean.Product;
import com.itqf.jtjxc.bean.Result;

/**
 * projectName: jtjxc
 *
 * @author: 赵伟风
 * time: 2020/11/26 9:23
 * description:
 */
public interface ProductService {
    /**
     * 展示商品信息的方法
     * @return
     */
    Result show();

    /**
     * 修改商品信息回显数据
     * @return
     */
    Result insert(Product product);

    /**
     * 删除商品
     * @param pid
     * @return
     */
    Result delete(Integer pid);
}
