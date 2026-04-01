package com.hxd.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hxd.project.model.entity.Tag;
import com.hxd.project.service.TagService;
import com.hxd.project.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
* @author hxd15
* @description 针对表【tag(标签)】的数据库操作Service实现
* @createDate 2026-03-31 20:32:59
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper,Tag>
    implements TagService{

}




