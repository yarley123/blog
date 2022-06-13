package pers.fjl.server.service;

import java.util.Map;

public interface ReportService {

    /**
     * 获取某个用户的音乐文章数据
     * @param uid
     * @return map
     */
    Map<String, Object> getReport(Long uid) throws Exception;

    /**
     * 获取单篇音乐文章数据
     * @param uid
     * @return map
     */
    Map<String, Object> getReport2(Long uid) throws Exception;
}
