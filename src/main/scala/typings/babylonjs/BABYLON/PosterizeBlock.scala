package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PosterizeBlock
  extends StObject
     with NodeMaterialBlock {
  
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the steps input component
    */
  def steps: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the value input component
    */
  def value: NodeMaterialConnectionPoint = js.native
}
