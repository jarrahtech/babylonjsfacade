package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "SceneRecorder")
@js.native
open class SceneRecorder ()
  extends typings.babylonjs.miscIndexMod.SceneRecorder
/* static members */
object SceneRecorder {
  
  @JSImport("babylonjs/index", "SceneRecorder")
  @js.native
  val ^ : js.Any = js.native
  
  inline def ApplyDelta(deltaJSON: String, scene: typings.babylonjs.sceneMod.Scene): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyDelta")(deltaJSON.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Apply a given delta to a given scene
    * @param deltaJSON defines the JSON containing the delta
    * @param scene defines the scene to apply the delta to
    */
  inline def ApplyDelta(deltaJSON: Any, scene: typings.babylonjs.sceneMod.Scene): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyDelta")(deltaJSON.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("babylonjs/index", "SceneRecorder.GetShadowGeneratorById")
  @js.native
  def GetShadowGeneratorById: Any = js.native
  inline def GetShadowGeneratorById_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetShadowGeneratorById")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "SceneRecorder._ApplyDeltaForEntity")
  @js.native
  def _ApplyDeltaForEntity: Any = js.native
  inline def _ApplyDeltaForEntity_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ApplyDeltaForEntity")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "SceneRecorder._ApplyPropertiesToEntity")
  @js.native
  def _ApplyPropertiesToEntity: Any = js.native
  inline def _ApplyPropertiesToEntity_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ApplyPropertiesToEntity")(x.asInstanceOf[js.Any])
}
