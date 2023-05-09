package typings.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "DefaultRenderingPipeline")
@js.native
/**
  * Instantiates a DefaultRenderingPipeline.
  * @param name The rendering pipeline name (default: "")
  * @param hdr If high dynamic range textures should be used (default: true)
  * @param scene The scene linked to this pipeline (default: the last created scene)
  * @param cameras The array of cameras that the rendering pipeline will be attached to (default: scene.cameras)
  * @param automaticBuild If false, you will have to manually call prepare() to update the pipeline (default: true)
  */
open class DefaultRenderingPipeline ()
  extends typings.babylonjs.indexMod.DefaultRenderingPipeline {
  def this(name: String) = this()
  def this(name: String, hdr: Boolean) = this()
  def this(name: Unit, hdr: Boolean) = this()
  def this(name: String, hdr: Boolean, scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(name: String, hdr: Unit, scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(name: Unit, hdr: Boolean, scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(name: Unit, hdr: Unit, scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(
    name: String,
    hdr: Boolean,
    scene: Unit,
    cameras: js.Array[typings.babylonjs.camerasCameraMod.Camera]
  ) = this()
  def this(
    name: String,
    hdr: Boolean,
    scene: typings.babylonjs.sceneMod.Scene,
    cameras: js.Array[typings.babylonjs.camerasCameraMod.Camera]
  ) = this()
  def this(name: String, hdr: Unit, scene: Unit, cameras: js.Array[typings.babylonjs.camerasCameraMod.Camera]) = this()
  def this(
    name: String,
    hdr: Unit,
    scene: typings.babylonjs.sceneMod.Scene,
    cameras: js.Array[typings.babylonjs.camerasCameraMod.Camera]
  ) = this()
  def this(
    name: Unit,
    hdr: Boolean,
    scene: Unit,
    cameras: js.Array[typings.babylonjs.camerasCameraMod.Camera]
  ) = this()
  def this(
    name: Unit,
    hdr: Boolean,
    scene: typings.babylonjs.sceneMod.Scene,
    cameras: js.Array[typings.babylonjs.camerasCameraMod.Camera]
  ) = this()
  def this(name: Unit, hdr: Unit, scene: Unit, cameras: js.Array[typings.babylonjs.camerasCameraMod.Camera]) = this()
  def this(
    name: Unit,
    hdr: Unit,
    scene: typings.babylonjs.sceneMod.Scene,
    cameras: js.Array[typings.babylonjs.camerasCameraMod.Camera]
  ) = this()
  def this(
    name: String,
    hdr: Boolean,
    scene: Unit,
    cameras: js.Array[typings.babylonjs.camerasCameraMod.Camera],
    automaticBuild: Boolean
  ) = this()
  def this(name: String, hdr: Boolean, scene: Unit, cameras: Unit, automaticBuild: Boolean) = this()
  def this(
    name: String,
    hdr: Boolean,
    scene: typings.babylonjs.sceneMod.Scene,
    cameras: js.Array[typings.babylonjs.camerasCameraMod.Camera],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: String,
    hdr: Boolean,
    scene: typings.babylonjs.sceneMod.Scene,
    cameras: Unit,
    automaticBuild: Boolean
  ) = this()
  def this(
    name: String,
    hdr: Unit,
    scene: Unit,
    cameras: js.Array[typings.babylonjs.camerasCameraMod.Camera],
    automaticBuild: Boolean
  ) = this()
  def this(name: String, hdr: Unit, scene: Unit, cameras: Unit, automaticBuild: Boolean) = this()
  def this(
    name: String,
    hdr: Unit,
    scene: typings.babylonjs.sceneMod.Scene,
    cameras: js.Array[typings.babylonjs.camerasCameraMod.Camera],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: String,
    hdr: Unit,
    scene: typings.babylonjs.sceneMod.Scene,
    cameras: Unit,
    automaticBuild: Boolean
  ) = this()
  def this(
    name: Unit,
    hdr: Boolean,
    scene: Unit,
    cameras: js.Array[typings.babylonjs.camerasCameraMod.Camera],
    automaticBuild: Boolean
  ) = this()
  def this(name: Unit, hdr: Boolean, scene: Unit, cameras: Unit, automaticBuild: Boolean) = this()
  def this(
    name: Unit,
    hdr: Boolean,
    scene: typings.babylonjs.sceneMod.Scene,
    cameras: js.Array[typings.babylonjs.camerasCameraMod.Camera],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: Unit,
    hdr: Boolean,
    scene: typings.babylonjs.sceneMod.Scene,
    cameras: Unit,
    automaticBuild: Boolean
  ) = this()
  def this(
    name: Unit,
    hdr: Unit,
    scene: Unit,
    cameras: js.Array[typings.babylonjs.camerasCameraMod.Camera],
    automaticBuild: Boolean
  ) = this()
  def this(name: Unit, hdr: Unit, scene: Unit, cameras: Unit, automaticBuild: Boolean) = this()
  def this(
    name: Unit,
    hdr: Unit,
    scene: typings.babylonjs.sceneMod.Scene,
    cameras: js.Array[typings.babylonjs.camerasCameraMod.Camera],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: Unit,
    hdr: Unit,
    scene: typings.babylonjs.sceneMod.Scene,
    cameras: Unit,
    automaticBuild: Boolean
  ) = this()
}
/* static members */
object DefaultRenderingPipeline {
  
  @JSImport("babylonjs/Legacy/legacy", "DefaultRenderingPipeline")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parse the serialized pipeline
    * @param source Source pipeline.
    * @param scene The scene to load the pipeline to.
    * @param rootUrl The URL of the serialized pipeline.
    * @returns An instantiated pipeline from the serialized object.
    */
  inline def Parse(source: Any, scene: typings.babylonjs.sceneMod.Scene, rootUrl: String): typings.babylonjs.postProcessesRenderPipelinePipelinesDefaultRenderingPipelineMod.DefaultRenderingPipeline = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.postProcessesRenderPipelinePipelinesDefaultRenderingPipelineMod.DefaultRenderingPipeline]
}
