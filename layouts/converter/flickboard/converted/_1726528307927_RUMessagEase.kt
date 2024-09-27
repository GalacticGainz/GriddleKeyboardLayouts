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



private val _RUMessagEase_button0_0 = makeClassicGestureButton(
	rowStart = 0, colStart = 0, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gesture(CLICK, simpleInput, threeChars = caseSensitive("с")),
		gesture(SWIPE_DOWN, simpleInput, threeChars = caseSensitive("ц")),
		gesture(SWIPE_DOWN_RIGHT, simpleInput, threeChars = caseSensitive("п")),
	)
)
private val _RUMessagEase_button0_1 = makeClassicGestureButton(
	rowStart = 0, colStart = 1, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gesture(SWIPE_UP, simpleInput, threeChars = caseSensitive("й")),
		gesture(CLICK, simpleInput, threeChars = caseSensitive("и")),
		gesture(SWIPE_DOWN, simpleInput, threeChars = caseSensitive("к")),
	)
)
private val _RUMessagEase_button0_2 = makeClassicGestureButton(
	rowStart = 0, colStart = 2, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gesture(CLICK, simpleInput, threeChars = caseSensitive("т")),
		gesture(SWIPE_DOWN_LEFT, simpleInput, threeChars = caseSensitive("ь")),
	)
)
private val _RUMessagEase_button1_0 = makeClassicGestureButton(
	rowStart = 1, colStart = 0, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gesture(CLICK, simpleInput, threeChars = caseSensitive("в")),
		gesture(SWIPE_UP, simpleInput, threeChars = caseSensitive("б")),
		gesture(SWIPE_RIGHT, simpleInput, threeChars = caseSensitive("ы")),
		gesture(SWIPE_DOWN, simpleInput, threeChars = caseSensitive("ъ")),
	)
)
private val _RUMessagEase_button1_1 = makeClassicGestureButton(
	rowStart = 1, colStart = 1, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gesture(CLICK, simpleInput, threeChars = caseSensitive("о")),
		gesture(SWIPE_UP_LEFT, simpleInput, threeChars = caseSensitive("ч")),
		gesture(SWIPE_UP, simpleInput, threeChars = caseSensitive("м")),
		gesture(SWIPE_UP_RIGHT, simpleInput, threeChars = caseSensitive("х")),
		gesture(SWIPE_LEFT, simpleInput, threeChars = caseSensitive("ж")),
		gesture(SWIPE_RIGHT, simpleInput, threeChars = caseSensitive("г")),
		gesture(SWIPE_DOWN_LEFT, simpleInput, threeChars = caseSensitive("щ")),
		gesture(SWIPE_DOWN, simpleInput, threeChars = caseSensitive("я")),
		gesture(SWIPE_DOWN_RIGHT, simpleInput, threeChars = caseSensitive("ш")),
	)
)
private val _RUMessagEase_button1_2 = makeClassicGestureButton(
	rowStart = 1, colStart = 2, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gesture(CLICK, simpleInput, threeChars = caseSensitive("а")),
		gesture(SWIPE_LEFT, simpleInput, threeChars = caseSensitive("л")),
	)
)
private val _RUMessagEase_button2_0 = makeClassicGestureButton(
	rowStart = 2, colStart = 0, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gesture(CLICK, simpleInput, threeChars = caseSensitive("е")),
		gesture(SWIPE_UP, simpleInput, threeChars = caseSensitive("ё")),
		gesture(SWIPE_UP_RIGHT, simpleInput, threeChars = caseSensitive("д")),
		gesture(SWIPE_RIGHT, simpleInput, threeChars = caseSensitive("э")),
	)
)
private val _RUMessagEase_button2_1 = makeClassicGestureButton(
	rowStart = 2, colStart = 1, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gesture(CLICK, simpleInput, threeChars = caseSensitive("р")),
		gesture(SWIPE_LEFT, simpleInput, threeChars = caseSensitive("ю")),
		gesture(SWIPE_UP, simpleInput, threeChars = caseSensitive("у")),
		gesture(SWIPE_RIGHT, simpleInput, threeChars = caseSensitive("з")),
	)
)
private val _RUMessagEase_button2_2 = makeClassicGestureButton(
	rowStart = 2, colStart = 2, rowSpan = 1, colSpan = 1,
	gestureSet = mutableSetOf(
		gesture(CLICK, simpleInput, threeChars = caseSensitive("н")),
		gesture(SWIPE_UP_LEFT, simpleInput, threeChars = caseSensitive("ф")),
	)
)