package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 健康档案对象 hms_records
 * 
 * @author ruoyi
 * @date 2022-03-18
 */
public class HmsRecords extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 被监测人id */
    private Long userId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String userName;

    /** 性别 */
    @Excel(name = "性别")
    private String userSex;

    /** 年龄 */
    @Excel(name = "年龄")
    private Long userAge;

    /** 血型 */
    @Excel(name = "血型")
    private String bloodType;

    /** 身高（cm) */
    @Excel(name = "身高", readConverterExp = "身高（cm)")
    private Long height;

    /** 体重（kg） */
    @Excel(name = "体重", readConverterExp = "k=g")
    private Long weight;

    /** 电话号码 */
    @Excel(name = "电话号码")
    private String phoneNumber;

    /** 家庭住址 */
    @Excel(name = "家庭住址")
    private String address;

    /** 被监测原因 */
    @Excel(name = "被监测原因")
    private String monitorReasons;

    /** 医疗病史 */
    @Excel(name = "医疗病史")
    private String medicalHistory;

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setUserSex(String userSex) 
    {
        this.userSex = userSex;
    }

    public String getUserSex() 
    {
        return userSex;
    }
    public void setUserAge(Long userAge) 
    {
        this.userAge = userAge;
    }

    public Long getUserAge() 
    {
        return userAge;
    }
    public void setBloodType(String bloodType) 
    {
        this.bloodType = bloodType;
    }

    public String getBloodType() 
    {
        return bloodType;
    }
    public void setHeight(Long height) 
    {
        this.height = height;
    }

    public Long getHeight() 
    {
        return height;
    }
    public void setWeight(Long weight) 
    {
        this.weight = weight;
    }

    public Long getWeight() 
    {
        return weight;
    }
    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setMonitorReasons(String monitorReasons) 
    {
        this.monitorReasons = monitorReasons;
    }

    public String getMonitorReasons() 
    {
        return monitorReasons;
    }
    public void setMedicalHistory(String medicalHistory) 
    {
        this.medicalHistory = medicalHistory;
    }

    public String getMedicalHistory() 
    {
        return medicalHistory;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userId", getUserId())
            .append("userName", getUserName())
            .append("userSex", getUserSex())
            .append("userAge", getUserAge())
            .append("bloodType", getBloodType())
            .append("height", getHeight())
            .append("weight", getWeight())
            .append("phoneNumber", getPhoneNumber())
            .append("address", getAddress())
            .append("monitorReasons", getMonitorReasons())
            .append("medicalHistory", getMedicalHistory())
            .toString();
    }
}
