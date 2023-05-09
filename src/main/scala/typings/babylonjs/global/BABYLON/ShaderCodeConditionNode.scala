package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.ProcessingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ShaderCodeConditionNode")
@js.native
open class ShaderCodeConditionNode ()
  extends StObject
     with typings.babylonjs.BABYLON.ShaderCodeConditionNode {
  
  /* CompleteClass */
  var children: js.Array[typings.babylonjs.BABYLON.ShaderCodeNode] = js.native
  
  /* CompleteClass */
  override def isValid(preprocessors: org.scalablytyped.runtime.StringDictionary[String]): Boolean = js.native
  
  /* CompleteClass */
  var line: String = js.native
  
  /* CompleteClass */
  override def process(preprocessors: org.scalablytyped.runtime.StringDictionary[String], options: ProcessingOptions): String = js.native
}