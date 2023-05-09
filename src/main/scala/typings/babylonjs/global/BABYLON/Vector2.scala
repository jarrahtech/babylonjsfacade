package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DeepImmutable
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Vector2")
@js.native
/**
  * Creates a new Vector2 from the given x and y coordinates
  * @param x defines the first coordinate
  * @param y defines the second coordinate
  */
open class Vector2 ()
  extends StObject
     with typings.babylonjs.BABYLON.Vector2 {
  def this(/** defines the first coordinate */
  x: Double) = this()
  def this(/** defines the first coordinate */
  x: Double, /** defines the second coordinate */
  y: Double) = this()
  def this(/** defines the first coordinate */
  x: Unit, /** defines the second coordinate */
  y: Double) = this()
}
/* static members */
object Vector2 {
  
  @JSGlobal("BABYLON.Vector2")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets a new Vector2 located for "amount" (float) on the CatmullRom spline defined by the given four Vector2
    * Example Playground https://playground.babylonjs.com/#QYBWV4#65
    * @param value1 defines 1st point of control
    * @param value2 defines 2nd point of control
    * @param value3 defines 3rd point of control
    * @param value4 defines 4th point of control
    * @param amount defines the interpolation factor
    * @returns a new Vector2
    */
  inline def CatmullRom[T /* <: typings.babylonjs.BABYLON.Vector2 */](
    value1: DeepImmutable[T],
    value2: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    value3: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    value4: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    amount: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("CatmullRom")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], value3.asInstanceOf[js.Any], value4.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Gets a new Vector2 located at the center of the vectors "value1" and "value2"
    * Example Playground https://playground.babylonjs.com/#QYBWV4#86
    * Example Playground https://playground.babylonjs.com/#QYBWV4#66
    * @param value1 defines first vector
    * @param value2 defines second vector
    * @returns a new Vector2
    */
  inline def Center[T /* <: typings.babylonjs.BABYLON.Vector2 */](value1: DeepImmutable[T], value2: DeepImmutable[typings.babylonjs.BABYLON.Vector2]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Center")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Gets the center of the vectors "value1" and "value2" and stores the result in the vector "ref"
    * Example Playground https://playground.babylonjs.com/#QYBWV4#66
    * @param value1 defines first vector
    * @param value2 defines second vector
    * @param ref defines third vector
    * @returns ref
    */
  inline def CenterToRef[T /* <: typings.babylonjs.BABYLON.Vector2 */](
    value1: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    value2: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    ref: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("CenterToRef")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Returns a new Vector2 set with same the coordinates than "value" ones if the vector "value" is in the square defined by "min" and "max".
    * If a coordinate of "value" is lower than "min" coordinates, the returned Vector2 is given this "min" coordinate.
    * If a coordinate of "value" is greater than "max" coordinates, the returned Vector2 is given this "max" coordinate
    * Example Playground https://playground.babylonjs.com/#QYBWV4#76
    * @param value defines the value to clamp
    * @param min defines the lower limit
    * @param max defines the upper limit
    * @returns a new Vector2
    */
  inline def Clamp[T /* <: typings.babylonjs.BABYLON.Vector2 */](
    value: DeepImmutable[T],
    min: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    max: DeepImmutable[typings.babylonjs.BABYLON.Vector2]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Gets the distance between the vectors "value1" and "value2"
    * Example Playground https://playground.babylonjs.com/#QYBWV4#71
    * @param value1 defines first vector
    * @param value2 defines second vector
    * @returns the distance between vectors
    */
  inline def Distance(
    value1: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    value2: DeepImmutable[typings.babylonjs.BABYLON.Vector2]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Distance")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Gets the shortest distance (float) between the point "p" and the segment defined by the two points "segA" and "segB".
    * Example Playground https://playground.babylonjs.com/#QYBWV4#77
    * @param p defines the middle point
    * @param segA defines one point of the segment
    * @param segB defines the other point of the segment
    * @returns the shortest distance
    */
  inline def DistanceOfPointFromSegment(
    p: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    segA: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    segB: DeepImmutable[typings.babylonjs.BABYLON.Vector2]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("DistanceOfPointFromSegment")(p.asInstanceOf[js.Any], segA.asInstanceOf[js.Any], segB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns the squared distance between the vectors "value1" and "value2"
    * Example Playground https://playground.babylonjs.com/#QYBWV4#72
    * @param value1 defines first vector
    * @param value2 defines second vector
    * @returns the squared distance between vectors
    */
  inline def DistanceSquared(
    value1: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    value2: DeepImmutable[typings.babylonjs.BABYLON.Vector2]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("DistanceSquared")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Gets the dot product of the vector "left" and the vector "right"
    * Example Playground https://playground.babylonjs.com/#QYBWV4#90
    * @param left defines first vector
    * @param right defines second vector
    * @returns the dot product (float)
    */
  inline def Dot(
    left: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    right: DeepImmutable[typings.babylonjs.BABYLON.Vector2]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Dot")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Gets a new Vector2 set from the given index element of the given array
    * Example Playground https://playground.babylonjs.com/#QYBWV4#79
    * @param array defines the data source
    * @param offset defines the offset in the data source
    * @returns a new Vector2
    */
  inline def FromArray(array: DeepImmutable[ArrayLike[Double]]): typings.babylonjs.BABYLON.Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Vector2]
  inline def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): typings.babylonjs.BABYLON.Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Vector2]
  
  /**
    * Sets "result" from the given index element of the given array
    * Example Playground https://playground.babylonjs.com/#QYBWV4#80
    * @param array defines the data source
    * @param offset defines the offset in the data source
    * @param result defines the target vector
    * @returns result input
    */
  inline def FromArrayToRef[T /* <: typings.babylonjs.BABYLON.Vector2 */](array: DeepImmutable[ArrayLike[Double]], offset: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Returns a new Vector2 located for "amount" (float) on the Hermite spline defined by the vectors "value1", "value2", "tangent1", "tangent2"
    * Example Playground https://playground.babylonjs.com/#QYBWV4#81
    * @param value1 defines the 1st control point
    * @param tangent1 defines the outgoing tangent
    * @param value2 defines the 2nd control point
    * @param tangent2 defines the incoming tangent
    * @param amount defines the interpolation factor
    * @returns a new Vector2
    */
  inline def Hermite[T /* <: typings.babylonjs.BABYLON.Vector2 */](
    value1: DeepImmutable[T],
    tangent1: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    value2: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    tangent2: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    amount: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Returns a new Vector2 which is the 1st derivative of the Hermite spline defined by the vectors "value1", "value2", "tangent1", "tangent2".
    * Example Playground https://playground.babylonjs.com/#QYBWV4#82
    * @param value1 defines the first control point
    * @param tangent1 defines the first tangent
    * @param value2 defines the second control point
    * @param tangent2 defines the second tangent
    * @param time define where the derivative must be done
    * @returns 1st derivative
    */
  inline def Hermite1stDerivative[T /* <: typings.babylonjs.BABYLON.Vector2 */](
    value1: DeepImmutable[T],
    tangent1: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    value2: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    tangent2: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    time: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite1stDerivative")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Returns a new Vector2 which is the 1st derivative of the Hermite spline defined by the vectors "value1", "value2", "tangent1", "tangent2".
    * Example Playground https://playground.babylonjs.com/#QYBWV4#83
    * @param value1 defines the first control point
    * @param tangent1 defines the first tangent
    * @param value2 defines the second control point
    * @param tangent2 defines the second tangent
    * @param time define where the derivative must be done
    * @param result define where the derivative will be stored
    * @returns result input
    */
  inline def Hermite1stDerivativeToRef[T /* <: typings.babylonjs.BABYLON.Vector2 */](
    value1: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    tangent1: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    value2: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    tangent2: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    time: Double,
    result: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite1stDerivativeToRef")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], time.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Returns a new Vector2 located for "amount" (float) on the linear interpolation between the vector "start" adn the vector "end".
    * Example Playground https://playground.babylonjs.com/#QYBWV4#84
    * @param start defines the start vector
    * @param end defines the end vector
    * @param amount defines the interpolation factor
    * @returns a new Vector2
    */
  inline def Lerp[T /* <: typings.babylonjs.BABYLON.Vector2 */](start: DeepImmutable[T], end: DeepImmutable[typings.babylonjs.BABYLON.Vector2], amount: Double): typings.babylonjs.BABYLON.Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("Lerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Vector2]
  
  /**
    * Gets a new Vector2 set with the maximal coordinate values from the "left" and "right" vectors
    * Example Playground https://playground.babylonjs.com/#QYBWV4#86
    * @param left defines 1st vector
    * @param right defines 2nd vector
    * @returns a new Vector2
    */
  inline def Maximize[T /* <: typings.babylonjs.BABYLON.Vector2 */](left: DeepImmutable[T], right: DeepImmutable[typings.babylonjs.BABYLON.Vector2]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Maximize")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Gets a new Vector2 set with the minimal coordinate values from the "left" and "right" vectors
    * Example Playground https://playground.babylonjs.com/#QYBWV4#86
    * @param left defines 1st vector
    * @param right defines 2nd vector
    * @returns a new Vector2
    */
  inline def Minimize[T /* <: typings.babylonjs.BABYLON.Vector2 */](left: DeepImmutable[T], right: DeepImmutable[typings.babylonjs.BABYLON.Vector2]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Minimize")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Returns a new Vector2 equal to the normalized given vector
    * Example Playground https://playground.babylonjs.com/#QYBWV4#46
    * @param vector defines the vector to normalize
    * @returns a new Vector2
    */
  inline def Normalize[T /* <: typings.babylonjs.BABYLON.Vector2 */](vector: DeepImmutable[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("Normalize")(vector.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Normalize a given vector into a second one
    * Example Playground https://playground.babylonjs.com/#QYBWV4#50
    * @param vector defines the vector to normalize
    * @param result defines the vector where to store the result
    * @returns result input
    */
  inline def NormalizeToRef[T /* <: typings.babylonjs.BABYLON.Vector2 */](vector: DeepImmutable[typings.babylonjs.BABYLON.Vector2], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("NormalizeToRef")(vector.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Gets a new Vector2(1, 1)
    * @returns a new Vector2
    */
  inline def One(): typings.babylonjs.BABYLON.Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("One")().asInstanceOf[typings.babylonjs.BABYLON.Vector2]
  
  /**
    * Determines if a given vector is included in a triangle
    * Example Playground https://playground.babylonjs.com/#QYBWV4#87
    * @param p defines the vector to test
    * @param p0 defines 1st triangle point
    * @param p1 defines 2nd triangle point
    * @param p2 defines 3rd triangle point
    * @returns true if the point "p" is in the triangle defined by the vectors "p0", "p1", "p2"
    */
  inline def PointInTriangle(
    p: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    p0: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    p1: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    p2: DeepImmutable[typings.babylonjs.BABYLON.Vector2]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("PointInTriangle")(p.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Returns a new Vector2 with random values between min and max
    * @param min the minimum random value
    * @param max the maximum random value
    * @returns a Vector2 with random values between min and max
    */
  inline def Random(): typings.babylonjs.BABYLON.Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("Random")().asInstanceOf[typings.babylonjs.BABYLON.Vector2]
  inline def Random(min: Double): typings.babylonjs.BABYLON.Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("Random")(min.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Vector2]
  inline def Random(min: Double, max: Double): typings.babylonjs.BABYLON.Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("Random")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Vector2]
  inline def Random(min: Unit, max: Double): typings.babylonjs.BABYLON.Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("Random")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Vector2]
  
  /**
    * Gets a new Vector2 set with the transformed coordinates of the given vector by the given transformation matrix
    * Example Playground https://playground.babylonjs.com/#QYBWV4#17
    * @param vector defines the vector to transform
    * @param transformation defines the matrix to apply
    * @returns a new Vector2
    */
  inline def Transform[T /* <: typings.babylonjs.BABYLON.Vector2 */](vector: DeepImmutable[T], transformation: DeepImmutable[typings.babylonjs.BABYLON.Matrix]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Transform")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Transforms the given vector coordinates by the given transformation matrix and stores the result in the vector "result" coordinates
    * Example Playground https://playground.babylonjs.com/#QYBWV4#19
    * @param vector defines the vector to transform
    * @param transformation defines the matrix to apply
    * @param result defines the target vector
    * @returns result input
    */
  inline def TransformToRef[T /* <: typings.babylonjs.BABYLON.Vector2 */](
    vector: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    transformation: DeepImmutable[typings.babylonjs.BABYLON.Matrix],
    result: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformToRef")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Gets a new Vector2(0, 0)
    * @returns a new Vector2
    */
  inline def Zero(): typings.babylonjs.BABYLON.Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("Zero")().asInstanceOf[typings.babylonjs.BABYLON.Vector2]
  
  @JSGlobal("BABYLON.Vector2._ZeroReadOnly")
  @js.native
  def _ZeroReadOnly: Any = js.native
  inline def _ZeroReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ZeroReadOnly")(x.asInstanceOf[js.Any])
}
