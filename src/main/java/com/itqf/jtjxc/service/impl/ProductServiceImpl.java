package com.itqf.jtjxc.service.impl;

import com.itqf.jtjxc.bean.Product;
import com.itqf.jtjxc.bean.Result;
import com.itqf.jtjxc.mapper.ProductMapper;
import com.itqf.jtjxc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: jtjxc
 *
 * @author: 赵伟风
 * time: 2020/11/26 9:24
 * description:
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Result show() {

        List<Product> products =  productMapper.query();

        if (products != null && products.size() > 0) {

            return Result.OK(products);
        }

        return Result.FAIL();
    }
}
