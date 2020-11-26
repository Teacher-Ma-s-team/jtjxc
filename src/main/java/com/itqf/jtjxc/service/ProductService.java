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

    /**
     * 更具商品id查询商品实体
     * @param pid
     * @return
     */
    Result queryOneByPid(Integer pid);

    /**
     * 更新商品
     * @param product
     * @return
     */
    Result update(Product product);
}
