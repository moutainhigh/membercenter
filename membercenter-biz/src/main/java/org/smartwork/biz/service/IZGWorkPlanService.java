package org.smartwork.biz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.smartwork.dal.entity.ZGWorkPlan;

import java.util.Date;
import java.util.List;

public interface IZGWorkPlanService extends IService<ZGWorkPlan> {

    /***
     * selectPlanDay方法概述:查询我的日程计划
     * @param startTime, endTime
     * @return org.forbes.comm.vo.Result<java.util.List<org.smartwork.dal.entity.ZGWorkPlan>>
     * @创建人 Tom
     * @创建时间 2020/3/23 12:34
     * @修改人 (修改了该文件，请填上修改人的名字)
     * @修改日期 (请填上修改该文件时的日期)
     */
    List<ZGWorkPlan> selectPlanDay(Date startTime, Date endTime);
}