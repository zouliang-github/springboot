package com.lcu.mapper;

import com.lcu.bean.User;
import tk.mybatis.mapper.common.Mapper;
//自定义Mapper接口继承tk.mybatis.mapper.com,泛型为当前接口操作的表所对应的实体类
public interface UserMapper extends Mapper<User>{

}
