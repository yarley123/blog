package pers.fjl.server.strategy.impl;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.ObjectMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.fjl.server.utils.OssConfigProperties;

import java.io.InputStream;
import java.util.Date;

/**
 * oss上传策略
 *
 */
@Service("ossUploadStrategyImpl")
public class OssUploadStrategyImpl extends AbstractUploadStrategyImpl {
    @Autowired
    private OssConfigProperties ossConfigProperties;

    @Override
    public Boolean exists(String filePath) {
        return getOssClient().doesObjectExist(ossConfigProperties.getBucketName(), filePath);
    }

    @Override
    public void upload(String path, String fileName, InputStream inputStream) {
        ObjectMetadata meta = new ObjectMetadata();
        meta.setContentType("image/jpg");
        getOssClient().putObject(ossConfigProperties.getBucketName(), path + fileName, inputStream,meta);
    }

    @Override
    public String getFileAccessUrl(String filePath) {
        return ossConfigProperties.getUrl() + filePath;
    }

    /**
     * 获取ossClient
     *
     * @return {@link OSS} ossClient
     */
    private OSS getOssClient() {
        return new OSSClientBuilder().build(ossConfigProperties.getEndpoint(), ossConfigProperties.getKeyId(), ossConfigProperties.getKeySecret());
    }

}
