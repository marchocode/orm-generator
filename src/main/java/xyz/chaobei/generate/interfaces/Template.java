package xyz.chaobei.generate.interfaces;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Map;

/**
 * @description:
 * @author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2022/6/21
 **/
public interface Template {

    /**
     * 模板文件所在位置
     * @return
     */
    File templateFile();

    /**
     * 填充元数据
     * @return
     */
    Map<String,String> metaData();

    /**
     * 文件输出位置
     * @return
     */
    FileOutputStream outputSteam();







}
