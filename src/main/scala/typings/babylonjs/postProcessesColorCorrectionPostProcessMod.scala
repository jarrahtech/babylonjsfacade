package typings.babylonjs

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.postProcessesPostProcessMod.PostProcess
import typings.babylonjs.postProcessesPostProcessMod.PostProcessOptions
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postProcessesColorCorrectionPostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/colorCorrectionPostProcess", "ColorCorrectionPostProcess")
  @js.native
  open class ColorCorrectionPostProcess protected () extends PostProcess {
    def this(name: String, colorTableUrl: String, options: Double, camera: Nullable[Camera]) = this()
    def this(name: String, colorTableUrl: String, options: PostProcessOptions, camera: Nullable[Camera]) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Unit,
      engine: Engine
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Unit,
      engine: Engine
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Unit,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Unit,
      engine: Unit,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Unit,
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Unit,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Unit,
      engine: Unit,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Unit,
      engine: Engine,
      reusable: Boolean
    ) = this()
    
    /* private */ var _colorTableTexture: Any = js.native
    
    /**
      * Gets the color table url used to create the LUT texture
      */
    var colorTableUrl: String = js.native
  }
  /* static members */
  object ColorCorrectionPostProcess {
    
    @JSImport("babylonjs/PostProcesses/colorCorrectionPostProcess", "ColorCorrectionPostProcess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @internal
      */
    inline def _Parse(parsedPostProcess: Any, targetCamera: Camera, scene: Scene, rootUrl: String): Nullable[ColorCorrectionPostProcess] = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedPostProcess.asInstanceOf[js.Any], targetCamera.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[ColorCorrectionPostProcess]]
  }
}
