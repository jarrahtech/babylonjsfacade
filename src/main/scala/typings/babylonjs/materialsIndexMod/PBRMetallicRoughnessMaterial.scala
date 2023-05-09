package typings.babylonjs.materialsIndexMod

import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "PBRMetallicRoughnessMaterial")
@js.native
open class PBRMetallicRoughnessMaterial protected ()
  extends typings.babylonjs.materialsPbrIndexMod.PBRMetallicRoughnessMaterial {
  /**
    * Instantiates a new PBRMetalRoughnessMaterial instance.
    *
    * @param name The material name
    * @param scene The scene the material will be use in.
    */
  def this(name: String) = this()
  def this(name: String, scene: Scene) = this()
}
/* static members */
object PBRMetallicRoughnessMaterial {
  
  @JSImport("babylonjs/Materials/index", "PBRMetallicRoughnessMaterial")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses a JSON object corresponding to the serialize function.
    * @param source
    * @param scene
    * @param rootUrl
    */
  inline def Parse(source: Any, scene: Scene, rootUrl: String): typings.babylonjs.materialsPbrPbrMetallicRoughnessMaterialMod.PBRMetallicRoughnessMaterial = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsPbrPbrMetallicRoughnessMaterialMod.PBRMetallicRoughnessMaterial]
}
