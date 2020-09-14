package com.acornsoft.cocktaildemo.demo.controller;

import com.acornsoft.cocktaildemo.demo.service.DoosanDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/view")
public class DoosanDemoController {

    @Autowired
    private DoosanDemoService doosanDemoService;



    @GetMapping("/health")
    public String health(Model model) {
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date time = new Date();

        String time1 = format1.format(time);

        model.addAttribute("health", "서버 현재 시간은 : " + time1 + " 입니다.");
        return "health";
    }


    @GetMapping("/demo/{groupId}")
    public String deviceDemo(@PathVariable String groupId, Model model) {

        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time = new Date();
        String time1 = format1.format(time);

        model.addAttribute("health", "서버 현재 시간은 : " + time1 + " 입니다.");

        List<Map<String, Object>> codes = doosanDemoService.getCodeParam(groupId);
        model.addAttribute("codes", codes);

        List<Map<String, Object>> fixCodes = doosanDemoService.getCodes2();
        model.addAttribute("fixCodes", fixCodes);

        List<Map<String, Object>> devices = doosanDemoService.getDevices();
        model.addAttribute("devices", devices);

        int threadCount = Thread.activeCount();
        model.addAttribute("threadCount", threadCount);


        return "deviceDemo";
    }
}