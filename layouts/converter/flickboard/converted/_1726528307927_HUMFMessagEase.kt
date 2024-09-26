package org.galacticware.griddle.keyboarddefinition.layouts.converter.flickboard.converted

//import org.galacticware.griddle.model.operation.shiftBoardLeft
//import org.galacticware.griddle.model.operation.shiftBoardRight
import org.galacticware.griddle.domain.operation.simpleInput
import org.galacticware.griddle.domain.gesture.GestureType.CLICK
import org.galacticware.griddle.domain.gesture.GestureType.SWIPE_DOWN
import org.galacticware.griddle.domain.gesture.GestureType.SWIPE_DOWN_LEFT
import org.galacticware.griddle.domain.gesture.GestureType.SWIPE_DOWN_RIGHT
import org.galacticware.griddle.domain.gesture.GestureType.SWIPE_LEFT
import org.galacticware.griddle.domain.gesture.GestureType.SWIPE_RIGHT
import org.galacticware.griddle.domain.gesture.GestureType.SWIPE_UP
import org.galacticware.griddle.domain.gesture.GestureType.SWIPE_UP_LEFT
import org.galacticware.griddle.domain.gesture.GestureType.SWIPE_UP_RIGHT
import org.galacticware.griddle.domain.griddlebutton.builder.GriddleButtonBuilder.Companion.makeClassicGestureButton
import org.galacticware.griddle.domain.keybinder.KeyBinder.Companion.gestureSet
import org.galacticware.griddle.domain.util.caseSensitive

/**
 * This file was generated by the FlickBoardConverter.kt script.
 * The original file should be kept in the same directory as this file.
 */



private val _HUMFMessagEase_button0_0 = makeClassicGestureButton(
	rowStart = 0, colStart = 0, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gestureSet(CLICK, simpleInput, threeChars = caseSensitive("a")),
		gestureSet(SWIPE_DOWN, simpleInput, threeChars = caseSensitive("á")),
		gestureSet(SWIPE_DOWN_RIGHT, simpleInput, threeChars = caseSensitive("v")),
	)
)
private val _HUMFMessagEase_button0_1 = makeClassicGestureButton(
	rowStart = 0, colStart = 1, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gestureSet(CLICK, simpleInput, threeChars = caseSensitive("n")),
		gestureSet(SWIPE_DOWN, simpleInput, threeChars = caseSensitive("l")),
	)
)
private val _HUMFMessagEase_button0_2 = makeClassicGestureButton(
	rowStart = 0, colStart = 2, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gestureSet(CLICK, simpleInput, threeChars = caseSensitive("i")),
		gestureSet(SWIPE_DOWN_LEFT, simpleInput, threeChars = caseSensitive("x")),
		gestureSet(SWIPE_DOWN, simpleInput, threeChars = caseSensitive("í")),
	)
)
private val _HUMFMessagEase_button1_0 = makeClassicGestureButton(
	rowStart = 1, colStart = 0, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gestureSet(CLICK, simpleInput, threeChars = caseSensitive("h")),
		gestureSet(SWIPE_UP, simpleInput, threeChars = caseSensitive("ú")),
		gestureSet(SWIPE_UP_RIGHT, simpleInput, threeChars = caseSensitive("ö")),
		gestureSet(SWIPE_RIGHT, simpleInput, threeChars = caseSensitive("k")),
		gestureSet(SWIPE_DOWN, simpleInput, threeChars = caseSensitive("ó")),
		gestureSet(SWIPE_DOWN_RIGHT, simpleInput, threeChars = caseSensitive("ő")),
	)
)
private val _HUMFMessagEase_button1_1 = makeClassicGestureButton(
	rowStart = 1, colStart = 1, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gestureSet(CLICK, simpleInput, threeChars = caseSensitive("o")),
		gestureSet(SWIPE_UP_LEFT, simpleInput, threeChars = caseSensitive("q")),
		gestureSet(SWIPE_UP, simpleInput, threeChars = caseSensitive("u")),
		gestureSet(SWIPE_UP_RIGHT, simpleInput, threeChars = caseSensitive("p")),
		gestureSet(SWIPE_LEFT, simpleInput, threeChars = caseSensitive("c")),
		gestureSet(SWIPE_RIGHT, simpleInput, threeChars = caseSensitive("b")),
		gestureSet(SWIPE_DOWN_LEFT, simpleInput, threeChars = caseSensitive("g")),
		gestureSet(SWIPE_DOWN, simpleInput, threeChars = caseSensitive("d")),
		gestureSet(SWIPE_DOWN_RIGHT, simpleInput, threeChars = caseSensitive("j")),
	)
)
private val _HUMFMessagEase_button1_2 = makeClassicGestureButton(
	rowStart = 1, colStart = 2, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gestureSet(CLICK, simpleInput, threeChars = caseSensitive("r")),
		gestureSet(SWIPE_UP_LEFT, simpleInput, threeChars = caseSensitive("ü")),
		gestureSet(SWIPE_LEFT, simpleInput, threeChars = caseSensitive("m")),
		gestureSet(SWIPE_DOWN_LEFT, simpleInput, threeChars = caseSensitive("ű")),
	)
)
private val _HUMFMessagEase_button2_0 = makeClassicGestureButton(
	rowStart = 2, colStart = 0, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gestureSet(CLICK, simpleInput, threeChars = caseSensitive("t")),
		gestureSet(SWIPE_UP_RIGHT, simpleInput, threeChars = caseSensitive("y")),
	)
)
private val _HUMFMessagEase_button2_1 = makeClassicGestureButton(
	rowStart = 2, colStart = 1, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gestureSet(CLICK, simpleInput, threeChars = caseSensitive("e")),
		gestureSet(SWIPE_UP, simpleInput, threeChars = caseSensitive("w")),
		gestureSet(SWIPE_LEFT, simpleInput, threeChars = caseSensitive("é")),
		gestureSet(SWIPE_RIGHT, simpleInput, threeChars = caseSensitive("z")),
	)
)
private val _HUMFMessagEase_button2_2 = makeClassicGestureButton(
	rowStart = 2, colStart = 2, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gestureSet(CLICK, simpleInput, threeChars = caseSensitive("s")),
		gestureSet(SWIPE_UP_LEFT, simpleInput, threeChars = caseSensitive("f")),
	)
)