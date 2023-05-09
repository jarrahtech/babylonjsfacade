package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Quaternion extends StObject {
  
  /** @internal */
  var _isDirty: Boolean = js.native
  
  /** @internal */
  var _w: Double = js.native
  
  /** @internal */
  var _x: Double = js.native
  
  /** @internal */
  var _y: Double = js.native
  
  /** @internal */
  var _z: Double = js.native
  
  /**
    * Adds two quaternions
    * Example Playground https://playground.babylonjs.com/#L49EJ7#10
    * @param other defines the second operand
    * @returns a new quaternion as the addition result of the given one and the current quaternion
    */
  def add(other: DeepImmutable[Quaternion]): this.type = js.native
  
  /**
    * Add a quaternion to the current one
    * Example Playground https://playground.babylonjs.com/#L49EJ7#11
    * @param other defines the quaternion to add
    * @returns the current quaternion
    */
  def addInPlace(other: DeepImmutable[Quaternion]): this.type = js.native
  
  /**
    * Copy the quaternion to an array
    * Example Playground https://playground.babylonjs.com/#L49EJ7#13
    * @returns a new array populated with 4 elements from the quaternion coordinates
    */
  def asArray(): js.Array[Double] = js.native
  
  /**
    * Conjugates (1-q) the current quaternion
    * Example Playground https://playground.babylonjs.com/#L49EJ7#83
    * @returns a new quaternion
    */
  def conjugate(): this.type = js.native
  
  /**
    * Conjugates in place the current quaternion
    * Example Playground https://playground.babylonjs.com/#L49EJ7#82
    * @returns the current updated quaternion
    */
  def conjugateInPlace(): this.type = js.native
  
  /**
    * Conjugates the current quaternion and stores the result in the given quaternion
    * Example Playground https://playground.babylonjs.com/#L49EJ7#81
    * @param ref defines the target quaternion
    * @returns result input
    */
  def conjugateToRef[T /* <: Quaternion */](ref: T): T = js.native
  
  /**
    * Copy a quaternion to the current one
    * Example Playground https://playground.babylonjs.com/#L49EJ7#86
    * @param other defines the other quaternion
    * @returns the updated current quaternion
    */
  def copyFrom(other: DeepImmutable[Quaternion]): this.type = js.native
  
  /**
    * Updates the current quaternion with the given float coordinates
    * Example Playground https://playground.babylonjs.com/#L49EJ7#87
    * @param x defines the x coordinate
    * @param y defines the y coordinate
    * @param z defines the z coordinate
    * @param w defines the w coordinate
    * @returns the updated current quaternion
    */
  def copyFromFloats(x: Double, y: Double, z: Double, w: Double): this.type = js.native
  
  /**
    * Check if two quaternions are equals
    * Example Playground https://playground.babylonjs.com/#L49EJ7#38
    * @param otherQuaternion defines the second operand
    * @returns true if the current quaternion and the given one coordinates are strictly equals
    */
  def equals(otherQuaternion: DeepImmutable[Quaternion]): Boolean = js.native
  
  /**
    * Gets a boolean if two quaternions are equals (using an epsilon value)
    * Example Playground https://playground.babylonjs.com/#L49EJ7#37
    * @param otherQuaternion defines the other quaternion
    * @param epsilon defines the minimal distance to consider equality
    * @returns true if the given quaternion coordinates are close to the current ones by a distance of epsilon.
    */
  def equalsWithEpsilon(otherQuaternion: DeepImmutable[Quaternion]): Boolean = js.native
  def equalsWithEpsilon(otherQuaternion: DeepImmutable[Quaternion], epsilon: Double): Boolean = js.native
  
  /**
    * Updates the current quaternion from the given rotation matrix values
    * Example Playground https://playground.babylonjs.com/#L49EJ7#41
    * @param matrix defines the source matrix
    * @returns the current updated quaternion
    */
  def fromRotationMatrix(matrix: DeepImmutable[Matrix]): this.type = js.native
  
  /**
    * Gets the class name of the quaternion
    * @returns the string "Quaternion"
    */
  def getClassName(): String = js.native
  
  /**
    * Gets a hash code for this quaternion
    * @returns the quaternion hash code
    */
  def getHashCode(): Double = js.native
  
  /**
    * Returns the inverse of the current quaternion
    * Example Playground https://playground.babylonjs.com/#L49EJ7#84
    * @returns a new quaternion
    */
  def invert(): this.type = js.native
  
  /**
    * Invert in place the current quaternion
    * Example Playground https://playground.babylonjs.com/#L49EJ7#85
    * @returns this quaternion
    */
  def invertInPlace(): this.type = js.native
  
  /**
    * Gets length of current quaternion
    * Example Playground https://playground.babylonjs.com/#L49EJ7#28
    * @returns the quaternion length (float)
    */
  def length(): Double = js.native
  
  /**
    * Gets squared length of current quaternion
    * Example Playground https://playground.babylonjs.com/#L49EJ7#29
    * @returns the quaternion length (float)
    */
  def lengthSquared(): Double = js.native
  
  /**
    * Multiplies two quaternions
    * Example Playground https://playground.babylonjs.com/#L49EJ7#43
    * @param q1 defines the second operand
    * @returns a new quaternion set as the multiplication result of the current one with the given one "q1"
    */
  def multiply(q1: DeepImmutable[Quaternion]): this.type = js.native
  
  /**
    * Updates the current quaternion with the multiplication of itself with the given one "q1"
    * Example Playground https://playground.babylonjs.com/#L49EJ7#46
    * @param q1 defines the second operand
    * @returns the currentupdated quaternion
    */
  def multiplyInPlace(q1: DeepImmutable[Quaternion]): this.type = js.native
  
  /**
    * Sets the given "result" as the the multiplication result of the current one with the given one "q1"
    * Example Playground https://playground.babylonjs.com/#L49EJ7#45
    * @param q1 defines the second operand
    * @param result defines the target quaternion
    * @returns the current quaternion
    */
  def multiplyToRef[T /* <: Quaternion */](q1: DeepImmutable[Quaternion], result: T): T = js.native
  
  /**
    * Normalize in place the current quaternion
    * Example Playground https://playground.babylonjs.com/#L49EJ7#54
    * @returns the current updated quaternion
    */
  def normalize(): this.type = js.native
  
  /**
    * Normalize a copy of the current quaternion
    * Example Playground https://playground.babylonjs.com/#L49EJ7#55
    * @returns the normalized quaternion
    */
  def normalizeToNew(): this.type = js.native
  
  /**
    * Multiplies the current quaternion by a scale factor
    * Example Playground https://playground.babylonjs.com/#L49EJ7#88
    * @param value defines the scale factor
    * @returns a new quaternion set by multiplying the current quaternion coordinates by the float "scale"
    */
  def scale(value: Double): this.type = js.native
  
  /**
    * Scale the current quaternion values by a factor and add the result to a given quaternion
    * Example Playground https://playground.babylonjs.com/#L49EJ7#91
    * @param scale defines the scale factor
    * @param result defines the Quaternion object where to store the result
    * @returns result input
    */
  def scaleAndAddToRef[T /* <: Quaternion */](scale: Double, result: T): T = js.native
  
  /**
    * Multiplies in place the current quaternion by a scale factor
    * Example Playground https://playground.babylonjs.com/#L49EJ7#90
    * @param value defines the scale factor
    * @returns the current modified quaternion
    */
  def scaleInPlace(value: Double): this.type = js.native
  
  /**
    * Scale the current quaternion values by a factor and stores the result to a given quaternion
    * Example Playground https://playground.babylonjs.com/#L49EJ7#89
    * @param scale defines the scale factor
    * @param result defines the Quaternion object where to store the result
    * @returns result input
    */
  def scaleToRef[T /* <: Quaternion */](scale: Double, result: T): T = js.native
  
  /**
    * Updates the current quaternion from the given float coordinates
    * Example Playground https://playground.babylonjs.com/#L49EJ7#56
    * @param x defines the x coordinate
    * @param y defines the y coordinate
    * @param z defines the z coordinate
    * @param w defines the w coordinate
    * @returns the updated current quaternion
    */
  def set(x: Double, y: Double, z: Double, w: Double): this.type = js.native
  
  /**
    * Subtract two quaternions
    * Example Playground https://playground.babylonjs.com/#L49EJ7#57
    * @param other defines the second operand
    * @returns a new quaternion as the subtraction result of the given one from the current one
    */
  def subtract(other: Quaternion): this.type = js.native
  
  /**
    * Subtract a quaternion to the current one
    * Example Playground https://playground.babylonjs.com/#L49EJ7#58
    * @param other defines the quaternion to subtract
    * @returns the current quaternion
    */
  def subtractInPlace(other: DeepImmutable[Quaternion]): this.type = js.native
  
  /**
    * Stores from the starting index in the given array the Quaternion successive values
    * Example Playground https://playground.babylonjs.com/#L49EJ7#59
    * @param array defines the array where to store the x,y,z,w components
    * @param index defines an optional index in the target array to define where to start storing values
    * @returns the current Quaternion object
    */
  def toArray(array: FloatArray): Quaternion = js.native
  def toArray(array: FloatArray, index: Double): Quaternion = js.native
  
  /**
    * Returns a new Vector3 set with the Euler angles translated from the current quaternion
    * Example Playground https://playground.babylonjs.com/#L49EJ7#32
    * @returns a new Vector3 containing the Euler angles
    * @see https://doc.babylonjs.com/features/featuresDeepDive/mesh/transforms/center_origin/rotation_conventions
    */
  def toEulerAngles(): Vector3 = js.native
  
  /**
    * Sets the given vector3 "result" with the Euler angles translated from the current quaternion
    * Example Playground https://playground.babylonjs.com/#L49EJ7#31
    * @param result defines the vector which will be filled with the Euler angles
    * @returns result input
    * @see https://doc.babylonjs.com/features/featuresDeepDive/mesh/transforms/center_origin/rotation_conventions
    */
  def toEulerAnglesToRef[T /* <: Vector3 */](result: T): T = js.native
  
  /**
    * Updates the given rotation matrix with the current quaternion values
    * Example Playground https://playground.babylonjs.com/#L49EJ7#67
    * @param result defines the target matrix
    * @returns the current unchanged quaternion
    */
  def toRotationMatrix[T /* <: Matrix */](result: T): T = js.native
  
  /** Gets or sets the w coordinate */
  def w: Double = js.native
  def w_=(value: Double): Unit = js.native
  
  /** Gets or sets the x coordinate */
  def x: Double = js.native
  def x_=(value: Double): Unit = js.native
  
  /** Gets or sets the y coordinate */
  def y: Double = js.native
  def y_=(value: Double): Unit = js.native
  
  /** Gets or sets the z coordinate */
  def z: Double = js.native
  def z_=(value: Double): Unit = js.native
}
