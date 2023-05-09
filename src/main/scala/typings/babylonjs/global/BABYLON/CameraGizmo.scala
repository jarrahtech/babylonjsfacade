package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.CameraGizmo")
@js.native
/**
  * Creates a CameraGizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  */
open class CameraGizmo ()
  extends StObject
     with typings.babylonjs.BABYLON.CameraGizmo {
  def this(gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer) = this()
  
  /** The root mesh of the gizmo */
  /* CompleteClass */
  var _rootMesh: typings.babylonjs.BABYLON.Mesh = js.native
  
  /**
    * Mesh that the gizmo will be attached to. (eg. on a drag gizmo the mesh that will be dragged)
    * * When set, interactions will be enabled
    */
  /* CompleteClass */
  var attachedMesh: Nullable[typings.babylonjs.BABYLON.AbstractMesh] = js.native
  
  /**
    * Node that the gizmo will be attached to. (eg. on a drag gizmo the mesh, bone or NodeTransform that will be dragged)
    * * When set, interactions will be enabled
    */
  /* CompleteClass */
  var attachedNode: Nullable[typings.babylonjs.BABYLON.Node] = js.native
  
  /**
    * posture that the gizmo will be display
    * When set null, default value will be used (Quaternion(0, 0, 0, 1))
    */
  /* CompleteClass */
  var customRotationQuaternion: Nullable[typings.babylonjs.BABYLON.Quaternion] = js.native
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /** The utility layer the gizmo will be added to */
  /* CompleteClass */
  var gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer = js.native
  
  /** True when the mouse pointer is hovered a gizmo mesh */
  /* CompleteClass */
  override val isHovered: Boolean = js.native
  
  /** Ratio for the scale of the gizmo */
  /* CompleteClass */
  var scaleRatio: Double = js.native
  
  /** Disposes and replaces the current meshes in the gizmo with the specified mesh */
  /* CompleteClass */
  override def setCustomMesh(mesh: typings.babylonjs.BABYLON.Mesh): Unit = js.native
  
  /**
    * If set the gizmo's position will be updated to match the attached mesh each frame (Default: true)
    */
  /* CompleteClass */
  var updateGizmoPositionToMatchAttachedMesh: Boolean = js.native
  
  /**
    * If set the gizmo's rotation will be updated to match the attached mesh each frame (Default: true)
    */
  /* CompleteClass */
  var updateGizmoRotationToMatchAttachedMesh: Boolean = js.native
  
  /**
    * When set, the gizmo will always appear the same size no matter where the camera is (default: true)
    */
  /* CompleteClass */
  var updateScale: Boolean = js.native
}
/* static members */
object CameraGizmo {
  
  @JSGlobal("BABYLON.CameraGizmo")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.CameraGizmo._CreateCameraFrustum")
  @js.native
  def _CreateCameraFrustum: Any = js.native
  inline def _CreateCameraFrustum_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateCameraFrustum")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.CameraGizmo._CreateCameraMesh")
  @js.native
  def _CreateCameraMesh: Any = js.native
  inline def _CreateCameraMesh_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateCameraMesh")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.CameraGizmo._Scale")
  @js.native
  def _Scale: Any = js.native
  inline def _Scale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Scale")(x.asInstanceOf[js.Any])
}
