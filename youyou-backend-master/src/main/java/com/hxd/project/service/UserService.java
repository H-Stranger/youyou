package com.hxd.project.service;

import com.hxd.project.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author hxd15
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2026-03-31 20:32:59
*/
public interface UserService extends IService<User> {
    List<User> searchUsersByTags(List<String> tagNameList);

//    List<User> searchUsersByTagsBySQL(List<String> tagNameList);

    User getSafetyUser(User originUser);
}
