package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextureAssetTask[TEX /* <: BaseTexture */] extends StObject {
  
  /**
    * Gets the loaded texture
    */
  var texture: TEX
}
object ITextureAssetTask {
  
  inline def apply[TEX /* <: BaseTexture */](texture: TEX): ITextureAssetTask[TEX] = {
    val __obj = js.Dynamic.literal(texture = texture.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextureAssetTask[TEX]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITextureAssetTask[?], TEX /* <: BaseTexture */] (val x: Self & ITextureAssetTask[TEX]) extends AnyVal {
    
    inline def setTexture(value: TEX): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
  }
}
