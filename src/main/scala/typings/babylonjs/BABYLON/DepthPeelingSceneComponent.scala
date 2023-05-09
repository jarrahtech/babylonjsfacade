package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DepthPeelingSceneComponent
  extends StObject
     with ISceneComponent
object DepthPeelingSceneComponent {
  
  inline def apply(dispose: () => Unit, name: String, rebuild: () => Unit, register: () => Unit, scene: Scene): DepthPeelingSceneComponent = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthPeelingSceneComponent]
  }
}
