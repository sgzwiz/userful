package com.kkb.b2c.gciantispider.controller;

import com.kkb.b2c.gciantispider.model.NhRulemonitorAntioccupy;
import com.kkb.b2c.gciantispider.model.NhRulemonitorAntispider;
import com.kkb.b2c.gciantispider.service.INhRulemonitorAntioccupyService;
import com.kkb.b2c.gciantispider.service.INhRulemonitorAntispiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/ruleMonitor")
public class IndexRuleMonitorController {
    
    @Autowired
    INhRulemonitorAntispiderService nhRulemonitorAntispiderService;
    
    @Autowired
    INhRulemonitorAntioccupyService nhRulemonitorAntioccupyService;
    /**
     * 反爬监控
     * @param timeType
     * @param ruleType
     * @return
     */
    @RequestMapping(value="/getRulemonitorAntispider",method = RequestMethod.POST)
    @ResponseBody
    public List<NhRulemonitorAntispider> getRulemonitorAntispider(@RequestParam("timeType") String timeType, @RequestParam("ruleType") String ruleType){
        return nhRulemonitorAntispiderService.getNhRulemonitorAntispiderByTimeAndType(timeType, ruleType);
    }
    /**
     * 防占座
     * @param timeType
     * @param ruleType
     * @return
     */
    @RequestMapping(value="/getNhRulemonitorAntioccupy",method = RequestMethod.POST)
    @ResponseBody
    public List<NhRulemonitorAntioccupy> getNhRulemonitorAntioccupy(@RequestParam("timeType") String timeType, @RequestParam("ruleType") String ruleType){
        return nhRulemonitorAntioccupyService.getNhRulemonitorAntioccupyByTimeAndType(timeType, ruleType);
    }

}
