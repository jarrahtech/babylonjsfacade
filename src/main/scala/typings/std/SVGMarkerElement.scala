package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGMarkerElement
  extends StObject
     with SVGElement
     with SVGFitToViewBox {
  
  /* standard dom */
  val SVG_MARKERUNITS_STROKEWIDTH: `2` = js.native
  
  /* standard dom */
  val SVG_MARKERUNITS_UNKNOWN: `0` = js.native
  
  /* standard dom */
  val SVG_MARKERUNITS_USERSPACEONUSE: `1` = js.native
  
  /* standard dom */
  val SVG_MARKER_ORIENT_ANGLE: `2` = js.native
  
  /* standard dom */
  val SVG_MARKER_ORIENT_AUTO: `1` = js.native
  
  /* standard dom */
  val SVG_MARKER_ORIENT_UNKNOWN: `0` = js.native
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  val markerHeight: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard dom */
  val markerUnits: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
  /* standard dom */
  val markerWidth: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard dom */
  val orientAngle: org.scalajs.dom.SVGAnimatedAngle = js.native
  
  /* standard dom */
  val orientType: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
  /* standard dom */
  val refX: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard dom */
  val refY: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  
  /* standard dom */
  def setOrientToAngle(angle: org.scalajs.dom.SVGAngle): Unit = js.native
  
  /* standard dom */
  def setOrientToAuto(): Unit = js.native
}
