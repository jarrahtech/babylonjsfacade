package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "RuntimeAnimation")
@js.native
open class RuntimeAnimation protected ()
  extends typings.babylonjs.animationsIndexMod.RuntimeAnimation {
  /**
    * Create a new RuntimeAnimation object
    * @param target defines the target of the animation
    * @param animation defines the source animation object
    * @param scene defines the hosting scene
    * @param host defines the initiating Animatable
    */
  def this(
    target: Any,
    animation: typings.babylonjs.animationsAnimationMod.Animation,
    scene: typings.babylonjs.sceneMod.Scene,
    host: typings.babylonjs.animationsAnimatableMod.Animatable
  ) = this()
}
