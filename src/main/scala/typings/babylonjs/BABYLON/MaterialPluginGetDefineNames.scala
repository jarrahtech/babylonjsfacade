package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterialPluginGetDefineNames extends StObject {
  
  var defineNames: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Default]] = js.undefined
}
object MaterialPluginGetDefineNames {
  
  inline def apply(): MaterialPluginGetDefineNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaterialPluginGetDefineNames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaterialPluginGetDefineNames] (val x: Self) extends AnyVal {
    
    inline def setDefineNames(value: org.scalablytyped.runtime.StringDictionary[Default]): Self = StObject.set(x, "defineNames", value.asInstanceOf[js.Any])
    
    inline def setDefineNamesUndefined: Self = StObject.set(x, "defineNames", js.undefined)
  }
}
