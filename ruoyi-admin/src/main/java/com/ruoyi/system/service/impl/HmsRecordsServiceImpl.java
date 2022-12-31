package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.HmsRecordsMapper;
import com.ruoyi.system.domain.HmsRecords;
import com.ruoyi.system.service.IHmsRecordsService;

/**
 * 健康档案Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-03-18
 */
@Service
public class HmsRecordsServiceImpl implements IHmsRecordsService 
{
    @Autowired
    private HmsRecordsMapper hmsRecordsMapper;

    /**
     * 查询健康档案
     * 
     * @param userId 健康档案主键
     * @return 健康档案
     */
    @Override
    public HmsRecords selectHmsRecordsByUserId(Long userId)
    {
        return hmsRecordsMapper.selectHmsRecordsByUserId(userId);
    }

    /**
     * 查询健康档案列表
     * 
     * @param hmsRecords 健康档案
     * @return 健康档案
     */
    @Override
    public List<HmsRecords> selectHmsRecordsList(HmsRecords hmsRecords)
    {
        return hmsRecordsMapper.selectHmsRecordsList(hmsRecords);
    }

    /**
     * 新增健康档案
     * 
     * @param hmsRecords 健康档案
     * @return 结果
     */
    @Override
    public int insertHmsRecords(HmsRecords hmsRecords)
    {
        return hmsRecordsMapper.insertHmsRecords(hmsRecords);
    }

    /**
     * 修改健康档案
     * 
     * @param hmsRecords 健康档案
     * @return 结果
     */
    @Override
    public int updateHmsRecords(HmsRecords hmsRecords)
    {
        return hmsRecordsMapper.updateHmsRecords(hmsRecords);
    }

    /**
     * 批量删除健康档案
     * 
     * @param userIds 需要删除的健康档案主键
     * @return 结果
     */
    @Override
    public int deleteHmsRecordsByUserIds(Long[] userIds)
    {
        return hmsRecordsMapper.deleteHmsRecordsByUserIds(userIds);
    }

    /**
     * 删除健康档案信息
     * 
     * @param userId 健康档案主键
     * @return 结果
     */
    @Override
    public int deleteHmsRecordsByUserId(Long userId)
    {
        return hmsRecordsMapper.deleteHmsRecordsByUserId(userId);
    }
}
