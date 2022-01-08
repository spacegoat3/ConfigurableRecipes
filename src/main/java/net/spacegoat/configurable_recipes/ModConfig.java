package net.spacegoat.configurable_recipes;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = ModMain.MOD_ID)
@Config.Gui.Background("minecraft:textures/block/crafting_table_top.png")
public class ModConfig implements ConfigData {

        @ConfigEntry.Gui.Excluded
    private transient static boolean registered = false;

    @ConfigEntry.Gui.TransitiveObject
    public RecipeCategories RecipeCategories = new RecipeCategories();

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("vanilla_recipes")
    public Recipes VanillaRecipes = new Recipes();

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("rotten_flesh_to_leather")
    public RottenFleshToLeather FleshToLeather = new RottenFleshToLeather();

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("undo_recipes")
    public UndoRecipes UndoRecipes = new UndoRecipes();

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("miscellaneous")
    public Miscellaneous Miscellaneous = new Miscellaneous();

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("blockof_recipes")
    public BlockOfRecipes BlockOfRecipes = new BlockOfRecipes();

    public static synchronized ModConfig getConfig() {
        if (!registered) {
            AutoConfig.register(ModConfig.class, JanksonConfigSerializer::new);
            registered = true;
        }
        return AutoConfig.getConfigHolder(ModConfig.class).getConfig();
    }
    public static class RecipeCategories{
        @ConfigEntry.Gui.RequiresRestart
        @Comment("Enables all Vanilla Recipe type recipes.")
        public boolean enableVanillaRecipes = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("Enables all Rotten Flesh to Leather Recipe type recipes.")
        public boolean enableFleshToLeatherRecipes = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("Enables all Undo Recipe type recipes.")
        public boolean enableUndoRecipes = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("Enables use of multiple items from the same category for recipes.")
        public boolean enableMiscellaneous = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("(Requires Block Of... Mod) Enables all Block Of... Recipes")
        public boolean enableBlockOfRecipes = true;
    }
    public static class Recipes {
        @ConfigEntry.Gui.RequiresRestart
        @Comment("6 Source Material + 1 Leather = Horse Armor")
        public boolean enableHorseArmorRecipes = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("5 Leather + 1 Iron Ingot + 2 Tripwire Hook = Saddle")
        public boolean enableSaddleRecipe = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("4 Yellow Wool + 4 Any Type of Seed + 1 Magma Cream = Sponge")
        public boolean enableSpongeRecipe = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("4 Redstone + 5 Gold Nuggets = 4 Glowstone Dust")
        public boolean enableGlowstoneDustRecipe = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("2 Maps + 3 Strings = Name Tag")
        public boolean enableNameTagRecipe = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("1 Any Sapling = 2 Sticks")
        public boolean saplingToStick = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("2 Emeralds + 4 Golden Ingots + 1 Nether Star = Totem of Undying")
        public boolean enableTotemOfUndyingRecipe = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("3 Any Type Of Logs + 1 Gold Block + 3 Gold Ingots")
        public boolean enableBellRecipe = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("3 Nether Quartz + 3 Prismarine Shards + 1 Prismarine = Trident")
        public boolean enableTridentRecipe = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("All recipes contain Iron Ingots and Chains. Please check the Wiki for the recipes.")
        public boolean enableChainmailArmorRecipes = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("5 Strings in X shape = Cobweb")
        public boolean enableCobwebRecipe = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("1 Dirt/Grass + Rotten Flesh + 1 Bone Meal = 3 Dirt/Grass")
        public boolean enableBonemealMultipliers = true;
    }
    public static class RottenFleshToLeather{
        @ConfigEntry.Gui.RequiresRestart
        @Comment("40 Seconds / 800 Ticks - 0.5 Experience")
        public boolean rottenFleshFromFurnace = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("40 Seconds / 800 Ticks - 1 Experience")
        public boolean rottenFleshFromCampfire = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("23 Seconds / 460 Ticks - 0.5 Experience")
        public boolean driedKelpFromFurnace = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("23 Seconds / 460 Ticks - 1 Experience")
        public boolean driedKelpFromCampfire = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("50 Seconds / 1000 Ticks - 1.5 Experience")
        public boolean rottenFleshToBeefFromSmoker = true;
    }
    public static class UndoRecipes{
        @ConfigEntry.Gui.RequiresRestart
        @Comment("6 Slabs paced horizontally = 3 Blocks")
        public boolean slabToBlock = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("4 Stairs in a square shape = 6 Blocks")
        public boolean stairToBlock = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("3 Ladders in a horizontal or vertical row = 7 Sticks")
        public boolean ladderToStick = true;
    }
    public static class Miscellaneous{
        @ConfigEntry.Gui.RequiresRestart
        @Comment("Multiple stone type blocks in Tool, Furnace, Dispenser, Dropper, Brewing Stand recipes")
        public boolean enableUniversalStone = true;
    }
    public static class BlockOfRecipes{
        @ConfigEntry.Gui.RequiresRestart
        @Comment("(Requires BlockOf...) 6 Minutes / 7200 Ticks - 0.5 Experience")
        public boolean enableRottenFleshBlockToLeatherFromFurnace = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("(Requires Block Of...) 6 Minutes / 7200 Ticks - 1 Experience")
        public boolean enableRottenFleshBlockToLeatherFromCampfire = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("(Requires Block Of...) 3 Minutes 27 Seconds / 4140 Ticks - 0.5 Experience")
        public boolean enableDriedKelpBlockFromFurnace = true;
        @ConfigEntry.Gui.RequiresRestart
        @Comment("(Requires Block Of...) 3 Minutes 27 Seconds / 4140 Ticks - 1 Experience")
        public boolean enableDriedKelpBlockFromCampfire = true;
    }
}
