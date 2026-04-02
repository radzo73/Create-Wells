package de.thetechnicboy.create_wells.kubejs;

import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.recipe.schema.RegisterRecipeSchemasEvent;

import static de.thetechnicboy.create_wells.CreateWells.MODID;

public class plugin extends KubeJSPlugin {
    @Override
    public void registerRecipeSchemas(RegisterRecipeSchemasEvent event){
        event.namespace(MODID)
                .register("fluid_extraction", FluidExtractionSchema.SCHEMA)
        ;
    }
}
