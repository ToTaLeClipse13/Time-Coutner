package timeCounter;
import timeCounter.lib.Reference;
import timeCounter.network.PacketHandler;
import timeCounter.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name=Reference.MOD_NAME,version=Reference.VERSION)
@NetworkMod(channels={"TCount"},clientSideRequired = false, serverSideRequired = false,packetHandler=PacketHandler.class)

public class timeCounter {
	@Instance(Reference.MOD_ID)
	public static timeCounter instance;
	
	@SidedProxy(clientSide="timeCounter.proxies.ClientProxy", serverSide="timeCounter.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void load(FMLPreInitializationEvent event){
		//PreInitialization
		proxy.initRenderers();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event){
		//Initialization
	}
	
	@EventHandler
	public void load(FMLPostInitializationEvent event){
		// PostInitialization
	}
}
 