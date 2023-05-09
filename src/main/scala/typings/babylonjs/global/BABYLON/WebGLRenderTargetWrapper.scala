package typings.babylonjs.global.BABYLON

import org.scalajs.dom.WebGLRenderingContext
import typings.babylonjs.BABYLON.TextureSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGLRenderTargetWrapper")
@js.native
open class WebGLRenderTargetWrapper protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebGLRenderTargetWrapper {
  def this(
    isMulti: Boolean,
    isCube: Boolean,
    size: TextureSize,
    engine: typings.babylonjs.BABYLON.ThinEngine,
    context: WebGLRenderingContext
  ) = this()
}
