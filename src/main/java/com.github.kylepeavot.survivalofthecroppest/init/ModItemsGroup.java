package com.github.kylepeavot.survivalofthecroppest.init;

import com.github.kylepeavot.survivalofthecroppest.SurvivalOfTheCroppestMain;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.function.Supplier;

public class ModItemsGroup {

  public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(
    SurvivalOfTheCroppestMain.MODID,
    () -> new ItemStack(ModItems.EXAMPLE_ITEM)
  );

  public static class ModItemGroup extends ItemGroup {

    private final Supplier<ItemStack> iconSupplier;

    public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
      super(name);
      this.iconSupplier = iconSupplier;
    }

    @Override
    public ItemStack createIcon() {
      return iconSupplier.get();
    }
  }
}
