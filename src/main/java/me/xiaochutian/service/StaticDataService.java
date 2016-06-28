/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.xiaochutian.service;

import java.util.List;
import me.xiaochutian.entity.Appversion;
import me.xiaochutian.entity.Line;
import me.xiaochutian.entity.Subsystem;
import me.xiaochutian.entity.Worninglevel;

/**
 *
 * @author Xiaochutian
 */
public interface StaticDataService {

    List<Subsystem> getSubsystemList();

    List<Line> getLineList();

    List<Worninglevel> getWorningLevelList();

    Appversion getLatestVersionByType(Integer type);
}
