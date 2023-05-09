package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.TexturePackerFrame")
@js.native
open class TexturePackerFrame protected ()
  extends StObject
     with typings.babylonjs.BABYLON.TexturePackerFrame {
  /**
    * Initializes a texture package frame.
    * @param id The numerical frame identifier
    * @param scale Scalar Vector2 for UV frame
    * @param offset Vector2 for the frame position in UV units.
    * @returns TexturePackerFrame
    */
  def this(id: Double, scale: typings.babylonjs.BABYLON.Vector2, offset: typings.babylonjs.BABYLON.Vector2) = this()
  
  /**
    * The frame ID
    */
  /* CompleteClass */
  var id: Double = js.native
  
  /**
    * The Frames offset
    */
  /* CompleteClass */
  var offset: typings.babylonjs.BABYLON.Vector2 = js.native
  
  /**
    * The frames Scale
    */
  /* CompleteClass */
  var scale: typings.babylonjs.BABYLON.Vector2 = js.native
}
