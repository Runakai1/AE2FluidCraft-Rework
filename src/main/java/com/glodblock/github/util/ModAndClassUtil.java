package com.glodblock.github.util;

import net.minecraftforge.fml.common.Loader;

public final class ModAndClassUtil {

    public static boolean AUTO_P = false;

    public static void init() {
        if (Loader.isModLoaded("packagedauto")) {
            AUTO_P = true;
        }
    }

}
