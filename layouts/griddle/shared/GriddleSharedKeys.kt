package org.galacticware.griddle.keyboarddefinition.opensource.layouts.griddle.shared

import android.view.KeyEvent.KEYCODE_1
import android.view.KeyEvent.KEYCODE_2
import android.view.KeyEvent.KEYCODE_3
import android.view.KeyEvent.KEYCODE_4
import android.view.KeyEvent.KEYCODE_5
import android.view.KeyEvent.KEYCODE_6
import android.view.KeyEvent.KEYCODE_7
import android.view.KeyEvent.KEYCODE_8
import android.view.KeyEvent.KEYCODE_9
import android.view.KeyEvent.KEYCODE_A
import android.view.KeyEvent.KEYCODE_DEL
import android.view.KeyEvent.KEYCODE_DPAD_LEFT
import android.view.KeyEvent.KEYCODE_DPAD_RIGHT
import android.view.KeyEvent.KEYCODE_DPAD_UP
import android.view.KeyEvent.KEYCODE_F1
import android.view.KeyEvent.KEYCODE_F10
import android.view.KeyEvent.KEYCODE_F11
import android.view.KeyEvent.KEYCODE_F12
import android.view.KeyEvent.KEYCODE_F2
import android.view.KeyEvent.KEYCODE_F3
import android.view.KeyEvent.KEYCODE_F4
import android.view.KeyEvent.KEYCODE_F5
import android.view.KeyEvent.KEYCODE_F6
import android.view.KeyEvent.KEYCODE_F7
import android.view.KeyEvent.KEYCODE_F8
import android.view.KeyEvent.KEYCODE_F9
import android.view.KeyEvent.KEYCODE_FORWARD_DEL
import android.view.KeyEvent.KEYCODE_PAGE_DOWN
import android.view.KeyEvent.KEYCODE_PAGE_UP
import org.galacticware.griddle.domain.gesture.Gesture
import org.galacticware.griddle.domain.gesture.GestureType.BOOMERANG_DOWN
import org.galacticware.griddle.domain.gesture.GestureType.BOOMERANG_DOWN_RIGHT
import org.galacticware.griddle.domain.gesture.GestureType.BOOMERANG_LEFT
import org.galacticware.griddle.domain.gesture.GestureType.BOOMERANG_RIGHT
import org.galacticware.griddle.domain.gesture.GestureType.BOOMERANG_UP
import org.galacticware.griddle.domain.gesture.GestureType.BOOMERANG_UP_LEFT
import org.galacticware.griddle.domain.gesture.GestureType.BOOMERANG_UP_RIGHT
import org.galacticware.griddle.domain.gesture.GestureType.CIRCLE_ANTI_CLOCKWISE
import org.galacticware.griddle.domain.gesture.GestureType.CIRCLE_CLOCKWISE
import org.galacticware.griddle.domain.gesture.GestureType.CLICK
import org.galacticware.griddle.domain.gesture.GestureType.HOLD
import org.galacticware.griddle.domain.gesture.GestureType.SWIPE_DOWN
import org.galacticware.griddle.domain.gesture.GestureType.SWIPE_DOWN_LEFT
import org.galacticware.griddle.domain.gesture.GestureType.SWIPE_DOWN_RIGHT
import org.galacticware.griddle.domain.gesture.GestureType.SWIPE_LEFT
import org.galacticware.griddle.domain.gesture.GestureType.SWIPE_RIGHT
import org.galacticware.griddle.domain.gesture.GestureType.SWIPE_UP
import org.galacticware.griddle.domain.gesture.GestureType.SWIPE_UP_LEFT
import org.galacticware.griddle.domain.gesture.GestureType.SWIPE_UP_RIGHT
import org.galacticware.griddle.domain.griddlebutton.builder.GriddleButtonBuilder.Companion.makeClassicGestureButton
import org.galacticware.griddle.domain.keybinder.AppSymbol
import org.galacticware.griddle.domain.keybinder.AppSymbol.ALT_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.BACKSPACE_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.CAPSLOCKED_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.CONTROL_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.COPY_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.CUT_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.DOWN_ARROW_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.ENTER_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.F10_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.F11_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.F12_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.F1_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.F2_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.F3_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.F4_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.F5_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.F6_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.F7_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.F8_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.F9_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.LEFT_ARROW_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.MACRO_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.MICROPHONE_CHAR
import org.galacticware.griddle.domain.keybinder.AppSymbol.MOVE_END_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.MOVE_HOME_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.MOVE_PGDN_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.PASTE_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.RIGHT_ARROW_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.SELECT_ALL_TEXT_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.SHIFTED_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.SWAP_HANDEDNESS
import org.galacticware.griddle.domain.keybinder.AppSymbol.TOGGLE_ALPHA_LAYER_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.TOGGLE_ALPHA_NUMERIC_UNIFIED_LAYER_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.TOGGLE_CLIPBOARD_LAYER_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.TOGGLE_FUNCTION_LAYER_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.TOGGLE_NUMBER_LAYER_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.TOGGLE_SETTINGS_SCREEN_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.UNSHIFTED_SYMBOL
import org.galacticware.griddle.domain.keybinder.AppSymbol.UP_ARROW_SYMBOL
import org.galacticware.griddle.domain.keybinder.KeyBinder.Companion.gesture
import org.galacticware.griddle.domain.modifier.AppModifierKey.Companion.control
import org.galacticware.griddle.domain.modifier.ModifierKeyKind
import org.galacticware.griddle.domain.modifier.ModifierTheme.Companion.modifierThemes
import org.galacticware.griddle.domain.modifier.ModifierThemeSet
import org.galacticware.griddle.domain.operation.applyAlt
import org.galacticware.griddle.domain.operation.applyControl
import org.galacticware.griddle.domain.operation.cycleShiftState
import org.galacticware.griddle.domain.operation.moveDown
import org.galacticware.griddle.domain.operation.moveEnd
import org.galacticware.griddle.domain.operation.moveHome
import org.galacticware.griddle.domain.operation.moveLeft
import org.galacticware.griddle.domain.operation.moveRight
import org.galacticware.griddle.domain.operation.moveUp
import org.galacticware.griddle.domain.operation.moveWordLeft
import org.galacticware.griddle.domain.operation.moveWordRight
import org.galacticware.griddle.domain.operation.noOp
import org.galacticware.griddle.domain.operation.openMacroEditor
import org.galacticware.griddle.domain.operation.pressEnterKey
import org.galacticware.griddle.domain.operation.pressKey
import org.galacticware.griddle.domain.operation.pressSpace
import org.galacticware.griddle.domain.operation.releaseShift
import org.galacticware.griddle.domain.operation.remappedSymbolLookup
import org.galacticware.griddle.domain.operation.selectAll
import org.galacticware.griddle.domain.operation.simpleInput

import org.galacticware.griddle.domain.operation.startRecognizingSpeech
import org.galacticware.griddle.domain.operation.swapHandedness
import org.galacticware.griddle.domain.operation.swappable
import org.galacticware.griddle.domain.operation.switchLayer
import org.galacticware.griddle.domain.operation.switchToScreen
import org.galacticware.griddle.domain.operation.toggleAltLock
import org.galacticware.griddle.domain.operation.toggleCapslock
import org.galacticware.griddle.domain.operation.toggleControlLock
import org.galacticware.griddle.domain.operation.toggleOneShotShift
import org.galacticware.griddle.domain.util.caseSensitive
import org.galacticware.griddle.domain.util.reversedCase
import org.galacticware.griddle.domain.util.triple
import org.galacticware.griddle.keyboarddefinition.opensource.layouts.griddle.english.button_0_0
import org.galacticware.griddle.keyboarddefinition.opensource.layouts.griddle.english.button_0_1
import org.galacticware.griddle.keyboarddefinition.opensource.layouts.griddle.english.button_0_2
import org.galacticware.griddle.view.composable.screen.BaseSettingsScreen
import spamBackspace

val shiftIndicator = ModifierThemeSet.forModifierWithDefaultTheme("LOWER", "UPPER", "CAPS ", kind = ModifierKeyKind.SHIFT)

val cursorControlButton = makeClassicGestureButton(
    rowStart = 0, colStart = 3, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(CLICK, noOp, modifierThemeSet = shiftIndicator),
        gesture(HOLD, toggleCapslock),
        gesture(SWIPE_UP, moveUp, threeStrings = triple(UP_ARROW_SYMBOL)),
        gesture(BOOMERANG_UP, pressKey(KEYCODE_PAGE_UP), threeStrings = triple(MOVE_PGDN_SYMBOL)),
        gesture(SWIPE_RIGHT, moveRight, threeStrings = triple(RIGHT_ARROW_SYMBOL)),
        gesture(SWIPE_UP_RIGHT, pressKey(KEYCODE_DPAD_UP)),
        gesture(BOOMERANG_UP_RIGHT, pressKey(KEYCODE_DPAD_UP, control)),
        gesture(SWIPE_DOWN_RIGHT, pressKey(KEYCODE_DPAD_RIGHT)),
        gesture(BOOMERANG_RIGHT, moveWordRight),
        gesture(SWIPE_LEFT, moveLeft, threeStrings = triple(LEFT_ARROW_SYMBOL)),
        gesture(SWIPE_UP_LEFT, pressKey(KEYCODE_DPAD_LEFT)),
        gesture(SWIPE_DOWN_LEFT, pressKey(KEYCODE_DPAD_LEFT)),
        gesture(BOOMERANG_LEFT, moveWordLeft),
        gesture(SWIPE_DOWN, moveDown, threeStrings = triple(DOWN_ARROW_SYMBOL)),
        gesture(BOOMERANG_DOWN, pressKey(KEYCODE_PAGE_DOWN), threeStrings = triple(MOVE_PGDN_SYMBOL)),
        gesture(CIRCLE_CLOCKWISE, moveEnd, threeStrings = triple(MOVE_END_SYMBOL)),
        gesture(CIRCLE_ANTI_CLOCKWISE, moveHome, threeStrings = triple(MOVE_HOME_SYMBOL)),
    ),
)

// you can define a triple of text that will be re-used in multiple gestures
val shiftLegends = Triple(SHIFTED_SYMBOL.value, CAPSLOCKED_SYMBOL.value, UNSHIFTED_SYMBOL.value)


val cycleEmojisLeft = makeClassicGestureButton(
    rowStart = 3, colStart = 0, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(CLICK, /* cycleEmojiPage */noOp, threeStrings = caseSensitive("⬅\uFE0F"))
    ),
)


val cycleEmojisRight = cycleEmojisLeft
    .withPosition(rowStart = 3, colStart=2, rowSpan = 1, colSpan = 1,)



val multiKey: Gesture =  gesture(CLICK, swappable(
    pressKey(KEYCODE_DEL) to triple(BACKSPACE_SYMBOL),
//    repeatPreviousOperation to withSymbol(AppSymbol.REPEAT_SYMBOL),
), threeStrings = triple(BACKSPACE_SYMBOL))

val backspace = makeClassicGestureButton(
    rowStart = 2, colStart = 3, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(HOLD, /*swapGesture(multiKey)*/spamBackspace),
        multiKey,
        gesture(SWIPE_LEFT, pressKey(KEYCODE_DEL)),
        gesture(SWIPE_UP_LEFT, pressKey(KEYCODE_DEL)),
        gesture(SWIPE_DOWN_LEFT, pressKey(KEYCODE_DEL)),
        gesture(BOOMERANG_LEFT, pressKey(KEYCODE_DEL, control)),
        gesture(SWIPE_RIGHT, pressKey(KEYCODE_FORWARD_DEL)),
        gesture(SWIPE_UP_RIGHT, pressKey(KEYCODE_FORWARD_DEL)),
        gesture(SWIPE_DOWN_RIGHT, pressKey(KEYCODE_FORWARD_DEL)),
        gesture(BOOMERANG_RIGHT, pressKey(KEYCODE_FORWARD_DEL, control)),
    ),
)


val rightBackspace = backspace
    .withPosition(rowStart = 2, colStart = 3, rowSpan = 1, colSpan = 1,)


val rightAlphaLayerToggle = makeClassicGestureButton(
    rowStart = 1, colStart = 3, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(SWIPE_UP, remappedSymbolLookup, appSymbol = COPY_SYMBOL),
        gesture(SWIPE_LEFT, remappedSymbolLookup, appSymbol = CUT_SYMBOL),
        gesture(SWIPE_UP_LEFT, openMacroEditor, appSymbol = MACRO_SYMBOL, ),
        gesture(SWIPE_DOWN, remappedSymbolLookup, appSymbol = PASTE_SYMBOL),
        gesture(CLICK, switchLayer, appSymbol = TOGGLE_ALPHA_LAYER_SYMBOL),
        gesture(SWIPE_RIGHT, swapHandedness, appSymbol = SWAP_HANDEDNESS),
        gesture(CIRCLE_ANTI_CLOCKWISE, pressKey(KEYCODE_A, control)),
        gesture(CIRCLE_CLOCKWISE, pressKey(KEYCODE_A, control)),
        gesture(SWIPE_DOWN_RIGHT, startRecognizingSpeech, appSymbol = MICROPHONE_CHAR),
        gesture(BOOMERANG_DOWN, switchLayer, appSymbol = TOGGLE_CLIPBOARD_LAYER_SYMBOL),
    ),
)

val lefAlphaLayerToggle = rightAlphaLayerToggle
    .withPosition(rowStart = 1, colStart = 3, rowSpan = 1, colSpan = 1,)

val rightNumLayerToggle = makeClassicGestureButton(
    rowStart = 1, colStart = 3, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(SWIPE_UP, remappedSymbolLookup, appSymbol = COPY_SYMBOL),
        gesture(SWIPE_LEFT, remappedSymbolLookup, appSymbol = CUT_SYMBOL),
        gesture(SWIPE_DOWN, remappedSymbolLookup, appSymbol = PASTE_SYMBOL),
        gesture(SWIPE_UP_LEFT, openMacroEditor, appSymbol = MACRO_SYMBOL, ),
        gesture(SWIPE_RIGHT, swapHandedness, appSymbol = SWAP_HANDEDNESS),
        gesture(CLICK, switchLayer, appSymbol = TOGGLE_NUMBER_LAYER_SYMBOL),
        gesture(CIRCLE_ANTI_CLOCKWISE, selectAll, appSymbol = SELECT_ALL_TEXT_SYMBOL),
        gesture(CIRCLE_CLOCKWISE, selectAll, appSymbol = SELECT_ALL_TEXT_SYMBOL),
        gesture(SWIPE_DOWN_RIGHT, startRecognizingSpeech, appSymbol = MICROPHONE_CHAR),
        gesture(BOOMERANG_DOWN, switchLayer, appSymbol = TOGGLE_CLIPBOARD_LAYER_SYMBOL),
    ),
)

val leftNumLayerToggles = rightNumLayerToggle
    .withPosition(rowStart = 1, colStart = 3, rowSpan = 1, colSpan = 1)

val enter = makeClassicGestureButton(
    rowStart = 3, colStart = 3, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(CLICK, pressEnterKey, appSymbol = ENTER_SYMBOL),
        gesture(SWIPE_UP_LEFT, applyAlt, modifierThemeSet = modifierThemes(ALT_SYMBOL.value, kind = ModifierKeyKind.ALT)),
        gesture(BOOMERANG_UP_LEFT, toggleAltLock),
        gesture(SWIPE_UP_RIGHT, applyControl, modifierThemeSet = modifierThemes(CONTROL_SYMBOL.value, kind = ModifierKeyKind.CONTROL)),
        gesture(BOOMERANG_UP_RIGHT, toggleControlLock),
    ),
)

val space = makeClassicGestureButton(
    rowStart = 3, colStart = 0, rowSpan = 1, colSpan = 3,
    gestureSet = mutableSetOf(
        gesture(CLICK, pressSpace),
        gesture(SWIPE_UP, toggleOneShotShift, threeStrings = UNSHIFTED_SYMBOL.value.let { Triple(SHIFTED_SYMBOL.value, it, it) }),
        gesture(BOOMERANG_UP, toggleCapslock, threeStrings = Triple(UNSHIFTED_SYMBOL.value, UNSHIFTED_SYMBOL.value, CAPSLOCKED_SYMBOL.value)),
        gesture(SWIPE_DOWN, switchToScreen(BaseSettingsScreen), appSymbol = TOGGLE_SETTINGS_SCREEN_SYMBOL),
        gesture(SWIPE_DOWN_LEFT, switchLayer, appSymbol = TOGGLE_FUNCTION_LAYER_SYMBOL),
        gesture(BOOMERANG_DOWN_RIGHT, /* clearLogs */noOp),
        gesture(CIRCLE_ANTI_CLOCKWISE, switchLayer, appSymbol = TOGGLE_ALPHA_NUMERIC_UNIFIED_LAYER_SYMBOL),
        gesture(CIRCLE_CLOCKWISE, switchLayer, appSymbol = TOGGLE_ALPHA_NUMERIC_UNIFIED_LAYER_SYMBOL),
        gesture(HOLD, simpleInput, threeStrings = reversedCase("0")),
        gesture(BOOMERANG_DOWN, simpleInput, threeStrings = reversedCase("H")),
    ),
)

val numericSpaceLeft = space.withoutGesture { g: Gesture -> g.currentText == AppSymbol.SETTINGS_SYMBOL.value }
    .withPosition(3, 0, 1, 1)

val numericSpaceRight = space.withPosition(3, 2, 1, 1)

val button0 = makeClassicGestureButton(
    rowStart = 3, colStart = 1, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(CLICK, simpleInput, threeStrings = caseSensitive("0"))
    ),
)

val button1 = button_0_0.withoutLetters()
    .withGesture(CLICK, pressKey(KEYCODE_1, respectShift = false), char = "1")

val button2 = button_0_1.withoutLetters()
    .withGesture(CLICK, pressKey(KEYCODE_2, respectShift = false), char = "2")

val button3 = button_0_2.withoutLetters()
    .withGesture(CLICK, pressKey(KEYCODE_3, respectShift = false), char = "3")

val button4 = makeClassicGestureButton(
    rowStart = 1, colStart = 0, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(SWIPE_UP, cycleShiftState, threeStrings = shiftLegends),
        gesture(SWIPE_DOWN, releaseShift, threeStrings = caseSensitive("", SHIFTED_SYMBOL.value, SHIFTED_SYMBOL.value)),
        gesture(CLICK, pressKey(KEYCODE_4, respectShift = false), threeStrings = caseSensitive("4"))
    )
)

val button5 = makeClassicGestureButton(
    rowStart = 1, colStart = 1, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(CLICK, pressKey(KEYCODE_5, respectShift = false), threeStrings = caseSensitive("5"))
    )
)

val button6 = makeClassicGestureButton(
    rowStart = 1, colStart = 2, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(SWIPE_UP, cycleShiftState, threeStrings = shiftLegends),
        gesture(SWIPE_DOWN, releaseShift, threeStrings = caseSensitive("", SHIFTED_SYMBOL.value, SHIFTED_SYMBOL.value)),
        gesture(CLICK, pressKey(KEYCODE_6, respectShift = false), threeStrings = caseSensitive("6")),
    )
)
val button7 = makeClassicGestureButton(
    rowStart = 2, colStart = 0, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(CLICK, pressKey(KEYCODE_7, respectShift = false), threeStrings = caseSensitive("7"))
    )
)

val button8 = makeClassicGestureButton(
    rowStart = 2, colStart = 1, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(CLICK, pressKey(KEYCODE_8, respectShift = false), threeStrings = caseSensitive("8"))
    )
)

val button9 = makeClassicGestureButton(
    rowStart = 2, colStart = 2, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(CLICK, pressKey(KEYCODE_9, respectShift = false), threeStrings = caseSensitive("9"))
    )
)

val f1 = makeClassicGestureButton(
    rowStart = 0, colStart = 0, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(CLICK, pressKey(KEYCODE_F1), appSymbol = F1_SYMBOL)
    )
)

val f2 = makeClassicGestureButton(
    rowStart = 0, colStart = 1, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(CLICK, pressKey(KEYCODE_F2), appSymbol = F2_SYMBOL)
    )
)

val f3 = makeClassicGestureButton(
    rowStart = 0, colStart = 2, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(CLICK, pressKey(KEYCODE_F3), appSymbol = F3_SYMBOL)
    )
)

val f4 = makeClassicGestureButton(
    rowStart = 1, colStart = 0, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(CLICK, pressKey(KEYCODE_F4), appSymbol = F4_SYMBOL)
    )
)

val f5 = makeClassicGestureButton(
    rowStart = 1, colStart = 1, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(CLICK, pressKey(KEYCODE_F5), appSymbol = F5_SYMBOL)
    )
)

val f6 = makeClassicGestureButton(
    rowStart = 1, colStart = 2, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(CLICK, pressKey(KEYCODE_F6), appSymbol = F6_SYMBOL)
    )
)

val f7 = makeClassicGestureButton(
    rowStart = 2, colStart = 0, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(CLICK, pressKey(KEYCODE_F7), appSymbol = F7_SYMBOL)
    )
)

val f8 = makeClassicGestureButton(
    rowStart = 2, colStart = 1, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(CLICK, pressKey(KEYCODE_F8), appSymbol = F8_SYMBOL)
    )
)

val f9 = makeClassicGestureButton(
    rowStart = 2, colStart = 2, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(CLICK, pressKey(KEYCODE_F9), appSymbol = F9_SYMBOL)
    )
)

val f10 = makeClassicGestureButton(
    rowStart = 3, colStart = 0, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(CLICK, pressKey(KEYCODE_F10), appSymbol = F10_SYMBOL)
    )
)

val f11 = makeClassicGestureButton(
    rowStart = 3, colStart = 1, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(CLICK, pressKey(KEYCODE_F11), appSymbol = F11_SYMBOL)
    )
)

val f12 = makeClassicGestureButton(
    rowStart = 3, colStart = 2, rowSpan = 1, colSpan = 1,
    gestureSet = mutableSetOf(
        gesture(CLICK, pressKey(KEYCODE_F12), appSymbol = F12_SYMBOL)
    )
)