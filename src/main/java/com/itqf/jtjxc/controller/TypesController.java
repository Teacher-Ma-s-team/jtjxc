package com.itqf.jtjxc.controller;

import com.itqf.jtjxc.bean.Result;
import com.itqf.jtjxc.bean.Types;
import com.itqf.jtjxc.service.TypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * projectName: jtjxc
 *
 * @author: 赵伟风
 * time: 2020/11/25 10:59
 * description:
 */
@RequestMapping("types")
@RestController
public class TypesController {

    @Autowired
    private TypesService typesService;

    @PostMapping("save")
    public Result save(Types types){

        Result result = typesService.save(types);

        return result;
    }

    @PostMapping("uptype")
    public Result uptype(Types types){
        Result result = typesService.uptype(types);

        return result;
    }

    @GetMapping("detype")
    public Result detype(Integer tId){
        Types types = new Types();
        types.settId(tId);
        Result result = typesService.detype(types);

        return result;
    }

    @GetMapping("show")
    public Result save(){

        Result result = typesService.show();

        return result;
    }

}
