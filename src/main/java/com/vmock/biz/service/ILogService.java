package com.vmock.biz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vmock.biz.entity.Log;

import java.util.List;

/**
 * 操作日志 服务层
 *
 * @author mock
 */
public interface ILogService extends IService<Log> {

    /**
     * 查询系统操作日志集合
     *
     * @param operLog  操作日志对象
     * @param isExport 是否为excel导出
     * @return 操作日志集合
     */
    List<Log> selectMockLogList(Log operLog, boolean isExport);

    /**
     * 异步插入
     *
     * @param mockLog log实体
     */
    void asyncInsert(Log mockLog);

    /**
     * 清除指定区间数据
     *
     * @param mockLog log实体
     */
    void clean(Log mockLog);

}
