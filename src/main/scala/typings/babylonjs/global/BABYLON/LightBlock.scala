package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.LightBlock")
@js.native
open class LightBlock protected ()
  extends StObject
     with typings.babylonjs.BABYLON.LightBlock {
  /**
    * Create a new LightBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
}
/* static members */
object LightBlock {
  
  @JSGlobal("BABYLON.LightBlock")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.LightBlock._OnGenerateOnlyFragmentCodeChanged")
  @js.native
  def _OnGenerateOnlyFragmentCodeChanged: Any = js.native
  inline def _OnGenerateOnlyFragmentCodeChanged_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_OnGenerateOnlyFragmentCodeChanged")(x.asInstanceOf[js.Any])
}
