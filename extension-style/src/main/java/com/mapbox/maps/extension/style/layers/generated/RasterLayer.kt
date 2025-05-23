// This file is generated.

package com.mapbox.maps.extension.style.layers.generated

import androidx.annotation.UiThread
import com.mapbox.maps.MapboxExperimental
import com.mapbox.maps.StyleManager
import com.mapbox.maps.extension.style.expressions.generated.Expression
import com.mapbox.maps.extension.style.layers.Layer
import com.mapbox.maps.extension.style.layers.properties.*
import com.mapbox.maps.extension.style.layers.properties.generated.*
import com.mapbox.maps.extension.style.types.*
import com.mapbox.maps.extension.style.utils.silentUnwrap
import java.util.*

/**
 * Raster map textures such as satellite imagery.
 *
 * @see [The online documentation](https://docs.mapbox.com/style-spec/reference/layers/#raster)
 *
 * @param layerId the ID of the layer
 * @param sourceId the ID of the source
 */
@UiThread
class RasterLayer(override val layerId: String, val sourceId: String) : RasterLayerDsl, Layer() {
  init {
    internalSourceId = sourceId
  }

  /**
   * A source layer is an individual layer of data within a vector source.
   * A vector source can have multiple source layers.
   *
   * @param sourceLayer value of sourceLayer
   */
  override fun sourceLayer(sourceLayer: String): RasterLayer = apply {
    val param = PropertyValue("source-layer", sourceLayer)
    setProperty(param)
  }

  /**
   * A source layer is an individual layer of data within a vector source.
   * A vector source can have multiple source layers.
   */
  val sourceLayer: String?
    /**
     * Get the sourceLayer property
     *
     * @return sourceLayer
     */
    get() {
      return getPropertyValue("source-layer")
    }

  /**
   * The slot this layer is assigned to. If specified, and a slot with that name exists,
   * it will be placed at that position in the layer order.
   *
   * @param slot value of slot. Setting it to empty string removes the slot.
   */
  override fun slot(slot: String): RasterLayer = apply {
    val param = PropertyValue("slot", slot)
    setProperty(param)
  }

  /**
   * The slot this layer is assigned to. If specified, and a slot with that name exists,
   * it will be placed at that position in the layer order.
   */
  override val slot: String?
    /**
     * Get the slot property
     *
     * @return slot
     */
    get() = getPropertyValue("slot")

  /**
   * Whether this layer is displayed.
   */
  override val visibility: Visibility?
    /**
     * Whether this layer is displayed.
     *
     * Use static method [RasterLayer.defaultVisibility] to get the default property value.
     *
     * @return VISIBILITY
     */
    get() {
      val property: String? = getPropertyValue("visibility")
      property?.let {
        return Visibility.valueOf(it.uppercase(Locale.US).replace('-', '_'))
      }
      return null
    }

  /**
   * Whether this layer is displayed.
   */
  override val visibilityAsExpression: Expression?
    /**
     * Whether this layer is displayed.
     *
     * Use static method [RasterLayer.defaultVisibility] to get the default property value.
     *
     * @return VISIBILITY as expression
     */
    get() = getPropertyValue("visibility")

  /**
   * Whether this layer is displayed.
   *
   * Use static method [RasterLayer.defaultVisibility] to get the default property value.
   *
   * @param visibility value of Visibility
   */
  override fun visibility(visibility: Visibility): RasterLayer = apply {
    val propertyValue = PropertyValue("visibility", visibility)
    setProperty(propertyValue)
  }

  /**
   * Whether this layer is displayed.
   *
   * Use static method [[RasterLayer.defaultVisibility] to get the default property value.
   *
   * @param visibility value of Visibility
   */
  override fun visibility(visibility: Expression): RasterLayer = apply {
    val propertyValue = PropertyValue("visibility", visibility)
    setProperty(propertyValue)
  }

  /**
   * The minimum zoom level for the layer. At zoom levels less than the minzoom, the layer will be hidden.
   *
   * Range:
   *       minimum: 0
   *       maximum: 24
   */
  override val minZoom: Double?
    /**
     * Get the minzoom property
     *
     * Use static method [RasterLayer.defaultMinZoom] to get the default property value.
     *
     * @return minzoom
     */
    get() = getPropertyValue("minzoom")

  /**
   * The minimum zoom level for the layer. At zoom levels less than the minzoom, the layer will be hidden.
   *
   * Range:
   *       minimum: 0
   *       maximum: 24
   *
   * Use static method [RasterLayer.defaultMinZoom] to get the default property value.
   *
   * @param minZoom value of minzoom
   */
  override fun minZoom(minZoom: Double): RasterLayer = apply {
    val param = PropertyValue("minzoom", minZoom)
    setProperty(param)
  }

  /**
   * The maximum zoom level for the layer. At zoom levels equal to or greater than the maxzoom, the layer will be hidden.
   *
   * Range:
   *       minimum: 0
   *       maximum: 24
   */
  override val maxZoom: Double?
    /**
     * Get the maxzoom property
     *
     * Use static method [RasterLayer.defaultMaxZoom] to get the default property value.
     *
     * @return maxzoom
     */
    get() = getPropertyValue("maxzoom")

  /**
   * The maximum zoom level for the layer. At zoom levels equal to or greater than the maxzoom, the layer will be hidden.
   *
   * Range:
   *       minimum: 0
   *       maximum: 24
   *
   * Use static method [RasterLayer.defaultMaxZoom] to get the default property value.
   *
   * @param maxZoom value of maxzoom
   */
  override fun maxZoom(maxZoom: Double): RasterLayer = apply {
    val param = PropertyValue("maxzoom", maxZoom)
    setProperty(param)
  }

  // Property getters and setters

  /**
   * Displayed band of raster array source layer. Defaults to the first band if not set.
   */
  @MapboxExperimental
  val rasterArrayBand: String?
    /**
     * Displayed band of raster array source layer. Defaults to the first band if not set.
     *
     * Use static method [RasterLayer.defaultRasterArrayBand] to get the default property.
     *
     * @return String
     */
    get() {
      return getPropertyValue("raster-array-band")
    }

  /**
   * Displayed band of raster array source layer. Defaults to the first band if not set.
   *
   * Use static method [RasterLayer.defaultRasterArrayBand] to set the default property.
   *
   * @param rasterArrayBand value of rasterArrayBand
   */
  @MapboxExperimental
  override fun rasterArrayBand(rasterArrayBand: String): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-array-band", rasterArrayBand)
    setProperty(propertyValue)
  }

  /**
   * Displayed band of raster array source layer. Defaults to the first band if not set.
   *
   * This is an Expression representation of "raster-array-band".
   *
   */
  @MapboxExperimental
  val rasterArrayBandAsExpression: Expression?
    /**
     * Displayed band of raster array source layer. Defaults to the first band if not set.
     *
     * Get the RasterArrayBand property as an Expression
     *
     * Use static method [RasterLayer.defaultRasterArrayBandAsExpression] to get the default property.
     */
    get() =
      getPropertyValueAsExpressionOrLiteralExpression("raster-array-band")

  /**
   * Displayed band of raster array source layer. Defaults to the first band if not set.
   *
   * Use static method [RasterLayer.defaultRasterArrayBandAsExpression] to set the default property.
   *
   * @param rasterArrayBand value of rasterArrayBand as Expression
   */
  @MapboxExperimental
  override fun rasterArrayBand(rasterArrayBand: Expression): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-array-band", rasterArrayBand)
    setProperty(propertyValue)
  }

  /**
   * Increase or reduce the brightness of the image. The value is the maximum brightness. Default value: 1. Value range: [0, 1]
   */
  val rasterBrightnessMax: Double?
    /**
     * Increase or reduce the brightness of the image. The value is the maximum brightness. Default value: 1. Value range: [0, 1]
     *
     * Use static method [RasterLayer.defaultRasterBrightnessMax] to get the default property.
     *
     * @return Double
     */
    get() {
      return getPropertyValue("raster-brightness-max")
    }

  /**
   * Increase or reduce the brightness of the image. The value is the maximum brightness. Default value: 1. Value range: [0, 1]
   *
   * Use static method [RasterLayer.defaultRasterBrightnessMax] to set the default property.
   *
   * @param rasterBrightnessMax value of rasterBrightnessMax
   */
  override fun rasterBrightnessMax(rasterBrightnessMax: Double): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-brightness-max", rasterBrightnessMax)
    setProperty(propertyValue)
  }

  /**
   * Increase or reduce the brightness of the image. The value is the maximum brightness. Default value: 1. Value range: [0, 1]
   *
   * This is an Expression representation of "raster-brightness-max".
   *
   */
  val rasterBrightnessMaxAsExpression: Expression?
    /**
     * Increase or reduce the brightness of the image. The value is the maximum brightness. Default value: 1. Value range: [0, 1]
     *
     * Get the RasterBrightnessMax property as an Expression
     *
     * Use static method [RasterLayer.defaultRasterBrightnessMaxAsExpression] to get the default property.
     */
    get() =
      getPropertyValueAsExpressionOrLiteralExpression("raster-brightness-max")

  /**
   * Increase or reduce the brightness of the image. The value is the maximum brightness. Default value: 1. Value range: [0, 1]
   *
   * Use static method [RasterLayer.defaultRasterBrightnessMaxAsExpression] to set the default property.
   *
   * @param rasterBrightnessMax value of rasterBrightnessMax as Expression
   */
  override fun rasterBrightnessMax(rasterBrightnessMax: Expression): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-brightness-max", rasterBrightnessMax)
    setProperty(propertyValue)
  }

  /**
   * Transition options for RasterBrightnessMax.
   */
  val rasterBrightnessMaxTransition: StyleTransition?
    /**
     * Get the RasterBrightnessMax property transition options
     *
     * Use static method [RasterLayer.defaultRasterBrightnessMaxTransition] to get the default property.
     *
     * @return transition options for Double
     */
    get() {
      return getPropertyValue("raster-brightness-max-transition")
    }

  /**
   * Set the RasterBrightnessMax property transition options
   *
   * Use static method [RasterLayer.defaultRasterBrightnessMaxTransition] to set the default property.
   *
   * @param options transition options for Double
   */
  override fun rasterBrightnessMaxTransition(options: StyleTransition): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-brightness-max-transition", options)
    setProperty(propertyValue)
  }

  /**
   * DSL for [rasterBrightnessMaxTransition].
   */
  override fun rasterBrightnessMaxTransition(block: StyleTransition.Builder.() -> Unit): RasterLayer = apply {
    rasterBrightnessMaxTransition(StyleTransition.Builder().apply(block).build())
  }

  /**
   * Increase or reduce the brightness of the image. The value is the minimum brightness. Default value: 0. Value range: [0, 1]
   */
  val rasterBrightnessMin: Double?
    /**
     * Increase or reduce the brightness of the image. The value is the minimum brightness. Default value: 0. Value range: [0, 1]
     *
     * Use static method [RasterLayer.defaultRasterBrightnessMin] to get the default property.
     *
     * @return Double
     */
    get() {
      return getPropertyValue("raster-brightness-min")
    }

  /**
   * Increase or reduce the brightness of the image. The value is the minimum brightness. Default value: 0. Value range: [0, 1]
   *
   * Use static method [RasterLayer.defaultRasterBrightnessMin] to set the default property.
   *
   * @param rasterBrightnessMin value of rasterBrightnessMin
   */
  override fun rasterBrightnessMin(rasterBrightnessMin: Double): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-brightness-min", rasterBrightnessMin)
    setProperty(propertyValue)
  }

  /**
   * Increase or reduce the brightness of the image. The value is the minimum brightness. Default value: 0. Value range: [0, 1]
   *
   * This is an Expression representation of "raster-brightness-min".
   *
   */
  val rasterBrightnessMinAsExpression: Expression?
    /**
     * Increase or reduce the brightness of the image. The value is the minimum brightness. Default value: 0. Value range: [0, 1]
     *
     * Get the RasterBrightnessMin property as an Expression
     *
     * Use static method [RasterLayer.defaultRasterBrightnessMinAsExpression] to get the default property.
     */
    get() =
      getPropertyValueAsExpressionOrLiteralExpression("raster-brightness-min")

  /**
   * Increase or reduce the brightness of the image. The value is the minimum brightness. Default value: 0. Value range: [0, 1]
   *
   * Use static method [RasterLayer.defaultRasterBrightnessMinAsExpression] to set the default property.
   *
   * @param rasterBrightnessMin value of rasterBrightnessMin as Expression
   */
  override fun rasterBrightnessMin(rasterBrightnessMin: Expression): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-brightness-min", rasterBrightnessMin)
    setProperty(propertyValue)
  }

  /**
   * Transition options for RasterBrightnessMin.
   */
  val rasterBrightnessMinTransition: StyleTransition?
    /**
     * Get the RasterBrightnessMin property transition options
     *
     * Use static method [RasterLayer.defaultRasterBrightnessMinTransition] to get the default property.
     *
     * @return transition options for Double
     */
    get() {
      return getPropertyValue("raster-brightness-min-transition")
    }

  /**
   * Set the RasterBrightnessMin property transition options
   *
   * Use static method [RasterLayer.defaultRasterBrightnessMinTransition] to set the default property.
   *
   * @param options transition options for Double
   */
  override fun rasterBrightnessMinTransition(options: StyleTransition): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-brightness-min-transition", options)
    setProperty(propertyValue)
  }

  /**
   * DSL for [rasterBrightnessMinTransition].
   */
  override fun rasterBrightnessMinTransition(block: StyleTransition.Builder.() -> Unit): RasterLayer = apply {
    rasterBrightnessMinTransition(StyleTransition.Builder().apply(block).build())
  }

  /**
   * Defines a color map by which to colorize a raster layer, parameterized by the `["raster-value"]` expression and evaluated at 256 uniformly spaced steps over the range specified by `raster-color-range`.
   */
  val rasterColor: Expression?
    /**
     * Defines a color map by which to colorize a raster layer, parameterized by the `["raster-value"]` expression and evaluated at 256 uniformly spaced steps over the range specified by `raster-color-range`.
     *
     * Use static method [RasterLayer.defaultRasterColor] to get the default property.
     *
     * @return Expression
     */
    get() {
      return getPropertyValue("raster-color")
    }

  /**
   * Defines a color map by which to colorize a raster layer, parameterized by the `["raster-value"]` expression and evaluated at 256 uniformly spaced steps over the range specified by `raster-color-range`.
   *
   * Use static method [RasterLayer.defaultRasterColor] to set the default property.
   *
   * @param rasterColor value of rasterColor
   */
  override fun rasterColor(rasterColor: Expression): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-color", rasterColor)
    setProperty(propertyValue)
  }

  /**
   * Сolor theme override for [rasterColor].
   */
  @MapboxExperimental
  val rasterColorUseTheme: String?
    /**
     * Get the RasterColorUseTheme property
     *
     * Use static method [RasterLayer.defaultRasterColorUseTheme] to get the default property.
     *
     * @return current RasterColorUseTheme property as Expression
     */
    get() {
      return getPropertyValue("raster-color-use-theme")
    }

  /**
   * Set the RasterColorUseTheme as String
   *
   * Use static method [RasterLayer.defaultRasterColorUseTheme] to get the default property.
   *
   * @param rasterColorUseTheme theme value for color. Overrides applying of color theme if "none" string value is set. To follow default theme "default" sting value should be set.
   */
  @MapboxExperimental
  override fun rasterColorUseTheme(rasterColorUseTheme: String): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-color-use-theme", rasterColorUseTheme)
    setProperty(propertyValue)
  }

  /**
   * Сolor theme override for [rasterColor].
   */
  @MapboxExperimental
  val rasterColorUseThemeAsExpression: Expression?
    /**
     * Get the RasterColorUseTheme property
     *
     * Use static method [RasterLayer.defaultRasterColorUseTheme] to get the default property.
     *
     * @return current RasterColorUseTheme property as Expression
     */
    get() = getPropertyValueAsExpressionOrLiteralExpression("raster-color-use-theme")

  /**
   * Set the RasterColorUseTheme as Expression
   *
   * Use static method [RasterLayer.defaultRasterColorUseTheme] to get the default property.
   *
   * @param rasterColorUseTheme theme value for color. Overrides applying of color theme if "none" string value is set. To follow default theme "default" sting value should be set.
   */
  @MapboxExperimental
  override fun rasterColorUseTheme(rasterColorUseTheme: Expression): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-color-use-theme", rasterColorUseTheme)
    setProperty(propertyValue)
  }

  /**
   * When `raster-color` is active, specifies the combination of source RGB channels used to compute the raster value. Computed using the equation `mix.r - src.r + mix.g - src.g + mix.b - src.b + mix.a`. The first three components specify the mix of source red, green, and blue channels, respectively. The fourth component serves as a constant offset and is -not- multipled by source alpha. Source alpha is instead carried through and applied as opacity to the colorized result. Default value corresponds to RGB luminosity. Default value: [0.2126,0.7152,0.0722,0].
   */
  val rasterColorMix: List<Double>?
    /**
     * When `raster-color` is active, specifies the combination of source RGB channels used to compute the raster value. Computed using the equation `mix.r - src.r + mix.g - src.g + mix.b - src.b + mix.a`. The first three components specify the mix of source red, green, and blue channels, respectively. The fourth component serves as a constant offset and is -not- multipled by source alpha. Source alpha is instead carried through and applied as opacity to the colorized result. Default value corresponds to RGB luminosity. Default value: [0.2126,0.7152,0.0722,0].
     *
     * Use static method [RasterLayer.defaultRasterColorMix] to get the default property.
     *
     * @return List<Double>
     */
    get() {
      return getPropertyValue("raster-color-mix")
    }

  /**
   * When `raster-color` is active, specifies the combination of source RGB channels used to compute the raster value. Computed using the equation `mix.r - src.r + mix.g - src.g + mix.b - src.b + mix.a`. The first three components specify the mix of source red, green, and blue channels, respectively. The fourth component serves as a constant offset and is -not- multipled by source alpha. Source alpha is instead carried through and applied as opacity to the colorized result. Default value corresponds to RGB luminosity. Default value: [0.2126,0.7152,0.0722,0].
   *
   * Use static method [RasterLayer.defaultRasterColorMix] to set the default property.
   *
   * @param rasterColorMix value of rasterColorMix
   */
  override fun rasterColorMix(rasterColorMix: List<Double>): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-color-mix", rasterColorMix)
    setProperty(propertyValue)
  }

  /**
   * When `raster-color` is active, specifies the combination of source RGB channels used to compute the raster value. Computed using the equation `mix.r - src.r + mix.g - src.g + mix.b - src.b + mix.a`. The first three components specify the mix of source red, green, and blue channels, respectively. The fourth component serves as a constant offset and is -not- multipled by source alpha. Source alpha is instead carried through and applied as opacity to the colorized result. Default value corresponds to RGB luminosity. Default value: [0.2126,0.7152,0.0722,0].
   *
   * This is an Expression representation of "raster-color-mix".
   *
   */
  val rasterColorMixAsExpression: Expression?
    /**
     * When `raster-color` is active, specifies the combination of source RGB channels used to compute the raster value. Computed using the equation `mix.r - src.r + mix.g - src.g + mix.b - src.b + mix.a`. The first three components specify the mix of source red, green, and blue channels, respectively. The fourth component serves as a constant offset and is -not- multipled by source alpha. Source alpha is instead carried through and applied as opacity to the colorized result. Default value corresponds to RGB luminosity. Default value: [0.2126,0.7152,0.0722,0].
     *
     * Get the RasterColorMix property as an Expression
     *
     * Use static method [RasterLayer.defaultRasterColorMixAsExpression] to get the default property.
     */
    get() =
      getPropertyValueAsExpressionOrLiteralExpression("raster-color-mix")

  /**
   * When `raster-color` is active, specifies the combination of source RGB channels used to compute the raster value. Computed using the equation `mix.r - src.r + mix.g - src.g + mix.b - src.b + mix.a`. The first three components specify the mix of source red, green, and blue channels, respectively. The fourth component serves as a constant offset and is -not- multipled by source alpha. Source alpha is instead carried through and applied as opacity to the colorized result. Default value corresponds to RGB luminosity. Default value: [0.2126,0.7152,0.0722,0].
   *
   * Use static method [RasterLayer.defaultRasterColorMixAsExpression] to set the default property.
   *
   * @param rasterColorMix value of rasterColorMix as Expression
   */
  override fun rasterColorMix(rasterColorMix: Expression): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-color-mix", rasterColorMix)
    setProperty(propertyValue)
  }

  /**
   * Transition options for RasterColorMix.
   */
  val rasterColorMixTransition: StyleTransition?
    /**
     * Get the RasterColorMix property transition options
     *
     * Use static method [RasterLayer.defaultRasterColorMixTransition] to get the default property.
     *
     * @return transition options for List<Double>
     */
    get() {
      return getPropertyValue("raster-color-mix-transition")
    }

  /**
   * Set the RasterColorMix property transition options
   *
   * Use static method [RasterLayer.defaultRasterColorMixTransition] to set the default property.
   *
   * @param options transition options for List<Double>
   */
  override fun rasterColorMixTransition(options: StyleTransition): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-color-mix-transition", options)
    setProperty(propertyValue)
  }

  /**
   * DSL for [rasterColorMixTransition].
   */
  override fun rasterColorMixTransition(block: StyleTransition.Builder.() -> Unit): RasterLayer = apply {
    rasterColorMixTransition(StyleTransition.Builder().apply(block).build())
  }

  /**
   * When `raster-color` is active, specifies the range over which `raster-color` is tabulated. Units correspond to the computed raster value via `raster-color-mix`. For `rasterarray` sources, if `raster-color-range` is unspecified, the source's stated data range is used.
   */
  val rasterColorRange: List<Double>?
    /**
     * When `raster-color` is active, specifies the range over which `raster-color` is tabulated. Units correspond to the computed raster value via `raster-color-mix`. For `rasterarray` sources, if `raster-color-range` is unspecified, the source's stated data range is used.
     *
     * Use static method [RasterLayer.defaultRasterColorRange] to get the default property.
     *
     * @return List<Double>
     */
    get() {
      return getPropertyValue("raster-color-range")
    }

  /**
   * When `raster-color` is active, specifies the range over which `raster-color` is tabulated. Units correspond to the computed raster value via `raster-color-mix`. For `rasterarray` sources, if `raster-color-range` is unspecified, the source's stated data range is used.
   *
   * Use static method [RasterLayer.defaultRasterColorRange] to set the default property.
   *
   * @param rasterColorRange value of rasterColorRange
   */
  override fun rasterColorRange(rasterColorRange: List<Double>): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-color-range", rasterColorRange)
    setProperty(propertyValue)
  }

  /**
   * When `raster-color` is active, specifies the range over which `raster-color` is tabulated. Units correspond to the computed raster value via `raster-color-mix`. For `rasterarray` sources, if `raster-color-range` is unspecified, the source's stated data range is used.
   *
   * This is an Expression representation of "raster-color-range".
   *
   */
  val rasterColorRangeAsExpression: Expression?
    /**
     * When `raster-color` is active, specifies the range over which `raster-color` is tabulated. Units correspond to the computed raster value via `raster-color-mix`. For `rasterarray` sources, if `raster-color-range` is unspecified, the source's stated data range is used.
     *
     * Get the RasterColorRange property as an Expression
     *
     * Use static method [RasterLayer.defaultRasterColorRangeAsExpression] to get the default property.
     */
    get() =
      getPropertyValueAsExpressionOrLiteralExpression("raster-color-range")

  /**
   * When `raster-color` is active, specifies the range over which `raster-color` is tabulated. Units correspond to the computed raster value via `raster-color-mix`. For `rasterarray` sources, if `raster-color-range` is unspecified, the source's stated data range is used.
   *
   * Use static method [RasterLayer.defaultRasterColorRangeAsExpression] to set the default property.
   *
   * @param rasterColorRange value of rasterColorRange as Expression
   */
  override fun rasterColorRange(rasterColorRange: Expression): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-color-range", rasterColorRange)
    setProperty(propertyValue)
  }

  /**
   * Transition options for RasterColorRange.
   */
  val rasterColorRangeTransition: StyleTransition?
    /**
     * Get the RasterColorRange property transition options
     *
     * Use static method [RasterLayer.defaultRasterColorRangeTransition] to get the default property.
     *
     * @return transition options for List<Double>
     */
    get() {
      return getPropertyValue("raster-color-range-transition")
    }

  /**
   * Set the RasterColorRange property transition options
   *
   * Use static method [RasterLayer.defaultRasterColorRangeTransition] to set the default property.
   *
   * @param options transition options for List<Double>
   */
  override fun rasterColorRangeTransition(options: StyleTransition): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-color-range-transition", options)
    setProperty(propertyValue)
  }

  /**
   * DSL for [rasterColorRangeTransition].
   */
  override fun rasterColorRangeTransition(block: StyleTransition.Builder.() -> Unit): RasterLayer = apply {
    rasterColorRangeTransition(StyleTransition.Builder().apply(block).build())
  }

  /**
   * Increase or reduce the contrast of the image. Default value: 0. Value range: [-1, 1]
   */
  val rasterContrast: Double?
    /**
     * Increase or reduce the contrast of the image. Default value: 0. Value range: [-1, 1]
     *
     * Use static method [RasterLayer.defaultRasterContrast] to get the default property.
     *
     * @return Double
     */
    get() {
      return getPropertyValue("raster-contrast")
    }

  /**
   * Increase or reduce the contrast of the image. Default value: 0. Value range: [-1, 1]
   *
   * Use static method [RasterLayer.defaultRasterContrast] to set the default property.
   *
   * @param rasterContrast value of rasterContrast
   */
  override fun rasterContrast(rasterContrast: Double): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-contrast", rasterContrast)
    setProperty(propertyValue)
  }

  /**
   * Increase or reduce the contrast of the image. Default value: 0. Value range: [-1, 1]
   *
   * This is an Expression representation of "raster-contrast".
   *
   */
  val rasterContrastAsExpression: Expression?
    /**
     * Increase or reduce the contrast of the image. Default value: 0. Value range: [-1, 1]
     *
     * Get the RasterContrast property as an Expression
     *
     * Use static method [RasterLayer.defaultRasterContrastAsExpression] to get the default property.
     */
    get() =
      getPropertyValueAsExpressionOrLiteralExpression("raster-contrast")

  /**
   * Increase or reduce the contrast of the image. Default value: 0. Value range: [-1, 1]
   *
   * Use static method [RasterLayer.defaultRasterContrastAsExpression] to set the default property.
   *
   * @param rasterContrast value of rasterContrast as Expression
   */
  override fun rasterContrast(rasterContrast: Expression): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-contrast", rasterContrast)
    setProperty(propertyValue)
  }

  /**
   * Transition options for RasterContrast.
   */
  val rasterContrastTransition: StyleTransition?
    /**
     * Get the RasterContrast property transition options
     *
     * Use static method [RasterLayer.defaultRasterContrastTransition] to get the default property.
     *
     * @return transition options for Double
     */
    get() {
      return getPropertyValue("raster-contrast-transition")
    }

  /**
   * Set the RasterContrast property transition options
   *
   * Use static method [RasterLayer.defaultRasterContrastTransition] to set the default property.
   *
   * @param options transition options for Double
   */
  override fun rasterContrastTransition(options: StyleTransition): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-contrast-transition", options)
    setProperty(propertyValue)
  }

  /**
   * DSL for [rasterContrastTransition].
   */
  override fun rasterContrastTransition(block: StyleTransition.Builder.() -> Unit): RasterLayer = apply {
    rasterContrastTransition(StyleTransition.Builder().apply(block).build())
  }

  /**
   * Specifies an uniform elevation from the ground, in meters. Default value: 0. Minimum value: 0.
   */
  @MapboxExperimental
  val rasterElevation: Double?
    /**
     * Specifies an uniform elevation from the ground, in meters. Default value: 0. Minimum value: 0.
     *
     * Use static method [RasterLayer.defaultRasterElevation] to get the default property.
     *
     * @return Double
     */
    get() {
      return getPropertyValue("raster-elevation")
    }

  /**
   * Specifies an uniform elevation from the ground, in meters. Default value: 0. Minimum value: 0.
   *
   * Use static method [RasterLayer.defaultRasterElevation] to set the default property.
   *
   * @param rasterElevation value of rasterElevation
   */
  @MapboxExperimental
  override fun rasterElevation(rasterElevation: Double): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-elevation", rasterElevation)
    setProperty(propertyValue)
  }

  /**
   * Specifies an uniform elevation from the ground, in meters. Default value: 0. Minimum value: 0.
   *
   * This is an Expression representation of "raster-elevation".
   *
   */
  @MapboxExperimental
  val rasterElevationAsExpression: Expression?
    /**
     * Specifies an uniform elevation from the ground, in meters. Default value: 0. Minimum value: 0.
     *
     * Get the RasterElevation property as an Expression
     *
     * Use static method [RasterLayer.defaultRasterElevationAsExpression] to get the default property.
     */
    get() =
      getPropertyValueAsExpressionOrLiteralExpression("raster-elevation")

  /**
   * Specifies an uniform elevation from the ground, in meters. Default value: 0. Minimum value: 0.
   *
   * Use static method [RasterLayer.defaultRasterElevationAsExpression] to set the default property.
   *
   * @param rasterElevation value of rasterElevation as Expression
   */
  @MapboxExperimental
  override fun rasterElevation(rasterElevation: Expression): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-elevation", rasterElevation)
    setProperty(propertyValue)
  }

  /**
   * Transition options for RasterElevation.
   */
  @MapboxExperimental
  val rasterElevationTransition: StyleTransition?
    /**
     * Get the RasterElevation property transition options
     *
     * Use static method [RasterLayer.defaultRasterElevationTransition] to get the default property.
     *
     * @return transition options for Double
     */
    get() {
      return getPropertyValue("raster-elevation-transition")
    }

  /**
   * Set the RasterElevation property transition options
   *
   * Use static method [RasterLayer.defaultRasterElevationTransition] to set the default property.
   *
   * @param options transition options for Double
   */
  @MapboxExperimental
  override fun rasterElevationTransition(options: StyleTransition): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-elevation-transition", options)
    setProperty(propertyValue)
  }

  /**
   * DSL for [rasterElevationTransition].
   */
  @MapboxExperimental
  override fun rasterElevationTransition(block: StyleTransition.Builder.() -> Unit): RasterLayer = apply {
    rasterElevationTransition(StyleTransition.Builder().apply(block).build())
  }

  /**
   * Controls the intensity of light emitted on the source features. Default value: 0. Minimum value: 0. The unit of rasterEmissiveStrength is in intensity.
   */
  val rasterEmissiveStrength: Double?
    /**
     * Controls the intensity of light emitted on the source features. Default value: 0. Minimum value: 0. The unit of rasterEmissiveStrength is in intensity.
     *
     * Use static method [RasterLayer.defaultRasterEmissiveStrength] to get the default property.
     *
     * @return Double
     */
    get() {
      return getPropertyValue("raster-emissive-strength")
    }

  /**
   * Controls the intensity of light emitted on the source features. Default value: 0. Minimum value: 0. The unit of rasterEmissiveStrength is in intensity.
   *
   * Use static method [RasterLayer.defaultRasterEmissiveStrength] to set the default property.
   *
   * @param rasterEmissiveStrength value of rasterEmissiveStrength
   */
  override fun rasterEmissiveStrength(rasterEmissiveStrength: Double): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-emissive-strength", rasterEmissiveStrength)
    setProperty(propertyValue)
  }

  /**
   * Controls the intensity of light emitted on the source features. Default value: 0. Minimum value: 0. The unit of rasterEmissiveStrength is in intensity.
   *
   * This is an Expression representation of "raster-emissive-strength".
   *
   */
  val rasterEmissiveStrengthAsExpression: Expression?
    /**
     * Controls the intensity of light emitted on the source features. Default value: 0. Minimum value: 0. The unit of rasterEmissiveStrength is in intensity.
     *
     * Get the RasterEmissiveStrength property as an Expression
     *
     * Use static method [RasterLayer.defaultRasterEmissiveStrengthAsExpression] to get the default property.
     */
    get() =
      getPropertyValueAsExpressionOrLiteralExpression("raster-emissive-strength")

  /**
   * Controls the intensity of light emitted on the source features. Default value: 0. Minimum value: 0. The unit of rasterEmissiveStrength is in intensity.
   *
   * Use static method [RasterLayer.defaultRasterEmissiveStrengthAsExpression] to set the default property.
   *
   * @param rasterEmissiveStrength value of rasterEmissiveStrength as Expression
   */
  override fun rasterEmissiveStrength(rasterEmissiveStrength: Expression): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-emissive-strength", rasterEmissiveStrength)
    setProperty(propertyValue)
  }

  /**
   * Transition options for RasterEmissiveStrength.
   */
  val rasterEmissiveStrengthTransition: StyleTransition?
    /**
     * Get the RasterEmissiveStrength property transition options
     *
     * Use static method [RasterLayer.defaultRasterEmissiveStrengthTransition] to get the default property.
     *
     * @return transition options for Double
     */
    get() {
      return getPropertyValue("raster-emissive-strength-transition")
    }

  /**
   * Set the RasterEmissiveStrength property transition options
   *
   * Use static method [RasterLayer.defaultRasterEmissiveStrengthTransition] to set the default property.
   *
   * @param options transition options for Double
   */
  override fun rasterEmissiveStrengthTransition(options: StyleTransition): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-emissive-strength-transition", options)
    setProperty(propertyValue)
  }

  /**
   * DSL for [rasterEmissiveStrengthTransition].
   */
  override fun rasterEmissiveStrengthTransition(block: StyleTransition.Builder.() -> Unit): RasterLayer = apply {
    rasterEmissiveStrengthTransition(StyleTransition.Builder().apply(block).build())
  }

  /**
   * Fade duration when a new tile is added. Default value: 300. Minimum value: 0. The unit of rasterFadeDuration is in milliseconds.
   */
  val rasterFadeDuration: Double?
    /**
     * Fade duration when a new tile is added. Default value: 300. Minimum value: 0. The unit of rasterFadeDuration is in milliseconds.
     *
     * Use static method [RasterLayer.defaultRasterFadeDuration] to get the default property.
     *
     * @return Double
     */
    get() {
      return getPropertyValue("raster-fade-duration")
    }

  /**
   * Fade duration when a new tile is added. Default value: 300. Minimum value: 0. The unit of rasterFadeDuration is in milliseconds.
   *
   * Use static method [RasterLayer.defaultRasterFadeDuration] to set the default property.
   *
   * @param rasterFadeDuration value of rasterFadeDuration
   */
  override fun rasterFadeDuration(rasterFadeDuration: Double): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-fade-duration", rasterFadeDuration)
    setProperty(propertyValue)
  }

  /**
   * Fade duration when a new tile is added. Default value: 300. Minimum value: 0. The unit of rasterFadeDuration is in milliseconds.
   *
   * This is an Expression representation of "raster-fade-duration".
   *
   */
  val rasterFadeDurationAsExpression: Expression?
    /**
     * Fade duration when a new tile is added. Default value: 300. Minimum value: 0. The unit of rasterFadeDuration is in milliseconds.
     *
     * Get the RasterFadeDuration property as an Expression
     *
     * Use static method [RasterLayer.defaultRasterFadeDurationAsExpression] to get the default property.
     */
    get() =
      getPropertyValueAsExpressionOrLiteralExpression("raster-fade-duration")

  /**
   * Fade duration when a new tile is added. Default value: 300. Minimum value: 0. The unit of rasterFadeDuration is in milliseconds.
   *
   * Use static method [RasterLayer.defaultRasterFadeDurationAsExpression] to set the default property.
   *
   * @param rasterFadeDuration value of rasterFadeDuration as Expression
   */
  override fun rasterFadeDuration(rasterFadeDuration: Expression): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-fade-duration", rasterFadeDuration)
    setProperty(propertyValue)
  }

  /**
   * Rotates hues around the color wheel. Default value: 0. The unit of rasterHueRotate is in degrees.
   */
  val rasterHueRotate: Double?
    /**
     * Rotates hues around the color wheel. Default value: 0. The unit of rasterHueRotate is in degrees.
     *
     * Use static method [RasterLayer.defaultRasterHueRotate] to get the default property.
     *
     * @return Double
     */
    get() {
      return getPropertyValue("raster-hue-rotate")
    }

  /**
   * Rotates hues around the color wheel. Default value: 0. The unit of rasterHueRotate is in degrees.
   *
   * Use static method [RasterLayer.defaultRasterHueRotate] to set the default property.
   *
   * @param rasterHueRotate value of rasterHueRotate
   */
  override fun rasterHueRotate(rasterHueRotate: Double): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-hue-rotate", rasterHueRotate)
    setProperty(propertyValue)
  }

  /**
   * Rotates hues around the color wheel. Default value: 0. The unit of rasterHueRotate is in degrees.
   *
   * This is an Expression representation of "raster-hue-rotate".
   *
   */
  val rasterHueRotateAsExpression: Expression?
    /**
     * Rotates hues around the color wheel. Default value: 0. The unit of rasterHueRotate is in degrees.
     *
     * Get the RasterHueRotate property as an Expression
     *
     * Use static method [RasterLayer.defaultRasterHueRotateAsExpression] to get the default property.
     */
    get() =
      getPropertyValueAsExpressionOrLiteralExpression("raster-hue-rotate")

  /**
   * Rotates hues around the color wheel. Default value: 0. The unit of rasterHueRotate is in degrees.
   *
   * Use static method [RasterLayer.defaultRasterHueRotateAsExpression] to set the default property.
   *
   * @param rasterHueRotate value of rasterHueRotate as Expression
   */
  override fun rasterHueRotate(rasterHueRotate: Expression): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-hue-rotate", rasterHueRotate)
    setProperty(propertyValue)
  }

  /**
   * Transition options for RasterHueRotate.
   */
  val rasterHueRotateTransition: StyleTransition?
    /**
     * Get the RasterHueRotate property transition options
     *
     * Use static method [RasterLayer.defaultRasterHueRotateTransition] to get the default property.
     *
     * @return transition options for Double
     */
    get() {
      return getPropertyValue("raster-hue-rotate-transition")
    }

  /**
   * Set the RasterHueRotate property transition options
   *
   * Use static method [RasterLayer.defaultRasterHueRotateTransition] to set the default property.
   *
   * @param options transition options for Double
   */
  override fun rasterHueRotateTransition(options: StyleTransition): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-hue-rotate-transition", options)
    setProperty(propertyValue)
  }

  /**
   * DSL for [rasterHueRotateTransition].
   */
  override fun rasterHueRotateTransition(block: StyleTransition.Builder.() -> Unit): RasterLayer = apply {
    rasterHueRotateTransition(StyleTransition.Builder().apply(block).build())
  }

  /**
   * The opacity at which the image will be drawn. Default value: 1. Value range: [0, 1]
   */
  val rasterOpacity: Double?
    /**
     * The opacity at which the image will be drawn. Default value: 1. Value range: [0, 1]
     *
     * Use static method [RasterLayer.defaultRasterOpacity] to get the default property.
     *
     * @return Double
     */
    get() {
      return getPropertyValue("raster-opacity")
    }

  /**
   * The opacity at which the image will be drawn. Default value: 1. Value range: [0, 1]
   *
   * Use static method [RasterLayer.defaultRasterOpacity] to set the default property.
   *
   * @param rasterOpacity value of rasterOpacity
   */
  override fun rasterOpacity(rasterOpacity: Double): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-opacity", rasterOpacity)
    setProperty(propertyValue)
  }

  /**
   * The opacity at which the image will be drawn. Default value: 1. Value range: [0, 1]
   *
   * This is an Expression representation of "raster-opacity".
   *
   */
  val rasterOpacityAsExpression: Expression?
    /**
     * The opacity at which the image will be drawn. Default value: 1. Value range: [0, 1]
     *
     * Get the RasterOpacity property as an Expression
     *
     * Use static method [RasterLayer.defaultRasterOpacityAsExpression] to get the default property.
     */
    get() =
      getPropertyValueAsExpressionOrLiteralExpression("raster-opacity")

  /**
   * The opacity at which the image will be drawn. Default value: 1. Value range: [0, 1]
   *
   * Use static method [RasterLayer.defaultRasterOpacityAsExpression] to set the default property.
   *
   * @param rasterOpacity value of rasterOpacity as Expression
   */
  override fun rasterOpacity(rasterOpacity: Expression): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-opacity", rasterOpacity)
    setProperty(propertyValue)
  }

  /**
   * Transition options for RasterOpacity.
   */
  val rasterOpacityTransition: StyleTransition?
    /**
     * Get the RasterOpacity property transition options
     *
     * Use static method [RasterLayer.defaultRasterOpacityTransition] to get the default property.
     *
     * @return transition options for Double
     */
    get() {
      return getPropertyValue("raster-opacity-transition")
    }

  /**
   * Set the RasterOpacity property transition options
   *
   * Use static method [RasterLayer.defaultRasterOpacityTransition] to set the default property.
   *
   * @param options transition options for Double
   */
  override fun rasterOpacityTransition(options: StyleTransition): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-opacity-transition", options)
    setProperty(propertyValue)
  }

  /**
   * DSL for [rasterOpacityTransition].
   */
  override fun rasterOpacityTransition(block: StyleTransition.Builder.() -> Unit): RasterLayer = apply {
    rasterOpacityTransition(StyleTransition.Builder().apply(block).build())
  }

  /**
   * The resampling/interpolation method to use for overscaling, also known as texture magnification filter Default value: "linear".
   */
  val rasterResampling: RasterResampling?
    /**
     * The resampling/interpolation method to use for overscaling, also known as texture magnification filter Default value: "linear".
     *
     * Use static method [RasterLayer.defaultRasterResampling] to get the default property.
     *
     * @return RasterResampling
     */
    get() {
      getPropertyValue<String?>("raster-resampling")?.let {
        return RasterResampling.valueOf(it.uppercase(Locale.US).replace('-', '_'))
      }
      return null
    }

  /**
   * The resampling/interpolation method to use for overscaling, also known as texture magnification filter Default value: "linear".
   *
   * Use static method [RasterLayer.defaultRasterResampling] to set the default property.
   *
   * @param rasterResampling value of rasterResampling
   */
  override fun rasterResampling(rasterResampling: RasterResampling): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-resampling", rasterResampling)
    setProperty(propertyValue)
  }

  /**
   * The resampling/interpolation method to use for overscaling, also known as texture magnification filter Default value: "linear".
   *
   * This is an Expression representation of "raster-resampling".
   *
   */
  val rasterResamplingAsExpression: Expression?
    /**
     * The resampling/interpolation method to use for overscaling, also known as texture magnification filter Default value: "linear".
     *
     * Get the RasterResampling property as an Expression
     *
     * Use static method [RasterLayer.defaultRasterResamplingAsExpression] to get the default property.
     */
    get() =
      getPropertyValue("raster-resampling")
        ?: rasterResampling?.let {
          Expression.literal(it.value)
        }

  /**
   * The resampling/interpolation method to use for overscaling, also known as texture magnification filter Default value: "linear".
   *
   * Use static method [RasterLayer.defaultRasterResamplingAsExpression] to set the default property.
   *
   * @param rasterResampling value of rasterResampling as Expression
   */
  override fun rasterResampling(rasterResampling: Expression): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-resampling", rasterResampling)
    setProperty(propertyValue)
  }

  /**
   * Increase or reduce the saturation of the image. Default value: 0. Value range: [-1, 1]
   */
  val rasterSaturation: Double?
    /**
     * Increase or reduce the saturation of the image. Default value: 0. Value range: [-1, 1]
     *
     * Use static method [RasterLayer.defaultRasterSaturation] to get the default property.
     *
     * @return Double
     */
    get() {
      return getPropertyValue("raster-saturation")
    }

  /**
   * Increase or reduce the saturation of the image. Default value: 0. Value range: [-1, 1]
   *
   * Use static method [RasterLayer.defaultRasterSaturation] to set the default property.
   *
   * @param rasterSaturation value of rasterSaturation
   */
  override fun rasterSaturation(rasterSaturation: Double): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-saturation", rasterSaturation)
    setProperty(propertyValue)
  }

  /**
   * Increase or reduce the saturation of the image. Default value: 0. Value range: [-1, 1]
   *
   * This is an Expression representation of "raster-saturation".
   *
   */
  val rasterSaturationAsExpression: Expression?
    /**
     * Increase or reduce the saturation of the image. Default value: 0. Value range: [-1, 1]
     *
     * Get the RasterSaturation property as an Expression
     *
     * Use static method [RasterLayer.defaultRasterSaturationAsExpression] to get the default property.
     */
    get() =
      getPropertyValueAsExpressionOrLiteralExpression("raster-saturation")

  /**
   * Increase or reduce the saturation of the image. Default value: 0. Value range: [-1, 1]
   *
   * Use static method [RasterLayer.defaultRasterSaturationAsExpression] to set the default property.
   *
   * @param rasterSaturation value of rasterSaturation as Expression
   */
  override fun rasterSaturation(rasterSaturation: Expression): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-saturation", rasterSaturation)
    setProperty(propertyValue)
  }

  /**
   * Transition options for RasterSaturation.
   */
  val rasterSaturationTransition: StyleTransition?
    /**
     * Get the RasterSaturation property transition options
     *
     * Use static method [RasterLayer.defaultRasterSaturationTransition] to get the default property.
     *
     * @return transition options for Double
     */
    get() {
      return getPropertyValue("raster-saturation-transition")
    }

  /**
   * Set the RasterSaturation property transition options
   *
   * Use static method [RasterLayer.defaultRasterSaturationTransition] to set the default property.
   *
   * @param options transition options for Double
   */
  override fun rasterSaturationTransition(options: StyleTransition): RasterLayer = apply {
    val propertyValue = PropertyValue("raster-saturation-transition", options)
    setProperty(propertyValue)
  }

  /**
   * DSL for [rasterSaturationTransition].
   */
  override fun rasterSaturationTransition(block: StyleTransition.Builder.() -> Unit): RasterLayer = apply {
    rasterSaturationTransition(StyleTransition.Builder().apply(block).build())
  }

  /**
   * Get the type of this layer
   *
   * @return Type of the layer as [String]
   */
  override fun getType(): String {
    return "raster"
  }
  /**
   * Static variables and methods.
   */
  companion object {
    // Default values for layer properties
    /**
     * Visibility of the layer.
     */
    val defaultVisibility: Visibility?
      /**
       * Get the default Visibility property
       *
       * @return VISIBILITY
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("raster", "visibility").silentUnwrap<String>()?.let {
          return Visibility.valueOf(it.uppercase(Locale.US).replace('-', '_'))
        }
        return null
      }

    /**
     * The minimum zoom level for the layer. At zoom levels less than the minzoom, the layer will be hidden.
     *
     * Range:
     *       minimum: 0
     *       maximum: 24
     */
    val defaultMinZoom: Double?
      /**
       * Get the minzoom property
       *
       * @return minzoom
       */
      get() = StyleManager.getStyleLayerPropertyDefaultValue("raster", "minzoom").silentUnwrap()

    /**
     * The maximum zoom level for the layer. At zoom levels equal to or greater than the maxzoom, the layer will be hidden.
     *
     * Range:
     *       minimum: 0
     *       maximum: 24
     */
    val defaultMaxZoom: Double?
      /**
       * Get the maxzoom property
       *
       * @return maxzoom
       */
      get() = StyleManager.getStyleLayerPropertyDefaultValue("raster", "maxzoom").silentUnwrap()

    /**
     * Displayed band of raster array source layer. Defaults to the first band if not set.
     */
    @MapboxExperimental
    val defaultRasterArrayBand: String?
      /**
       * Displayed band of raster array source layer. Defaults to the first band if not set.
       *
       * Get the default value of RasterArrayBand property
       *
       * @return String
       */
      get() {
        return StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-array-band").silentUnwrap()
      }

    /**
     * Displayed band of raster array source layer. Defaults to the first band if not set.
     *
     * This is an Expression representation of "raster-array-band".
     *
     */
    @MapboxExperimental
    val defaultRasterArrayBandAsExpression: Expression?
      /**
       * Get default value of the RasterArrayBand property as an Expression
       *
       * @return String
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-array-band").silentUnwrap<Expression>()?.let {
          return it
        }
        defaultRasterArrayBand?.let {
          return Expression.literal(it)
        }
        return null
      }

    /**
     * Increase or reduce the brightness of the image. The value is the maximum brightness. Default value: 1. Value range: [0, 1]
     */
    val defaultRasterBrightnessMax: Double?
      /**
       * Increase or reduce the brightness of the image. The value is the maximum brightness. Default value: 1. Value range: [0, 1]
       *
       * Get the default value of RasterBrightnessMax property
       *
       * @return Double
       */
      get() {
        return StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-brightness-max").silentUnwrap()
      }

    /**
     * Increase or reduce the brightness of the image. The value is the maximum brightness. Default value: 1. Value range: [0, 1]
     *
     * This is an Expression representation of "raster-brightness-max".
     *
     */
    val defaultRasterBrightnessMaxAsExpression: Expression?
      /**
       * Get default value of the RasterBrightnessMax property as an Expression
       *
       * @return Double
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-brightness-max").silentUnwrap<Expression>()?.let {
          return it
        }
        defaultRasterBrightnessMax?.let {
          return Expression.literal(it)
        }
        return null
      }

    /**
     * Transition options for RasterBrightnessMax.
     */
    val defaultRasterBrightnessMaxTransition: StyleTransition?
      /**
       * Get the RasterBrightnessMax property transition options
       *
       * @return transition options for Double
       */
      get() = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-brightness-max-transition").silentUnwrap()

    /**
     * Increase or reduce the brightness of the image. The value is the minimum brightness. Default value: 0. Value range: [0, 1]
     */
    val defaultRasterBrightnessMin: Double?
      /**
       * Increase or reduce the brightness of the image. The value is the minimum brightness. Default value: 0. Value range: [0, 1]
       *
       * Get the default value of RasterBrightnessMin property
       *
       * @return Double
       */
      get() {
        return StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-brightness-min").silentUnwrap()
      }

    /**
     * Increase or reduce the brightness of the image. The value is the minimum brightness. Default value: 0. Value range: [0, 1]
     *
     * This is an Expression representation of "raster-brightness-min".
     *
     */
    val defaultRasterBrightnessMinAsExpression: Expression?
      /**
       * Get default value of the RasterBrightnessMin property as an Expression
       *
       * @return Double
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-brightness-min").silentUnwrap<Expression>()?.let {
          return it
        }
        defaultRasterBrightnessMin?.let {
          return Expression.literal(it)
        }
        return null
      }

    /**
     * Transition options for RasterBrightnessMin.
     */
    val defaultRasterBrightnessMinTransition: StyleTransition?
      /**
       * Get the RasterBrightnessMin property transition options
       *
       * @return transition options for Double
       */
      get() = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-brightness-min-transition").silentUnwrap()

    /**
     * Default color theme for [rasterColor].
     */
    @MapboxExperimental
    val defaultRasterColorUseTheme: String?
      /**
       * Get default value of the RasterColor property as String
       *
       * @return Expression
       */
      get() = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-use-theme").silentUnwrap()

    /**
     * Default color theme for [rasterColor].
     */
    @MapboxExperimental
    val defaultRasterColorUseThemeAsExpression: Expression?
      /**
       * Get default value of the RasterColor property as Expression
       *
       * @return Expression
       */
      get() {
        return StyleManager
          .getStyleLayerPropertyDefaultValue("raster", "raster-color-use-theme")
          .silentUnwrap<Expression>() ?: defaultRasterColorUseTheme?.let { Expression.literal(it) }
      }

    /**
     * When `raster-color` is active, specifies the combination of source RGB channels used to compute the raster value. Computed using the equation `mix.r - src.r + mix.g - src.g + mix.b - src.b + mix.a`. The first three components specify the mix of source red, green, and blue channels, respectively. The fourth component serves as a constant offset and is -not- multipled by source alpha. Source alpha is instead carried through and applied as opacity to the colorized result. Default value corresponds to RGB luminosity. Default value: [0.2126,0.7152,0.0722,0].
     */
    val defaultRasterColorMix: List<Double>?
      /**
       * When `raster-color` is active, specifies the combination of source RGB channels used to compute the raster value. Computed using the equation `mix.r - src.r + mix.g - src.g + mix.b - src.b + mix.a`. The first three components specify the mix of source red, green, and blue channels, respectively. The fourth component serves as a constant offset and is -not- multipled by source alpha. Source alpha is instead carried through and applied as opacity to the colorized result. Default value corresponds to RGB luminosity. Default value: [0.2126,0.7152,0.0722,0].
       *
       * Get the default value of RasterColorMix property
       *
       * @return List<Double>
       */
      get() {
        return StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-mix").silentUnwrap()
      }

    /**
     * When `raster-color` is active, specifies the combination of source RGB channels used to compute the raster value. Computed using the equation `mix.r - src.r + mix.g - src.g + mix.b - src.b + mix.a`. The first three components specify the mix of source red, green, and blue channels, respectively. The fourth component serves as a constant offset and is -not- multipled by source alpha. Source alpha is instead carried through and applied as opacity to the colorized result. Default value corresponds to RGB luminosity. Default value: [0.2126,0.7152,0.0722,0].
     *
     * This is an Expression representation of "raster-color-mix".
     *
     */
    val defaultRasterColorMixAsExpression: Expression?
      /**
       * Get default value of the RasterColorMix property as an Expression
       *
       * @return List<Double>
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-mix").silentUnwrap<Expression>()?.let {
          return it
        }
        defaultRasterColorMix?.let {
          return Expression.literal(it)
        }
        return null
      }

    /**
     * Transition options for RasterColorMix.
     */
    val defaultRasterColorMixTransition: StyleTransition?
      /**
       * Get the RasterColorMix property transition options
       *
       * @return transition options for List<Double>
       */
      get() = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-mix-transition").silentUnwrap()

    /**
     * When `raster-color` is active, specifies the range over which `raster-color` is tabulated. Units correspond to the computed raster value via `raster-color-mix`. For `rasterarray` sources, if `raster-color-range` is unspecified, the source's stated data range is used.
     */
    val defaultRasterColorRange: List<Double>?
      /**
       * When `raster-color` is active, specifies the range over which `raster-color` is tabulated. Units correspond to the computed raster value via `raster-color-mix`. For `rasterarray` sources, if `raster-color-range` is unspecified, the source's stated data range is used.
       *
       * Get the default value of RasterColorRange property
       *
       * @return List<Double>
       */
      get() {
        return StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-range").silentUnwrap()
      }

    /**
     * When `raster-color` is active, specifies the range over which `raster-color` is tabulated. Units correspond to the computed raster value via `raster-color-mix`. For `rasterarray` sources, if `raster-color-range` is unspecified, the source's stated data range is used.
     *
     * This is an Expression representation of "raster-color-range".
     *
     */
    val defaultRasterColorRangeAsExpression: Expression?
      /**
       * Get default value of the RasterColorRange property as an Expression
       *
       * @return List<Double>
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-range").silentUnwrap<Expression>()?.let {
          return it
        }
        defaultRasterColorRange?.let {
          return Expression.literal(it)
        }
        return null
      }

    /**
     * Transition options for RasterColorRange.
     */
    val defaultRasterColorRangeTransition: StyleTransition?
      /**
       * Get the RasterColorRange property transition options
       *
       * @return transition options for List<Double>
       */
      get() = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-range-transition").silentUnwrap()

    /**
     * Increase or reduce the contrast of the image. Default value: 0. Value range: [-1, 1]
     */
    val defaultRasterContrast: Double?
      /**
       * Increase or reduce the contrast of the image. Default value: 0. Value range: [-1, 1]
       *
       * Get the default value of RasterContrast property
       *
       * @return Double
       */
      get() {
        return StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-contrast").silentUnwrap()
      }

    /**
     * Increase or reduce the contrast of the image. Default value: 0. Value range: [-1, 1]
     *
     * This is an Expression representation of "raster-contrast".
     *
     */
    val defaultRasterContrastAsExpression: Expression?
      /**
       * Get default value of the RasterContrast property as an Expression
       *
       * @return Double
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-contrast").silentUnwrap<Expression>()?.let {
          return it
        }
        defaultRasterContrast?.let {
          return Expression.literal(it)
        }
        return null
      }

    /**
     * Transition options for RasterContrast.
     */
    val defaultRasterContrastTransition: StyleTransition?
      /**
       * Get the RasterContrast property transition options
       *
       * @return transition options for Double
       */
      get() = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-contrast-transition").silentUnwrap()

    /**
     * Specifies an uniform elevation from the ground, in meters. Default value: 0. Minimum value: 0.
     */
    @MapboxExperimental
    val defaultRasterElevation: Double?
      /**
       * Specifies an uniform elevation from the ground, in meters. Default value: 0. Minimum value: 0.
       *
       * Get the default value of RasterElevation property
       *
       * @return Double
       */
      get() {
        return StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-elevation").silentUnwrap()
      }

    /**
     * Specifies an uniform elevation from the ground, in meters. Default value: 0. Minimum value: 0.
     *
     * This is an Expression representation of "raster-elevation".
     *
     */
    @MapboxExperimental
    val defaultRasterElevationAsExpression: Expression?
      /**
       * Get default value of the RasterElevation property as an Expression
       *
       * @return Double
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-elevation").silentUnwrap<Expression>()?.let {
          return it
        }
        defaultRasterElevation?.let {
          return Expression.literal(it)
        }
        return null
      }

    /**
     * Transition options for RasterElevation.
     */
    @MapboxExperimental
    val defaultRasterElevationTransition: StyleTransition?
      /**
       * Get the RasterElevation property transition options
       *
       * @return transition options for Double
       */
      get() = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-elevation-transition").silentUnwrap()

    /**
     * Controls the intensity of light emitted on the source features. Default value: 0. Minimum value: 0. The unit of rasterEmissiveStrength is in intensity.
     */
    val defaultRasterEmissiveStrength: Double?
      /**
       * Controls the intensity of light emitted on the source features. Default value: 0. Minimum value: 0. The unit of rasterEmissiveStrength is in intensity.
       *
       * Get the default value of RasterEmissiveStrength property
       *
       * @return Double
       */
      get() {
        return StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-emissive-strength").silentUnwrap()
      }

    /**
     * Controls the intensity of light emitted on the source features. Default value: 0. Minimum value: 0. The unit of rasterEmissiveStrength is in intensity.
     *
     * This is an Expression representation of "raster-emissive-strength".
     *
     */
    val defaultRasterEmissiveStrengthAsExpression: Expression?
      /**
       * Get default value of the RasterEmissiveStrength property as an Expression
       *
       * @return Double
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-emissive-strength").silentUnwrap<Expression>()?.let {
          return it
        }
        defaultRasterEmissiveStrength?.let {
          return Expression.literal(it)
        }
        return null
      }

    /**
     * Transition options for RasterEmissiveStrength.
     */
    val defaultRasterEmissiveStrengthTransition: StyleTransition?
      /**
       * Get the RasterEmissiveStrength property transition options
       *
       * @return transition options for Double
       */
      get() = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-emissive-strength-transition").silentUnwrap()

    /**
     * Fade duration when a new tile is added. Default value: 300. Minimum value: 0. The unit of rasterFadeDuration is in milliseconds.
     */
    val defaultRasterFadeDuration: Double?
      /**
       * Fade duration when a new tile is added. Default value: 300. Minimum value: 0. The unit of rasterFadeDuration is in milliseconds.
       *
       * Get the default value of RasterFadeDuration property
       *
       * @return Double
       */
      get() {
        return StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-fade-duration").silentUnwrap()
      }

    /**
     * Fade duration when a new tile is added. Default value: 300. Minimum value: 0. The unit of rasterFadeDuration is in milliseconds.
     *
     * This is an Expression representation of "raster-fade-duration".
     *
     */
    val defaultRasterFadeDurationAsExpression: Expression?
      /**
       * Get default value of the RasterFadeDuration property as an Expression
       *
       * @return Double
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-fade-duration").silentUnwrap<Expression>()?.let {
          return it
        }
        defaultRasterFadeDuration?.let {
          return Expression.literal(it)
        }
        return null
      }

    /**
     * Rotates hues around the color wheel. Default value: 0. The unit of rasterHueRotate is in degrees.
     */
    val defaultRasterHueRotate: Double?
      /**
       * Rotates hues around the color wheel. Default value: 0. The unit of rasterHueRotate is in degrees.
       *
       * Get the default value of RasterHueRotate property
       *
       * @return Double
       */
      get() {
        return StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-hue-rotate").silentUnwrap()
      }

    /**
     * Rotates hues around the color wheel. Default value: 0. The unit of rasterHueRotate is in degrees.
     *
     * This is an Expression representation of "raster-hue-rotate".
     *
     */
    val defaultRasterHueRotateAsExpression: Expression?
      /**
       * Get default value of the RasterHueRotate property as an Expression
       *
       * @return Double
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-hue-rotate").silentUnwrap<Expression>()?.let {
          return it
        }
        defaultRasterHueRotate?.let {
          return Expression.literal(it)
        }
        return null
      }

    /**
     * Transition options for RasterHueRotate.
     */
    val defaultRasterHueRotateTransition: StyleTransition?
      /**
       * Get the RasterHueRotate property transition options
       *
       * @return transition options for Double
       */
      get() = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-hue-rotate-transition").silentUnwrap()

    /**
     * The opacity at which the image will be drawn. Default value: 1. Value range: [0, 1]
     */
    val defaultRasterOpacity: Double?
      /**
       * The opacity at which the image will be drawn. Default value: 1. Value range: [0, 1]
       *
       * Get the default value of RasterOpacity property
       *
       * @return Double
       */
      get() {
        return StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-opacity").silentUnwrap()
      }

    /**
     * The opacity at which the image will be drawn. Default value: 1. Value range: [0, 1]
     *
     * This is an Expression representation of "raster-opacity".
     *
     */
    val defaultRasterOpacityAsExpression: Expression?
      /**
       * Get default value of the RasterOpacity property as an Expression
       *
       * @return Double
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-opacity").silentUnwrap<Expression>()?.let {
          return it
        }
        defaultRasterOpacity?.let {
          return Expression.literal(it)
        }
        return null
      }

    /**
     * Transition options for RasterOpacity.
     */
    val defaultRasterOpacityTransition: StyleTransition?
      /**
       * Get the RasterOpacity property transition options
       *
       * @return transition options for Double
       */
      get() = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-opacity-transition").silentUnwrap()

    /**
     * The resampling/interpolation method to use for overscaling, also known as texture magnification filter Default value: "linear".
     */
    val defaultRasterResampling: RasterResampling?
      /**
       * The resampling/interpolation method to use for overscaling, also known as texture magnification filter Default value: "linear".
       *
       * Get the default value of RasterResampling property
       *
       * @return RasterResampling
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-resampling").silentUnwrap<String>()?.let {
          return RasterResampling.valueOf(it.uppercase(Locale.US).replace('-', '_'))
        }
        return null
      }

    /**
     * The resampling/interpolation method to use for overscaling, also known as texture magnification filter Default value: "linear".
     *
     * This is an Expression representation of "raster-resampling".
     *
     */
    val defaultRasterResamplingAsExpression: Expression?
      /**
       * Get default value of the RasterResampling property as an Expression
       *
       * @return RasterResampling
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-resampling").silentUnwrap<Expression>()?.let {
          return it
        }
        defaultRasterResampling?.let {
          return Expression.literal(it.value)
        }
        return null
      }

    /**
     * Increase or reduce the saturation of the image. Default value: 0. Value range: [-1, 1]
     */
    val defaultRasterSaturation: Double?
      /**
       * Increase or reduce the saturation of the image. Default value: 0. Value range: [-1, 1]
       *
       * Get the default value of RasterSaturation property
       *
       * @return Double
       */
      get() {
        return StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-saturation").silentUnwrap()
      }

    /**
     * Increase or reduce the saturation of the image. Default value: 0. Value range: [-1, 1]
     *
     * This is an Expression representation of "raster-saturation".
     *
     */
    val defaultRasterSaturationAsExpression: Expression?
      /**
       * Get default value of the RasterSaturation property as an Expression
       *
       * @return Double
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-saturation").silentUnwrap<Expression>()?.let {
          return it
        }
        defaultRasterSaturation?.let {
          return Expression.literal(it)
        }
        return null
      }

    /**
     * Transition options for RasterSaturation.
     */
    val defaultRasterSaturationTransition: StyleTransition?
      /**
       * Get the RasterSaturation property transition options
       *
       * @return transition options for Double
       */
      get() = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-saturation-transition").silentUnwrap()
  }
}

/**
 * This Interface contains all the functions that will be exposed to Koltin DSL.
 *
 * Separated the DSL receiver class to this interface to avoid IDE code suggestion for
 * property getters.
 */
@LayersDsl
interface RasterLayerDsl {
  /**
   * A source layer is an individual layer of data within a vector source.
   * A vector source can have multiple source layers.
   *
   * @param sourceLayer value of sourceLayer
   */
  fun sourceLayer(sourceLayer: String): RasterLayer

  /**
   * The slot this layer is assigned to. If specified, and a slot with that name exists,
   * it will be placed at that position in the layer order.
   *
   * @param slot value of slot. Setting it to empty string removes the slot.
   */
  fun slot(slot: String): RasterLayer

  /**
   * Whether this layer is displayed.
   *
   * @param visibility value of Visibility
   */
  fun visibility(visibility: Visibility): RasterLayer

  /**
   * Whether this layer is displayed.
   *
   * @param visibility value of Visibility as Expression
   */
  fun visibility(visibility: Expression): RasterLayer

  /**
   * The minimum zoom level for the layer. At zoom levels less than the minzoom, the layer will be hidden.
   *
   * Range:
   *       minimum: 0
   *       maximum: 24
   *
   * @param minZoom value of minzoom
   */
  fun minZoom(minZoom: Double): RasterLayer

  /**
   * The maximum zoom level for the layer. At zoom levels equal to or greater than the maxzoom, the layer will be hidden.
   *
   * Range:
   *       minimum: 0
   *       maximum: 24
   *
   * @param maxZoom value of maxzoom
   */
  fun maxZoom(maxZoom: Double): RasterLayer

  // Property getters and setters

  /**
   * Displayed band of raster array source layer. Defaults to the first band if not set.
   *
   * @param rasterArrayBand value of rasterArrayBand
   */
  @MapboxExperimental
  fun rasterArrayBand(rasterArrayBand: String): RasterLayer

  /**
   * Displayed band of raster array source layer. Defaults to the first band if not set.
   *
   * @param rasterArrayBand value of rasterArrayBand as Expression
   */
  @MapboxExperimental
  fun rasterArrayBand(rasterArrayBand: Expression): RasterLayer

  /**
   * Increase or reduce the brightness of the image. The value is the maximum brightness. Default value: 1. Value range: [0, 1]
   *
   * @param rasterBrightnessMax value of rasterBrightnessMax
   */
  fun rasterBrightnessMax(rasterBrightnessMax: Double = 1.0): RasterLayer

  /**
   * Increase or reduce the brightness of the image. The value is the maximum brightness. Default value: 1. Value range: [0, 1]
   *
   * @param rasterBrightnessMax value of rasterBrightnessMax as Expression
   */
  fun rasterBrightnessMax(rasterBrightnessMax: Expression): RasterLayer

  /**
   * Increase or reduce the brightness of the image. The value is the maximum brightness. Default value: 1. Value range: [0, 1]
   *
   * Set the RasterBrightnessMax property transition options
   *
   * @param options transition options for Double
   */
  fun rasterBrightnessMaxTransition(options: StyleTransition): RasterLayer

  /**
   * Increase or reduce the brightness of the image. The value is the maximum brightness. Default value: 1. Value range: [0, 1]
   *
   * DSL for [rasterBrightnessMaxTransition].
   */
  fun rasterBrightnessMaxTransition(block: StyleTransition.Builder.() -> Unit): RasterLayer

  /**
   * Increase or reduce the brightness of the image. The value is the minimum brightness. Default value: 0. Value range: [0, 1]
   *
   * @param rasterBrightnessMin value of rasterBrightnessMin
   */
  fun rasterBrightnessMin(rasterBrightnessMin: Double = 0.0): RasterLayer

  /**
   * Increase or reduce the brightness of the image. The value is the minimum brightness. Default value: 0. Value range: [0, 1]
   *
   * @param rasterBrightnessMin value of rasterBrightnessMin as Expression
   */
  fun rasterBrightnessMin(rasterBrightnessMin: Expression): RasterLayer

  /**
   * Increase or reduce the brightness of the image. The value is the minimum brightness. Default value: 0. Value range: [0, 1]
   *
   * Set the RasterBrightnessMin property transition options
   *
   * @param options transition options for Double
   */
  fun rasterBrightnessMinTransition(options: StyleTransition): RasterLayer

  /**
   * Increase or reduce the brightness of the image. The value is the minimum brightness. Default value: 0. Value range: [0, 1]
   *
   * DSL for [rasterBrightnessMinTransition].
   */
  fun rasterBrightnessMinTransition(block: StyleTransition.Builder.() -> Unit): RasterLayer

  /**
   * Defines a color map by which to colorize a raster layer, parameterized by the `["raster-value"]` expression and evaluated at 256 uniformly spaced steps over the range specified by `raster-color-range`.
   *
   * @param rasterColor value of rasterColor
   */
  fun rasterColor(rasterColor: Expression): RasterLayer

  /**
   * Set the rasterColorUseTheme as String for [rasterColor].
   *
   * @param rasterColorUseTheme overrides applying of color theme if "none" string value is set. To follow default theme "default" sting value should be set.
   */
  @MapboxExperimental
  fun rasterColorUseTheme(rasterColorUseTheme: String): RasterLayer

  /**
   * Set the rasterColorUseTheme as Expression for [rasterColor].
   *
   * @param rasterColorUseTheme overrides applying of color theme if "none" string value is set. To follow default theme "default" sting value should be set.
   */
  @MapboxExperimental
  fun rasterColorUseTheme(rasterColorUseTheme: Expression): RasterLayer

  /**
   * When `raster-color` is active, specifies the combination of source RGB channels used to compute the raster value. Computed using the equation `mix.r - src.r + mix.g - src.g + mix.b - src.b + mix.a`. The first three components specify the mix of source red, green, and blue channels, respectively. The fourth component serves as a constant offset and is -not- multipled by source alpha. Source alpha is instead carried through and applied as opacity to the colorized result. Default value corresponds to RGB luminosity. Default value: [0.2126,0.7152,0.0722,0].
   *
   * @param rasterColorMix value of rasterColorMix
   */
  fun rasterColorMix(rasterColorMix: List<Double> = listOf(0.2126, 0.7152, 0.0722, 0.0)): RasterLayer

  /**
   * When `raster-color` is active, specifies the combination of source RGB channels used to compute the raster value. Computed using the equation `mix.r - src.r + mix.g - src.g + mix.b - src.b + mix.a`. The first three components specify the mix of source red, green, and blue channels, respectively. The fourth component serves as a constant offset and is -not- multipled by source alpha. Source alpha is instead carried through and applied as opacity to the colorized result. Default value corresponds to RGB luminosity. Default value: [0.2126,0.7152,0.0722,0].
   *
   * @param rasterColorMix value of rasterColorMix as Expression
   */
  fun rasterColorMix(rasterColorMix: Expression): RasterLayer

  /**
   * When `raster-color` is active, specifies the combination of source RGB channels used to compute the raster value. Computed using the equation `mix.r - src.r + mix.g - src.g + mix.b - src.b + mix.a`. The first three components specify the mix of source red, green, and blue channels, respectively. The fourth component serves as a constant offset and is -not- multipled by source alpha. Source alpha is instead carried through and applied as opacity to the colorized result. Default value corresponds to RGB luminosity. Default value: [0.2126,0.7152,0.0722,0].
   *
   * Set the RasterColorMix property transition options
   *
   * @param options transition options for List<Double>
   */
  fun rasterColorMixTransition(options: StyleTransition): RasterLayer

  /**
   * When `raster-color` is active, specifies the combination of source RGB channels used to compute the raster value. Computed using the equation `mix.r - src.r + mix.g - src.g + mix.b - src.b + mix.a`. The first three components specify the mix of source red, green, and blue channels, respectively. The fourth component serves as a constant offset and is -not- multipled by source alpha. Source alpha is instead carried through and applied as opacity to the colorized result. Default value corresponds to RGB luminosity. Default value: [0.2126,0.7152,0.0722,0].
   *
   * DSL for [rasterColorMixTransition].
   */
  fun rasterColorMixTransition(block: StyleTransition.Builder.() -> Unit): RasterLayer

  /**
   * When `raster-color` is active, specifies the range over which `raster-color` is tabulated. Units correspond to the computed raster value via `raster-color-mix`. For `rasterarray` sources, if `raster-color-range` is unspecified, the source's stated data range is used.
   *
   * @param rasterColorRange value of rasterColorRange
   */
  fun rasterColorRange(rasterColorRange: List<Double>): RasterLayer

  /**
   * When `raster-color` is active, specifies the range over which `raster-color` is tabulated. Units correspond to the computed raster value via `raster-color-mix`. For `rasterarray` sources, if `raster-color-range` is unspecified, the source's stated data range is used.
   *
   * @param rasterColorRange value of rasterColorRange as Expression
   */
  fun rasterColorRange(rasterColorRange: Expression): RasterLayer

  /**
   * When `raster-color` is active, specifies the range over which `raster-color` is tabulated. Units correspond to the computed raster value via `raster-color-mix`. For `rasterarray` sources, if `raster-color-range` is unspecified, the source's stated data range is used.
   *
   * Set the RasterColorRange property transition options
   *
   * @param options transition options for List<Double>
   */
  fun rasterColorRangeTransition(options: StyleTransition): RasterLayer

  /**
   * When `raster-color` is active, specifies the range over which `raster-color` is tabulated. Units correspond to the computed raster value via `raster-color-mix`. For `rasterarray` sources, if `raster-color-range` is unspecified, the source's stated data range is used.
   *
   * DSL for [rasterColorRangeTransition].
   */
  fun rasterColorRangeTransition(block: StyleTransition.Builder.() -> Unit): RasterLayer

  /**
   * Increase or reduce the contrast of the image. Default value: 0. Value range: [-1, 1]
   *
   * @param rasterContrast value of rasterContrast
   */
  fun rasterContrast(rasterContrast: Double = 0.0): RasterLayer

  /**
   * Increase or reduce the contrast of the image. Default value: 0. Value range: [-1, 1]
   *
   * @param rasterContrast value of rasterContrast as Expression
   */
  fun rasterContrast(rasterContrast: Expression): RasterLayer

  /**
   * Increase or reduce the contrast of the image. Default value: 0. Value range: [-1, 1]
   *
   * Set the RasterContrast property transition options
   *
   * @param options transition options for Double
   */
  fun rasterContrastTransition(options: StyleTransition): RasterLayer

  /**
   * Increase or reduce the contrast of the image. Default value: 0. Value range: [-1, 1]
   *
   * DSL for [rasterContrastTransition].
   */
  fun rasterContrastTransition(block: StyleTransition.Builder.() -> Unit): RasterLayer

  /**
   * Specifies an uniform elevation from the ground, in meters. Default value: 0. Minimum value: 0.
   *
   * @param rasterElevation value of rasterElevation
   */
  @MapboxExperimental
  fun rasterElevation(rasterElevation: Double = 0.0): RasterLayer

  /**
   * Specifies an uniform elevation from the ground, in meters. Default value: 0. Minimum value: 0.
   *
   * @param rasterElevation value of rasterElevation as Expression
   */
  @MapboxExperimental
  fun rasterElevation(rasterElevation: Expression): RasterLayer

  /**
   * Specifies an uniform elevation from the ground, in meters. Default value: 0. Minimum value: 0.
   *
   * Set the RasterElevation property transition options
   *
   * @param options transition options for Double
   */
  @MapboxExperimental
  fun rasterElevationTransition(options: StyleTransition): RasterLayer

  /**
   * Specifies an uniform elevation from the ground, in meters. Default value: 0. Minimum value: 0.
   *
   * DSL for [rasterElevationTransition].
   */
  @MapboxExperimental
  fun rasterElevationTransition(block: StyleTransition.Builder.() -> Unit): RasterLayer

  /**
   * Controls the intensity of light emitted on the source features. Default value: 0. Minimum value: 0. The unit of rasterEmissiveStrength is in intensity.
   *
   * @param rasterEmissiveStrength value of rasterEmissiveStrength
   */
  fun rasterEmissiveStrength(rasterEmissiveStrength: Double = 0.0): RasterLayer

  /**
   * Controls the intensity of light emitted on the source features. Default value: 0. Minimum value: 0. The unit of rasterEmissiveStrength is in intensity.
   *
   * @param rasterEmissiveStrength value of rasterEmissiveStrength as Expression
   */
  fun rasterEmissiveStrength(rasterEmissiveStrength: Expression): RasterLayer

  /**
   * Controls the intensity of light emitted on the source features. Default value: 0. Minimum value: 0. The unit of rasterEmissiveStrength is in intensity.
   *
   * Set the RasterEmissiveStrength property transition options
   *
   * @param options transition options for Double
   */
  fun rasterEmissiveStrengthTransition(options: StyleTransition): RasterLayer

  /**
   * Controls the intensity of light emitted on the source features. Default value: 0. Minimum value: 0. The unit of rasterEmissiveStrength is in intensity.
   *
   * DSL for [rasterEmissiveStrengthTransition].
   */
  fun rasterEmissiveStrengthTransition(block: StyleTransition.Builder.() -> Unit): RasterLayer

  /**
   * Fade duration when a new tile is added. Default value: 300. Minimum value: 0. The unit of rasterFadeDuration is in milliseconds.
   *
   * @param rasterFadeDuration value of rasterFadeDuration
   */
  fun rasterFadeDuration(rasterFadeDuration: Double = 300.0): RasterLayer

  /**
   * Fade duration when a new tile is added. Default value: 300. Minimum value: 0. The unit of rasterFadeDuration is in milliseconds.
   *
   * @param rasterFadeDuration value of rasterFadeDuration as Expression
   */
  fun rasterFadeDuration(rasterFadeDuration: Expression): RasterLayer

  /**
   * Rotates hues around the color wheel. Default value: 0. The unit of rasterHueRotate is in degrees.
   *
   * @param rasterHueRotate value of rasterHueRotate
   */
  fun rasterHueRotate(rasterHueRotate: Double = 0.0): RasterLayer

  /**
   * Rotates hues around the color wheel. Default value: 0. The unit of rasterHueRotate is in degrees.
   *
   * @param rasterHueRotate value of rasterHueRotate as Expression
   */
  fun rasterHueRotate(rasterHueRotate: Expression): RasterLayer

  /**
   * Rotates hues around the color wheel. Default value: 0. The unit of rasterHueRotate is in degrees.
   *
   * Set the RasterHueRotate property transition options
   *
   * @param options transition options for Double
   */
  fun rasterHueRotateTransition(options: StyleTransition): RasterLayer

  /**
   * Rotates hues around the color wheel. Default value: 0. The unit of rasterHueRotate is in degrees.
   *
   * DSL for [rasterHueRotateTransition].
   */
  fun rasterHueRotateTransition(block: StyleTransition.Builder.() -> Unit): RasterLayer

  /**
   * The opacity at which the image will be drawn. Default value: 1. Value range: [0, 1]
   *
   * @param rasterOpacity value of rasterOpacity
   */
  fun rasterOpacity(rasterOpacity: Double = 1.0): RasterLayer

  /**
   * The opacity at which the image will be drawn. Default value: 1. Value range: [0, 1]
   *
   * @param rasterOpacity value of rasterOpacity as Expression
   */
  fun rasterOpacity(rasterOpacity: Expression): RasterLayer

  /**
   * The opacity at which the image will be drawn. Default value: 1. Value range: [0, 1]
   *
   * Set the RasterOpacity property transition options
   *
   * @param options transition options for Double
   */
  fun rasterOpacityTransition(options: StyleTransition): RasterLayer

  /**
   * The opacity at which the image will be drawn. Default value: 1. Value range: [0, 1]
   *
   * DSL for [rasterOpacityTransition].
   */
  fun rasterOpacityTransition(block: StyleTransition.Builder.() -> Unit): RasterLayer

  /**
   * The resampling/interpolation method to use for overscaling, also known as texture magnification filter Default value: "linear".
   *
   * @param rasterResampling value of rasterResampling
   */
  fun rasterResampling(rasterResampling: RasterResampling = RasterResampling.LINEAR): RasterLayer

  /**
   * The resampling/interpolation method to use for overscaling, also known as texture magnification filter Default value: "linear".
   *
   * @param rasterResampling value of rasterResampling as Expression
   */
  fun rasterResampling(rasterResampling: Expression): RasterLayer

  /**
   * Increase or reduce the saturation of the image. Default value: 0. Value range: [-1, 1]
   *
   * @param rasterSaturation value of rasterSaturation
   */
  fun rasterSaturation(rasterSaturation: Double = 0.0): RasterLayer

  /**
   * Increase or reduce the saturation of the image. Default value: 0. Value range: [-1, 1]
   *
   * @param rasterSaturation value of rasterSaturation as Expression
   */
  fun rasterSaturation(rasterSaturation: Expression): RasterLayer

  /**
   * Increase or reduce the saturation of the image. Default value: 0. Value range: [-1, 1]
   *
   * Set the RasterSaturation property transition options
   *
   * @param options transition options for Double
   */
  fun rasterSaturationTransition(options: StyleTransition): RasterLayer

  /**
   * Increase or reduce the saturation of the image. Default value: 0. Value range: [-1, 1]
   *
   * DSL for [rasterSaturationTransition].
   */
  fun rasterSaturationTransition(block: StyleTransition.Builder.() -> Unit): RasterLayer
}

/**
 * DSL function for creating a [RasterLayer].
 */
fun rasterLayer(layerId: String, sourceId: String, block: RasterLayerDsl.() -> Unit): RasterLayer = RasterLayer(layerId, sourceId).apply(block)

// End of generated file.