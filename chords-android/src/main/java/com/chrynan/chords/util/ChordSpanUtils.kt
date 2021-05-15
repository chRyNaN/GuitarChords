@file:Suppress("unused")

package com.chrynan.chords.util

import android.text.Spannable
import android.text.SpannableString
import com.chrynan.chords.model.Chord
import com.chrynan.chords.span.ChordSpan
import com.chrynan.chords.span.RaisedTextSpan
import com.chrynan.chords.span.TouchableSpanViewModel

// ChordSpan

fun chordSpan(
    chord: Chord,
    viewModel: TouchableSpanViewModel = TouchableSpanViewModel(),
    listener: ChordSpan.ChordSelectedListener
): SpannableString {
    val spannable = SpannableString(chord.name)
    val chordSpan = ChordSpan(chord = chord, viewModel = viewModel, listener = listener)

    spannable.setSpan(chordSpan, 0, chord.name?.length ?: 0, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

    return spannable
}

fun chordSpan(
    text: String,
    chord: Chord,
    viewModel: TouchableSpanViewModel = TouchableSpanViewModel(),
    listener: ChordSpan.ChordSelectedListener
): SpannableString {
    val spannable = SpannableString(text)
    val chordSpan = ChordSpan(chord = chord, viewModel = viewModel, listener = listener)

    spannable.setSpan(chordSpan, 0, text.length, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

    return spannable
}

fun chordSpan(
    text: String,
    startInclusive: Int,
    endExclusive: Int,
    chord: Chord,
    viewModel: TouchableSpanViewModel = TouchableSpanViewModel(),
    listener: ChordSpan.ChordSelectedListener
): SpannableString {
    val spannable = SpannableString(text)
    val chordSpan = ChordSpan(chord = chord, viewModel = viewModel, listener = listener)

    spannable.setSpan(chordSpan, startInclusive, endExclusive, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

    return spannable
}

fun chordSpan(
    text: String,
    range: IntRange,
    chord: Chord,
    viewModel: TouchableSpanViewModel = TouchableSpanViewModel(),
    listener: ChordSpan.ChordSelectedListener
): SpannableString {
    val spannable = SpannableString(text)
    val chordSpan = ChordSpan(chord = chord, viewModel = viewModel, listener = listener)

    spannable.setSpan(chordSpan, range.first, range.last, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

    return spannable
}

fun chordSpan(
    chord: Chord,
    viewModel: TouchableSpanViewModel = TouchableSpanViewModel(),
    listener: ((Chord) -> Unit)? = null
): SpannableString {
    val spannable = SpannableString(chord.name)
    val chordSpan =
        ChordSpan(chord = chord, viewModel = viewModel, listener = object : ChordSpan.ChordSelectedListener {
            override fun onChordSpanSelected(chord: Chord) {
                listener?.invoke(chord)
            }
        })

    spannable.setSpan(chordSpan, 0, chord.name?.length ?: 0, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

    return spannable
}

fun chordSpan(
    text: String,
    chord: Chord,
    viewModel: TouchableSpanViewModel = TouchableSpanViewModel(),
    listener: ((Chord) -> Unit)? = null
): SpannableString {
    val spannable = SpannableString(text)
    val chordSpan =
        ChordSpan(chord = chord, viewModel = viewModel, listener = object : ChordSpan.ChordSelectedListener {
            override fun onChordSpanSelected(chord: Chord) {
                listener?.invoke(chord)
            }
        })

    spannable.setSpan(chordSpan, 0, text.length, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

    return spannable
}

fun chordSpan(
    text: String,
    startInclusive: Int,
    endExclusive: Int,
    chord: Chord,
    viewModel: TouchableSpanViewModel = TouchableSpanViewModel(),
    listener: ((Chord) -> Unit)? = null
): SpannableString {
    val spannable = SpannableString(text)
    val chordSpan =
        ChordSpan(chord = chord, viewModel = viewModel, listener = object : ChordSpan.ChordSelectedListener {
            override fun onChordSpanSelected(chord: Chord) {
                listener?.invoke(chord)
            }
        })

    spannable.setSpan(chordSpan, startInclusive, endExclusive, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

    return spannable
}

fun chordSpan(
    text: String,
    range: IntRange,
    chord: Chord,
    viewModel: TouchableSpanViewModel = TouchableSpanViewModel(),
    listener: ((Chord) -> Unit)? = null
): SpannableString {
    val spannable = SpannableString(text)
    val chordSpan =
        ChordSpan(chord = chord, viewModel = viewModel, listener = object : ChordSpan.ChordSelectedListener {
            override fun onChordSpanSelected(chord: Chord) {
                listener?.invoke(chord)
            }
        })

    spannable.setSpan(chordSpan, range.first, range.last, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

    return spannable
}

// RaisedChordSpan

fun raisedChordSpan(
    chord: Chord,
    viewModel: TouchableSpanViewModel = TouchableSpanViewModel(),
    listener: ChordSpan.ChordSelectedListener
): SpannableString {
    val spannable = SpannableString(chord.name)
    val chordSpan = ChordSpan(chord = chord, viewModel = viewModel, listener = listener)

    spannable.setSpan(chordSpan, 0, chord.name?.length ?: 0, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
    spannable.setSpan(RaisedTextSpan(), 0, chord.name?.length ?: 0, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

    return spannable
}

fun raisedChordSpan(
    text: String,
    chord: Chord,
    viewModel: TouchableSpanViewModel = TouchableSpanViewModel(),
    listener: ChordSpan.ChordSelectedListener
): SpannableString {
    val spannable = SpannableString(text)
    val chordSpan = ChordSpan(chord = chord, viewModel = viewModel, listener = listener)

    spannable.setSpan(chordSpan, 0, text.length, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
    spannable.setSpan(RaisedTextSpan(), 0, text.length, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

    return spannable
}

fun raisedChordSpan(
    text: String,
    startInclusive: Int,
    endExclusive: Int,
    chord: Chord,
    viewModel: TouchableSpanViewModel = TouchableSpanViewModel(),
    listener: ChordSpan.ChordSelectedListener
): SpannableString {
    val spannable = SpannableString(text)
    val chordSpan = ChordSpan(chord = chord, viewModel = viewModel, listener = listener)

    spannable.setSpan(chordSpan, startInclusive, endExclusive, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
    spannable.setSpan(RaisedTextSpan(), startInclusive, endExclusive, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

    return spannable
}

fun raisedChordSpan(
    text: String,
    range: IntRange,
    chord: Chord,
    viewModel: TouchableSpanViewModel = TouchableSpanViewModel(),
    listener: ChordSpan.ChordSelectedListener
): SpannableString {
    val spannable = SpannableString(text)
    val chordSpan = ChordSpan(chord = chord, viewModel = viewModel, listener = listener)

    spannable.setSpan(chordSpan, range.first, range.last, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
    spannable.setSpan(RaisedTextSpan(), range.first, range.last, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

    return spannable
}

fun raisedChordSpan(
    chord: Chord,
    viewModel: TouchableSpanViewModel = TouchableSpanViewModel(),
    listener: ((Chord) -> Unit)? = null
): SpannableString {
    val spannable = SpannableString(chord.name)
    val chordSpan =
        ChordSpan(chord = chord, viewModel = viewModel, listener = object : ChordSpan.ChordSelectedListener {
            override fun onChordSpanSelected(chord: Chord) {
                listener?.invoke(chord)
            }
        })

    spannable.setSpan(chordSpan, 0, chord.name?.length ?: 0, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
    spannable.setSpan(RaisedTextSpan(), 0, chord.name?.length ?: 0, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

    return spannable
}

fun raisedChordSpan(
    text: String,
    chord: Chord,
    viewModel: TouchableSpanViewModel = TouchableSpanViewModel(),
    listener: ((Chord) -> Unit)? = null
): SpannableString {
    val spannable = SpannableString(text)
    val chordSpan =
        ChordSpan(chord = chord, viewModel = viewModel, listener = object : ChordSpan.ChordSelectedListener {
            override fun onChordSpanSelected(chord: Chord) {
                listener?.invoke(chord)
            }
        })

    spannable.setSpan(chordSpan, 0, text.length, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
    spannable.setSpan(RaisedTextSpan(), 0, text.length, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

    return spannable
}

fun raisedChordSpan(
    text: String,
    startInclusive: Int,
    endExclusive: Int,
    chord: Chord,
    viewModel: TouchableSpanViewModel = TouchableSpanViewModel(),
    listener: ((Chord) -> Unit)? = null
): SpannableString {
    val spannable = SpannableString(text)
    val chordSpan =
        ChordSpan(chord = chord, viewModel = viewModel, listener = object : ChordSpan.ChordSelectedListener {
            override fun onChordSpanSelected(chord: Chord) {
                listener?.invoke(chord)
            }
        })

    spannable.setSpan(chordSpan, startInclusive, endExclusive, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
    spannable.setSpan(RaisedTextSpan(), startInclusive, endExclusive, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

    return spannable
}

fun raisedChordSpan(
    text: String,
    range: IntRange,
    chord: Chord,
    viewModel: TouchableSpanViewModel = TouchableSpanViewModel(),
    listener: ((Chord) -> Unit)? = null
): SpannableString {
    val spannable = SpannableString(text)
    val chordSpan =
        ChordSpan(chord = chord, viewModel = viewModel, listener = object : ChordSpan.ChordSelectedListener {
            override fun onChordSpanSelected(chord: Chord) {
                listener?.invoke(chord)
            }
        })

    spannable.setSpan(chordSpan, range.first, range.last, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
    spannable.setSpan(RaisedTextSpan(), range.first, range.last, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

    return spannable
}
