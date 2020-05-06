package com.github.kylepeavot.survivalofthecroppest;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Main.MODID)
public class Main {
  public static final String MODID = "survival-of-the-croppest";
  public static final Logger LOGGER = LogManager.getLogger(MODID);

  public Main() {
    LOGGER.debug("Hello world from Main");
  }

}
