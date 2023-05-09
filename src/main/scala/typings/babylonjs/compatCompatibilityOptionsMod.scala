package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compatCompatibilityOptionsMod {
  
  @JSImport("babylonjs/Compat/compatibilityOptions", "CompatibilityOptions")
  @js.native
  open class CompatibilityOptions () extends StObject
  /* static members */
  object CompatibilityOptions {
    
    @JSImport("babylonjs/Compat/compatibilityOptions", "CompatibilityOptions")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Defines if the system should use OpenGL convention for UVs when creating geometry or loading .babylon files (false by default)
      */
    @JSImport("babylonjs/Compat/compatibilityOptions", "CompatibilityOptions.UseOpenGLOrientationForUV")
    @js.native
    def UseOpenGLOrientationForUV: Boolean = js.native
    inline def UseOpenGLOrientationForUV_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UseOpenGLOrientationForUV")(x.asInstanceOf[js.Any])
  }
}
