package com.github.kylepeavot.survivalofthecroppest;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SurvivalOfTheCroppestMain.MODID)
public class SurvivalOfTheCroppestMain {
  public static final String MODID = "survivalofthecroppest";
  public static final Logger LOGGER = LogManager.getLogger(MODID);

  public SurvivalOfTheCroppestMain() {
    LOGGER.debug("Hello world from SurvivalOfTheCroppestMain");
  }

}
