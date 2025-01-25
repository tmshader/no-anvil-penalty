package me.tmshader.noRepairPenalty.mixin;

import net.minecraft.screen.AnvilScreenHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AnvilScreenHandler.class)
public class AnvilNextCostMixin {
    @Inject(method = "getNextCost", at = @At("RETURN"), cancellable = true)
    private static void getNextCostMixin(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }
}
