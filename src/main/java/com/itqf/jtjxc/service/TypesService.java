package com.itqf.jtjxc.service;

import com.itqf.jtjxc.bean.Result;
import com.itqf.jtjxc.bean.Types;

/**
 * projectName: jtjxc
 *
 * @author: 赵伟风
 * time: 2020/11/25 11:02
 * description: type实体类的业务接口
 */
public interface TypesService {

    /**
     * 保存type的业务方法
     * @param types
     * @return
     */
    Result save(Types types);

    Result  uptype(Types types);

    Result detype(Types types);

    Result show();
}
