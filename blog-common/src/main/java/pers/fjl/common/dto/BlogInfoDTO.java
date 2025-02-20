package pers.fjl.common.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 网站音乐文章数据
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlogInfoDTO {

    private Integer blogCount;

    private Integer tagCount;

    private Integer typeCount;

}
