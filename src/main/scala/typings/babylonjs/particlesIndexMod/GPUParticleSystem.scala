package typings.babylonjs.particlesIndexMod

import typings.babylonjs.anon.Partialcapacitynumberrand
import typings.babylonjs.enginesThinEngineMod.ThinEngine
import typings.babylonjs.materialsEffectMod.Effect
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Particles/index", "GPUParticleSystem")
@js.native
open class GPUParticleSystem protected ()
  extends typings.babylonjs.particlesGpuParticleSystemMod.GPUParticleSystem {
  def this(name: String, options: Partialcapacitynumberrand, sceneOrEngine: ThinEngine) = this()
  /**
    * Instantiates a GPU particle system.
    * Particles are often small sprites used to simulate hard-to-reproduce phenomena like fire, smoke, water, or abstract visual effects like magic glitter and faery dust.
    * @param name The name of the particle system
    * @param options The options used to create the system
    * @param sceneOrEngine The scene the particle system belongs to or the engine to use if no scene
    * @param customEffect a custom effect used to change the way particles are rendered by default
    * @param isAnimationSheetEnabled Must be true if using a spritesheet to animate the particles texture
    */
  def this(name: String, options: Partialcapacitynumberrand, sceneOrEngine: Scene) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: ThinEngine,
    customEffect: Nullable[Effect]
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: Scene,
    customEffect: Nullable[Effect]
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: ThinEngine,
    customEffect: Unit,
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: ThinEngine,
    customEffect: Nullable[Effect],
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: Scene,
    customEffect: Unit,
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: Scene,
    customEffect: Nullable[Effect],
    isAnimationSheetEnabled: Boolean
  ) = this()
}
/* static members */
object GPUParticleSystem {
  
  @JSImport("babylonjs/Particles/index", "GPUParticleSystem")
  @js.native
  val ^ : js.Any = js.native
  
  inline def Parse(parsedParticleSystem: Any, sceneOrEngine: ThinEngine, rootUrl: String): typings.babylonjs.particlesGpuParticleSystemMod.GPUParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particlesGpuParticleSystemMod.GPUParticleSystem]
  inline def Parse(parsedParticleSystem: Any, sceneOrEngine: ThinEngine, rootUrl: String, doNotStart: Boolean): typings.babylonjs.particlesGpuParticleSystemMod.GPUParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particlesGpuParticleSystemMod.GPUParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: ThinEngine,
    rootUrl: String,
    doNotStart: Boolean,
    capacity: Double
  ): typings.babylonjs.particlesGpuParticleSystemMod.GPUParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particlesGpuParticleSystemMod.GPUParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: ThinEngine,
    rootUrl: String,
    doNotStart: Unit,
    capacity: Double
  ): typings.babylonjs.particlesGpuParticleSystemMod.GPUParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particlesGpuParticleSystemMod.GPUParticleSystem]
  /**
    * Parses a JSON object to create a GPU particle system.
    * @param parsedParticleSystem The JSON object to parse
    * @param sceneOrEngine The scene or the engine to create the particle system in
    * @param rootUrl The root url to use to load external dependencies like texture
    * @param doNotStart Ignore the preventAutoStart attribute and does not start
    * @param capacity defines the system capacity (if null or undefined the sotred capacity will be used)
    * @returns the parsed GPU particle system
    */
  inline def Parse(parsedParticleSystem: Any, sceneOrEngine: Scene, rootUrl: String): typings.babylonjs.particlesGpuParticleSystemMod.GPUParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particlesGpuParticleSystemMod.GPUParticleSystem]
  inline def Parse(parsedParticleSystem: Any, sceneOrEngine: Scene, rootUrl: String, doNotStart: Boolean): typings.babylonjs.particlesGpuParticleSystemMod.GPUParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particlesGpuParticleSystemMod.GPUParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: Scene,
    rootUrl: String,
    doNotStart: Boolean,
    capacity: Double
  ): typings.babylonjs.particlesGpuParticleSystemMod.GPUParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particlesGpuParticleSystemMod.GPUParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: Scene,
    rootUrl: String,
    doNotStart: Unit,
    capacity: Double
  ): typings.babylonjs.particlesGpuParticleSystemMod.GPUParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particlesGpuParticleSystemMod.GPUParticleSystem]
  
  /**
    * @internal
    */
  inline def _GetAttributeNamesOrOptions(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")().asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(hasColorGradients: Boolean): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(hasColorGradients: Boolean, isAnimationSheetEnabled: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(hasColorGradients: Boolean, isAnimationSheetEnabled: Boolean, isBillboardBased: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(
    hasColorGradients: Boolean,
    isAnimationSheetEnabled: Boolean,
    isBillboardBased: Boolean,
    isBillboardStretched: Boolean
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], isBillboardStretched.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(
    hasColorGradients: Boolean,
    isAnimationSheetEnabled: Boolean,
    isBillboardBased: Unit,
    isBillboardStretched: Boolean
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], isBillboardStretched.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(hasColorGradients: Boolean, isAnimationSheetEnabled: Unit, isBillboardBased: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(
    hasColorGradients: Boolean,
    isAnimationSheetEnabled: Unit,
    isBillboardBased: Boolean,
    isBillboardStretched: Boolean
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], isBillboardStretched.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(
    hasColorGradients: Boolean,
    isAnimationSheetEnabled: Unit,
    isBillboardBased: Unit,
    isBillboardStretched: Boolean
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], isBillboardStretched.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(hasColorGradients: Unit, isAnimationSheetEnabled: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(hasColorGradients: Unit, isAnimationSheetEnabled: Boolean, isBillboardBased: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(
    hasColorGradients: Unit,
    isAnimationSheetEnabled: Boolean,
    isBillboardBased: Boolean,
    isBillboardStretched: Boolean
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], isBillboardStretched.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(
    hasColorGradients: Unit,
    isAnimationSheetEnabled: Boolean,
    isBillboardBased: Unit,
    isBillboardStretched: Boolean
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], isBillboardStretched.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(hasColorGradients: Unit, isAnimationSheetEnabled: Unit, isBillboardBased: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(
    hasColorGradients: Unit,
    isAnimationSheetEnabled: Unit,
    isBillboardBased: Boolean,
    isBillboardStretched: Boolean
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], isBillboardStretched.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(
    hasColorGradients: Unit,
    isAnimationSheetEnabled: Unit,
    isBillboardBased: Unit,
    isBillboardStretched: Boolean
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], isBillboardStretched.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  /**
    * @internal
    */
  inline def _GetEffectCreationOptions(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetEffectCreationOptions")().asInstanceOf[js.Array[String]]
  inline def _GetEffectCreationOptions(isAnimationSheetEnabled: Boolean): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetEffectCreationOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def _GetEffectCreationOptions(isAnimationSheetEnabled: Boolean, useLogarithmicDepth: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetEffectCreationOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], useLogarithmicDepth.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetEffectCreationOptions(isAnimationSheetEnabled: Unit, useLogarithmicDepth: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetEffectCreationOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], useLogarithmicDepth.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
