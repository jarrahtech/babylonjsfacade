package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.NodeMaterialBlock")
@js.native
open class NodeMaterialBlock protected ()
  extends StObject
     with typings.babylonjs.BABYLON.NodeMaterialBlock {
  /**
    * Creates a new NodeMaterialBlock
    * @param name defines the block name
    * @param target defines the target of that block (Vertex by default)
    * @param isFinalMerger defines a boolean indicating that this block is an end block (e.g. it is generating a system value). Default is false
    * @param isInput defines a boolean indicating that this block is an input (e.g. it sends data to the shader). Default is false
    */
  def this(name: String) = this()
  def this(name: String, target: typings.babylonjs.BABYLON.NodeMaterialBlockTargets) = this()
  def this(name: String, target: Unit, isFinalMerger: Boolean) = this()
  def this(name: String, target: typings.babylonjs.BABYLON.NodeMaterialBlockTargets, isFinalMerger: Boolean) = this()
  def this(name: String, target: Unit, isFinalMerger: Boolean, isInput: Boolean) = this()
  def this(name: String, target: Unit, isFinalMerger: Unit, isInput: Boolean) = this()
  def this(
    name: String,
    target: typings.babylonjs.BABYLON.NodeMaterialBlockTargets,
    isFinalMerger: Boolean,
    isInput: Boolean
  ) = this()
  def this(
    name: String,
    target: typings.babylonjs.BABYLON.NodeMaterialBlockTargets,
    isFinalMerger: Unit,
    isInput: Boolean
  ) = this()
}
