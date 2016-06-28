/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.xiaochutian.controller;

import java.util.ArrayList;
import java.util.List;
import me.xiaochutian.entity.Appversion;
import me.xiaochutian.entity.Line;
import me.xiaochutian.entity.LineData;
import me.xiaochutian.entity.MyList;
import me.xiaochutian.entity.ReturnJson;
import me.xiaochutian.entity.Subsystem;
import me.xiaochutian.entity.Worninglevel;
import me.xiaochutian.service.StaticDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Xiaochutian
 */
@RestController
@RequestMapping("/static")
public class StaticDataController {

    @Autowired
    ReturnJson resultObj;
    @Autowired
    StaticDataService staticDataService;


    @RequestMapping(method = GET , value = "lineList")
    public ReturnJson getLineList() {
        System.out.println("\n************************");
        System.out.println("in StaticData linList...");
        List<LineData> linedatalist = new ArrayList<LineData>();
        List<Line> linelist = staticDataService.getLineList();
        for (Line l : linelist) {
            linedatalist.add(new LineData(l.getLinecode(), l.getLinename()));
        }
        resultObj.setData(new MyList(linedatalist));
        return resultObj;
    }

//    @RequestMapping(method = GET , value = "subsystemList")
//    public String getSubsystemList() {
//        System.out.println("\n************************");
//        System.out.println("in StaticData subsystemList...");
//        List<SubsystemData> subsystemdatalist = new ArrayList<SubsystemData>();
//        List<Subsystem> subsystemlist = staticDataService.getSubsystemList();
//        for (Subsystem s : subsystemlist) {
//            subsystemdatalist.add(new SubsystemData(s.getSubsystemcode(), s
//                    .getSubsystemname()));
//        }
//        json.setData(new MyList(subsystemdatalist));
//        String result = gson.toJson(json);
//        System.out.println(result);
//        return result;
//    }
//
//    @RequestMapping(method = GET , value = "worningLevelList")
//    public String getWorningLevelList() {
//        System.out.println("\n************************");
//        System.out.println("in StaticData worningLevelList...");
//        List<WorningLevelData> worningLeveldatalist = new ArrayList<WorningLevelData>();
//        List<Worninglevel> worningLevellist = staticDataService
//                .getWorningLevelList();
//        for (Worninglevel w : worningLevellist) {
//            worningLeveldatalist
//                    .add(new WorningLevelData(w.getWorninglevelcode()
//                                    .toString(), w.getWorninglevelname()));
//        }
//        json.setData(new MyList(worningLeveldatalist));
//        String result = gson.toJson(json);
//        System.out.println(result);
//        return result;
//    }
//
//    @RequestMapping(method = GET , value = "version")
//    public String getLatestVersion(
//            @QueryParam("type") @DefaultValue("1") Integer type) {
//        System.out.println("\n************************");
//        System.out.println("in StaticData latestVersion...  type:" + type.toString());
//        Appversion version = staticDataService.getLatestVersionByType(type);
//
//        if (version != null) {
//            LatestAppVersionData data = new LatestAppVersionData(
//                    version.getVersion(), version.getVersioncode(),
//                    version.getForce().toString(), version.getUrl(),
//                    version.getRemarks());
//            json.setData(data);
//        } else {
//            json.setResult("-1");
//            json.setMessage("最新版本未找到");
//        }
//        String result = gson.toJson(json);
//        System.out.println(result);
//        return result;
//    }
}
