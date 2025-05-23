// This file is generated.

package com.mapbox.maps.plugin.annotation.generated

import android.graphics.Color
import android.graphics.PointF
import com.google.gson.JsonObject
import com.mapbox.android.gestures.MoveDistancesObject
import com.mapbox.android.gestures.MoveGestureDetector
import com.mapbox.bindgen.ExpectedFactory
import com.mapbox.common.Cancelable
import com.mapbox.geojson.Feature
import com.mapbox.geojson.FeatureCollection
import com.mapbox.geojson.LineString
import com.mapbox.geojson.Point
import com.mapbox.maps.*
import com.mapbox.maps.extension.style.expressions.generated.Expression
import com.mapbox.maps.extension.style.layers.addPersistentLayer
import com.mapbox.maps.extension.style.layers.generated.LineLayer
import com.mapbox.maps.extension.style.layers.properties.generated.*
import com.mapbox.maps.extension.style.sources.addSource
import com.mapbox.maps.extension.style.sources.generated.GeoJsonSource
import com.mapbox.maps.extension.style.sources.getSource
import com.mapbox.maps.extension.style.utils.ColorUtils
import com.mapbox.maps.interactions.FeatureState
import com.mapbox.maps.interactions.FeaturesetFeature
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor
import com.mapbox.maps.plugin.annotation.*
import com.mapbox.maps.plugin.delegates.*
import com.mapbox.maps.plugin.gestures.GesturesPlugin
import io.mockk.*
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@OptIn(MapboxExperimental::class)
@RunWith(RobolectricTestRunner::class)
@Config(shadows = [ShadowProjection::class])
class PolylineAnnotationManagerTest {
  private val delegateProvider: MapDelegateProvider = mockk()
  private val style: MapboxStyleManager = mockk()
  private val mapCameraManagerDelegate: MapCameraManagerDelegate = mockk()
  private val mapInteractionDelegate: MapInteractionDelegate = mockk()
  private val gesturesPlugin: GesturesPlugin = mockk()
  private val moveGestureDetector: MoveGestureDetector = mockk()
  private val layer: LineLayer = mockk()
  private val source: GeoJsonSource = mockk()
  private val dragLayer: LineLayer = mockk()
  private val dragSource: GeoJsonSource = mockk()
  private val feature = mockk<Feature>()

  private lateinit var manager: PolylineAnnotationManager
  @Before
  fun setUp() {
    mockkStatic("com.mapbox.maps.extension.style.layers.LayerUtils")
    mockkStatic("com.mapbox.maps.extension.style.sources.SourceUtils")
    mockkStatic(Projection::class)
    mockkStatic("com.mapbox.maps.MapboxLogger")
    every { logE(any(), any()) } just Runs
    every { delegateProvider.mapStyleManagerDelegate } returns style
    every { style.addSource(any()) } just Runs
    every { style.getSource(any()) } returns null
    every { style.addPersistentStyleLayer(any(), any()) } returns ExpectedFactory.createNone()
    every { style.addPersistentLayer(any(), any()) } just Runs
    every { style.setStyleLayerProperty(any(), any(), any()) } returns mockk()
    every { style.styleSourceExists(any()) } returns false
    every { style.styleLayerExists(any()) } returns false
    every { style.removeStyleLayer(any()) } returns mockk()
    every { style.removeStyleSource(any()) } returns mockk()
    every { style.pixelRatio } returns 1.0f
    every { delegateProvider.mapPluginProviderDelegate.getPlugin<GesturesPlugin>(any()) } returns gesturesPlugin
    every { delegateProvider.mapCameraManagerDelegate } returns mapCameraManagerDelegate
    every { delegateProvider.mapInteractionDelegate } returns mapInteractionDelegate
    every { delegateProvider.mapFeatureQueryDelegate } returns mockk()
    every { mapInteractionDelegate.addInteraction(any()) } returns Cancelable { }
    every { gesturesPlugin.getGesturesManager().moveGestureDetector } returns moveGestureDetector
    every { mapCameraManagerDelegate.coordinateForPixel(any()) } returns Point.fromLngLat(0.0, 0.0)
    every { mapCameraManagerDelegate.pixelForCoordinate(any()) } returns ScreenCoordinate(1.0, 1.0)
    every { mapCameraManagerDelegate.cameraState } returns mockk(relaxed = true)
    every { layer.layerId } returns "layer0"
    every { source.sourceId } returns "source0"
    every { source.featureCollection(any()) } answers { source }

    manager = PolylineAnnotationManager(delegateProvider)
    manager.layer = layer
    manager.source = source
    manager.dragLayer = dragLayer
    manager.dragSource = dragSource
    every { layer.lineJoin(any<Expression>()) } answers { layer }
    every { dragLayer.lineJoin(any<Expression>()) } answers { dragLayer }
    every { layer.lineSortKey(any<Expression>()) } answers { layer }
    every { dragLayer.lineSortKey(any<Expression>()) } answers { dragLayer }
    every { layer.lineZOffset(any<Expression>()) } answers { layer }
    every { dragLayer.lineZOffset(any<Expression>()) } answers { dragLayer }
    every { layer.lineBlur(any<Expression>()) } answers { layer }
    every { dragLayer.lineBlur(any<Expression>()) } answers { dragLayer }
    every { layer.lineBorderColor(any<Expression>()) } answers { layer }
    every { dragLayer.lineBorderColor(any<Expression>()) } answers { dragLayer }
    every { layer.lineBorderWidth(any<Expression>()) } answers { layer }
    every { dragLayer.lineBorderWidth(any<Expression>()) } answers { dragLayer }
    every { layer.lineColor(any<Expression>()) } answers { layer }
    every { dragLayer.lineColor(any<Expression>()) } answers { dragLayer }
    every { layer.lineGapWidth(any<Expression>()) } answers { layer }
    every { dragLayer.lineGapWidth(any<Expression>()) } answers { dragLayer }
    every { layer.lineOffset(any<Expression>()) } answers { layer }
    every { dragLayer.lineOffset(any<Expression>()) } answers { dragLayer }
    every { layer.lineOpacity(any<Expression>()) } answers { layer }
    every { dragLayer.lineOpacity(any<Expression>()) } answers { dragLayer }
    every { layer.linePattern(any<Expression>()) } answers { layer }
    every { dragLayer.linePattern(any<Expression>()) } answers { dragLayer }
    every { layer.lineWidth(any<Expression>()) } answers { layer }
    every { dragLayer.lineWidth(any<Expression>()) } answers { dragLayer }
    every { layer.lineBorderColorUseTheme(any<Expression>()) } answers { layer }
    every { dragLayer.lineBorderColorUseTheme(any<Expression>()) } answers { dragLayer }
    every { layer.lineColorUseTheme(any<Expression>()) } answers { layer }
    every { dragLayer.lineColorUseTheme(any<Expression>()) } answers { dragLayer }
  }

  @After
  fun cleanUp() {
    unmockkAll()
  }

  @Test
  fun initialize() {
    verify(exactly = 2) { mapInteractionDelegate.addInteraction(ofType(ClickInteraction::class)) }
    verify(exactly = 2) { mapInteractionDelegate.addInteraction(ofType(LongClickInteraction::class)) }
    verify(exactly = 2) { mapInteractionDelegate.addInteraction(ofType(DragInteraction::class)) }
    assertEquals(PolylineAnnotation.ID_KEY, manager.getAnnotationIdKey())
    verify { style.addPersistentLayer(any(), null) }
    every { style.styleLayerExists("test_layer") } returns true

    manager = PolylineAnnotationManager(delegateProvider, AnnotationConfig("test_layer"))
    verify { style.addPersistentLayer(any(), LayerPosition(null, "test_layer", null)) }

    manager.addClickListener(mockk())
    manager.addDragListener(mockk())
    manager.addLongClickListener(mockk())
    assertEquals(1, manager.dragListeners.size)
    assertEquals(1, manager.clickListeners.size)
    assertEquals(1, manager.longClickListeners.size)
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    manager.onDestroy()
    verify { style.removeStyleLayer(any()) }
    verify { style.removeStyleSource(any()) }
    assertTrue(manager.dragListeners.isEmpty())
    assertTrue(manager.clickListeners.isEmpty())
    assertTrue(manager.longClickListeners.isEmpty())
  }

  @Test
  fun initializeBeforeStyleLoad() {
    every { style.styleLayerExists("test_layer") } returns true
    val captureCallback = slot<(MapboxStyleManager) -> Unit>()
    every { delegateProvider.getStyle(capture(captureCallback)) } just Runs
    manager = PolylineAnnotationManager(delegateProvider, AnnotationConfig("test_layer"))
    // Style is not loaded, still create and add layer to style as it's persistent layer
    verify(exactly = 1) { style.addPersistentLayer(any(), LayerPosition(null, "test_layer", null)) }
    every { delegateProvider.getStyle(capture(captureCallback)) } answers {
      captureCallback.captured.invoke(style)
    }
    manager.create(
      PolylineAnnotationOptions()
        .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    )
    // Style is loaded, will create and add layer to style while creating annotations
    verify(exactly = 1) { style.addPersistentLayer(any(), LayerPosition(null, "test_layer", null)) }
  }

  @Test
  fun createWithGeoJsonOptions() {
    manager = PolylineAnnotationManager(
      delegateProvider,
      AnnotationConfig(
        annotationSourceOptions = AnnotationSourceOptions(
          10, 20L, true, 10.0
        )
      )
    )

    val sourceString = manager.source.toString()
    assertTrue(sourceString.contains("maxzoom = 10"))
    assertTrue(sourceString.contains("lineMetrics = true"))
    assertTrue(sourceString.contains("buffer = 20"))
    assertTrue(sourceString.contains("tolerance = 10.0"))
  }

  @Test
  fun create() {
    val annotation = manager.create(
      PolylineAnnotationOptions()
        .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    )
    assertEquals(annotation, manager.annotations[0])
  }

  @Test
  fun createFromFeature() {
    val featureCollection =
      FeatureCollection.fromFeature(Feature.fromGeometry(LineString.fromLngLats(listOf(Point.fromLngLat(0.0, 0.0)))))
    val annotations = manager.create(featureCollection.toJson())
    assertEquals(annotations.first(), manager.annotations[0])
    val annotations1 = manager.create(featureCollection)
    assertEquals(annotations1.first(), manager.annotations[1])
  }

  @Test
  fun createList() {
    val list = listOf(
      PolylineAnnotationOptions().withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0))),
      PolylineAnnotationOptions().withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    )
    val annotations = manager.create(list)
    assertEquals(annotations[0], manager.annotations[0])
    assertEquals(annotations[1], manager.annotations[1])
  }

  @Test
  fun update() {
    val annotation = manager.create(PolylineAnnotationOptions().withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0))))
    assertEquals(annotation, manager.annotations[0])
    annotation.points = listOf(Point.fromLngLat(1.0, 1.0), Point.fromLngLat(1.0, 1.0))
    manager.update(annotation)
    assertEquals(annotation, manager.annotations[0])
  }

  @Test
  fun annotationPropertiesUpdate() {
    val annotation = manager.create(PolylineAnnotationOptions().withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0))))

    annotation.lineJoin = LineJoin.BEVEL
    assertEquals(LineJoin.BEVEL, annotation.lineJoin)
    annotation.lineJoin = null
    assertNull(annotation.lineJoin)

    annotation.lineSortKey = 1.0
    assertEquals(1.0, annotation.lineSortKey)
    annotation.lineSortKey = null
    assertNull(annotation.lineSortKey)

    annotation.lineZOffset = 0.0
    assertEquals(0.0, annotation.lineZOffset)
    annotation.lineZOffset = null
    assertNull(annotation.lineZOffset)

    annotation.lineBlur = 0.0
    assertEquals(0.0, annotation.lineBlur)
    annotation.lineBlur = null
    assertNull(annotation.lineBlur)

    annotation.lineBorderColorInt = Color.BLACK
    assertEquals(Color.BLACK, annotation.lineBorderColorInt)
    annotation.lineBorderColorInt = null
    assertNull(annotation.lineBorderColorInt)

    annotation.lineBorderColorString = ColorUtils.colorToRgbaString(Color.YELLOW)
    assertEquals(ColorUtils.colorToRgbaString(Color.YELLOW), annotation.lineBorderColorString)
    annotation.lineBorderColorString = null
    assertNull(annotation.lineBorderColorString)

    annotation.lineBorderWidth = 0.0
    assertEquals(0.0, annotation.lineBorderWidth)
    annotation.lineBorderWidth = null
    assertNull(annotation.lineBorderWidth)

    annotation.lineColorInt = Color.BLACK
    assertEquals(Color.BLACK, annotation.lineColorInt)
    annotation.lineColorInt = null
    assertNull(annotation.lineColorInt)

    annotation.lineColorString = ColorUtils.colorToRgbaString(Color.YELLOW)
    assertEquals(ColorUtils.colorToRgbaString(Color.YELLOW), annotation.lineColorString)
    annotation.lineColorString = null
    assertNull(annotation.lineColorString)

    annotation.lineGapWidth = 0.0
    assertEquals(0.0, annotation.lineGapWidth)
    annotation.lineGapWidth = null
    assertNull(annotation.lineGapWidth)

    annotation.lineOffset = 0.0
    assertEquals(0.0, annotation.lineOffset)
    annotation.lineOffset = null
    assertNull(annotation.lineOffset)

    annotation.lineOpacity = 1.0
    assertEquals(1.0, annotation.lineOpacity)
    annotation.lineOpacity = null
    assertNull(annotation.lineOpacity)

    annotation.linePattern = "pedestrian-polygon"
    assertEquals("pedestrian-polygon", annotation.linePattern)
    annotation.linePattern = null
    assertNull(annotation.linePattern)

    annotation.lineWidth = 1.0
    assertEquals(1.0, annotation.lineWidth)
    annotation.lineWidth = null
    assertNull(annotation.lineWidth)

    annotation.lineBorderColorUseTheme = "default"
    assertEquals("default", annotation.lineBorderColorUseTheme)
    annotation.lineBorderColorUseTheme = null
    assertNull(annotation.lineBorderColorUseTheme)

    annotation.lineColorUseTheme = "default"
    assertEquals("default", annotation.lineColorUseTheme)
    annotation.lineColorUseTheme = null
    assertNull(annotation.lineColorUseTheme)
  }

  @Test
  fun updateList() {
    val list = listOf(
      PolylineAnnotationOptions().withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0))),
      PolylineAnnotationOptions().withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    )
    val annotations = manager.create(list)
    assertEquals(annotations[0], manager.annotations[0])
    assertEquals(annotations[1], manager.annotations[1])
    annotations[0].points = listOf(Point.fromLngLat(1.0, 0.0), Point.fromLngLat(1.0, 0.0))
    annotations[1].points = listOf(Point.fromLngLat(1.0, 0.0), Point.fromLngLat(1.0, 0.0))
    manager.update(annotations)
    assertEquals(annotations[0], manager.annotations[0])
    assertEquals(annotations[1], manager.annotations[1])
  }

  @Test
  fun delete() {
    val annotation = manager.create(
      PolylineAnnotationOptions()
        .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    )
    assertEquals(annotation, manager.annotations[0])
    manager.delete(annotation)
    assertTrue(manager.annotations.isEmpty())
  }

  @Test
  fun deleteList() {
    val list = listOf(
      PolylineAnnotationOptions().withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0))),
      PolylineAnnotationOptions().withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    )
    val annotations = manager.create(list)
    assertEquals(annotations[0], manager.annotations[0])
    assertEquals(annotations[1], manager.annotations[1])

    manager.delete(annotations)
    assertTrue(manager.annotations.isEmpty())
  }

  @Test
  fun deleteAll() {
    val list = listOf(
      PolylineAnnotationOptions().withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0))),
      PolylineAnnotationOptions().withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    )
    val annotations = manager.create(list)
    assertEquals(annotations[0], manager.annotations[0])
    assertEquals(annotations[1], manager.annotations[1])

    manager.deleteAll()
    assertTrue(manager.annotations.isEmpty())
  }

  @Test
  fun clickWithNoAnnotation() {
    mockkObject(ClickInteraction.Companion)
    val onClickLayerIdSlot = slot<((FeaturesetFeature<FeatureState>, InteractionContext) -> Boolean)>()
    val customLayerId = "customLayerId"
    every {
      ClickInteraction.layer(id = customLayerId, filter = any(), onClick = capture(onClickLayerIdSlot))
    } answers {
      mockk()
    }
    every {
      ClickInteraction.layer(
        id = any(),
        filter = any(),
        onClick = { _, _ -> return@layer false }
      )
    } returns mockk()
    val manager = PolylineAnnotationManager(
      delegateProvider,
      annotationConfig = AnnotationConfig(layerId = customLayerId)
    )

    val listener = mockk<OnPolylineAnnotationClickListener>()
    every { listener.onAnnotationClick(any()) } returns false
    manager.addClickListener(listener)

    every { feature.properties() } returns JsonObject().apply {
      addProperty(PolylineAnnotation.ID_KEY, "incorrectId")
    }
    every { feature.id() } returns "featureId"
    every { feature.geometry() } returns Point.fromLngLat(0.0, 0.0)

    onClickLayerIdSlot.captured.invoke(
      FeaturesetFeature(
        id = FeaturesetFeatureId(feature.id()!!, null),
        descriptor = TypedFeaturesetDescriptor.Layer(customLayerId),
        originalFeature = feature,
        state = FeatureState { }
      ),
      InteractionContext(
        CoordinateInfo(
          Point.fromLngLat(0.0, 0.0),
          true
        ),
        ScreenCoordinate(0.0, 0.0)
      )
    )
    verify(exactly = 0) { listener.onAnnotationClick(any()) }
    unmockkObject(ClickInteraction.Companion)
  }

  @Test
  fun click() {
    mockkObject(ClickInteraction.Companion)
    val onClickLayerIdSlot = slot<((FeaturesetFeature<FeatureState>, InteractionContext) -> Boolean)>()
    val customLayerId = "customLayerId"
    every {
      ClickInteraction.layer(id = customLayerId, filter = any(), onClick = capture(onClickLayerIdSlot))
    } answers {
      mockk()
    }
    every {
      ClickInteraction.layer(
        id = any(),
        filter = any(),
        onClick = { _, _ -> return@layer false }
      )
    } returns mockk()
    val manager = PolylineAnnotationManager(
      delegateProvider,
      annotationConfig = AnnotationConfig(layerId = customLayerId)
    )
    val annotation = manager.create(
      PolylineAnnotationOptions()
        .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    )
    assertEquals(annotation, manager.annotations[0])
    every { feature.getProperty(any()).asString } returns annotation.id

    val listener = mockk<OnPolylineAnnotationClickListener>()
    every { listener.onAnnotationClick(any()) } returns true
    manager.addClickListener(listener)

    val interactionListener = mockk<OnPolylineAnnotationInteractionListener>()
    every { interactionListener.onSelectAnnotation(any()) } just Runs
    every { interactionListener.onDeselectAnnotation(any()) } just Runs
    manager.addInteractionListener(interactionListener)

    every { feature.properties() } returns JsonObject().apply {
      addProperty(PolylineAnnotation.ID_KEY, annotation.id)
    }
    every { feature.id() } returns "featureId"
    every { feature.geometry() } returns Point.fromLngLat(0.0, 0.0)

   onClickLayerIdSlot.captured.invoke(
      FeaturesetFeature(
        id = FeaturesetFeatureId(feature.id()!!, null),
        descriptor = TypedFeaturesetDescriptor.Layer(customLayerId),
        originalFeature = feature,
        state = FeatureState { }
      ),
      InteractionContext(
        CoordinateInfo(
          Point.fromLngLat(0.0, 0.0),
          true
        ),
        ScreenCoordinate(0.0, 0.0)
      )
    )
    verify { listener.onAnnotationClick(annotation) }
    verify { interactionListener.onSelectAnnotation(annotation) }

    every { feature.properties() } returns JsonObject().apply {
      addProperty(PolylineAnnotation.ID_KEY, annotation.id)
    }
    every { feature.id() } returns "featureId"
    every { feature.geometry() } returns Point.fromLngLat(0.0, 0.0)

    onClickLayerIdSlot.captured.invoke(
      FeaturesetFeature(
        id = FeaturesetFeatureId(feature.id()!!, null),
        descriptor = TypedFeaturesetDescriptor.Layer(annotation.id),
        originalFeature = feature,
        state = FeatureState { }
      ),
      InteractionContext(
        CoordinateInfo(
          Point.fromLngLat(0.0, 0.0),
          true
        ),
        ScreenCoordinate(0.0, 0.0)
      )
    )
    verify { interactionListener.onDeselectAnnotation(annotation) }

    manager.removeClickListener(listener)
    assertTrue(manager.clickListeners.isEmpty())
    manager.removeInteractionListener(interactionListener)
    assertTrue(manager.interactionListener.isEmpty())
    unmockkObject(ClickInteraction.Companion)
  }

  @Test
  fun longClick() {
    mockkObject(LongClickInteraction.Companion)
    val onLongClickLayerIdSlot = slot<((FeaturesetFeature<FeatureState>, InteractionContext) -> Boolean)>()
    val customLayerId = "customLayerId"
    every {
      LongClickInteraction.layer(id = customLayerId, filter = any(), onLongClick = capture(onLongClickLayerIdSlot))
    } answers {
      mockk()
    }
    every {
      LongClickInteraction.layer(
        id = any(),
        filter = any(),
        onLongClick = { _, _ -> return@layer false }
      )
    } returns mockk()
    val manager = PolylineAnnotationManager(
      delegateProvider,
      annotationConfig = AnnotationConfig(layerId = customLayerId)
    )

    val annotation = manager.create(
      PolylineAnnotationOptions()
        .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    )
    assertEquals(annotation, manager.annotations[0])
    every { feature.getProperty(any()).asString } returns annotation.id

    val listener = mockk<OnPolylineAnnotationLongClickListener>()
    every { listener.onAnnotationLongClick(any()) } returns false
    manager.addLongClickListener(listener)

    every { feature.properties() } returns JsonObject().apply {
      addProperty(PolylineAnnotation.ID_KEY, annotation.id)
    }
    every { feature.id() } returns "featureId"
    every { feature.geometry() } returns Point.fromLngLat(0.0, 0.0)

    onLongClickLayerIdSlot.captured.invoke(
      FeaturesetFeature(
        id = FeaturesetFeatureId(feature.id()!!, null),
        descriptor = TypedFeaturesetDescriptor.Layer(customLayerId),
        originalFeature = feature,
        state = FeatureState { }
      ),
      InteractionContext(
        CoordinateInfo(
          Point.fromLngLat(0.0, 0.0),
          true
        ),
        ScreenCoordinate(0.0, 0.0)
      )
    )
    verify { listener.onAnnotationLongClick(annotation) }

    manager.removeLongClickListener(listener)
    assertTrue(manager.longClickListeners.isEmpty())
    unmockkObject(LongClickInteraction.Companion)
  }

  @Test
  fun drag() {
    mockkObject(DragInteraction.Companion)
    val onDragBeginLayerIdSlot = slot<((FeaturesetFeature<FeatureState>, InteractionContext) -> Boolean)>()
    val onDragSlot = slot<((InteractionContext) -> Unit)>()
    val onDragEndSlot = slot<((InteractionContext) -> Unit)>()
    val customLayerId = "customLayerId"
    every {
      DragInteraction.layer(
        id = customLayerId,
        filter = any(),
        onDragBegin = capture(onDragBeginLayerIdSlot),
        onDrag = capture(onDragSlot),
        onDragEnd = capture(onDragEndSlot)
      )
    } answers {
      mockk()
    }
    every {
      DragInteraction.layer(
        id = any(),
        filter = any(),
        onDragBegin = { _, _ -> return@layer false },
        onDrag = { },
        onDragEnd = { }
      )
    } returns mockk()
    val manager = PolylineAnnotationManager(
      delegateProvider,
      annotationConfig = AnnotationConfig(layerId = customLayerId)
    )
    manager.onSizeChanged(100, 100)
    val annotation = manager.create(
      PolylineAnnotationOptions()
        .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    )
    assertEquals(annotation, manager.annotations[0])

    every { feature.getProperty(any()).asString } returns annotation.id

    val listener = mockk<OnPolylineAnnotationDragListener>(relaxed = true)
    manager.addDragListener(listener)

    annotation.isDraggable = true
    val pointF = PointF(0f, 0f)
    every { moveGestureDetector.pointersCount } returns 1
    every { moveGestureDetector.focalPoint } returns pointF

    every { feature.properties() } returns JsonObject().apply {
      addProperty(PolylineAnnotation.ID_KEY, annotation.id)
    }
    every { feature.id() } returns "featureId"
    every { feature.geometry() } returns Point.fromLngLat(0.0, 0.0)

    onDragBeginLayerIdSlot.captured.invoke(
      FeaturesetFeature(
        id = FeaturesetFeatureId(feature.id()!!, null),
        descriptor = TypedFeaturesetDescriptor.Layer(customLayerId),
        originalFeature = feature,
        state = FeatureState { }
      ),
      InteractionContext(
        CoordinateInfo(
          Point.fromLngLat(0.0, 0.0),
          true
        ),
        ScreenCoordinate(0.0, 0.0)
      )
    )
    verify { listener.onAnnotationDragStarted(annotation) }
    assertEquals(1, manager.annotations.size)

    val moveDistancesObject = mockk<MoveDistancesObject>()
    every { moveDistancesObject.currentX } returns 1f
    every { moveDistancesObject.currentY } returns 1f
    every { moveDistancesObject.distanceXSinceLast } returns 1f
    every { moveDistancesObject.distanceYSinceLast } returns 1f
    every { moveGestureDetector.getMoveObject(any()) } returns moveDistancesObject
    onDragSlot.captured.invoke(
      InteractionContext(
        CoordinateInfo(
          Point.fromLngLat(0.0, 0.0),
          true
        ),
        ScreenCoordinate(0.0, 0.0)
      )
    )
    verify { listener.onAnnotationDrag(annotation) }
    assertEquals(1, manager.annotations.size)

    onDragEndSlot.captured.invoke(
      InteractionContext(
        CoordinateInfo(
          Point.fromLngLat(0.0, 0.0),
          true
        ),
        ScreenCoordinate(0.0, 0.0)
      )
    )
    verify { listener.onAnnotationDragFinished(annotation) }

    manager.removeDragListener(listener)
    assertTrue(manager.dragListeners.isEmpty())
    assertEquals(1, manager.annotations.size)

    // Verify update after drag
    annotation.points = listOf(Point.fromLngLat(1.0, 1.0), Point.fromLngLat(1.0, 1.0))
    manager.update(annotation)
    assertEquals(annotation, manager.annotations[0])

    // Verify delete after drag
    manager.delete(annotation)
    assertTrue(manager.annotations.isEmpty())
    unmockkObject(DragInteraction.Companion)
  }

  @Test
  fun testScaleDoesNotTriggerDrag() {
    mockkObject(DragInteraction.Companion)
    val onDragBeginLayerIdSlot = slot<((FeaturesetFeature<FeatureState>, InteractionContext) -> Boolean)>()
    val onDragSlot = slot<((InteractionContext) -> Unit)>()
    val onDragEndSlot = slot<((InteractionContext) -> Unit)>()
    val customLayerId = "customLayerId"
    every {
      DragInteraction.layer(
        id = customLayerId,
        filter = any(),
        onDragBegin = capture(onDragBeginLayerIdSlot),
        onDrag = capture(onDragSlot),
        onDragEnd = capture(onDragEndSlot)
      )
    } answers {
      mockk()
    }
    every {
      DragInteraction.layer(
        id = any(),
        filter = any(),
        onDragBegin = { _, _ -> return@layer false },
        onDrag = { },
        onDragEnd = { }
      )
    } returns mockk()
    every { mapInteractionDelegate.dispatch(any()) } just runs
    val manager = PolylineAnnotationManager(
      delegateProvider,
      annotationConfig = AnnotationConfig(layerId = customLayerId)
    )
    manager.onSizeChanged(100, 100)
    val annotation = manager.create(
      PolylineAnnotationOptions()
        .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    )
    assertEquals(annotation, manager.annotations[0])

    every { feature.getProperty(any()).asString } returns annotation.id

    val listener = mockk<OnPolylineAnnotationDragListener>(relaxed = true)
    manager.addDragListener(listener)

    annotation.isDraggable = true
    val pointF = PointF(0f, 0f)
    every { moveGestureDetector.pointersCount } returns 2
    every { moveGestureDetector.focalPoint } returns pointF

    every { feature.properties() } returns JsonObject().apply {
      addProperty(PolylineAnnotation.ID_KEY, annotation.id)
    }
    every { feature.id() } returns "featureId"
    every { feature.geometry() } returns Point.fromLngLat(0.0, 0.0)

    onDragBeginLayerIdSlot.captured.invoke(
      FeaturesetFeature(
        id = FeaturesetFeatureId(feature.id()!!, null),
        descriptor = TypedFeaturesetDescriptor.Layer(customLayerId),
        originalFeature = feature,
        state = FeatureState { }
      ),
      InteractionContext(
        CoordinateInfo(
          Point.fromLngLat(0.0, 0.0),
          true
        ),
        ScreenCoordinate(0.0, 0.0)
      )
    )
    verify { listener.onAnnotationDragStarted(annotation) }
    assertEquals(1, manager.annotations.size)

    val moveDistancesObject = mockk<MoveDistancesObject>()
    every { moveDistancesObject.currentX } returns 1f
    every { moveDistancesObject.currentY } returns 1f
    every { moveDistancesObject.distanceXSinceLast } returns 1f
    every { moveDistancesObject.distanceYSinceLast } returns 1f
    every { moveGestureDetector.getMoveObject(any()) } returns moveDistancesObject
    onDragSlot.captured.invoke(
      InteractionContext(
        CoordinateInfo(
          Point.fromLngLat(0.0, 0.0),
          true
        ),
        ScreenCoordinate(0.0, 0.0)
      )
    )
    verify(exactly = 0) { listener.onAnnotationDrag(annotation) }
    verify(exactly = 1) { listener.onAnnotationDragFinished(annotation) }

    manager.removeDragListener(listener)
    assertTrue(manager.dragListeners.isEmpty())
    assertEquals(1, manager.annotations.size)

    // Verify update after drag
    annotation.points = listOf(Point.fromLngLat(1.0, 1.0), Point.fromLngLat(1.0, 1.0))
    manager.update(annotation)
    assertEquals(annotation, manager.annotations[0])

    // Verify delete after drag
    manager.delete(annotation)
    assertTrue(manager.annotations.isEmpty())
    unmockkObject(DragInteraction.Companion)
  }

  @Test
  fun testLineJoinLayerProperty() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineJoin(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_JOIN)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
      .withLineJoin(LineJoin.MITER)
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineJoin(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_JOIN)) }
    verify(exactly = 1) { manager.dragLayer.lineJoin(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_JOIN)) }
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineJoin(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_JOIN)) }
    verify(exactly = 1) { manager.dragLayer.lineJoin(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_JOIN)) }
  }

  @Test
  fun testLineJoinInAnnotationManager() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineJoin(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_JOIN)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    manager.lineJoin = LineJoin.MITER
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineJoin(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_JOIN)) }
    verify(exactly = 1) { manager.dragLayer.lineJoin(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_JOIN)) }
  }

  @Test
  fun testLineSortKeyLayerProperty() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineSortKey(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
      .withLineSortKey(1.0)
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineSortKey(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY)) }
    verify(exactly = 1) { manager.dragLayer.lineSortKey(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY)) }
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineSortKey(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY)) }
    verify(exactly = 1) { manager.dragLayer.lineSortKey(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY)) }
  }

  @Test
  fun testLineSortKeyInAnnotationManager() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineSortKey(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    manager.lineSortKey = 1.0
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineSortKey(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY)) }
    verify(exactly = 1) { manager.dragLayer.lineSortKey(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY)) }
  }

  @Test
  fun testLineZOffsetLayerProperty() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineZOffset(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
      .withLineZOffset(0.0)
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineZOffset(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET)) }
    verify(exactly = 1) { manager.dragLayer.lineZOffset(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET)) }
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineZOffset(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET)) }
    verify(exactly = 1) { manager.dragLayer.lineZOffset(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET)) }
  }

  @Test
  fun testLineZOffsetInAnnotationManager() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineZOffset(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    manager.lineZOffset = 0.0
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineZOffset(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET)) }
    verify(exactly = 1) { manager.dragLayer.lineZOffset(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET)) }
  }

  @Test
  fun testLineBlurLayerProperty() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineBlur(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BLUR)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
      .withLineBlur(0.0)
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineBlur(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BLUR)) }
    verify(exactly = 1) { manager.dragLayer.lineBlur(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BLUR)) }
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineBlur(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BLUR)) }
    verify(exactly = 1) { manager.dragLayer.lineBlur(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BLUR)) }
  }

  @Test
  fun testLineBlurInAnnotationManager() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineBlur(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BLUR)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    manager.lineBlur = 0.0
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineBlur(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BLUR)) }
    verify(exactly = 1) { manager.dragLayer.lineBlur(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BLUR)) }
  }

  @Test
  fun testLineBorderColorIntLayerProperty() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineBorderColor(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
      .withLineBorderColor(Color.YELLOW)
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineBorderColor(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR)) }
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineBorderColor(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR)) }
  }

  @Test
  fun testLineBorderColorLayerProperty() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineBorderColor(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
      .withLineBorderColor("rgba(0, 0, 0, 1)")
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineBorderColor(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR)) }
    verify(exactly = 1) { manager.dragLayer.lineBorderColor(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR)) }
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineBorderColor(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR)) }
    verify(exactly = 1) { manager.dragLayer.lineBorderColor(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR)) }
  }

  @Test
  fun testLineBorderColorInAnnotationManager() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineBorderColor(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    manager.lineBorderColorString = "rgba(0, 0, 0, 1)"
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineBorderColor(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR)) }
    verify(exactly = 1) { manager.dragLayer.lineBorderColor(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR)) }
  }

  @Test
  fun testLineBorderWidthLayerProperty() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineBorderWidth(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
      .withLineBorderWidth(0.0)
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineBorderWidth(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH)) }
    verify(exactly = 1) { manager.dragLayer.lineBorderWidth(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH)) }
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineBorderWidth(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH)) }
    verify(exactly = 1) { manager.dragLayer.lineBorderWidth(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH)) }
  }

  @Test
  fun testLineBorderWidthInAnnotationManager() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineBorderWidth(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    manager.lineBorderWidth = 0.0
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineBorderWidth(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH)) }
    verify(exactly = 1) { manager.dragLayer.lineBorderWidth(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH)) }
  }

  @Test
  fun testLineColorIntLayerProperty() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineColor(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
      .withLineColor(Color.YELLOW)
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineColor(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR)) }
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineColor(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR)) }
  }

  @Test
  fun testLineColorLayerProperty() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineColor(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
      .withLineColor("rgba(0, 0, 0, 1)")
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineColor(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR)) }
    verify(exactly = 1) { manager.dragLayer.lineColor(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR)) }
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineColor(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR)) }
    verify(exactly = 1) { manager.dragLayer.lineColor(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR)) }
  }

  @Test
  fun testLineColorInAnnotationManager() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineColor(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    manager.lineColorString = "rgba(0, 0, 0, 1)"
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineColor(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR)) }
    verify(exactly = 1) { manager.dragLayer.lineColor(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR)) }
  }

  @Test
  fun testLineGapWidthLayerProperty() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineGapWidth(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
      .withLineGapWidth(0.0)
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineGapWidth(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH)) }
    verify(exactly = 1) { manager.dragLayer.lineGapWidth(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH)) }
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineGapWidth(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH)) }
    verify(exactly = 1) { manager.dragLayer.lineGapWidth(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH)) }
  }

  @Test
  fun testLineGapWidthInAnnotationManager() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineGapWidth(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    manager.lineGapWidth = 0.0
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineGapWidth(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH)) }
    verify(exactly = 1) { manager.dragLayer.lineGapWidth(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH)) }
  }

  @Test
  fun testLineOffsetLayerProperty() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineOffset(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
      .withLineOffset(0.0)
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineOffset(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET)) }
    verify(exactly = 1) { manager.dragLayer.lineOffset(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET)) }
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineOffset(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET)) }
    verify(exactly = 1) { manager.dragLayer.lineOffset(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET)) }
  }

  @Test
  fun testLineOffsetInAnnotationManager() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineOffset(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    manager.lineOffset = 0.0
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineOffset(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET)) }
    verify(exactly = 1) { manager.dragLayer.lineOffset(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET)) }
  }

  @Test
  fun testLineOpacityLayerProperty() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineOpacity(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
      .withLineOpacity(1.0)
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineOpacity(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY)) }
    verify(exactly = 1) { manager.dragLayer.lineOpacity(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY)) }
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineOpacity(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY)) }
    verify(exactly = 1) { manager.dragLayer.lineOpacity(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY)) }
  }

  @Test
  fun testLineOpacityInAnnotationManager() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineOpacity(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    manager.lineOpacity = 1.0
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineOpacity(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY)) }
    verify(exactly = 1) { manager.dragLayer.lineOpacity(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY)) }
  }

  @Test
  fun testLinePatternLayerProperty() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.linePattern(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
      .withLinePattern("pedestrian-polygon")
    manager.create(options)
    verify(exactly = 1) { manager.layer.linePattern(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN)) }
    verify(exactly = 1) { manager.dragLayer.linePattern(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN)) }
    manager.create(options)
    verify(exactly = 1) { manager.layer.linePattern(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN)) }
    verify(exactly = 1) { manager.dragLayer.linePattern(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN)) }
  }

  @Test
  fun testLinePatternInAnnotationManager() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.linePattern(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    manager.linePattern = "pedestrian-polygon"
    manager.create(options)
    verify(exactly = 1) { manager.layer.linePattern(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN)) }
    verify(exactly = 1) { manager.dragLayer.linePattern(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN)) }
  }

  @Test
  fun testLineWidthLayerProperty() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineWidth(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
      .withLineWidth(1.0)
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineWidth(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH)) }
    verify(exactly = 1) { manager.dragLayer.lineWidth(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH)) }
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineWidth(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH)) }
    verify(exactly = 1) { manager.dragLayer.lineWidth(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH)) }
  }

  @Test
  fun testLineWidthInAnnotationManager() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineWidth(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    manager.lineWidth = 1.0
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineWidth(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH)) }
    verify(exactly = 1) { manager.dragLayer.lineWidth(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH)) }
  }

  @Test
  fun testLineBorderColorUseThemeLayerProperty() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineBorderColorUseTheme(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
      .withLineBorderColorUseTheme("default")
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineBorderColorUseTheme(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME)) }
    verify(exactly = 1) { manager.dragLayer.lineBorderColorUseTheme(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME)) }
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineBorderColorUseTheme(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME)) }
    verify(exactly = 1) { manager.dragLayer.lineBorderColorUseTheme(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME)) }
  }

  @Test
  fun testLineBorderColorUseThemeInAnnotationManager() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineBorderColorUseTheme(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    manager.lineBorderColorUseTheme = "default"
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineBorderColorUseTheme(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME)) }
    verify(exactly = 1) { manager.dragLayer.lineBorderColorUseTheme(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME)) }
  }

  @Test
  fun testLineColorUseThemeLayerProperty() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineColorUseTheme(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
      .withLineColorUseTheme("default")
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineColorUseTheme(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME)) }
    verify(exactly = 1) { manager.dragLayer.lineColorUseTheme(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME)) }
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineColorUseTheme(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME)) }
    verify(exactly = 1) { manager.dragLayer.lineColorUseTheme(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME)) }
  }

  @Test
  fun testLineColorUseThemeInAnnotationManager() {
    every { style.styleSourceExists(any()) } returns true
    every { style.styleLayerExists(any()) } returns true
    verify(exactly = 0) { manager.layer.lineColorUseTheme(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME)) }
    val options = PolylineAnnotationOptions()
      .withPoints(listOf(Point.fromLngLat(0.0, 0.0), Point.fromLngLat(0.0, 0.0)))
    manager.lineColorUseTheme = "default"
    manager.create(options)
    verify(exactly = 1) { manager.layer.lineColorUseTheme(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME)) }
    verify(exactly = 1) { manager.dragLayer.lineColorUseTheme(Expression.get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME)) }
  }
}