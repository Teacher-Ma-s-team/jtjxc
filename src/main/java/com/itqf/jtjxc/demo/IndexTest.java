package com.itqf.jtjxc.demo;

/**
 * projectName: jtjxc
 *
 * @author: 赵伟风
 * time: 2020/11/24 9:51
 * description:
 */
public class IndexTest{

    public static void main(String[] args) {
        Animal xingxing = AnimalFactory.createAnimal();
        xingxing.eat();


//        Result result = new Result();
//        result.setRet(Constants.RET_OK);
//        result.setMsg("~~~");
//        result.setData(xingxing);



//        Result result =  Result.OK(xingxing);
//        Result result =  Result.OK("",xingxing);
//
//
//        Result result =  Result.FAIL(xingxing);
//        Result result =  Result.FAIL("",xingxing);
//        Result result =  Result.FAIL("");





        Animal xingxing1 = AnimalFactory.createAnimal();
        xingxing1.eat();
        Animal xingxing11 =AnimalFactory.createAnimal();
        xingxing11.eat();
        Animal xingxing111 = AnimalFactory.createAnimal();
        xingxing111.eat();
        Animal xingxing1111 = AnimalFactory.createAnimal();
        xingxing1111.eat();
        Animal xingxing11111 = AnimalFactory.createAnimal();
        xingxing11111.eat();
        Animal xingxing111111 = AnimalFactory.createAnimal();
        xingxing111111.eat();

    }
}
