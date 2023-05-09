package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementCSSInlineStyle extends StObject {
  
  /* standard dom */
  val style: org.scalajs.dom.CSSStyleDeclaration
}
object ElementCSSInlineStyle {
  
  inline def apply(style: org.scalajs.dom.CSSStyleDeclaration): ElementCSSInlineStyle = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementCSSInlineStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementCSSInlineStyle] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: org.scalajs.dom.CSSStyleDeclaration): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
