package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.PostProcessOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ScreenSpaceReflectionPostProcess")
@js.native
open class ScreenSpaceReflectionPostProcess protected ()
  extends StObject
     with typings.babylonjs.BABYLON.ScreenSpaceReflectionPostProcess {
  /**
    * Creates a new instance of ScreenSpaceReflectionPostProcess.
    * @param name The name of the effect.
    * @param scene The scene containing the objects to calculate reflections.
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param textureType Type of textures used when performing the post process. (default: 0)
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: true)
    * @param forceGeometryBuffer If this post process should use geometry buffer instead of prepass (default: false)
    */
  def this(
    name: String,
    scene: typings.babylonjs.BABYLON.Scene,
    options: Double | PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typings.babylonjs.BABYLON.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    blockCompilation: js.UndefOr[Boolean],
    forceGeometryBuffer: js.UndefOr[Boolean]
  ) = this()
}
/* static members */
object ScreenSpaceReflectionPostProcess {
  
  @JSGlobal("BABYLON.ScreenSpaceReflectionPostProcess")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @internal
    */
  inline def _Parse(
    parsedPostProcess: Any,
    targetCamera: typings.babylonjs.BABYLON.Camera,
    scene: typings.babylonjs.BABYLON.Scene,
    rootUrl: String
  ): typings.babylonjs.BABYLON.ScreenSpaceReflectionPostProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedPostProcess.asInstanceOf[js.Any], targetCamera.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.ScreenSpaceReflectionPostProcess]
}