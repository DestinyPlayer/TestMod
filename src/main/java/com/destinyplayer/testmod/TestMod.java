package com.destinyplayer.testmod;

import com.destinyplayer.testmod.proxy.CommonProxy;
import com.destinyplayer.testmod.proxy.ClientProxy;
import com.destinyplayer.testmod.proxy.ServerProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TestMod.MODID, name = TestMod.MODNAME, version = TestMod.VERSION)

public class TestMod {
    public static final String MODID   = "TestMod";
    public static final String MODNAME = "Test Mod";
    public static final String VERSION = "0.1";

    @SidedProxy
    public static CommonProxy proxy;

    @Mod.Instance
    public static TestMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }


}
