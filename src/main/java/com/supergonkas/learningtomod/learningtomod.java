package com.supergonkas.learningtomod;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "learningtomod", name = "Learning To Mod", version = "1.7.2-1.0")

//public class leaningtomod {
//
//    public static final String ID = "leaningtomod";
//    public static final String NAME = "leaningtomod";
//    public static final String VERSION = "1.7.2-1.0";
//}
//

public class learningtomod {

    @Mod.Instance("learningtomod")
    public static learningtomod instance;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}