package typings.babylonjs

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object probesIndexMod {
  
  @JSImport("babylonjs/Probes/index", "ReflectionProbe")
  @js.native
  open class ReflectionProbe protected ()
    extends typings.babylonjs.probesReflectionProbeMod.ReflectionProbe {
    /**
      * Creates a new reflection probe
      * @param name defines the name of the probe
      * @param size defines the texture resolution (for each face)
      * @param scene defines the hosting scene
      * @param generateMipMaps defines if mip maps should be generated automatically (true by default)
      * @param useFloat defines if HDR data (float data) should be used to store colors (false by default)
      * @param linearSpace defines if the probe should be generated in linear space or not (false by default)
      */
    def this(/** defines the name of the probe */
    name: String, size: Double, scene: Scene) = this()
    def this(
      /** defines the name of the probe */
    name: String,
      size: Double,
      scene: Scene,
      generateMipMaps: Boolean
    ) = this()
    def this(
      /** defines the name of the probe */
    name: String,
      size: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      useFloat: Boolean
    ) = this()
    def this(
      /** defines the name of the probe */
    name: String,
      size: Double,
      scene: Scene,
      generateMipMaps: Unit,
      useFloat: Boolean
    ) = this()
    def this(
      /** defines the name of the probe */
    name: String,
      size: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      useFloat: Boolean,
      linearSpace: Boolean
    ) = this()
    def this(
      /** defines the name of the probe */
    name: String,
      size: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      useFloat: Unit,
      linearSpace: Boolean
    ) = this()
    def this(
      /** defines the name of the probe */
    name: String,
      size: Double,
      scene: Scene,
      generateMipMaps: Unit,
      useFloat: Boolean,
      linearSpace: Boolean
    ) = this()
    def this(
      /** defines the name of the probe */
    name: String,
      size: Double,
      scene: Scene,
      generateMipMaps: Unit,
      useFloat: Unit,
      linearSpace: Boolean
    ) = this()
  }
  /* static members */
  object ReflectionProbe {
    
    @JSImport("babylonjs/Probes/index", "ReflectionProbe")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parse the JSON representation of a reflection probe in order to recreate the reflection probe in the given scene.
      * @param parsedReflectionProbe Define the JSON representation of the reflection probe
      * @param scene Define the scene the parsed reflection probe should be instantiated in
      * @param rootUrl Define the root url of the parsing sequence in the case of relative dependencies
      * @returns The parsed reflection probe if successful
      */
    inline def Parse(parsedReflectionProbe: Any, scene: Scene, rootUrl: String): Nullable[typings.babylonjs.probesReflectionProbeMod.ReflectionProbe] = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedReflectionProbe.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.probesReflectionProbeMod.ReflectionProbe]]
  }
  
  /* augmented module */
  object babylonjsAbstractSceneAugmentingMod {
    
    trait AbstractScene extends StObject {
      
      /**
        * Adds the given reflection probe to this scene.
        * @param newReflectionProbe The reflection probe to add
        */
      def addReflectionProbe(newReflectionProbe: typings.babylonjs.probesReflectionProbeMod.ReflectionProbe): Unit
      
      /**
        * The list of reflection probes added to the scene
        * @see https://doc.babylonjs.com/features/featuresDeepDive/environment/reflectionProbes
        */
      var reflectionProbes: js.Array[typings.babylonjs.probesReflectionProbeMod.ReflectionProbe]
      
      /**
        * Removes the given reflection probe from this scene.
        * @param toRemove The reflection probe to remove
        * @returns The index of the removed reflection probe
        */
      def removeReflectionProbe(toRemove: typings.babylonjs.probesReflectionProbeMod.ReflectionProbe): Double
    }
    object AbstractScene {
      
      inline def apply(
        addReflectionProbe: typings.babylonjs.probesReflectionProbeMod.ReflectionProbe => Unit,
        reflectionProbes: js.Array[typings.babylonjs.probesReflectionProbeMod.ReflectionProbe],
        removeReflectionProbe: typings.babylonjs.probesReflectionProbeMod.ReflectionProbe => Double
      ): AbstractScene = {
        val __obj = js.Dynamic.literal(addReflectionProbe = js.Any.fromFunction1(addReflectionProbe), reflectionProbes = reflectionProbes.asInstanceOf[js.Any], removeReflectionProbe = js.Any.fromFunction1(removeReflectionProbe))
        __obj.asInstanceOf[AbstractScene]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AbstractScene] (val x: Self) extends AnyVal {
        
        inline def setAddReflectionProbe(value: typings.babylonjs.probesReflectionProbeMod.ReflectionProbe => Unit): Self = StObject.set(x, "addReflectionProbe", js.Any.fromFunction1(value))
        
        inline def setReflectionProbes(value: js.Array[typings.babylonjs.probesReflectionProbeMod.ReflectionProbe]): Self = StObject.set(x, "reflectionProbes", value.asInstanceOf[js.Any])
        
        inline def setReflectionProbesVarargs(value: typings.babylonjs.probesReflectionProbeMod.ReflectionProbe*): Self = StObject.set(x, "reflectionProbes", js.Array(value*))
        
        inline def setRemoveReflectionProbe(value: typings.babylonjs.probesReflectionProbeMod.ReflectionProbe => Double): Self = StObject.set(x, "removeReflectionProbe", js.Any.fromFunction1(value))
      }
    }
  }
}
