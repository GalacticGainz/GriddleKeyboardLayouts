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



private val _NOThumbKey_button0_0 = makeClassicGestureButton(
	rowStart = 0, colStart = 0, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gestureSet(CLICK, simpleInput, threeChars = caseSensitive("s")),
		gestureSet(SWIPE_DOWN_RIGHT, simpleInput, threeChars = caseSensitive("p")),
	)
)
private val _NOThumbKey_button0_1 = makeClassicGestureButton(
	rowStart = 0, colStart = 1, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gestureSet(CLICK, simpleInput, threeChars = caseSensitive("r")),
		gestureSet(SWIPE_DOWN, simpleInput, threeChars = caseSensitive("h")),
		gestureSet(SWIPE_LEFT, simpleInput, threeChars = caseSensitive("z")),
		gestureSet(SWIPE_RIGHT, simpleInput, threeChars = caseSensitive("q")),
	)
)
private val _NOThumbKey_button0_2 = makeClassicGestureButton(
	rowStart = 0, colStart = 2, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gestureSet(CLICK, simpleInput, threeChars = caseSensitive("o")),
		gestureSet(SWIPE_DOWN_LEFT, simpleInput, threeChars = caseSensitive("u")),
	)
)
private val _NOThumbKey_button1_0 = makeClassicGestureButton(
	rowStart = 1, colStart = 0, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gestureSet(CLICK, simpleInput, threeChars = caseSensitive("n")),
		gestureSet(SWIPE_RIGHT, simpleInput, threeChars = caseSensitive("v")),
	)
)
private val _NOThumbKey_button1_1 = makeClassicGestureButton(
	rowStart = 1, colStart = 1, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gestureSet(CLICK, simpleInput, threeChars = caseSensitive("d")),
		gestureSet(SWIPE_UP_LEFT, simpleInput, threeChars = caseSensitive("j")),
		gestureSet(SWIPE_UP, simpleInput, threeChars = caseSensitive("y")),
		gestureSet(SWIPE_UP_RIGHT, simpleInput, threeChars = caseSensitive("ø")),
		gestureSet(SWIPE_LEFT, simpleInput, threeChars = caseSensitive("c")),
		gestureSet(SWIPE_RIGHT, simpleInput, threeChars = caseSensitive("å")),
		gestureSet(SWIPE_DOWN_LEFT, simpleInput, threeChars = caseSensitive("b")),
		gestureSet(SWIPE_DOWN, simpleInput, threeChars = caseSensitive("f")),
		gestureSet(SWIPE_DOWN_RIGHT, simpleInput, threeChars = caseSensitive("æ")),
	)
)
private val _NOThumbKey_button1_2 = makeClassicGestureButton(
	rowStart = 1, colStart = 2, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gestureSet(CLICK, simpleInput, threeChars = caseSensitive("a")),
		gestureSet(SWIPE_LEFT, simpleInput, threeChars = caseSensitive("g")),
	)
)
private val _NOThumbKey_button2_0 = makeClassicGestureButton(
	rowStart = 2, colStart = 0, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gestureSet(CLICK, simpleInput, threeChars = caseSensitive("t")),
		gestureSet(SWIPE_UP_RIGHT, simpleInput, threeChars = caseSensitive("m")),
	)
)
private val _NOThumbKey_button2_1 = makeClassicGestureButton(
	rowStart = 2, colStart = 1, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gestureSet(CLICK, simpleInput, threeChars = caseSensitive("i")),
		gestureSet(SWIPE_UP, simpleInput, threeChars = caseSensitive("k")),
		gestureSet(SWIPE_RIGHT, simpleInput, threeChars = caseSensitive("x")),
		gestureSet(SWIPE_LEFT, simpleInput, threeChars = caseSensitive("w")),
	)
)
private val _NOThumbKey_button2_2 = makeClassicGestureButton(
	rowStart = 2, colStart = 2, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gestureSet(CLICK, simpleInput, threeChars = caseSensitive("e")),
		gestureSet(SWIPE_UP_LEFT, simpleInput, threeChars = caseSensitive("l")),
	)
)