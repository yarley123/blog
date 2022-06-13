package pers.fjl.server.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import pers.fjl.common.po.Blog;

public interface ArchivesService {
    /**
     * 音乐文章归档数据
     * @return
     */
    Page<Blog> getArchivesList();
}
