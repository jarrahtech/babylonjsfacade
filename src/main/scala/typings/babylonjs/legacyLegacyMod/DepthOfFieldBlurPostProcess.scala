package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.postProcessesPostProcessMod.PostProcessOptions
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "DepthOfFieldBlurPostProcess")
@js.native
open class DepthOfFieldBlurPostProcess protected ()
  extends typings.babylonjs.indexMod.DepthOfFieldBlurPostProcess {
  /**
    * Creates a new instance DepthOfFieldBlurPostProcess
    * @param name The name of the effect.
    * @param scene The scene the effect belongs to.
    * @param direction The direction the blur should be applied.
    * @param kernel The size of the kernel used to blur.
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param circleOfConfusion The circle of confusion + depth map to be used to avoid blurring across edges
    * @param imageToBlur The image to apply the blur to (default: Current rendered frame)
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param textureType Type of textures used when performing the post process. (default: 0)
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    * @param textureFormat Format of textures used when performing the post process. (default: TEXTUREFORMAT_RGBA)
    */
  def this(
    name: String,
    scene: typings.babylonjs.sceneMod.Scene,
    direction: typings.babylonjs.mathsMathDotvectorMod.Vector2,
    kernel: Double,
    options: Double | PostProcessOptions,
    camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
    circleOfConfusion: typings.babylonjs.postProcessesPostProcessMod.PostProcess,
    imageToBlur: js.UndefOr[Nullable[typings.babylonjs.postProcessesPostProcessMod.PostProcess]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typings.babylonjs.enginesEngineMod.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    blockCompilation: js.UndefOr[Boolean],
    textureFormat: js.UndefOr[Double]
  ) = this()
}
