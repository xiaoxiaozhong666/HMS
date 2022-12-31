package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.HmsRecords;
import com.ruoyi.system.service.IHmsRecordsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 健康档案Controller
 * 
 * @author ruoyi
 * @date 2022-03-18
 */
@RestController
@RequestMapping("/system/records")
public class HmsRecordsController extends BaseController
{
    @Autowired
    private IHmsRecordsService hmsRecordsService;

    /**
     * 查询健康档案列表
     */
    @PreAuthorize("@ss.hasPermi('system:records:list')")
    @GetMapping("/list")
    public TableDataInfo list(HmsRecords hmsRecords)
    {
        startPage();
        List<HmsRecords> list = hmsRecordsService.selectHmsRecordsList(hmsRecords);
        return getDataTable(list);
    }

    /**
     * 导出健康档案列表
     */
    @PreAuthorize("@ss.hasPermi('system:records:export')")
    @Log(title = "健康档案", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HmsRecords hmsRecords)
    {
        List<HmsRecords> list = hmsRecordsService.selectHmsRecordsList(hmsRecords);
        ExcelUtil<HmsRecords> util = new ExcelUtil<HmsRecords>(HmsRecords.class);
        util.exportExcel(response, list, "健康档案数据");
    }

    /**
     * 获取健康档案详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:records:query')")
    @GetMapping(value = "/{userId}")
    public AjaxResult getInfo(@PathVariable("userId") Long userId)
    {
        return AjaxResult.success(hmsRecordsService.selectHmsRecordsByUserId(userId));
    }

    /**
     * 新增健康档案
     */
    @PreAuthorize("@ss.hasPermi('system:records:add')")
    @Log(title = "健康档案", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HmsRecords hmsRecords)
    {
        return toAjax(hmsRecordsService.insertHmsRecords(hmsRecords));
    }

    /**
     * 修改健康档案
     */
    @PreAuthorize("@ss.hasPermi('system:records:edit')")
    @Log(title = "健康档案", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HmsRecords hmsRecords)
    {
        return toAjax(hmsRecordsService.updateHmsRecords(hmsRecords));
    }

    /**
     * 删除健康档案
     */
    @PreAuthorize("@ss.hasPermi('system:records:remove')")
    @Log(title = "健康档案", businessType = BusinessType.DELETE)
	@DeleteMapping("/{userIds}")
    public AjaxResult remove(@PathVariable Long[] userIds)
    {
        return toAjax(hmsRecordsService.deleteHmsRecordsByUserIds(userIds));
    }
}
