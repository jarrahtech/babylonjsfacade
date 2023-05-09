package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.HTMLVideoElement
import typings.babylonjs.materialsTexturesHtmlElementTextureMod.IHtmlElementTextureOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "HtmlElementTexture")
@js.native
open class HtmlElementTexture protected ()
  extends typings.babylonjs.indexMod.HtmlElementTexture {
  def this(name: String, element: HTMLCanvasElement, options: IHtmlElementTextureOptions) = this()
  /**
    * Instantiates a HtmlElementTexture from the following parameters.
    *
    * @param name Defines the name of the texture
    * @param element Defines the video or canvas the texture is filled with
    * @param options Defines the other none mandatory texture creation options
    */
  def this(name: String, element: HTMLVideoElement, options: IHtmlElementTextureOptions) = this()
}
/* static members */
object HtmlElementTexture {
  
  @JSImport("babylonjs/Legacy/legacy", "HtmlElementTexture._DefaultOptions")
  @js.native
  val _DefaultOptions: Any = js.native
}
