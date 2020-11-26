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

    @Override
    public Result insert(Product product) {
        // 设置规格id默认为1
        product.setsId(1);

        int i = productMapper.insert(product);
        if(i > 0){
            List<Product> products = productMapper.query();
            return Result.OK(products);
        }
        return Result.FAIL();
    }

    @Override
    public Result delete(Integer pid) {
        int i = productMapper.delete(pid);
        if(i > 0){
            List<Product> products = productMapper.query();
            return Result.OK(products);
        }

        return Result.FAIL();
    }
}
