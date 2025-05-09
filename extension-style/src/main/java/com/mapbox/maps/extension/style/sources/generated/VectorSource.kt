// This file is generated.

package com.mapbox.maps.extension.style.sources.generated

import com.mapbox.maps.StyleManager
import com.mapbox.maps.TileCacheBudget
import com.mapbox.maps.extension.style.layers.properties.PropertyValue
import com.mapbox.maps.extension.style.sources.Source
import com.mapbox.maps.extension.style.sources.TileSet
import com.mapbox.maps.extension.style.types.PromoteId
import com.mapbox.maps.extension.style.types.SourceDsl
import com.mapbox.maps.extension.style.utils.TypeUtils
import com.mapbox.maps.extension.style.utils.silentUnwrap
import java.util.*

/**
 * A vector tile source.
 *
 * @see [The online documentation](https://docs.mapbox.com/style-spec/reference/sources/#vector)
 *
 */
class VectorSource(builder: Builder) : Source(builder.sourceId) {

  init {
    sourceProperties.putAll(builder.properties)
    volatileSourceProperties.putAll(builder.volatileProperties)
  }

  /**
   * Get the type of the current source as a String.
   */
  override fun getType(): String {
    return "vector"
  }

  /**
   * A URL to a TileJSON resource. Supported protocols are `http:`, `https:`, and `mapbox://<Tileset ID>`. Required if
   * `tiles` is not provided.
   */
  fun url(value: String): VectorSource = apply {
    setProperty(PropertyValue("url", TypeUtils.wrapToValue(value)))
  }

  /**
   * A URL to a TileJSON resource. Supported protocols are `http:`, `https:`, and `mapbox://<Tileset ID>`. Required if
   * `tiles` is not provided.
   */
  val url: String?
    /**
     * Get the Url property
     *
     * @return String
     */
    get() = getPropertyValue("url")

  /**
   * An array of one or more tile source URLs, as in the TileJSON spec. Required if
   * `url` is not provided.
   */
  fun tiles(value: List<String>): VectorSource = apply {
    setProperty(PropertyValue("tiles", TypeUtils.wrapToValue(value)))
  }

  /**
   * An array of one or more tile source URLs, as in the TileJSON spec. Required if
   * `url` is not provided.
   */
  val tiles: List<String>?
    /**
     * Get the Tiles property
     *
     * @return List<String>
     */
    get() = getPropertyValue("tiles")

  /**
   * An array containing the longitude and latitude of the southwest and northeast corners of the source's
   * bounding box in the following order: `[sw.lng, sw.lat, ne.lng, ne.lat]`. When this property is included in
   * a source, no tiles outside of the given bounds are requested by Mapbox GL.
   * Default value: [-180,-85.051129,180,85.051129].
   */
  val bounds: List<Double>?
    /**
     * Get the Bounds property
     *
     * @return List<Double>
     */
    get() = getPropertyValue("bounds")

  /**
   * Influences the y direction of the tile coordinates. The global-mercator (aka Spherical Mercator) profile is assumed.
   * Default value: "xyz".
   */
  val scheme: Scheme?
    /**
     * Get the Scheme property
     *
     * Use static method [VectorSource.defaultScheme] to get the default property.
     *
     * @return Scheme
     */
    get() {
      getPropertyValue<String?>("scheme")?.let {
        return Scheme.valueOf(it.uppercase(Locale.US).replace('-', '_'))
      }
      return null
    }

  /**
   * Minimum zoom level for which tiles are available, as in the TileJSON spec.
   * Default value: 0.
   */
  fun minzoom(value: Long = 0L): VectorSource = apply {
    setProperty(PropertyValue("minzoom", TypeUtils.wrapToValue(value)))
  }

  /**
   * Minimum zoom level for which tiles are available, as in the TileJSON spec.
   * Default value: 0.
   */
  val minzoom: Long?
    /**
     * Get the Minzoom property
     *
     * Use static method [VectorSource.defaultMinzoom] to get the default property.
     *
     * @return Long
     */
    get() = getPropertyValue("minzoom")

  /**
   * Maximum zoom level for which tiles are available, as in the TileJSON spec. Data from tiles
   * at the maxzoom are used when displaying the map at higher zoom levels.
   * Default value: 22.
   */
  fun maxzoom(value: Long = 22L): VectorSource = apply {
    setProperty(PropertyValue("maxzoom", TypeUtils.wrapToValue(value)))
  }

  /**
   * Maximum zoom level for which tiles are available, as in the TileJSON spec. Data from tiles
   * at the maxzoom are used when displaying the map at higher zoom levels.
   * Default value: 22.
   */
  val maxzoom: Long?
    /**
     * Get the Maxzoom property
     *
     * Use static method [VectorSource.defaultMaxzoom] to get the default property.
     *
     * @return Long
     */
    get() = getPropertyValue("maxzoom")

  /**
   * Contains an attribution to be displayed when the map is shown to a user.
   */
  val attribution: String?
    /**
     * Get the Attribution property
     *
     * @return String
     */
    get() = getPropertyValue("attribution")

  /**
   * A property to use as a feature id (for feature state). Either a property name, or
   * an object of the form `{<sourceLayer>: <propertyName>}`. If specified as a string for a vector tile
   * source, the same property is used across all its source layers. If specified as an object
   * only specified source layers will have id overriden, others will fallback to original feature id
   */
  val promoteId: PromoteId?
    /**
     * Get the PromoteId property
     *
     * @return PromoteId
     */
    get() {
      val propertyValue = getPropertyValue<Any>("promoteId")
      propertyValue?.let {
        return PromoteId.fromProperty(it)
      }
      return null
    }

  /**
   * A setting to determine whether a source's tiles are cached locally.
   * Default value: false.
   */
  fun volatile(value: Boolean = false): VectorSource = apply {
    setProperty(PropertyValue("volatile", TypeUtils.wrapToValue(value)))
  }

  /**
   * A setting to determine whether a source's tiles are cached locally.
   * Default value: false.
   */
  val volatile: Boolean?
    /**
     * Get the Volatile property
     *
     * Use static method [VectorSource.defaultVolatile] to get the default property.
     *
     * @return Boolean
     */
    get() = getPropertyValue("volatile")

  /**
   * When loading a map, if PrefetchZoomDelta is set to any number greater than 0, the map
   * will first request a tile at zoom level lower than zoom - delta, but so that
   * the zoom level is multiple of delta, in an attempt to display a full map at
   * lower resolution as quick as possible. It will get clamped at the tile source minimum zoom.
   * Default value: 4.
   */
  fun prefetchZoomDelta(value: Long = 4L): VectorSource = apply {
    setVolatileProperty(PropertyValue("prefetch-zoom-delta", TypeUtils.wrapToValue(value)))
  }

  /**
   * When loading a map, if PrefetchZoomDelta is set to any number greater than 0, the map
   * will first request a tile at zoom level lower than zoom - delta, but so that
   * the zoom level is multiple of delta, in an attempt to display a full map at
   * lower resolution as quick as possible. It will get clamped at the tile source minimum zoom.
   * Default value: 4.
   */
  val prefetchZoomDelta: Long?
    /**
     * Get the PrefetchZoomDelta property
     *
     * Use static method [VectorSource.defaultPrefetchZoomDelta] to get the default property.
     *
     * @return Long
     */
    get() = getPropertyValue("prefetch-zoom-delta")

  /**
   * This property defines a source-specific resource budget, either in tile units or in megabytes. Whenever the
   * tile cache goes over the defined limit, the least recently used tile will be evicted from
   * the in-memory cache. Note that the current implementation does not take into account resources allocated by
   * the visible tiles.
   */
  fun tileCacheBudget(value: TileCacheBudget): VectorSource = apply {
    setVolatileProperty(PropertyValue("tile-cache-budget", TypeUtils.wrapToValue(value)))
  }

  /**
   * This property defines a source-specific resource budget, either in tile units or in megabytes. Whenever the
   * tile cache goes over the defined limit, the least recently used tile will be evicted from
   * the in-memory cache. Note that the current implementation does not take into account resources allocated by
   * the visible tiles.
   */
  val tileCacheBudget: TileCacheBudget?
    /**
     * Get the TileCacheBudget property
     *
     * @return TileCacheBudget
     */
    get() = getPropertyValue("tile-cache-budget")

  /**
   * Minimum tile update interval in seconds, which is used to throttle the tile update network requests.
   * If the given source supports loading tiles from a server, sets the minimum tile update interval.
   * Update network requests that are more frequent than the minimum tile update interval are suppressed.
   * Default value: 0.
   */
  fun minimumTileUpdateInterval(value: Double = 0.0): VectorSource = apply {
    setVolatileProperty(PropertyValue("minimum-tile-update-interval", TypeUtils.wrapToValue(value)))
  }

  /**
   * Minimum tile update interval in seconds, which is used to throttle the tile update network requests.
   * If the given source supports loading tiles from a server, sets the minimum tile update interval.
   * Update network requests that are more frequent than the minimum tile update interval are suppressed.
   * Default value: 0.
   */
  val minimumTileUpdateInterval: Double?
    /**
     * Get the MinimumTileUpdateInterval property
     *
     * Use static method [VectorSource.defaultMinimumTileUpdateInterval] to get the default property.
     *
     * @return Double
     */
    get() = getPropertyValue("minimum-tile-update-interval")

  /**
   * When a set of tiles for a current zoom level is being rendered and some of
   * the ideal tiles that cover the screen are not yet loaded, parent tile could be used
   * instead. This might introduce unwanted rendering side-effects, especially for raster tiles that are overscaled multiple times.
   * This property sets the maximum limit for how much a parent tile can be overscaled.
   */
  fun maxOverscaleFactorForParentTiles(value: Long): VectorSource = apply {
    setVolatileProperty(PropertyValue("max-overscale-factor-for-parent-tiles", TypeUtils.wrapToValue(value)))
  }

  /**
   * When a set of tiles for a current zoom level is being rendered and some of
   * the ideal tiles that cover the screen are not yet loaded, parent tile could be used
   * instead. This might introduce unwanted rendering side-effects, especially for raster tiles that are overscaled multiple times.
   * This property sets the maximum limit for how much a parent tile can be overscaled.
   */
  val maxOverscaleFactorForParentTiles: Long?
    /**
     * Get the MaxOverscaleFactorForParentTiles property
     *
     * @return Long
     */
    get() = getPropertyValue("max-overscale-factor-for-parent-tiles")

  /**
   * For the tiled sources, this property sets the tile requests delay. The given delay comes in
   * action only during an ongoing animation or gestures. It helps to avoid loading, parsing and rendering
   * of the transient tiles and thus to improve the rendering performance, especially on low-end devices.
   * Default value: 0.
   */
  fun tileRequestsDelay(value: Double = 0.0): VectorSource = apply {
    setVolatileProperty(PropertyValue("tile-requests-delay", TypeUtils.wrapToValue(value)))
  }

  /**
   * For the tiled sources, this property sets the tile requests delay. The given delay comes in
   * action only during an ongoing animation or gestures. It helps to avoid loading, parsing and rendering
   * of the transient tiles and thus to improve the rendering performance, especially on low-end devices.
   * Default value: 0.
   */
  val tileRequestsDelay: Double?
    /**
     * Get the TileRequestsDelay property
     *
     * Use static method [VectorSource.defaultTileRequestsDelay] to get the default property.
     *
     * @return Double
     */
    get() = getPropertyValue("tile-requests-delay")

  /**
   * For the tiled sources, this property sets the tile network requests delay. The given delay comes
   * in action only during an ongoing animation or gestures. It helps to avoid loading the transient
   * tiles from the network and thus to avoid redundant network requests. Note that tile-network-requests-delay value is
   * superseded with tile-requests-delay property value, if both are provided.
   * Default value: 0.
   */
  fun tileNetworkRequestsDelay(value: Double = 0.0): VectorSource = apply {
    setVolatileProperty(PropertyValue("tile-network-requests-delay", TypeUtils.wrapToValue(value)))
  }

  /**
   * For the tiled sources, this property sets the tile network requests delay. The given delay comes
   * in action only during an ongoing animation or gestures. It helps to avoid loading the transient
   * tiles from the network and thus to avoid redundant network requests. Note that tile-network-requests-delay value is
   * superseded with tile-requests-delay property value, if both are provided.
   * Default value: 0.
   */
  val tileNetworkRequestsDelay: Double?
    /**
     * Get the TileNetworkRequestsDelay property
     *
     * Use static method [VectorSource.defaultTileNetworkRequestsDelay] to get the default property.
     *
     * @return Double
     */
    get() = getPropertyValue("tile-network-requests-delay")

  /**
   * Builder for VectorSource.
   *
   * @param sourceId the ID of the source
   */
  @SourceDsl
  class Builder(val sourceId: String) {
    internal val properties = HashMap<String, PropertyValue<*>>()
    // Properties that only settable after the source is added to the style.
    internal val volatileProperties = HashMap<String, PropertyValue<*>>()

    /**
     * A URL to a TileJSON resource. Supported protocols are `http:`, `https:`, and `mapbox://<Tileset ID>`. Required if
     * `tiles` is not provided.
     */
    fun url(value: String): Builder = apply {
      val propertyValue = PropertyValue("url", TypeUtils.wrapToValue(value))
      properties[propertyValue.propertyName] = propertyValue
    }

    /**
     * An array of one or more tile source URLs, as in the TileJSON spec. Required if
     * `url` is not provided.
     */
    fun tiles(value: List<String>): Builder = apply {
      val propertyValue = PropertyValue("tiles", TypeUtils.wrapToValue(value))
      properties[propertyValue.propertyName] = propertyValue
    }

    /**
     * An array containing the longitude and latitude of the southwest and northeast corners of the source's
     * bounding box in the following order: `[sw.lng, sw.lat, ne.lng, ne.lat]`. When this property is included in
     * a source, no tiles outside of the given bounds are requested by Mapbox GL.
     * Default value: [-180,-85.051129,180,85.051129].
     */
    fun bounds(value: List<Double> = listOf(-180.0, -85.051129, 180.0, 85.051129)): Builder = apply {
      val propertyValue = PropertyValue("bounds", TypeUtils.wrapToValue(value))
      properties[propertyValue.propertyName] = propertyValue
    }

    /**
     * Influences the y direction of the tile coordinates. The global-mercator (aka Spherical Mercator) profile is assumed.
     * Default value: "xyz".
     */
    fun scheme(value: Scheme = Scheme.XYZ): Builder = apply {
      val propertyValue = PropertyValue("scheme", TypeUtils.wrapToValue(value.value))
      properties[propertyValue.propertyName] = propertyValue
    }

    /**
     * Minimum zoom level for which tiles are available, as in the TileJSON spec.
     * Default value: 0.
     */
    fun minzoom(value: Long = 0L): Builder = apply {
      val propertyValue = PropertyValue("minzoom", TypeUtils.wrapToValue(value))
      properties[propertyValue.propertyName] = propertyValue
    }

    /**
     * Maximum zoom level for which tiles are available, as in the TileJSON spec. Data from tiles
     * at the maxzoom are used when displaying the map at higher zoom levels.
     * Default value: 22.
     */
    fun maxzoom(value: Long = 22L): Builder = apply {
      val propertyValue = PropertyValue("maxzoom", TypeUtils.wrapToValue(value))
      properties[propertyValue.propertyName] = propertyValue
    }

    /**
     * Contains an attribution to be displayed when the map is shown to a user.
     */
    fun attribution(value: String): Builder = apply {
      val propertyValue = PropertyValue("attribution", TypeUtils.wrapToValue(value))
      properties[propertyValue.propertyName] = propertyValue
    }

    /**
     * A property to use as a feature id (for feature state). Either a property name, or
     * an object of the form `{<sourceLayer>: <propertyName>}`. If specified as a string for a vector tile
     * source, the same property is used across all its source layers. If specified as an object
     * only specified source layers will have id overriden, others will fallback to original feature id
     */
    fun promoteId(value: PromoteId): Builder = apply {
      val propertyValue = PropertyValue("promoteId", value.toValue())
      properties[propertyValue.propertyName] = propertyValue
    }

    /**
     * A setting to determine whether a source's tiles are cached locally.
     * Default value: false.
     */
    fun volatile(value: Boolean = false): Builder = apply {
      val propertyValue = PropertyValue("volatile", TypeUtils.wrapToValue(value))
      properties[propertyValue.propertyName] = propertyValue
    }

    /**
     * When loading a map, if PrefetchZoomDelta is set to any number greater than 0, the map
     * will first request a tile at zoom level lower than zoom - delta, but so that
     * the zoom level is multiple of delta, in an attempt to display a full map at
     * lower resolution as quick as possible. It will get clamped at the tile source minimum zoom.
     * Default value: 4.
     */
    fun prefetchZoomDelta(value: Long = 4L): Builder = apply {
      val propertyValue = PropertyValue("prefetch-zoom-delta", TypeUtils.wrapToValue(value))
      volatileProperties[propertyValue.propertyName] = propertyValue
    }

    /**
     * This property defines a source-specific resource budget, either in tile units or in megabytes. Whenever the
     * tile cache goes over the defined limit, the least recently used tile will be evicted from
     * the in-memory cache. Note that the current implementation does not take into account resources allocated by
     * the visible tiles.
     */
    fun tileCacheBudget(value: TileCacheBudget): Builder = apply {
      val propertyValue = PropertyValue("tile-cache-budget", TypeUtils.wrapToValue(value))
      volatileProperties[propertyValue.propertyName] = propertyValue
    }

    /**
     * Minimum tile update interval in seconds, which is used to throttle the tile update network requests.
     * If the given source supports loading tiles from a server, sets the minimum tile update interval.
     * Update network requests that are more frequent than the minimum tile update interval are suppressed.
     * Default value: 0.
     */
    fun minimumTileUpdateInterval(value: Double = 0.0): Builder = apply {
      val propertyValue = PropertyValue("minimum-tile-update-interval", TypeUtils.wrapToValue(value))
      volatileProperties[propertyValue.propertyName] = propertyValue
    }

    /**
     * When a set of tiles for a current zoom level is being rendered and some of
     * the ideal tiles that cover the screen are not yet loaded, parent tile could be used
     * instead. This might introduce unwanted rendering side-effects, especially for raster tiles that are overscaled multiple times.
     * This property sets the maximum limit for how much a parent tile can be overscaled.
     */
    fun maxOverscaleFactorForParentTiles(value: Long): Builder = apply {
      val propertyValue = PropertyValue("max-overscale-factor-for-parent-tiles", TypeUtils.wrapToValue(value))
      volatileProperties[propertyValue.propertyName] = propertyValue
    }

    /**
     * For the tiled sources, this property sets the tile requests delay. The given delay comes in
     * action only during an ongoing animation or gestures. It helps to avoid loading, parsing and rendering
     * of the transient tiles and thus to improve the rendering performance, especially on low-end devices.
     * Default value: 0.
     */
    fun tileRequestsDelay(value: Double = 0.0): Builder = apply {
      val propertyValue = PropertyValue("tile-requests-delay", TypeUtils.wrapToValue(value))
      volatileProperties[propertyValue.propertyName] = propertyValue
    }

    /**
     * For the tiled sources, this property sets the tile network requests delay. The given delay comes
     * in action only during an ongoing animation or gestures. It helps to avoid loading the transient
     * tiles from the network and thus to avoid redundant network requests. Note that tile-network-requests-delay value is
     * superseded with tile-requests-delay property value, if both are provided.
     * Default value: 0.
     */
    fun tileNetworkRequestsDelay(value: Double = 0.0): Builder = apply {
      val propertyValue = PropertyValue("tile-network-requests-delay", TypeUtils.wrapToValue(value))
      volatileProperties[propertyValue.propertyName] = propertyValue
    }

    /**
     * Add a TileSet to the Source.
     *
     * @param tileSet
     */
    fun tileSet(tileSet: TileSet): Builder = apply {
      for ((name, value) in tileSet) {
        val propertyValue = PropertyValue(name, value)
        properties[propertyValue.propertyName] = propertyValue
      }
    }

    /**
     * Add a TileSet to the Source, using DSL.
     *
     * @param tilejson
     * @param tiles
     * @param block
     */
    fun tileSet(tilejson: String, tiles: List<String>, block: TileSet.Builder.() -> Unit): Builder = apply {
      val tileSet = TileSet.Builder(tilejson, tiles).apply(block).build()
      for ((name, value) in tileSet) {
        val propertyValue = PropertyValue(name, value)
        properties[propertyValue.propertyName] = propertyValue
      }
    }
    /**
     * Build the VectorSource.
     *
     * @return the VectorSource
     */
    fun build(): VectorSource = VectorSource(this)
  }

  /**
   * Static variables and methods.
   */
  companion object {

    /**
     * Influences the y direction of the tile coordinates. The global-mercator (aka Spherical Mercator) profile is assumed.
     * Default value: "xyz".
     */
    val defaultScheme: Scheme?
      /**
       * Get the Scheme property
       *
       * @return Scheme
       */
      get() {
        StyleManager.getStyleSourcePropertyDefaultValue("vector", "scheme").silentUnwrap<String>()?.let {
          return Scheme.valueOf(it.uppercase(Locale.US).replace('-', '_'))
        }
        return null
      }

    /**
     * Minimum zoom level for which tiles are available, as in the TileJSON spec.
     * Default value: 0.
     */
    val defaultMinzoom: Long?
      /**
       * Get the Minzoom property
       *
       * @return Long
       */
      get() = StyleManager.getStyleSourcePropertyDefaultValue("vector", "minzoom").silentUnwrap()

    /**
     * Maximum zoom level for which tiles are available, as in the TileJSON spec. Data from tiles
     * at the maxzoom are used when displaying the map at higher zoom levels.
     * Default value: 22.
     */
    val defaultMaxzoom: Long?
      /**
       * Get the Maxzoom property
       *
       * @return Long
       */
      get() = StyleManager.getStyleSourcePropertyDefaultValue("vector", "maxzoom").silentUnwrap()

    /**
     * A setting to determine whether a source's tiles are cached locally.
     * Default value: false.
     */
    val defaultVolatile: Boolean?
      /**
       * Get the Volatile property
       *
       * @return Boolean
       */
      get() = StyleManager.getStyleSourcePropertyDefaultValue("vector", "volatile").silentUnwrap()

    /**
     * When loading a map, if PrefetchZoomDelta is set to any number greater than 0, the map
     * will first request a tile at zoom level lower than zoom - delta, but so that
     * the zoom level is multiple of delta, in an attempt to display a full map at
     * lower resolution as quick as possible. It will get clamped at the tile source minimum zoom.
     * Default value: 4.
     */
    val defaultPrefetchZoomDelta: Long?
      /**
       * Get the PrefetchZoomDelta property
       *
       * @return Long
       */
      get() = StyleManager.getStyleSourcePropertyDefaultValue("vector", "prefetch-zoom-delta").silentUnwrap()

    /**
     * Minimum tile update interval in seconds, which is used to throttle the tile update network requests.
     * If the given source supports loading tiles from a server, sets the minimum tile update interval.
     * Update network requests that are more frequent than the minimum tile update interval are suppressed.
     * Default value: 0.
     */
    val defaultMinimumTileUpdateInterval: Double?
      /**
       * Get the MinimumTileUpdateInterval property
       *
       * @return Double
       */
      get() = StyleManager.getStyleSourcePropertyDefaultValue("vector", "minimum-tile-update-interval").silentUnwrap()

    /**
     * For the tiled sources, this property sets the tile requests delay. The given delay comes in
     * action only during an ongoing animation or gestures. It helps to avoid loading, parsing and rendering
     * of the transient tiles and thus to improve the rendering performance, especially on low-end devices.
     * Default value: 0.
     */
    val defaultTileRequestsDelay: Double?
      /**
       * Get the TileRequestsDelay property
       *
       * @return Double
       */
      get() = StyleManager.getStyleSourcePropertyDefaultValue("vector", "tile-requests-delay").silentUnwrap()

    /**
     * For the tiled sources, this property sets the tile network requests delay. The given delay comes
     * in action only during an ongoing animation or gestures. It helps to avoid loading the transient
     * tiles from the network and thus to avoid redundant network requests. Note that tile-network-requests-delay value is
     * superseded with tile-requests-delay property value, if both are provided.
     * Default value: 0.
     */
    val defaultTileNetworkRequestsDelay: Double?
      /**
       * Get the TileNetworkRequestsDelay property
       *
       * @return Double
       */
      get() = StyleManager.getStyleSourcePropertyDefaultValue("vector", "tile-network-requests-delay").silentUnwrap()
  }
}

/**
 * DSL function for [VectorSource].
 */
fun vectorSource(id: String, block: VectorSource.Builder.() -> Unit): VectorSource =
  VectorSource.Builder(id).apply(block).build()

// End of generated file.