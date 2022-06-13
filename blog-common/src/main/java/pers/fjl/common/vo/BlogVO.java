package pers.fjl.common.vo;

import lombok.Data;
import pers.fjl.common.po.Blog;
import pers.fjl.common.po.Tag;

import java.io.Serializable;
import java.util.List;

/**
 * 设计音乐文章模块查询的附加条件
 */
@Data
public class BlogVO extends Blog implements Serializable {

    private String typeName;    // 分类名称
    private String nickname;    //用户昵称
    private String avatar;      //用户头像
    private String firstPicture;//配图

    /**
     * 文章标签
     */
    private List<String> tagNameList;


}
