// This file is generated.

package com.mapbox.maps.testapp.style.layers.generated

import android.graphics.Color
import androidx.test.annotation.UiThreadTest
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.mapbox.maps.extension.style.expressions.dsl.generated.*
import com.mapbox.maps.extension.style.layers.generated.*
import com.mapbox.maps.extension.style.layers.properties.generated.*
import com.mapbox.maps.extension.style.types.*
import com.mapbox.maps.testapp.style.BaseStyleTest
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Basic smoke tests for LocationIndicatorLayer
 */
@RunWith(AndroidJUnit4::class)
class LocationIndicatorLayerTest : BaseStyleTest() {
  // Property getters and setters

  @Test
  @UiThreadTest
  fun accuracyRadiusTest() {
    val testValue = 1.0
    val layer = locationIndicatorLayer("id") {
      accuracyRadius(testValue)
    }
    setupLayer(layer)
    assertEquals(testValue, layer.accuracyRadius!!, 1E-5)
  }

  @Test
  @UiThreadTest
  fun accuracyRadiusAsExpressionTest() {
    val expression = literal(1.0)
    val layer = locationIndicatorLayer("id") {
      accuracyRadius(expression)
    }
    setupLayer(layer)

    assertEquals(1.0, layer.accuracyRadiusAsExpression?.contents as Double, 1E-5)
    assertEquals(1.0, layer.accuracyRadius!!, 1E-5)
  }

  @Test
  @UiThreadTest
  fun accuracyRadiusTransitionTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val layer = locationIndicatorLayer("id") {
      accuracyRadiusTransition(transition)
    }
    setupLayer(layer)
    assertEquals(transition, layer.accuracyRadiusTransition)
  }

  @Test
  @UiThreadTest
  fun accuracyRadiusTransitionSetDslTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val layer = locationIndicatorLayer("id") {
      accuracyRadiusTransition {
        duration(100)
        delay(200)
      }
    }
    setupLayer(layer)
    assertEquals(transition, layer.accuracyRadiusTransition)
  }

  @Test
  @UiThreadTest
  fun accuracyRadiusBorderColorTest() {
    val testValue = "rgba(0, 0, 0, 1)"
    val layer = locationIndicatorLayer("id") {
      accuracyRadiusBorderColor(testValue)
    }
    setupLayer(layer)
    assertEquals(testValue.toString(), layer.accuracyRadiusBorderColor?.toString())
  }

  @Test
  @UiThreadTest
  fun accuracyRadiusBorderColorAsExpressionTest() {
    val expression = rgba {
      literal(0.0)
      literal(0.0)
      literal(0.0)
      literal(1.0)
    }
    val layer = locationIndicatorLayer("id") {
      accuracyRadiusBorderColor(expression)
    }
    setupLayer(layer)

    assertEquals(expression.toString(), layer.accuracyRadiusBorderColorAsExpression.toString())
    assertEquals("rgba(0, 0, 0, 1)", layer.accuracyRadiusBorderColor)
    assertEquals(Color.BLACK, layer.accuracyRadiusBorderColorAsColorInt)
  }

  @Test
  @UiThreadTest
  fun accuracyRadiusBorderColorUseThemeAsExpressionTest() {
    val expression = literal("none")
    val layer = locationIndicatorLayer("id") {
      accuracyRadiusBorderColorUseTheme(expression)
    }
    setupLayer(layer)
    assertEquals(expression.toString(), layer.accuracyRadiusBorderColorUseThemeAsExpression.toString())
  }

  @Test
  @UiThreadTest
  fun accuracyRadiusBorderColorUseThemeStringAsExpressionTest() {
    val testValue = "none"
    val layer = locationIndicatorLayer("id") {
      accuracyRadiusBorderColorUseTheme(testValue)
    }
    setupLayer(layer)
    assertEquals(literal(testValue).toString(), layer.accuracyRadiusBorderColorUseThemeAsExpression.toString())
  }

  @Test
  @UiThreadTest
  fun accuracyRadiusBorderColorAsColorIntTest() {
    val layer = locationIndicatorLayer("id") {
      accuracyRadiusBorderColor(Color.CYAN)
    }
    setupLayer(layer)
    assertEquals(Color.CYAN, layer.accuracyRadiusBorderColorAsColorInt)
  }

  @Test
  @UiThreadTest
  fun accuracyRadiusBorderColorUseTheme() {
    val theme = "none"
    val layer = locationIndicatorLayer("id") {
      accuracyRadiusBorderColorUseTheme(theme)
    }
    setupLayer(layer)
    assertEquals(theme, layer.accuracyRadiusBorderColorUseTheme)
  }

  @Test
  @UiThreadTest
  fun accuracyRadiusBorderColorTransitionTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val layer = locationIndicatorLayer("id") {
      accuracyRadiusBorderColorTransition(transition)
    }
    setupLayer(layer)
    assertEquals(transition, layer.accuracyRadiusBorderColorTransition)
  }

  @Test
  @UiThreadTest
  fun accuracyRadiusBorderColorTransitionSetDslTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val layer = locationIndicatorLayer("id") {
      accuracyRadiusBorderColorTransition {
        duration(100)
        delay(200)
      }
    }
    setupLayer(layer)
    assertEquals(transition, layer.accuracyRadiusBorderColorTransition)
  }

  @Test
  @UiThreadTest
  fun accuracyRadiusColorTest() {
    val testValue = "rgba(0, 0, 0, 1)"
    val layer = locationIndicatorLayer("id") {
      accuracyRadiusColor(testValue)
    }
    setupLayer(layer)
    assertEquals(testValue.toString(), layer.accuracyRadiusColor?.toString())
  }

  @Test
  @UiThreadTest
  fun accuracyRadiusColorAsExpressionTest() {
    val expression = rgba {
      literal(0.0)
      literal(0.0)
      literal(0.0)
      literal(1.0)
    }
    val layer = locationIndicatorLayer("id") {
      accuracyRadiusColor(expression)
    }
    setupLayer(layer)

    assertEquals(expression.toString(), layer.accuracyRadiusColorAsExpression.toString())
    assertEquals("rgba(0, 0, 0, 1)", layer.accuracyRadiusColor)
    assertEquals(Color.BLACK, layer.accuracyRadiusColorAsColorInt)
  }

  @Test
  @UiThreadTest
  fun accuracyRadiusColorUseThemeAsExpressionTest() {
    val expression = literal("none")
    val layer = locationIndicatorLayer("id") {
      accuracyRadiusColorUseTheme(expression)
    }
    setupLayer(layer)
    assertEquals(expression.toString(), layer.accuracyRadiusColorUseThemeAsExpression.toString())
  }

  @Test
  @UiThreadTest
  fun accuracyRadiusColorUseThemeStringAsExpressionTest() {
    val testValue = "none"
    val layer = locationIndicatorLayer("id") {
      accuracyRadiusColorUseTheme(testValue)
    }
    setupLayer(layer)
    assertEquals(literal(testValue).toString(), layer.accuracyRadiusColorUseThemeAsExpression.toString())
  }

  @Test
  @UiThreadTest
  fun accuracyRadiusColorAsColorIntTest() {
    val layer = locationIndicatorLayer("id") {
      accuracyRadiusColor(Color.CYAN)
    }
    setupLayer(layer)
    assertEquals(Color.CYAN, layer.accuracyRadiusColorAsColorInt)
  }

  @Test
  @UiThreadTest
  fun accuracyRadiusColorUseTheme() {
    val theme = "none"
    val layer = locationIndicatorLayer("id") {
      accuracyRadiusColorUseTheme(theme)
    }
    setupLayer(layer)
    assertEquals(theme, layer.accuracyRadiusColorUseTheme)
  }

  @Test
  @UiThreadTest
  fun accuracyRadiusColorTransitionTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val layer = locationIndicatorLayer("id") {
      accuracyRadiusColorTransition(transition)
    }
    setupLayer(layer)
    assertEquals(transition, layer.accuracyRadiusColorTransition)
  }

  @Test
  @UiThreadTest
  fun accuracyRadiusColorTransitionSetDslTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val layer = locationIndicatorLayer("id") {
      accuracyRadiusColorTransition {
        duration(100)
        delay(200)
      }
    }
    setupLayer(layer)
    assertEquals(transition, layer.accuracyRadiusColorTransition)
  }

  @Test
  @UiThreadTest
  fun bearingTest() {
    val testValue = 1.0
    val layer = locationIndicatorLayer("id") {
      bearing(testValue)
    }
    setupLayer(layer)
    assertEquals(testValue, layer.bearing!!, 1E-5)
  }

  @Test
  @UiThreadTest
  fun bearingAsExpressionTest() {
    val expression = literal(1.0)
    val layer = locationIndicatorLayer("id") {
      bearing(expression)
    }
    setupLayer(layer)

    assertEquals(1.0, layer.bearingAsExpression?.contents as Double, 1E-5)
    assertEquals(1.0, layer.bearing!!, 1E-5)
  }

  @Test
  @UiThreadTest
  fun bearingTransitionTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val layer = locationIndicatorLayer("id") {
      bearingTransition(transition)
    }
    setupLayer(layer)
    assertEquals(transition, layer.bearingTransition)
  }

  @Test
  @UiThreadTest
  fun bearingTransitionSetDslTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val layer = locationIndicatorLayer("id") {
      bearingTransition {
        duration(100)
        delay(200)
      }
    }
    setupLayer(layer)
    assertEquals(transition, layer.bearingTransition)
  }

  @Test
  @UiThreadTest
  fun bearingImageTest() {
    val testValue = "abc"
    val layer = locationIndicatorLayer("id") {
      bearingImage(testValue)
    }
    setupLayer(layer)
    assertEquals(testValue.toString(), layer.bearingImage?.toString())
  }

  @Test
  @UiThreadTest
  fun bearingImageAsExpressionTest() {
    val expression = literal("abc")
    val layer = locationIndicatorLayer("id") {
      bearingImage(expression)
    }
    setupLayer(layer)

    assertEquals(expression.toString(), layer.bearingImageAsExpression.toString())
    assertEquals(expression.toString(), layer.bearingImage)
  }

  @Test
  @UiThreadTest
  fun bearingImageSizeTest() {
    val testValue = 1.0
    val layer = locationIndicatorLayer("id") {
      bearingImageSize(testValue)
    }
    setupLayer(layer)
    assertEquals(testValue, layer.bearingImageSize!!, 1E-5)
  }

  @Test
  @UiThreadTest
  fun bearingImageSizeAsExpressionTest() {
    val expression = literal(1.0)
    val layer = locationIndicatorLayer("id") {
      bearingImageSize(expression)
    }
    setupLayer(layer)

    assertEquals(1.0, layer.bearingImageSizeAsExpression?.contents as Double, 1E-5)
    assertEquals(1.0, layer.bearingImageSize!!, 1E-5)
  }

  @Test
  @UiThreadTest
  fun bearingImageSizeTransitionTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val layer = locationIndicatorLayer("id") {
      bearingImageSizeTransition(transition)
    }
    setupLayer(layer)
    assertEquals(transition, layer.bearingImageSizeTransition)
  }

  @Test
  @UiThreadTest
  fun bearingImageSizeTransitionSetDslTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val layer = locationIndicatorLayer("id") {
      bearingImageSizeTransition {
        duration(100)
        delay(200)
      }
    }
    setupLayer(layer)
    assertEquals(transition, layer.bearingImageSizeTransition)
  }

  @Test
  @UiThreadTest
  fun emphasisCircleColorTest() {
    val testValue = "rgba(0, 0, 0, 1)"
    val layer = locationIndicatorLayer("id") {
      emphasisCircleColor(testValue)
    }
    setupLayer(layer)
    assertEquals(testValue.toString(), layer.emphasisCircleColor?.toString())
  }

  @Test
  @UiThreadTest
  fun emphasisCircleColorAsExpressionTest() {
    val expression = rgba {
      literal(0.0)
      literal(0.0)
      literal(0.0)
      literal(1.0)
    }
    val layer = locationIndicatorLayer("id") {
      emphasisCircleColor(expression)
    }
    setupLayer(layer)

    assertEquals(expression.toString(), layer.emphasisCircleColorAsExpression.toString())
    assertEquals("rgba(0, 0, 0, 1)", layer.emphasisCircleColor)
    assertEquals(Color.BLACK, layer.emphasisCircleColorAsColorInt)
  }

  @Test
  @UiThreadTest
  fun emphasisCircleColorUseThemeAsExpressionTest() {
    val expression = literal("none")
    val layer = locationIndicatorLayer("id") {
      emphasisCircleColorUseTheme(expression)
    }
    setupLayer(layer)
    assertEquals(expression.toString(), layer.emphasisCircleColorUseThemeAsExpression.toString())
  }

  @Test
  @UiThreadTest
  fun emphasisCircleColorUseThemeStringAsExpressionTest() {
    val testValue = "none"
    val layer = locationIndicatorLayer("id") {
      emphasisCircleColorUseTheme(testValue)
    }
    setupLayer(layer)
    assertEquals(literal(testValue).toString(), layer.emphasisCircleColorUseThemeAsExpression.toString())
  }

  @Test
  @UiThreadTest
  fun emphasisCircleColorAsColorIntTest() {
    val layer = locationIndicatorLayer("id") {
      emphasisCircleColor(Color.CYAN)
    }
    setupLayer(layer)
    assertEquals(Color.CYAN, layer.emphasisCircleColorAsColorInt)
  }

  @Test
  @UiThreadTest
  fun emphasisCircleColorUseTheme() {
    val theme = "none"
    val layer = locationIndicatorLayer("id") {
      emphasisCircleColorUseTheme(theme)
    }
    setupLayer(layer)
    assertEquals(theme, layer.emphasisCircleColorUseTheme)
  }

  @Test
  @UiThreadTest
  fun emphasisCircleColorTransitionTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val layer = locationIndicatorLayer("id") {
      emphasisCircleColorTransition(transition)
    }
    setupLayer(layer)
    assertEquals(transition, layer.emphasisCircleColorTransition)
  }

  @Test
  @UiThreadTest
  fun emphasisCircleColorTransitionSetDslTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val layer = locationIndicatorLayer("id") {
      emphasisCircleColorTransition {
        duration(100)
        delay(200)
      }
    }
    setupLayer(layer)
    assertEquals(transition, layer.emphasisCircleColorTransition)
  }

  @Test
  @UiThreadTest
  fun emphasisCircleGlowRangeTest() {
    val testValue = listOf(0.0, 1.0)
    val layer = locationIndicatorLayer("id") {
      emphasisCircleGlowRange(testValue)
    }
    setupLayer(layer)
    assertEquals(testValue.toString(), layer.emphasisCircleGlowRange?.toString())
  }

  @Test
  @UiThreadTest
  fun emphasisCircleGlowRangeAsExpressionTest() {
    val expression = literal(listOf(0.0, 1.0))
    val layer = locationIndicatorLayer("id") {
      emphasisCircleGlowRange(expression)
    }
    setupLayer(layer)

    assertEquals(expression.toString(), layer.emphasisCircleGlowRangeAsExpression.toString())
    assertEquals(listOf(0.0, 1.0), layer.emphasisCircleGlowRange!!)
  }

  @Test
  @UiThreadTest
  fun emphasisCircleGlowRangeTransitionTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val layer = locationIndicatorLayer("id") {
      emphasisCircleGlowRangeTransition(transition)
    }
    setupLayer(layer)
    assertEquals(transition, layer.emphasisCircleGlowRangeTransition)
  }

  @Test
  @UiThreadTest
  fun emphasisCircleGlowRangeTransitionSetDslTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val layer = locationIndicatorLayer("id") {
      emphasisCircleGlowRangeTransition {
        duration(100)
        delay(200)
      }
    }
    setupLayer(layer)
    assertEquals(transition, layer.emphasisCircleGlowRangeTransition)
  }

  @Test
  @UiThreadTest
  fun emphasisCircleRadiusTest() {
    val testValue = 1.0
    val layer = locationIndicatorLayer("id") {
      emphasisCircleRadius(testValue)
    }
    setupLayer(layer)
    assertEquals(testValue, layer.emphasisCircleRadius!!, 1E-5)
  }

  @Test
  @UiThreadTest
  fun emphasisCircleRadiusAsExpressionTest() {
    val expression = literal(1.0)
    val layer = locationIndicatorLayer("id") {
      emphasisCircleRadius(expression)
    }
    setupLayer(layer)

    assertEquals(1.0, layer.emphasisCircleRadiusAsExpression?.contents as Double, 1E-5)
    assertEquals(1.0, layer.emphasisCircleRadius!!, 1E-5)
  }

  @Test
  @UiThreadTest
  fun emphasisCircleRadiusTransitionTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val layer = locationIndicatorLayer("id") {
      emphasisCircleRadiusTransition(transition)
    }
    setupLayer(layer)
    assertEquals(transition, layer.emphasisCircleRadiusTransition)
  }

  @Test
  @UiThreadTest
  fun emphasisCircleRadiusTransitionSetDslTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val layer = locationIndicatorLayer("id") {
      emphasisCircleRadiusTransition {
        duration(100)
        delay(200)
      }
    }
    setupLayer(layer)
    assertEquals(transition, layer.emphasisCircleRadiusTransition)
  }

  @Test
  @UiThreadTest
  fun imagePitchDisplacementTest() {
    val testValue = 1.0
    val layer = locationIndicatorLayer("id") {
      imagePitchDisplacement(testValue)
    }
    setupLayer(layer)
    assertEquals(testValue, layer.imagePitchDisplacement!!, 1E-5)
  }

  @Test
  @UiThreadTest
  fun imagePitchDisplacementAsExpressionTest() {
    val expression = literal(1.0)
    val layer = locationIndicatorLayer("id") {
      imagePitchDisplacement(expression)
    }
    setupLayer(layer)

    assertEquals(1.0, layer.imagePitchDisplacementAsExpression?.contents as Double, 1E-5)
    assertEquals(1.0, layer.imagePitchDisplacement!!, 1E-5)
  }

  @Test
  @UiThreadTest
  fun locationTest() {
    val testValue = listOf(0.0, 1.0, 2.0)
    val layer = locationIndicatorLayer("id") {
      location(testValue)
    }
    setupLayer(layer)
    assertEquals(testValue.toString(), layer.location?.toString())
  }

  @Test
  @UiThreadTest
  fun locationAsExpressionTest() {
    val expression = literal(listOf(0.0, 1.0, 2.0))
    val layer = locationIndicatorLayer("id") {
      location(expression)
    }
    setupLayer(layer)

    assertEquals(expression.toString(), layer.locationAsExpression.toString())
    assertEquals(listOf(0.0, 1.0, 2.0), layer.location!!)
  }

  @Test
  @UiThreadTest
  fun locationTransitionTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val layer = locationIndicatorLayer("id") {
      locationTransition(transition)
    }
    setupLayer(layer)
    assertEquals(transition, layer.locationTransition)
  }

  @Test
  @UiThreadTest
  fun locationTransitionSetDslTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val layer = locationIndicatorLayer("id") {
      locationTransition {
        duration(100)
        delay(200)
      }
    }
    setupLayer(layer)
    assertEquals(transition, layer.locationTransition)
  }

  @Test
  @UiThreadTest
  fun locationIndicatorOpacityTest() {
    val testValue = 1.0
    val layer = locationIndicatorLayer("id") {
      locationIndicatorOpacity(testValue)
    }
    setupLayer(layer)
    assertEquals(testValue, layer.locationIndicatorOpacity!!, 1E-5)
  }

  @Test
  @UiThreadTest
  fun locationIndicatorOpacityAsExpressionTest() {
    val expression = literal(1.0)
    val layer = locationIndicatorLayer("id") {
      locationIndicatorOpacity(expression)
    }
    setupLayer(layer)

    assertEquals(1.0, layer.locationIndicatorOpacityAsExpression?.contents as Double, 1E-5)
    assertEquals(1.0, layer.locationIndicatorOpacity!!, 1E-5)
  }

  @Test
  @UiThreadTest
  fun locationIndicatorOpacityTransitionTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val layer = locationIndicatorLayer("id") {
      locationIndicatorOpacityTransition(transition)
    }
    setupLayer(layer)
    assertEquals(transition, layer.locationIndicatorOpacityTransition)
  }

  @Test
  @UiThreadTest
  fun locationIndicatorOpacityTransitionSetDslTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val layer = locationIndicatorLayer("id") {
      locationIndicatorOpacityTransition {
        duration(100)
        delay(200)
      }
    }
    setupLayer(layer)
    assertEquals(transition, layer.locationIndicatorOpacityTransition)
  }

  @Test
  @UiThreadTest
  fun perspectiveCompensationTest() {
    val testValue = 1.0
    val layer = locationIndicatorLayer("id") {
      perspectiveCompensation(testValue)
    }
    setupLayer(layer)
    assertEquals(testValue, layer.perspectiveCompensation!!, 1E-5)
  }

  @Test
  @UiThreadTest
  fun perspectiveCompensationAsExpressionTest() {
    val expression = literal(1.0)
    val layer = locationIndicatorLayer("id") {
      perspectiveCompensation(expression)
    }
    setupLayer(layer)

    assertEquals(1.0, layer.perspectiveCompensationAsExpression?.contents as Double, 1E-5)
    assertEquals(1.0, layer.perspectiveCompensation!!, 1E-5)
  }

  @Test
  @UiThreadTest
  fun shadowImageTest() {
    val testValue = "abc"
    val layer = locationIndicatorLayer("id") {
      shadowImage(testValue)
    }
    setupLayer(layer)
    assertEquals(testValue.toString(), layer.shadowImage?.toString())
  }

  @Test
  @UiThreadTest
  fun shadowImageAsExpressionTest() {
    val expression = literal("abc")
    val layer = locationIndicatorLayer("id") {
      shadowImage(expression)
    }
    setupLayer(layer)

    assertEquals(expression.toString(), layer.shadowImageAsExpression.toString())
    assertEquals(expression.toString(), layer.shadowImage)
  }

  @Test
  @UiThreadTest
  fun shadowImageSizeTest() {
    val testValue = 1.0
    val layer = locationIndicatorLayer("id") {
      shadowImageSize(testValue)
    }
    setupLayer(layer)
    assertEquals(testValue, layer.shadowImageSize!!, 1E-5)
  }

  @Test
  @UiThreadTest
  fun shadowImageSizeAsExpressionTest() {
    val expression = literal(1.0)
    val layer = locationIndicatorLayer("id") {
      shadowImageSize(expression)
    }
    setupLayer(layer)

    assertEquals(1.0, layer.shadowImageSizeAsExpression?.contents as Double, 1E-5)
    assertEquals(1.0, layer.shadowImageSize!!, 1E-5)
  }

  @Test
  @UiThreadTest
  fun shadowImageSizeTransitionTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val layer = locationIndicatorLayer("id") {
      shadowImageSizeTransition(transition)
    }
    setupLayer(layer)
    assertEquals(transition, layer.shadowImageSizeTransition)
  }

  @Test
  @UiThreadTest
  fun shadowImageSizeTransitionSetDslTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val layer = locationIndicatorLayer("id") {
      shadowImageSizeTransition {
        duration(100)
        delay(200)
      }
    }
    setupLayer(layer)
    assertEquals(transition, layer.shadowImageSizeTransition)
  }

  @Test
  @UiThreadTest
  fun topImageTest() {
    val testValue = "abc"
    val layer = locationIndicatorLayer("id") {
      topImage(testValue)
    }
    setupLayer(layer)
    assertEquals(testValue.toString(), layer.topImage?.toString())
  }

  @Test
  @UiThreadTest
  fun topImageAsExpressionTest() {
    val expression = literal("abc")
    val layer = locationIndicatorLayer("id") {
      topImage(expression)
    }
    setupLayer(layer)

    assertEquals(expression.toString(), layer.topImageAsExpression.toString())
    assertEquals(expression.toString(), layer.topImage)
  }

  @Test
  @UiThreadTest
  fun topImageSizeTest() {
    val testValue = 1.0
    val layer = locationIndicatorLayer("id") {
      topImageSize(testValue)
    }
    setupLayer(layer)
    assertEquals(testValue, layer.topImageSize!!, 1E-5)
  }

  @Test
  @UiThreadTest
  fun topImageSizeAsExpressionTest() {
    val expression = literal(1.0)
    val layer = locationIndicatorLayer("id") {
      topImageSize(expression)
    }
    setupLayer(layer)

    assertEquals(1.0, layer.topImageSizeAsExpression?.contents as Double, 1E-5)
    assertEquals(1.0, layer.topImageSize!!, 1E-5)
  }

  @Test
  @UiThreadTest
  fun topImageSizeTransitionTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val layer = locationIndicatorLayer("id") {
      topImageSizeTransition(transition)
    }
    setupLayer(layer)
    assertEquals(transition, layer.topImageSizeTransition)
  }

  @Test
  @UiThreadTest
  fun topImageSizeTransitionSetDslTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val layer = locationIndicatorLayer("id") {
      topImageSizeTransition {
        duration(100)
        delay(200)
      }
    }
    setupLayer(layer)
    assertEquals(transition, layer.topImageSizeTransition)
  }

  @Test
  @UiThreadTest
  fun visibilityTest() {
    val layer = locationIndicatorLayer("id") {
      visibility(Visibility.NONE)
    }
    setupLayer(layer)
    assertEquals(Visibility.NONE, layer.visibility)
  }

  @Test
  @UiThreadTest
  fun visibilityAsExpressionTest() {
    val layer = locationIndicatorLayer("id") {
      visibility(
        concat {
          literal("no")
          literal("ne")
        }
      )
    }
    setupLayer(layer)
    assertEquals(Visibility.NONE, layer.visibility)
  }

  // Default property getter tests

  @Test
  @UiThreadTest
  fun defaultLayerPropertiesTest() {
    assertNotNull("defaultVisibility should not be null", LocationIndicatorLayer.defaultVisibility)
    assertNotNull("defaultMinZoom should not be null", LocationIndicatorLayer.defaultMinZoom)
    assertNotNull("defaultMaxZoom should not be null", LocationIndicatorLayer.defaultMaxZoom)
    assertNotNull("defaultAccuracyRadius should not be null", LocationIndicatorLayer.defaultAccuracyRadius)
    assertNotNull("defaultAccuracyRadiusAsExpression should not be null", LocationIndicatorLayer.defaultAccuracyRadiusAsExpression)
    assertNotNull("defaultAccuracyRadiusTransition should not be null", LocationIndicatorLayer.defaultAccuracyRadiusTransition)
    assertNotNull("defaultAccuracyRadiusBorderColor should not be null", LocationIndicatorLayer.defaultAccuracyRadiusBorderColor)
    assertNotNull("defaultAccuracyRadiusBorderColorAsExpression should not be null", LocationIndicatorLayer.defaultAccuracyRadiusBorderColorAsExpression)
    assertNotNull("defaultAccuracyRadiusBorderColorAsColorInt should not be null", LocationIndicatorLayer.defaultAccuracyRadiusBorderColorAsColorInt)
    assertNotNull("defaultAccuracyRadiusBorderColorUseTheme should not be null", LocationIndicatorLayer.defaultAccuracyRadiusBorderColorUseTheme)
    assertNotNull("defaultAccuracyRadiusBorderColorUseThemeAsExpression should not be null", LocationIndicatorLayer.defaultAccuracyRadiusBorderColorUseThemeAsExpression)
    assertNotNull("defaultAccuracyRadiusBorderColorTransition should not be null", LocationIndicatorLayer.defaultAccuracyRadiusBorderColorTransition)
    assertNotNull("defaultAccuracyRadiusColor should not be null", LocationIndicatorLayer.defaultAccuracyRadiusColor)
    assertNotNull("defaultAccuracyRadiusColorAsExpression should not be null", LocationIndicatorLayer.defaultAccuracyRadiusColorAsExpression)
    assertNotNull("defaultAccuracyRadiusColorAsColorInt should not be null", LocationIndicatorLayer.defaultAccuracyRadiusColorAsColorInt)
    assertNotNull("defaultAccuracyRadiusColorUseTheme should not be null", LocationIndicatorLayer.defaultAccuracyRadiusColorUseTheme)
    assertNotNull("defaultAccuracyRadiusColorUseThemeAsExpression should not be null", LocationIndicatorLayer.defaultAccuracyRadiusColorUseThemeAsExpression)
    assertNotNull("defaultAccuracyRadiusColorTransition should not be null", LocationIndicatorLayer.defaultAccuracyRadiusColorTransition)
    assertNotNull("defaultBearing should not be null", LocationIndicatorLayer.defaultBearing)
    assertNotNull("defaultBearingAsExpression should not be null", LocationIndicatorLayer.defaultBearingAsExpression)
    assertNotNull("defaultBearingTransition should not be null", LocationIndicatorLayer.defaultBearingTransition)
    assertNotNull("defaultBearingImage should not be null", LocationIndicatorLayer.defaultBearingImage)
    assertNotNull("defaultBearingImageAsExpression should not be null", LocationIndicatorLayer.defaultBearingImageAsExpression)
    assertNotNull("defaultBearingImageSize should not be null", LocationIndicatorLayer.defaultBearingImageSize)
    assertNotNull("defaultBearingImageSizeAsExpression should not be null", LocationIndicatorLayer.defaultBearingImageSizeAsExpression)
    assertNotNull("defaultBearingImageSizeTransition should not be null", LocationIndicatorLayer.defaultBearingImageSizeTransition)
    assertNotNull("defaultEmphasisCircleColor should not be null", LocationIndicatorLayer.defaultEmphasisCircleColor)
    assertNotNull("defaultEmphasisCircleColorAsExpression should not be null", LocationIndicatorLayer.defaultEmphasisCircleColorAsExpression)
    assertNotNull("defaultEmphasisCircleColorAsColorInt should not be null", LocationIndicatorLayer.defaultEmphasisCircleColorAsColorInt)
    assertNotNull("defaultEmphasisCircleColorUseTheme should not be null", LocationIndicatorLayer.defaultEmphasisCircleColorUseTheme)
    assertNotNull("defaultEmphasisCircleColorUseThemeAsExpression should not be null", LocationIndicatorLayer.defaultEmphasisCircleColorUseThemeAsExpression)
    assertNotNull("defaultEmphasisCircleColorTransition should not be null", LocationIndicatorLayer.defaultEmphasisCircleColorTransition)
    assertNotNull("defaultEmphasisCircleGlowRange should not be null", LocationIndicatorLayer.defaultEmphasisCircleGlowRange)
    assertNotNull("defaultEmphasisCircleGlowRangeAsExpression should not be null", LocationIndicatorLayer.defaultEmphasisCircleGlowRangeAsExpression)
    assertNotNull("defaultEmphasisCircleGlowRangeTransition should not be null", LocationIndicatorLayer.defaultEmphasisCircleGlowRangeTransition)
    assertNotNull("defaultEmphasisCircleRadius should not be null", LocationIndicatorLayer.defaultEmphasisCircleRadius)
    assertNotNull("defaultEmphasisCircleRadiusAsExpression should not be null", LocationIndicatorLayer.defaultEmphasisCircleRadiusAsExpression)
    assertNotNull("defaultEmphasisCircleRadiusTransition should not be null", LocationIndicatorLayer.defaultEmphasisCircleRadiusTransition)
    assertNotNull("defaultImagePitchDisplacement should not be null", LocationIndicatorLayer.defaultImagePitchDisplacement)
    assertNotNull("defaultImagePitchDisplacementAsExpression should not be null", LocationIndicatorLayer.defaultImagePitchDisplacementAsExpression)
    assertNotNull("defaultLocation should not be null", LocationIndicatorLayer.defaultLocation)
    assertNotNull("defaultLocationAsExpression should not be null", LocationIndicatorLayer.defaultLocationAsExpression)
    assertNotNull("defaultLocationTransition should not be null", LocationIndicatorLayer.defaultLocationTransition)
    assertNotNull("defaultLocationIndicatorOpacity should not be null", LocationIndicatorLayer.defaultLocationIndicatorOpacity)
    assertNotNull("defaultLocationIndicatorOpacityAsExpression should not be null", LocationIndicatorLayer.defaultLocationIndicatorOpacityAsExpression)
    assertNotNull("defaultLocationIndicatorOpacityTransition should not be null", LocationIndicatorLayer.defaultLocationIndicatorOpacityTransition)
    assertNotNull("defaultPerspectiveCompensation should not be null", LocationIndicatorLayer.defaultPerspectiveCompensation)
    assertNotNull("defaultPerspectiveCompensationAsExpression should not be null", LocationIndicatorLayer.defaultPerspectiveCompensationAsExpression)
    assertNotNull("defaultShadowImage should not be null", LocationIndicatorLayer.defaultShadowImage)
    assertNotNull("defaultShadowImageAsExpression should not be null", LocationIndicatorLayer.defaultShadowImageAsExpression)
    assertNotNull("defaultShadowImageSize should not be null", LocationIndicatorLayer.defaultShadowImageSize)
    assertNotNull("defaultShadowImageSizeAsExpression should not be null", LocationIndicatorLayer.defaultShadowImageSizeAsExpression)
    assertNotNull("defaultShadowImageSizeTransition should not be null", LocationIndicatorLayer.defaultShadowImageSizeTransition)
    assertNotNull("defaultTopImage should not be null", LocationIndicatorLayer.defaultTopImage)
    assertNotNull("defaultTopImageAsExpression should not be null", LocationIndicatorLayer.defaultTopImageAsExpression)
    assertNotNull("defaultTopImageSize should not be null", LocationIndicatorLayer.defaultTopImageSize)
    assertNotNull("defaultTopImageSizeAsExpression should not be null", LocationIndicatorLayer.defaultTopImageSizeAsExpression)
    assertNotNull("defaultTopImageSizeTransition should not be null", LocationIndicatorLayer.defaultTopImageSizeTransition)
  }

  @Test
  @UiThreadTest
  fun getLayerTest() {
    val accuracyRadiusTestValue = 1.0
    val accuracyRadiusBorderColorTestValue = "rgba(0, 0, 0, 1)"
    val accuracyRadiusBorderColorUseThemeTestValue = "default"
    val accuracyRadiusColorTestValue = "rgba(0, 0, 0, 1)"
    val accuracyRadiusColorUseThemeTestValue = "default"
    val bearingTestValue = 1.0
    val bearingImageTestValue = "abc"
    val bearingImageSizeTestValue = 1.0
    val emphasisCircleColorTestValue = "rgba(0, 0, 0, 1)"
    val emphasisCircleColorUseThemeTestValue = "default"
    val emphasisCircleGlowRangeTestValue = listOf(0.0, 1.0)
    val emphasisCircleRadiusTestValue = 1.0
    val imagePitchDisplacementTestValue = 1.0
    val locationTestValue = listOf(0.0, 1.0, 2.0)
    val locationIndicatorOpacityTestValue = 1.0
    val perspectiveCompensationTestValue = 1.0
    val shadowImageTestValue = "abc"
    val shadowImageSizeTestValue = 1.0
    val topImageTestValue = "abc"
    val topImageSizeTestValue = 1.0

    val layer = locationIndicatorLayer("id") {
      accuracyRadius(accuracyRadiusTestValue)
      accuracyRadiusBorderColor(accuracyRadiusBorderColorTestValue)
      accuracyRadiusBorderColorUseTheme(accuracyRadiusBorderColorUseThemeTestValue)
      accuracyRadiusColor(accuracyRadiusColorTestValue)
      accuracyRadiusColorUseTheme(accuracyRadiusColorUseThemeTestValue)
      bearing(bearingTestValue)
      bearingImage(bearingImageTestValue)
      bearingImageSize(bearingImageSizeTestValue)
      emphasisCircleColor(emphasisCircleColorTestValue)
      emphasisCircleColorUseTheme(emphasisCircleColorUseThemeTestValue)
      emphasisCircleGlowRange(emphasisCircleGlowRangeTestValue)
      emphasisCircleRadius(emphasisCircleRadiusTestValue)
      imagePitchDisplacement(imagePitchDisplacementTestValue)
      location(locationTestValue)
      locationIndicatorOpacity(locationIndicatorOpacityTestValue)
      perspectiveCompensation(perspectiveCompensationTestValue)
      shadowImage(shadowImageTestValue)
      shadowImageSize(shadowImageSizeTestValue)
      topImage(topImageTestValue)
      topImageSize(topImageSizeTestValue)
    }

    setupLayer(layer)

    val cachedLayer = getLayer("id") as LocationIndicatorLayer

    removeLayer(layer)
    setupLayer(cachedLayer)

    assertEquals(accuracyRadiusTestValue, cachedLayer.accuracyRadius)
    assertEquals(accuracyRadiusBorderColorTestValue, cachedLayer.accuracyRadiusBorderColor)
    assertEquals(accuracyRadiusBorderColorUseThemeTestValue, cachedLayer.accuracyRadiusBorderColorUseTheme)
    assertEquals(accuracyRadiusColorTestValue, cachedLayer.accuracyRadiusColor)
    assertEquals(accuracyRadiusColorUseThemeTestValue, cachedLayer.accuracyRadiusColorUseTheme)
    assertEquals(bearingTestValue, cachedLayer.bearing)
    assertEquals(bearingImageTestValue, cachedLayer.bearingImage)
    assertEquals(bearingImageSizeTestValue, cachedLayer.bearingImageSize)
    assertEquals(emphasisCircleColorTestValue, cachedLayer.emphasisCircleColor)
    assertEquals(emphasisCircleColorUseThemeTestValue, cachedLayer.emphasisCircleColorUseTheme)
    assertEquals(emphasisCircleGlowRangeTestValue, cachedLayer.emphasisCircleGlowRange)
    assertEquals(emphasisCircleRadiusTestValue, cachedLayer.emphasisCircleRadius)
    assertEquals(imagePitchDisplacementTestValue, cachedLayer.imagePitchDisplacement)
    assertEquals(locationTestValue, cachedLayer.location)
    assertEquals(locationIndicatorOpacityTestValue, cachedLayer.locationIndicatorOpacity)
    assertEquals(perspectiveCompensationTestValue, cachedLayer.perspectiveCompensation)
    assertEquals(shadowImageTestValue, cachedLayer.shadowImage)
    assertEquals(shadowImageSizeTestValue, cachedLayer.shadowImageSize)
    assertEquals(topImageTestValue, cachedLayer.topImage)
    assertEquals(topImageSizeTestValue, cachedLayer.topImageSize)
  }
}

// End of generated file.