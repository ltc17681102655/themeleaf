package jpa.controller;

import cn.hutool.json.JSONObject;
import com.google.common.collect.Lists;
import jpa.entity.AgentInfoEntity;
import jpa.param.ReportParam;
import jpa.reporitory.AgentInfoReporitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class JpaController {


    @Autowired
    private AgentInfoReporitory agentInfoReporitory;

    @RequestMapping("lay_ui")
    public String lay_ui() {
        LayUiBean layUiBean = new LayUiBean();
        layUiBean.setId(1);
        layUiBean.setUsername("ltc");
        layUiBean.setClassify("abc");
        layUiBean.setExperience(10000);
        layUiBean.setScore(80);
        layUiBean.setSign("dev");
        layUiBean.setSex("nan");
        layUiBean.setWealth(155);
        layUiBean.setTitle("lay_ui");

        JSONObject obj=new JSONObject(); //前台通过key值获得对应的value值
         obj.put("code", 0);
         obj.put("msg", "");
         obj.put("count",1);
         obj.put("data", Lists.newArrayList(layUiBean));
        return obj.toString();
    }

    @RequestMapping("test")
    public String demo() {
        return "success";
    }

    @RequestMapping("test3")
    public void test3(ReportParam report, Integer year) {
        System.out.println(report.getYear());
        System.out.println(report.getMonth());
        System.out.println(report.getSeason());

        System.out.println("================");
        System.out.println(year);
    }

    @RequestMapping("test4")
    public void test4(ReportParam report) {
        System.out.println(report.getYear());
        System.out.println(report.getMonth());
        System.out.println(report.getSeason());
    }

    @RequestMapping("jpa")
    @Cacheable(value = "agent_info")
    public List<AgentInfoEntity> test() {
        Page<AgentInfoEntity> page = agentInfoReporitory.findAll(new PageRequest(1, 10, Sort.Direction.ASC, "agentId"));
        List<AgentInfoEntity> content = page.getContent();
        if (CollectionUtils.isEmpty(content)) {
            return null;
        }
        return content;
    }

    @RequestMapping("redis_delete")
    @CacheEvict(value = "agent_info")
    public void test2() {


    }
}
