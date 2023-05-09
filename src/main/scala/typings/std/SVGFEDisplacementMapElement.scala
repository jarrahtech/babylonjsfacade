package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import typings.std.stdInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <feDisplacementMap> element. */
@js.native
trait SVGFEDisplacementMapElement
  extends StObject
     with SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  
  /* standard dom */
  val SVG_CHANNEL_A: `4` = js.native
  
  /* standard dom */
  val SVG_CHANNEL_B: `3` = js.native
  
  /* standard dom */
  val SVG_CHANNEL_G: `2` = js.native
  
  /* standard dom */
  val SVG_CHANNEL_R: `1` = js.native
  
  /* standard dom */
  val SVG_CHANNEL_UNKNOWN: `0` = js.native
  
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
  val in1: org.scalajs.dom.SVGAnimatedString = js.native
  
  /* standard dom */
  val in2: org.scalajs.dom.SVGAnimatedString = js.native
  
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
  val scale: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val xChannelSelector: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
  /* standard dom */
  val yChannelSelector: org.scalajs.dom.SVGAnimatedEnumeration = js.native
}