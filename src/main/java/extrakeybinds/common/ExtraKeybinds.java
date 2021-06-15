package extrakeybinds.common;

import io.github.apace100.apoli.ApoliClient;
import io.github.apace100.origins.Origins;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class ExtraKeybinds implements ModInitializer {

	public static KeyBinding useTernaryActivePowerKeybind;
	public static KeyBinding useQuaternaryActivePowerKeybind;
	public static KeyBinding useQuinaryActivePowerKeybind;
	public static KeyBinding useSenaryActivePowerKeybind;
	public static KeyBinding useSeptenaryActivePowerKeybind;
	public static KeyBinding useOctonaryActivePowerKeybind;
	public static KeyBinding useNonaryActivePowerKeybind;
	public static KeyBinding useDenaryActivePowerKeybind;

	@Override
	public void onInitialize() {
		useTernaryActivePowerKeybind = new KeyBinding("key.origins.ternary_active", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		ApoliClient.registerPowerKeybinding("key.origins.ternary_active", useTernaryActivePowerKeybind);
		ApoliClient.registerPowerKeybinding("ternary", useTernaryActivePowerKeybind);
		KeyBindingHelper.registerKeyBinding(useTernaryActivePowerKeybind);

		useQuaternaryActivePowerKeybind = new KeyBinding("key.origins.quaternary_active", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		ApoliClient.registerPowerKeybinding("key.origins.quaternary_active", useQuaternaryActivePowerKeybind);
		ApoliClient.registerPowerKeybinding("quaternary", useQuaternaryActivePowerKeybind);
		KeyBindingHelper.registerKeyBinding(useQuaternaryActivePowerKeybind);

		useQuinaryActivePowerKeybind = new KeyBinding("key.origins.quinary_active", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		ApoliClient.registerPowerKeybinding("key.origins.quinary_active", useQuinaryActivePowerKeybind);
		ApoliClient.registerPowerKeybinding("quinary", useQuinaryActivePowerKeybind);
		KeyBindingHelper.registerKeyBinding(useQuinaryActivePowerKeybind);

		useSenaryActivePowerKeybind = new KeyBinding("key.origins.senary_active", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		ApoliClient.registerPowerKeybinding("key.origins.senary_active", useSenaryActivePowerKeybind);
		ApoliClient.registerPowerKeybinding("senary", useSenaryActivePowerKeybind);
		KeyBindingHelper.registerKeyBinding(useSenaryActivePowerKeybind);

		useSeptenaryActivePowerKeybind = new KeyBinding("key.origins.septenary_active", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		ApoliClient.registerPowerKeybinding("key.origins.septenary_active", useSeptenaryActivePowerKeybind);
		ApoliClient.registerPowerKeybinding("septenary", useSeptenaryActivePowerKeybind);
		KeyBindingHelper.registerKeyBinding(useSeptenaryActivePowerKeybind);

		useOctonaryActivePowerKeybind = new KeyBinding("key.origins.octonary_active", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		ApoliClient.registerPowerKeybinding("key.origins.octonary_active", useOctonaryActivePowerKeybind);
		ApoliClient.registerPowerKeybinding("octonary", useOctonaryActivePowerKeybind);
		KeyBindingHelper.registerKeyBinding(useOctonaryActivePowerKeybind);

		useNonaryActivePowerKeybind = new KeyBinding("key.origins.nonary_active", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		ApoliClient.registerPowerKeybinding("key.origins.nonary_active", useNonaryActivePowerKeybind);
		ApoliClient.registerPowerKeybinding("nonnary", useNonaryActivePowerKeybind);
		KeyBindingHelper.registerKeyBinding(useNonaryActivePowerKeybind);

		useDenaryActivePowerKeybind = new KeyBinding("key.origins.denary_active", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		ApoliClient.registerPowerKeybinding("key.origins.denary_active", useDenaryActivePowerKeybind);
		ApoliClient.registerPowerKeybinding("denary", useDenaryActivePowerKeybind);
		KeyBindingHelper.registerKeyBinding(useDenaryActivePowerKeybind);
	}
}
