package me.dizzy.dizzyflipper.tweaker;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import java.util.Map;

@IFMLLoadingPlugin.MCVersion("1.8.9")
@IFMLLoadingPlugin.Name("DizzyFlipper FTW")
public class DizzyFlipperLoadingPlugin implements IFMLLoadingPlugin 
    {
    @Override
    public String[] getASMTransformerClass() {
        return new String[]{DizzyFlipperTransformer.class.getName()};
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
