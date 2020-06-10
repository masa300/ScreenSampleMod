package jp.masa.screensamplemod;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

@Mod(modid = ScreenSampleMod.MODID, name = ScreenSampleMod.MODNAME, version = ScreenSampleMod.VERSION)
public class ScreenSampleMod {
    public static final  String MODID = "ScreenSampleMod";
    public static final String MODNAME = "Screen Sample Mod";
    public static final String VERSION = "1.0.0";

    public static Logger logger;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        try {
            System.out.println("screen create");
            //FMLCommonHandler.instance().bus().register(new ScreenSwing());
            FMLCommonHandler.instance().bus().register(new ScreenFX());
        } catch (Exception e) {
            logger.log(Level.ERROR, "ScreenSampleMod Exception");
            e.printStackTrace();
        }
    }

}
