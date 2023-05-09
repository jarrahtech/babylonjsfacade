package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PlaneDragGizmo")
@js.native
open class PlaneDragGizmo protected ()
  extends typings.babylonjs.legacyLegacyMod.PlaneDragGizmo {
  /**
    * Creates a PlaneDragGizmo
    * @param dragPlaneNormal The axis normal to which the gizmo will be able to drag on
    * @param color The color of the gizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param parent
    */
  def this(dragPlaneNormal: typings.babylonjs.mathsMathDotvectorMod.Vector3) = this()
  def this(
    dragPlaneNormal: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    color: typings.babylonjs.mathsMathDotcolorMod.Color3
  ) = this()
  def this(
    dragPlaneNormal: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    color: Unit,
    gizmoLayer: typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    dragPlaneNormal: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    color: typings.babylonjs.mathsMathDotcolorMod.Color3,
    gizmoLayer: typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    dragPlaneNormal: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    color: Unit,
    gizmoLayer: Unit,
    parent: Nullable[typings.babylonjs.gizmosPositionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragPlaneNormal: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    color: Unit,
    gizmoLayer: typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.gizmosPositionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragPlaneNormal: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    color: typings.babylonjs.mathsMathDotcolorMod.Color3,
    gizmoLayer: Unit,
    parent: Nullable[typings.babylonjs.gizmosPositionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragPlaneNormal: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    color: typings.babylonjs.mathsMathDotcolorMod.Color3,
    gizmoLayer: typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.gizmosPositionGizmoMod.PositionGizmo]
  ) = this()
}
/* static members */
object PlaneDragGizmo {
  
  @JSImport("babylonjs", "PlaneDragGizmo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @internal
    */
  inline def _CreatePlane(
    scene: typings.babylonjs.sceneMod.Scene,
    material: typings.babylonjs.materialsStandardMaterialMod.StandardMaterial
  ): typings.babylonjs.meshesTransformNodeMod.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreatePlane")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesTransformNodeMod.TransformNode]
}
