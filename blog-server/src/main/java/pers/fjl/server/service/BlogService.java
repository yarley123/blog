package pers.fjl.server.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import pers.fjl.common.dto.BlogBackDTO;
import pers.fjl.common.dto.BlogBackInfoDTO;
import pers.fjl.common.dto.BlogInfoDTO;
import pers.fjl.common.entity.QueryPageBean;
import pers.fjl.common.po.Blog;
import pers.fjl.common.vo.AddBlogVO;
import pers.fjl.common.vo.BlogVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fangjiale
 * @since 2021-01-28
 */
public interface BlogService extends IService<Blog> {

    /**
     * 音乐文章管理的分页数据
     * @param queryPageBean
     * @return Page<BlogVO>
     */
    Page<BlogVO> findPage(QueryPageBean queryPageBean, Long uid);

    /**
     * 添加音乐文章
     * @param addBlogVO 返回音乐文章实体
     * @return boolean
     */
    Long addOrUpdateBlog(AddBlogVO addBlogVO, Long uid);

    /**
     * 渲染首页的分页数据(按阅读量降序)
     * @param queryPageBean
     * @return Page<BlogVO>
     */
    Page<BlogVO> findHomePage(QueryPageBean queryPageBean);

    /**
     * 根据音乐文章id获取音乐文章
     * @param blog_id
     * @return blog
     */
    BlogVO getOneBlog(Long blog_id);

    /**
     * 按照时间降序获取最新推荐的音乐文章列表
     * @return list
     */
    List<Blog> getLatestList();

    /**
     * 根据分类id获取音乐文章分页数据
     * @param queryPageBean
     * @return page
     */
    Page<BlogVO> getByTypeId(QueryPageBean queryPageBean);

    /**
     * 更新音乐文章浏览量
     * @param blogId 音乐文章id
     */
    void updateBlogViewsCount(Long blogId);

    /**
     * 点赞
     * @param blogId 音乐文章id
     * @param uid 用户id
     */
    boolean thumbsUp(Long blogId, Long uid);

    /**
     * 获取音乐文章后台可视化管理数据
     * @return 音乐文章数据dto
     */
    BlogBackInfoDTO getBlogBackInfo();

    /**
     * 获取音乐文章后台分页数据
     * @param queryPageBean 分页实体
     * @return page
     */
    Page<BlogBackDTO> adminBlogPage(QueryPageBean queryPageBean);

    /**
     * 根据标题或内容查询
     * @param queryPageBean
     * @return
     */
    Page<Blog> search(QueryPageBean queryPageBean);

    /**
     * 收藏夹的分页数据(按时间降序)
     * @param queryPageBean
     * @return Page<BlogVO>
     */
    Page<BlogVO> findFavoritesPage(QueryPageBean queryPageBean, Long uid);

    /**
     * 管理员编辑文章
     * @param BlogVO blogVO
     * @param uid uid
     */
    void adminSaveOrUpdateBlog(BlogVO blogVO, Long uid);

    /**
     * 删除音乐文章
     * @param blogIdList 音乐文章id列表
     */
    void deleteBlogs(List<Long> blogIdList);

    /**
     * 收藏或者取消收藏1
     * @param blogId
     * @param uid
     * @return
     */
    boolean favorite(Long blogId, Long uid);

    /**
     * 获取网站信息
     * @return blogInfo
     */
     BlogInfoDTO blogInfo();
}

