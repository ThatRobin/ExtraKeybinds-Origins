package extrakeybinds.common;

import io.github.apace100.apoli.ApoliClient;
import io.github.apace100.origins.Origins;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

import java.util.List;

public class ExtraKeybinds implements ClientModInitializer {

	public List<String> keys = List.of("ternary","quaternary","quinary","senary","septenary","octonary","nonary","denary");

	@Override
	public void onInitializeClient() {
		for(String key : keys) {
			KeyBinding binding = new KeyBinding("key.origins."+key+"_active", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
			ApoliClient.registerPowerKeybinding(binding.getTranslationKey(), binding);
			ApoliClient.registerPowerKeybinding(key, binding);
			KeyBindingHelper.registerKeyBinding(binding);
		}
	}
}
