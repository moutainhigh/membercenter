package org.smartwork.biz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.forbes.comm.constant.UserContext;
import org.forbes.comm.model.SysUser;
import org.smartwork.biz.service.IZGWorkPlanService;
import org.smartwork.comm.model.ZGCompanyDto;
import org.smartwork.comm.model.ZGWorkPlanAssessDto;
import org.smartwork.comm.model.ZGWorkPlanDto;
import org.smartwork.dal.entity.ZGCompany;
import org.smartwork.dal.entity.ZGWorkPlan;
import org.smartwork.dal.mapper.ZGWorkPlanMapper;
import org.smartwork.dal.mapper.ext.ZGWorkPlanExtMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class ZGWorkPlanServiceImpl extends ServiceImpl<ZGWorkPlanMapper, ZGWorkPlan> implements IZGWorkPlanService {

    @Autowired
    ZGWorkPlanExtMapper workPlanExtMapper;

    /***
     * selectPlanDay方法概述:查询我的日程计划
     * @param startTime, endTime
     * @创建人 nhy
     * @创建时间 2020/3/23 12:34
     * @修改人 (修改了该文件，请填上修改人的名字)
     * @修改日期 (请填上修改该文件时的日期)
     */
    @Override
    public List<ZGWorkPlan> selectPlanDay(Date startTime, Date endTime) {
        return workPlanExtMapper.selectPlanDay(startTime,endTime);
    }

    /***
     * addWorkPlan方法概述:写工作计划
     * @param zgWorkPlanDto
     * @创建人 nhy
     * @创建时间 2020/3/24 9:49
     * @修改人 (修改了该文件，请填上修改人的名字)
     * @修改日期 (请填上修改该文件时的日期)
     */
    @Transactional
    @Override
    public void addWorkPlan(ZGWorkPlanDto zgWorkPlanDto) {
        //添加工作计划信息
        ZGWorkPlan zgWorkPlan = new ZGWorkPlan();
        BeanCopier.create(ZGWorkPlanDto.class, ZGWorkPlan.class, false)
                .copy(zgWorkPlanDto, zgWorkPlan, null);
        //获取当前用户
        SysUser user = UserContext.getSysUser();
        zgWorkPlan.setUserId(user.getId());
        zgWorkPlan.setName(user.getRealname());
        baseMapper.insert(zgWorkPlan);
    }

    /***
     * updateWorkPlan方法概述:修改工作计划
     * @param zgWorkPlanDto
     * @创建人 lzw
     * @创建时间 2020/3/24 10:06
     * @修改人 (修改了该文件，请填上修改人的名字)
     * @修改日期 (请填上修改该文件时的日期)
     */
    @Transactional
    @Override
    public void updateWorkPlan(ZGWorkPlanDto zgWorkPlanDto) {
        //修改工作计划信息
        ZGWorkPlan zgWorkPlan = new ZGWorkPlan();
        BeanCopier.create(ZGWorkPlanDto.class, ZGWorkPlan.class, false)
                .copy(zgWorkPlanDto, zgWorkPlan, null);
        //获取当前用户
        SysUser user = UserContext.getSysUser();
        zgWorkPlan.setUserId(user.getId());
        zgWorkPlan.setName(user.getRealname());
        baseMapper.updateById(zgWorkPlan);
    }

    /***
     * updateWorkPlan方法概述:修改(评估)工作计划
     * @param zgWorkPlanAssessDto
     * @创建人 lzw
     * @创建时间 2020/3/24 10:06
     * @修改人 (修改了该文件，请填上修改人的名字)
     * @修改日期 (请填上修改该文件时的日期)
     */
    @Transactional
    @Override
    public void updateWorkAssessPlan(ZGWorkPlanAssessDto zgWorkPlanAssessDto) {
        //修改工作计划信息
        ZGWorkPlan zgWorkPlan = new ZGWorkPlan();
        BeanCopier.create(ZGWorkPlanAssessDto.class, ZGWorkPlan.class, false)
                .copy(zgWorkPlanAssessDto, zgWorkPlan, null);
        //获取当前用户
        SysUser user = UserContext.getSysUser();
        zgWorkPlan.setAssessId(user.getId());
        zgWorkPlan.setAssessName(user.getRealname());
        baseMapper.updateById(zgWorkPlan);
    }


}