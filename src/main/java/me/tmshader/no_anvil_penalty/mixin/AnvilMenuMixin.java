package me.tmshader.no_anvil_penalty.mixin;

import net.minecraft.world.inventory.AnvilMenu;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(AnvilMenu.class)
public class AnvilMenuMixin {
    @ModifyArg(
        method = "createResult",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/world/item/ItemStack;set(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;)Ljava/lang/Object;",
            ordinal = 1
        ),
        index = 1
    )
    private Object zeroRepairCost(Object value) {
        return 0;
    }
}