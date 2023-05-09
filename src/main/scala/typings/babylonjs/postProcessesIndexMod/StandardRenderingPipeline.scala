package typings.babylonjs.postProcessesIndexMod

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/index", "StandardRenderingPipeline")
@js.native
open class StandardRenderingPipeline protected ()
  extends typings.babylonjs.postProcessesRenderPipelineIndexMod.StandardRenderingPipeline {
  /**
    * Default pipeline should be used going forward but the standard pipeline will be kept for backwards compatibility.
    * @constructor
    * @param name The rendering pipeline name
    * @param scene The scene linked to this pipeline
    * @param ratio The size of the postprocesses (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
    * @param originalPostProcess the custom original color post-process. Must be "reusable". Can be null.
    * @param cameras The array of cameras that the rendering pipeline will be attached to
    */
  def this(name: String, scene: Scene, ratio: Double) = this()
  def this(
    name: String,
    scene: Scene,
    ratio: Double,
    originalPostProcess: Nullable[typings.babylonjs.postProcessesPostProcessMod.PostProcess]
  ) = this()
  def this(name: String, scene: Scene, ratio: Double, originalPostProcess: Unit, cameras: js.Array[Camera]) = this()
  def this(
    name: String,
    scene: Scene,
    ratio: Double,
    originalPostProcess: Nullable[typings.babylonjs.postProcessesPostProcessMod.PostProcess],
    cameras: js.Array[Camera]
  ) = this()
}
/* static members */
object StandardRenderingPipeline {
  
  @JSImport("babylonjs/PostProcesses/index", "StandardRenderingPipeline")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Luminance steps
    */
  @JSImport("babylonjs/PostProcesses/index", "StandardRenderingPipeline.LuminanceSteps")
  @js.native
  def LuminanceSteps: Double = js.native
  inline def LuminanceSteps_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LuminanceSteps")(x.asInstanceOf[js.Any])
  
  /**
    * Parse the serialized pipeline
    * @param source Source pipeline.
    * @param scene The scene to load the pipeline to.
    * @param rootUrl The URL of the serialized pipeline.
    * @returns An instantiated pipeline from the serialized object.
    */
  inline def Parse(source: Any, scene: Scene, rootUrl: String): typings.babylonjs.postProcessesRenderPipelinePipelinesStandardRenderingPipelineMod.StandardRenderingPipeline = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.postProcessesRenderPipelinePipelinesStandardRenderingPipelineMod.StandardRenderingPipeline]
}
