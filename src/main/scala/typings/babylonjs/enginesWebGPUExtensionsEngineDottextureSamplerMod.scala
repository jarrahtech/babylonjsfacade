package typings.babylonjs

import typings.babylonjs.materialsTexturesTextureSamplerMod.TextureSampler
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesWebGPUExtensionsEngineDottextureSamplerMod {
  
  /* augmented module */
  object babylonjsMaterialsEffectAugmentingMod {
    
    trait Effect extends StObject {
      
      /**
        * Sets a sampler on the engine to be used in the shader.
        * @param name Name of the sampler variable.
        * @param sampler Sampler to set.
        */
      def setTextureSampler(name: String, sampler: Nullable[TextureSampler]): Unit
    }
    object Effect {
      
      inline def apply(setTextureSampler: (String, Nullable[TextureSampler]) => Unit): Effect = {
        val __obj = js.Dynamic.literal(setTextureSampler = js.Any.fromFunction2(setTextureSampler))
        __obj.asInstanceOf[Effect]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Effect] (val x: Self) extends AnyVal {
        
        inline def setSetTextureSampler(value: (String, Nullable[TextureSampler]) => Unit): Self = StObject.set(x, "setTextureSampler", js.Any.fromFunction2(value))
      }
    }
  }
}
