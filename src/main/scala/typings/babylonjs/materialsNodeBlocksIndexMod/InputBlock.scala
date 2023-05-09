package typings.babylonjs.materialsNodeBlocksIndexMod

import typings.babylonjs.materialsNodeEnumsNodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes
import typings.babylonjs.materialsNodeEnumsNodeMaterialBlockTargetsMod.NodeMaterialBlockTargets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Blocks/index", "InputBlock")
@js.native
open class InputBlock protected ()
  extends typings.babylonjs.materialsNodeBlocksInputIndexMod.InputBlock {
  /**
    * Creates a new InputBlock
    * @param name defines the block name
    * @param target defines the target of that block (Vertex by default)
    * @param type defines the type of the input (can be set to NodeMaterialBlockConnectionPointTypes.AutoDetect)
    */
  def this(name: String) = this()
  def this(name: String, target: NodeMaterialBlockTargets) = this()
  def this(name: String, target: Unit, `type`: NodeMaterialBlockConnectionPointTypes) = this()
  def this(name: String, target: NodeMaterialBlockTargets, `type`: NodeMaterialBlockConnectionPointTypes) = this()
}
