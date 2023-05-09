package typings.babylonjs

import typings.babylonjs.mathsMathDotvectorMod.Quaternion
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.meshesTransformNodeMod.TransformNode
import typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType
import typings.babylonjs.physicsV2PhysicsBodyMod.PhysicsBody
import typings.babylonjs.physicsV2PhysicsMaterialMod.PhysicsMaterial
import typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShape
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsV2PhysicsAggregateMod {
  
  @JSImport("babylonjs/Physics/v2/physicsAggregate", "PhysicsAggregate")
  @js.native
  open class PhysicsAggregate protected () extends StObject {
    def this(
      /**
      * The physics-enabled object used as the physics aggregate
      */
    transformNode: TransformNode,
      /**
      * The type of the physics aggregate
      */
    `type`: PhysicsShapeType
    ) = this()
    def this(
      /**
      * The physics-enabled object used as the physics aggregate
      */
    transformNode: TransformNode,
      /**
      * The type of the physics aggregate
      */
    `type`: PhysicsShape
    ) = this()
    def this(
      /**
      * The physics-enabled object used as the physics aggregate
      */
    transformNode: TransformNode,
      /**
      * The type of the physics aggregate
      */
    `type`: PhysicsShapeType,
      _options: PhysicsAggregateParameters
    ) = this()
    def this(
      /**
      * The physics-enabled object used as the physics aggregate
      */
    transformNode: TransformNode,
      /**
      * The type of the physics aggregate
      */
    `type`: PhysicsShape,
      _options: PhysicsAggregateParameters
    ) = this()
    def this(
      /**
      * The physics-enabled object used as the physics aggregate
      */
    transformNode: TransformNode,
      /**
      * The type of the physics aggregate
      */
    `type`: PhysicsShapeType,
      _options: Unit,
      _scene: Scene
    ) = this()
    def this(
      /**
      * The physics-enabled object used as the physics aggregate
      */
    transformNode: TransformNode,
      /**
      * The type of the physics aggregate
      */
    `type`: PhysicsShapeType,
      _options: PhysicsAggregateParameters,
      _scene: Scene
    ) = this()
    def this(
      /**
      * The physics-enabled object used as the physics aggregate
      */
    transformNode: TransformNode,
      /**
      * The type of the physics aggregate
      */
    `type`: PhysicsShape,
      _options: Unit,
      _scene: Scene
    ) = this()
    def this(
      /**
      * The physics-enabled object used as the physics aggregate
      */
    transformNode: TransformNode,
      /**
      * The type of the physics aggregate
      */
    `type`: PhysicsShape,
      _options: PhysicsAggregateParameters,
      _scene: Scene
    ) = this()
    
    /* private */ var _addSizeOptions: Any = js.native
    
    /* private */ var _disposeShapeWhenDisposed: Any = js.native
    
    /* private */ var _getObjectBoundingBox: Any = js.native
    
    /* private */ var _nodeDisposeObserver: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /**
      * The body that is associated with this aggregate
      */
    var body: PhysicsBody = js.native
    
    /**
      * Releases the body, shape and material
      */
    def dispose(): Unit = js.native
    
    /**
      * The material that is associated with this aggregate
      */
    var material: PhysicsMaterial = js.native
    
    /**
      * The shape that is associated with this aggregate
      */
    var shape: PhysicsShape = js.native
    
    /**
      * The physics-enabled object used as the physics aggregate
      */
    var transformNode: TransformNode = js.native
    
    /**
      * The type of the physics aggregate
      */
    var `type`: PhysicsShapeType | PhysicsShape = js.native
  }
  
  trait PhysicsAggregateParameters extends StObject {
    
    /**
      * mesh local center
      */
    var center: js.UndefOr[Vector3] = js.undefined
    
    /**
      * The collision margin around a soft object
      */
    var damping: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies if bi-directional transformations should be disabled
      */
    var disableBidirectionalTransformation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Extents for box
      */
    var extents: js.UndefOr[Vector3] = js.undefined
    
    /**
      * The number used to fix points on a cloth (0, 1, 2, 4, 8) or rope (0, 1, 2) only
      * 0 None, 1, back left or top, 2, back right or bottom, 4, front left, 8, front right
      * Add to fix multiple points
      */
    var fixedPoints: js.UndefOr[Double] = js.undefined
    
    /**
      * The friction of the physics aggregate
      */
    var friction: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies if the parent should be ignored
      */
    var ignoreParent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The collision margin around a soft object
      */
    var margin: js.UndefOr[Double] = js.undefined
    
    /**
      * The mass of the physics aggregate
      */
    var mass: Double
    
    /**
      * mesh object. Used for mesh and convex hull aggregates.
      */
    var mesh: js.UndefOr[Mesh] = js.undefined
    
    /**
      * The native options of the physics aggregate
      */
    var nativeOptions: js.UndefOr[Any] = js.undefined
    
    /**
      * The path for a rope based on an extrusion
      */
    var path: js.UndefOr[Any] = js.undefined
    
    /**
      * Starting point for cylinder/capsule
      */
    var pointA: js.UndefOr[Vector3] = js.undefined
    
    /**
      * Ending point for cylinder/capsule
      */
    var pointB: js.UndefOr[Vector3] = js.undefined
    
    /**
      * The number of iterations used in maintaining consistent vertex positions, soft object only
      */
    var positionIterations: js.UndefOr[Double] = js.undefined
    
    /**
      * The pressure inside the physics aggregate, soft object only
      */
    var pressure: js.UndefOr[Double] = js.undefined
    
    /**
      * Radius for sphere, cylinder and capsule
      */
    var radius: js.UndefOr[Double] = js.undefined
    
    /**
      * The coefficient of restitution of the physics aggregate
      */
    var restitution: js.UndefOr[Double] = js.undefined
    
    /**
      * Orientation for box
      */
    var rotation: js.UndefOr[Quaternion] = js.undefined
    
    /**
      * The shape of an extrusion used for a rope based on an extrusion
      */
    var shape: js.UndefOr[Any] = js.undefined
    
    /**
      * Physics engine will try to make this body sleeping and not active
      */
    var startAsleep: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The stiffness the physics aggregate, soft object only
      */
    var stiffness: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of iterations used in maintaining consistent vertex velocities, soft object only
      */
    var velocityIterations: js.UndefOr[Double] = js.undefined
  }
  object PhysicsAggregateParameters {
    
    inline def apply(mass: Double): PhysicsAggregateParameters = {
      val __obj = js.Dynamic.literal(mass = mass.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhysicsAggregateParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PhysicsAggregateParameters] (val x: Self) extends AnyVal {
      
      inline def setCenter(value: Vector3): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      inline def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
      
      inline def setDisableBidirectionalTransformation(value: Boolean): Self = StObject.set(x, "disableBidirectionalTransformation", value.asInstanceOf[js.Any])
      
      inline def setDisableBidirectionalTransformationUndefined: Self = StObject.set(x, "disableBidirectionalTransformation", js.undefined)
      
      inline def setExtents(value: Vector3): Self = StObject.set(x, "extents", value.asInstanceOf[js.Any])
      
      inline def setExtentsUndefined: Self = StObject.set(x, "extents", js.undefined)
      
      inline def setFixedPoints(value: Double): Self = StObject.set(x, "fixedPoints", value.asInstanceOf[js.Any])
      
      inline def setFixedPointsUndefined: Self = StObject.set(x, "fixedPoints", js.undefined)
      
      inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
      
      inline def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
      
      inline def setIgnoreParent(value: Boolean): Self = StObject.set(x, "ignoreParent", value.asInstanceOf[js.Any])
      
      inline def setIgnoreParentUndefined: Self = StObject.set(x, "ignoreParent", js.undefined)
      
      inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
      
      inline def setMesh(value: Mesh): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
      
      inline def setMeshUndefined: Self = StObject.set(x, "mesh", js.undefined)
      
      inline def setNativeOptions(value: Any): Self = StObject.set(x, "nativeOptions", value.asInstanceOf[js.Any])
      
      inline def setNativeOptionsUndefined: Self = StObject.set(x, "nativeOptions", js.undefined)
      
      inline def setPath(value: Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPointA(value: Vector3): Self = StObject.set(x, "pointA", value.asInstanceOf[js.Any])
      
      inline def setPointAUndefined: Self = StObject.set(x, "pointA", js.undefined)
      
      inline def setPointB(value: Vector3): Self = StObject.set(x, "pointB", value.asInstanceOf[js.Any])
      
      inline def setPointBUndefined: Self = StObject.set(x, "pointB", js.undefined)
      
      inline def setPositionIterations(value: Double): Self = StObject.set(x, "positionIterations", value.asInstanceOf[js.Any])
      
      inline def setPositionIterationsUndefined: Self = StObject.set(x, "positionIterations", js.undefined)
      
      inline def setPressure(value: Double): Self = StObject.set(x, "pressure", value.asInstanceOf[js.Any])
      
      inline def setPressureUndefined: Self = StObject.set(x, "pressure", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
      
      inline def setRestitutionUndefined: Self = StObject.set(x, "restitution", js.undefined)
      
      inline def setRotation(value: Quaternion): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setShape(value: Any): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setStartAsleep(value: Boolean): Self = StObject.set(x, "startAsleep", value.asInstanceOf[js.Any])
      
      inline def setStartAsleepUndefined: Self = StObject.set(x, "startAsleep", js.undefined)
      
      inline def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
      
      inline def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
      
      inline def setVelocityIterations(value: Double): Self = StObject.set(x, "velocityIterations", value.asInstanceOf[js.Any])
      
      inline def setVelocityIterationsUndefined: Self = StObject.set(x, "velocityIterations", js.undefined)
    }
  }
}
