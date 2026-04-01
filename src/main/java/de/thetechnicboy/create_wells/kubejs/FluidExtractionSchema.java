package de.thetechnicboy.create_wells.kubejs;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import dev.latvian.mods.kubejs.recipe.component.StringComponent;

public interface FluidExtractionSchema {
    RecipeKey<String> FLUID = StringComponent.ID
            .key("fluid");
    RecipeKey<Integer> AMOUNT = NumberComponent.INT
            .key("amount");
    RecipeKey<String> DIRECTION = StringComponent.ANY
            .key("direction").optional("BOTH");
    RecipeKey<Integer> Y_MIN = NumberComponent.INT
            .key("yMin").optional(-255);
    RecipeKey<Integer> Y_MAX = NumberComponent.INT
            .key("yMax").optional(-255);
    RecipeKey<String> BLOCK = StringComponent.ANY
            .key("block").optional("");
    RecipeKey<String> STATE = StringComponent.ANY
            .key("state").optional("[]");
    RecipeKey<Integer> RPM = NumberComponent.INT
            .key("rpm").optional(0);
    RecipeKey<String[]> BIOME = StringComponent.ID
            .asArray().key("biome").optional(new String[]{});
    RecipeKey<String[]> DIMENSION = StringComponent.ID
            .asArray().key("dimension").optional(new String[]{});

    RecipeSchema SCHEMA = new RecipeSchema(FluidExtractionRecipe.class, FluidExtractionRecipe::new, FLUID, AMOUNT, DIRECTION, Y_MIN, Y_MAX, BLOCK, STATE, RPM, BIOME, DIMENSION);
}
