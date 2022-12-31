package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.HmsRecords;

/**
 * 健康档案Service接口
 * 
 * @author ruoyi
 * @date 2022-03-18
 */
public interface IHmsRecordsService 
{
    /**
     * 查询健康档案
     * 
     * @param userId 健康档案主键
     * @return 健康档案
     */
    public HmsRecords selectHmsRecordsByUserId(Long userId);

    /**
     * 查询健康档案列表
     * 
     * @param hmsRecords 健康档案
     * @return 健康档案集合
     */
    public List<HmsRecords> selectHmsRecordsList(HmsRecords hmsRecords);

    /**
     * 新增健康档案
     * 
     * @param hmsRecords 健康档案
     * @return 结果
     */
    public int insertHmsRecords(HmsRecords hmsRecords);

    /**
     * 修改健康档案
     * 
     * @param hmsRecords 健康档案
     * @return 结果
     */
    public int updateHmsRecords(HmsRecords hmsRecords);

    /**
     * 批量删除健康档案
     * 
     * @param userIds 需要删除的健康档案主键集合
     * @return 结果
     */
    public int deleteHmsRecordsByUserIds(Long[] userIds);

    /**
     * 删除健康档案信息
     * 
     * @param userId 健康档案主键
     * @return 结果
     */
    public int deleteHmsRecordsByUserId(Long userId);
}
