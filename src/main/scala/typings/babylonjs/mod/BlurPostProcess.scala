package typings.babylonjs.mod

import typings.babylonjs.postProcessesPostProcessMod.PostProcessOptions
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "BlurPostProcess")
@js.native
open class BlurPostProcess protected ()
  extends typings.babylonjs.legacyLegacyMod.BlurPostProcess {
  /**
    * Creates a new instance BlurPostProcess
    * @param name The name of the effect.
    * @param direction The direction in which to blur the image.
    * @param kernel The size of the kernel to be used when computing the blur. eg. Size of 3 will blur the center pixel by 2 pixels surrounding it.
    * @param options The required width/height ratio to downsize to before computing the render pass. (Use 1.0 for full size)
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param textureType Type of textures used when performing the post process. (default: 0)
    * @param defines
    * @param _blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    * @param textureFormat Format of textures used when performing the post process. (default: TEXTUREFORMAT_RGBA)
    */
  def this(
    name: String,
    direction: typings.babylonjs.mathsMathDotvectorMod.Vector2,
    kernel: Double,
    options: Double | PostProcessOptions,
    camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typings.babylonjs.enginesEngineMod.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    defines: js.UndefOr[String],
    _blockCompilation: js.UndefOr[Boolean],
    textureFormat: js.UndefOr[Double]
  ) = this()
}
/* static members */
object BlurPostProcess {
  
  @JSImport("babylonjs", "BlurPostProcess")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @internal
    */
  inline def _Parse(
    parsedPostProcess: Any,
    targetCamera: typings.babylonjs.camerasCameraMod.Camera,
    scene: typings.babylonjs.sceneMod.Scene,
    rootUrl: String
  ): Nullable[typings.babylonjs.postProcessesBlurPostProcessMod.BlurPostProcess] = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedPostProcess.asInstanceOf[js.Any], targetCamera.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.postProcessesBlurPostProcessMod.BlurPostProcess]]
}
