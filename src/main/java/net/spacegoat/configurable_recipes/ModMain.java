package net.spacegoat.configurable_recipes;

import net.fabricmc.api.ModInitializer;
import net.spacegoat.configurable_recipes.config.ModConfig;

public class ModMain implements ModInitializer {
	public static final String MOD_ID = "configurable_recipes";

	@Override
	public void onInitialize() {
		ModConfig config = ModConfig.getConfig();
		if (config.RecipeCategories.enableNewRecipes){
			Recipes.registerNewRecipes();
		}
		if (config.RecipeCategories.enableAlternativeRecipes){
			Recipes.registerAlternativeRecipes();
		}
		if (config.RecipeCategories.enableFleshToLeatherRecipes){
			Recipes.registerRottenFleshToLeatherRecipes();
		}
		if (config.RecipeCategories.enableUndoRecipes){
			Recipes.registerUndoRecipes();
		}
		if (config.RecipeCategories.enableMiscellaneousRecipes){
			Recipes.registerMiscellaneousRecipes();
		}
		if (config.RecipeCategories.enableCollaborationRecipes){
			if (config.RecipeCategories.enableBlockOfRecipes){
				Recipes.CollaborationRecipes.registerBlockOfRecipes();
			}
		}
	}
}
