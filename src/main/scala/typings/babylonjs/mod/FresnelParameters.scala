package typings.babylonjs.mod

import typings.babylonjs.materialsFresnelParametersMod.IFresnelParametersCreationOptions
import typings.babylonjs.materialsFresnelParametersMod.IFresnelParametersSerialized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "FresnelParameters")
@js.native
/**
  * Creates a new FresnelParameters object.
  *
  * @param options provide your own settings to optionally to override defaults
  */
open class FresnelParameters ()
  extends typings.babylonjs.legacyLegacyMod.FresnelParameters {
  def this(options: IFresnelParametersCreationOptions) = this()
}
/* static members */
object FresnelParameters {
  
  @JSImport("babylonjs", "FresnelParameters")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parse a JSON object and deserialize it to a new Fresnel parameter object.
    * @param parsedFresnelParameters Define the JSON representation
    * @returns the parsed parameters
    */
  inline def Parse(parsedFresnelParameters: IFresnelParametersSerialized): typings.babylonjs.materialsFresnelParametersMod.FresnelParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedFresnelParameters.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.materialsFresnelParametersMod.FresnelParameters]
}
