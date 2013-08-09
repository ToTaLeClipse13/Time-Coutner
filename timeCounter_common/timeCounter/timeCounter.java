package timeCounter;
import timeCounter.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name=Reference.MOD_NAME,version=Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class timeCounter {
	@EventHandler
	public void load(FMLPreInitializationEvent event){
		
	}
	@EventHandler
	public void load(FMLInitializationEvent event){
		
	}
	@EventHandler
	public void load(FMLPostInitializationEvent event){
		
	}
}
 