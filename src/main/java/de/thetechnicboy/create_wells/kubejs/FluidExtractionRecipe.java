package de.thetechnicboy.create_wells.kubejs;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import dev.latvian.mods.kubejs.recipe.RecipeJS;

public class FluidExtractionRecipe extends RecipeJS {
    @Override
    public void serialize(){
        JsonObject condition = new JsonObject();
        condition.addProperty("direction", getValue(FluidExtractionSchema.DIRECTION));
        condition.addProperty("yMin", getValue(FluidExtractionSchema.Y_MIN));
        condition.addProperty("yMax", getValue(FluidExtractionSchema.Y_MAX));
        condition.addProperty("block", getValue(FluidExtractionSchema.BLOCK));
        condition.addProperty("state", getValue(FluidExtractionSchema.STATE));
        condition.addProperty("rpm", getValue(FluidExtractionSchema.RPM));

        JsonArray biomes = new JsonArray();
        for (String b : getValue(FluidExtractionSchema.BIOME)) biomes.add(b);
        condition.add("biome", biomes);

        JsonArray dimensions = new JsonArray();
        for (String d : getValue(FluidExtractionSchema.DIMENSION)) dimensions.add(d);
        condition.add("dimension", dimensions);

        json.add("condition", condition);

        JsonObject output = new JsonObject();
        output.addProperty("fluid", getValue(FluidExtractionSchema.FLUID));
        output.addProperty("amount", getValue(FluidExtractionSchema.AMOUNT));

        json.add("output", output);
    }

}
