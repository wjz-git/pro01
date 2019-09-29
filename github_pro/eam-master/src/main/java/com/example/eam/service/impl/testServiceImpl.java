package com.example.eam.service.impl;

import com.example.eam.domain.Login;
import com.example.eam.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @version 1.0.0
 * @Author 凌波水月
 * @date 2019/9/29 11:12
 */
@Service
//定义缓存的命名空间
//建议在每个业务操作的Service层上定义好属于自己的命名空间
@CacheConfig(cacheNames = "test")
public class testServiceImpl implements testService {

    /**
     * 将方法的运行结果进行缓存，以后要是再有相同的数据，直接从缓存中获取，不用调用方法
     * CacheManager中管理多个Cache组件，对缓存的真正CRUD操作在Cache组件中，每个缓存组件都有自己的唯一名字；
     *
     * 属性：
     *  CacheName/value:指定存储缓存组件的名字
     *  key:缓存数据使用的key,可以使用它来指定。默认是使用方法参数的值，1-方法的返回值
     *  编写Spel表达式：#id 参数id的值， #a0/#p0 #root.args[0]
     *  keyGenerator:key的生成器，自己可以指定key的生成器的组件id
     *  key/keyGendertor二选一使用
     *
     *  cacheManager指定Cache管理器，或者cacheReslover指定获取解析器
     *  condition:指定符合条件的情况下，才缓存；
     *  unless：否定缓存，unless指定的条件为true，方法的返回值就不会被缓存，可以获取到结果进行判断
     *  sync:是否使用异步模式
     *
     * @return
     */
    @Cacheable(key = "#id")
    //下面进行条件判断，根据具体需求修改
//    @Cacheable(key = "#id",condition = "#id>0",unless = "#result==null")
    @Override
    public String test(int id){

        //会将每次的返回值缓存到Redis服务器上
        return "Hello World!";
    }
}
