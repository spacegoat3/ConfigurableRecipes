package net.spacegoat.configurable_recipes;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModMain implements ModInitializer {
	public static final String MOD_ID = "configurable_recipes";
	public static final Logger LOGGER = LogManager.getLogger("configurable_recipes");

	@Override
	public void onInitialize() {

		//UNCRAFTABLE ITEM RECIPES
		if (ModConfig.getConfig().UncraftableItemRecipes.enableSaddleRecipe && ModConfig.getConfig().RecipeCategories.enableUncraftableItemRecipes){
			saddleRecipe();
		}
		if (ModConfig.getConfig().UncraftableItemRecipes.enableHorseArmorRecipes && ModConfig.getConfig().RecipeCategories.enableUncraftableItemRecipes){
			horseArmorRecipes();
		}
		if (ModConfig.getConfig().UncraftableItemRecipes.enableSpongeRecipe && ModConfig.getConfig().RecipeCategories.enableUncraftableItemRecipes){
			spongeRecipe();
		}
		if (ModConfig.getConfig().UncraftableItemRecipes.enableNameTagRecipe && ModConfig.getConfig().RecipeCategories.enableUncraftableItemRecipes){
			nametagRecipe();
		}
		if (ModConfig.getConfig().UncraftableItemRecipes.enableTotemOfUndyingRecipe && ModConfig.getConfig().RecipeCategories.enableUncraftableItemRecipes){
			totemOfUndyingRecipe();
		}
		if (ModConfig.getConfig().UncraftableItemRecipes.enableBellRecipe && ModConfig.getConfig().RecipeCategories.enableUncraftableItemRecipes){
			bellRecipe();
		}
		if (ModConfig.getConfig().UncraftableItemRecipes.enableTridentRecipe && ModConfig.getConfig().RecipeCategories.enableUncraftableItemRecipes){
			tridentRecipe();
		}
		if (ModConfig.getConfig().UncraftableItemRecipes.enableChainmailArmorRecipes && ModConfig.getConfig().RecipeCategories.enableUncraftableItemRecipes){
			chainmailArmorRecipes();
		}
		if (ModConfig.getConfig().UncraftableItemRecipes.enableCobwebRecipe && ModConfig.getConfig().RecipeCategories.enableUncraftableItemRecipes){
			cobwebRecipe();
		}


		//ALTERNATIVE
		if (ModConfig.getConfig().AlternativeItemRecipes.enableBonemealMultipliers && ModConfig.getConfig().RecipeCategories.enableAlternativeItemRecipes){
			bonemealMultiplierRecipes();
		}
		if (ModConfig.getConfig().AlternativeItemRecipes.saplingToStick && ModConfig.getConfig().RecipeCategories.enableAlternativeItemRecipes){
			saplingToStickRecipes();
		}
		if (ModConfig.getConfig().AlternativeItemRecipes.enableGlowstoneDustRecipe && ModConfig.getConfig().RecipeCategories.enableAlternativeItemRecipes){
			glowstoneDustRecipe();
		}
		if (ModConfig.getConfig().AlternativeItemRecipes.rottenFleshToBeefFromSmoker && ModConfig.getConfig().RecipeCategories.enableAlternativeItemRecipes){
			rottenFleshToBeef();
		}

		//ROTTEN FLESH TO LEATHER
		if (ModConfig.getConfig().FleshToLeather.rottenFleshFromFurnace && ModConfig.getConfig().RecipeCategories.enableFleshToLeatherRecipes){
			rottenFleshToLeatherFromFurnace();
		}
		if (ModConfig.getConfig().FleshToLeather.rottenFleshFromCampfire && ModConfig.getConfig().RecipeCategories.enableFleshToLeatherRecipes){
			rottenFleshToLeatherFromCampfire();
		}
		if (ModConfig.getConfig().FleshToLeather.driedKelpFromFurnace && ModConfig.getConfig().RecipeCategories.enableFleshToLeatherRecipes){
            driedKelpToLeatherFurnace();
		}
		if (ModConfig.getConfig().FleshToLeather.driedKelpFromCampfire && ModConfig.getConfig().RecipeCategories.enableFleshToLeatherRecipes){
			driedKelpToLeatherCampfire();
		}


		//UNDO RECIPES
		if (ModConfig.getConfig().UndoRecipes.slabToBlock && ModConfig.getConfig().RecipeCategories.enableUndoRecipes){
			slabToBlockRecipes();
		}
		if (ModConfig.getConfig().UndoRecipes.stairToBlock && ModConfig.getConfig().RecipeCategories.enableUndoRecipes){
			stairToBlockRecipes();
		}
		if (ModConfig.getConfig().UndoRecipes.ladderToStick && ModConfig.getConfig().RecipeCategories.enableUndoRecipes){
			ladderToStickRecipe();
		}


		//MISCELLANEOUS
		if (ModConfig.getConfig().Miscellaneous.enableUniversalStone && ModConfig.getConfig().RecipeCategories.enableMiscellaneous){
			universalStoneRecipes();
		}


		//MODDED RECIPES

		//BLOCK OF...
		if (ModConfig.getConfig().BlockOfRecipes.enableRottenFleshBlockToLeatherFromFurnace && ModConfig.getConfig().RecipeCategories.enableBlockOfRecipes){
			rottenFleshBlockToLeatherFurnace();
		}
		if (ModConfig.getConfig().BlockOfRecipes.enableRottenFleshBlockToLeatherFromCampfire && ModConfig.getConfig().RecipeCategories.enableBlockOfRecipes){
			rottenFleshBlockToLeatherCampfire();
		}
		if (ModConfig.getConfig().BlockOfRecipes.enableDriedKelpBlockFromCampfire && ModConfig.getConfig().RecipeCategories.enableBlockOfRecipes){
			driedKelpBlockToLeatherCampfire();
		}
		if (ModConfig.getConfig().BlockOfRecipes.enableDriedKelpBlockFromFurnace && ModConfig.getConfig().RecipeCategories.enableBlockOfRecipes){
			driedKelpBlockToLeatherFurnace();
		}
	}


	//NORMAL RECIPES
	private void saddleRecipe() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "saddle_recipe"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void horseArmorRecipes() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "horse_armor_recipes"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void spongeRecipe() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "sponge_recipe"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void glowstoneDustRecipe() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "glowstone_dust_recipe"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void nametagRecipe() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "nametag_recipe"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void saplingToStickRecipes() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "sapling_to_stick_recipes"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void totemOfUndyingRecipe(){
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added  = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "totem_of_undying_recipe"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void bellRecipe(){
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added  = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "bell_recipe"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void tridentRecipe(){
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added  = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "trident_recipe"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void chainmailArmorRecipes(){
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added  = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "chainmail_armor_recipes"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void cobwebRecipe(){
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added  = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "cobweb_recipe"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void bonemealMultiplierRecipes() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "bonemeal_multiplier_recipes"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}


	//ROTTEN FLESH TO LEATHER
	private void rottenFleshToLeatherFromFurnace() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "rottenflesh_to_leather_furnace"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void rottenFleshToLeatherFromCampfire() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "rottenflesh_to_leather_campfire"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void rottenFleshToBeef() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "rottenflesh_to_beef"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void driedKelpToLeatherFurnace() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "driedkelp_to_leather_furnace"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void driedKelpToLeatherCampfire() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "driedkelp_to_leather_campfire"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void driedKelpBlockToLeatherFurnace() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "driedkelp_block_to_leather_furnace"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void driedKelpBlockToLeatherCampfire() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "driedkelp_block_to_leather_campfire"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}



	//UNDO RECIPES
	private void slabToBlockRecipes() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "slab_to_block_recipes"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void stairToBlockRecipes() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "stair_to_block_recipes"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void ladderToStickRecipe() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "ladder_to_stick_recipe"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}


	//MISCELLANEOUS
	private void universalStoneRecipes() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "universal_stone_recipes"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}

	//MODDED RECIPES
	//BLOCK OF...
	private void rottenFleshBlockToLeatherFurnace() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "rottenflesh_block_to_leather_furnace"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void rottenFleshBlockToLeatherCampfire() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "rottenflesh_block_to_leather_campfire"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
}
