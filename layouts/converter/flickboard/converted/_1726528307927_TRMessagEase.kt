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
import org.galacticware.griddle.domain.keybinder.KeyBinder.Companion.gesture
import org.galacticware.griddle.domain.util.caseSensitive

/**
 * This file was generated by the FlickBoardConverter.kt script.
 * The original file should be kept in the same directory as this file.
 */



private val _TRMessagEase_button0_0 = makeClassicGestureButton(
	rowStart = 0, colStart = 0, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gesture(CLICK, simpleInput, threeStrings = caseSensitive("a")),
		gesture(SWIPE_DOWN, simpleInput, threeStrings = caseSensitive("ç")),
		gesture(SWIPE_DOWN_RIGHT, simpleInput, threeStrings = caseSensitive("v")),
	)
)
private val _TRMessagEase_button0_1 = makeClassicGestureButton(
	rowStart = 0, colStart = 1, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gesture(CLICK, simpleInput, threeStrings = caseSensitive("n")),
		gesture(SWIPE_DOWN, simpleInput, threeStrings = caseSensitive("l")),
	)
)
private val _TRMessagEase_button0_2 = makeClassicGestureButton(
	rowStart = 0, colStart = 2, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gesture(CLICK, simpleInput, threeStrings = caseSensitive("i")),
		gesture(SWIPE_DOWN_LEFT, simpleInput, threeStrings = caseSensitive("x")),
	)
)
private val _TRMessagEase_button1_0 = makeClassicGestureButton(
	rowStart = 1, colStart = 0, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gesture(CLICK, simpleInput, threeStrings = caseSensitive("h")),
		gesture(SWIPE_UP, simpleInput, threeStrings = caseSensitive("ö")),
		gesture(SWIPE_RIGHT, simpleInput, threeStrings = caseSensitive("k")),
		gesture(SWIPE_DOWN, simpleInput, threeStrings = caseSensitive("ğ")),
	)
)
private val _TRMessagEase_button1_1 = makeClassicGestureButton(
	rowStart = 1, colStart = 1, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gesture(CLICK, simpleInput, threeStrings = caseSensitive("o")),
		gesture(SWIPE_UP_LEFT, simpleInput, threeStrings = caseSensitive("q")),
		gesture(SWIPE_UP, simpleInput, threeStrings = caseSensitive("u")),
		gesture(SWIPE_UP_RIGHT, simpleInput, threeStrings = caseSensitive("p")),
		gesture(SWIPE_LEFT, simpleInput, threeStrings = caseSensitive("c")),
		gesture(SWIPE_RIGHT, simpleInput, threeStrings = caseSensitive("b")),
		gesture(SWIPE_DOWN_LEFT, simpleInput, threeStrings = caseSensitive("g")),
		gesture(SWIPE_DOWN, simpleInput, threeStrings = caseSensitive("d")),
		gesture(SWIPE_DOWN_RIGHT, simpleInput, threeStrings = caseSensitive("j")),
	)
)
private val _TRMessagEase_button1_2 = makeClassicGestureButton(
	rowStart = 1, colStart = 2, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gesture(CLICK, simpleInput, threeStrings = caseSensitive("r")),
		gesture(SWIPE_LEFT, simpleInput, threeStrings = caseSensitive("m")),
	)
)
private val _TRMessagEase_button2_0 = makeClassicGestureButton(
	rowStart = 2, colStart = 0, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gesture(CLICK, simpleInput, threeStrings = caseSensitive("t")),
		gesture(SWIPE_UP, simpleInput, threeStrings = caseSensitive("ü")),
		gesture(SWIPE_UP_RIGHT, simpleInput, threeStrings = caseSensitive("y")),
	)
)
private val _TRMessagEase_button2_1 = makeClassicGestureButton(
	rowStart = 2, colStart = 1, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gesture(CLICK, simpleInput, threeStrings = caseSensitive("e")),
		gesture(SWIPE_UP, simpleInput, threeStrings = caseSensitive("w")),
		gesture(SWIPE_RIGHT, simpleInput, threeStrings = caseSensitive("z")),
	)
)
private val _TRMessagEase_button2_2 = makeClassicGestureButton(
	rowStart = 2, colStart = 2, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gesture(CLICK, simpleInput, threeStrings = caseSensitive("s")),
		gesture(SWIPE_UP_LEFT, simpleInput, threeStrings = caseSensitive("f")),
		gesture(SWIPE_LEFT, simpleInput, threeStrings = caseSensitive("ş")),
	)
)