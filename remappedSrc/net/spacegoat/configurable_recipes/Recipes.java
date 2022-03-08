package net.spacegoat.configurable_recipes;

import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import net.spacegoat.configurable_recipes.config.ModConfig;

public class Recipes {

    private static final ModConfig config = ModConfig.getConfig();

    public static void registerNewRecipes() {
        if (config.NewRecipes.enableHorseArmorRecipes){
            createRecipe("horse_armor_recipes");
        }
        if (config.NewRecipes.enableSaddleRecipe){
            createRecipe("saddle_recipe");
        }
        if (config.NewRecipes.enableSpongeRecipe){
            createRecipe("sponge_recipe");
        }
        if (config.NewRecipes.enableNameTagRecipe){
            createRecipe("nametag_recipe");
        }
        if (config.NewRecipes.enableTotemOfUndyingRecipe){
            createRecipe("totem_of_undying_recipe");
        }
        if (config.NewRecipes.enableBellRecipe){
            createRecipe("bell_recipe");
        }
        if (config.NewRecipes.enableTridentRecipe){
            createRecipe("trident_recipe");
        }
        if (config.NewRecipes.enableChainmailArmorRecipes){
            createRecipe("chainmail_armor_recipes");
        }
        if (config.NewRecipes.enableCobwebRecipe){
            createRecipe("cobweb_recipe");
        }
        if (config.NewRecipes.enableBundleRecipe){
            createRecipe("bundle_recipe");
        }
    }

    public static void registerAlternativeRecipes() {
        if (config.AlternativeRecipes.enableBonemealMultipliers){
            createRecipe("bonemeal_multiplier_recipes");
        }
        if (config.AlternativeRecipes.saplingToStick){
            createRecipe("sapling_to_stick_recipes");
        }
        if (config.AlternativeRecipes.enableGlowstoneDustRecipe){
            createRecipe("glowstone_dust_recipe");
        }
        if (config.AlternativeRecipes.rottenFleshToBeefFromSmoker){
            createRecipe("rottenflesh_to_beef");
        }
    }

    public static void registerRottenFleshToLeatherRecipes() {
        if (config.FleshToLeather.rottenFleshFromFurnace){
            createRecipe("rottenflesh_to_leather_furnace");
        }
        if (config.FleshToLeather.rottenFleshFromCampfire){
            createRecipe("rottenflesh_to_leather_campfire");
        }
        if (config.FleshToLeather.driedKelpFromFurnace){
            createRecipe("driedkelp_to_leather_furnace");
        }
        if (config.FleshToLeather.driedKelpFromCampfire){
            createRecipe("driedkelp_to_leather_campfire");
        }
    }

    public static void registerUndoRecipes() {
        if (config.UndoRecipes.slabToBlock){
            createRecipe("ladder_to_stick_recipe");
        }
        if (config.UndoRecipes.stairToBlock){
            createRecipe("stair_to_block_recipes");
        }
        if (config.UndoRecipes.ladderToStick){
            createRecipe("ladder_to_stick_recipe");
        }
    }

    public static void registerMiscellaneousRecipes() {
        if (config.Miscellaneous.enableUniversalStone){
            createRecipe("universal_stone_recipes");
        }
    }

    public static class CollaborationRecipes {
        public static void registerBlockOfRecipes() {
            if (config.BlockOfRecipes.enableRottenFleshBlockToLeatherFromFurnace) {
                createRecipe("rottenflesh_block_to_leather_furnace");
            }
            if (config.BlockOfRecipes.enableRottenFleshBlockToLeatherFromCampfire) {
                createRecipe("rottenflesh_block_to_leather_campfire");
            }
        }
    }

    private static void createRecipe(String id){
        String mod = ModMain.MOD_ID;
        FabricLoader.getInstance().getModContainer(mod).ifPresent(modContainer -> ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(mod, id), modContainer, ResourcePackActivationType.DEFAULT_ENABLED));
        System.out.println("Registering" + id + "for" + ModMain.MOD_ID);
    }
}
