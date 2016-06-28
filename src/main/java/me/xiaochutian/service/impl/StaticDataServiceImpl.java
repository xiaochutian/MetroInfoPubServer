package me.xiaochutian.service.impl;

import java.util.ArrayList;
import java.util.List;
import me.xiaochutian.entity.Appversion;
import me.xiaochutian.entity.Line;
import me.xiaochutian.entity.Subsystem;
import me.xiaochutian.entity.Worninglevel;
import me.xiaochutian.service.StaticDataService;
import org.springframework.stereotype.Service;


@Service
public class StaticDataServiceImpl implements StaticDataService{

    @Override
    public List<Subsystem> getSubsystemList() {
        List<Subsystem> list = new ArrayList<>();
        list.add(new Subsystem("1", "ZC"));
        list.add(new Subsystem("2", "VOBC"));
        return list;
    }

    @Override
    public List<Line> getLineList() {
        List<Line> list = new ArrayList<>();
        list.add(new Line());
        return list;
    }

    @Override
    public List<Worninglevel> getWorningLevelList() {
        List<Worninglevel> list = new ArrayList<>();
        list.add(new Worninglevel(1, "一级告警"));
        list.add(new Worninglevel(2, "二级告警"));
        return list;
    }

    @Override
    public Appversion getLatestVersionByType(Integer type) {
        return new Appversion();
    }

    
}
